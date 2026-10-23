
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Colectivo;

public class ColectivoData {
    private Connection conexion = null;

    public ColectivoData(Conexion conex) {
        this.conexion = conex.buscarConexion();
    }
    
    public void cargarColectivo(Colectivo colectivo) throws SQLException {
        String sql ="INSERT INTO colectivos (matricula, marca, modelo, capacidad, chofer, estado) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setString(5, colectivo.getChofer());
            ps.setBoolean(6, colectivo.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                colectivo.setIdColectivo(rs.getInt(1));
            } else {
                System.out.println("No se pudo obetner el id del colectivo");
            }
            
            System.out.println("Colectivo cargado correctamente.");
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo cargar el colectivo." + e.getMessage());
            throw e;
        }
    }
    
    public Colectivo buscarColectivoMatricula(String matricula) throws SQLException {
        String sql ="SELECT * FROM colectivos WHERE matricula = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, matricula);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int idColectivo = rs.getInt("idColectivo");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int capacidad = rs.getInt("capacidad");
                String chofer = rs.getString("chofer");
                boolean estado = rs.getBoolean("estado");
                
                Colectivo coleEncontrado = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estado);
                
                return coleEncontrado;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar el colectivo." + e.getMessage());
            throw e;
        }
        return null;
    }
    
    
}
