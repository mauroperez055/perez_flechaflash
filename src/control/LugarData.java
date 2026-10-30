
package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Lugar;
import modelo.Viaje;

public class LugarData {
    private Connection conexion = null;
    
    private ViajeData viajeData;

    public LugarData(Conexion conex) {
        this.conexion = conex.buscarConexion();
    }
    
    public void crearLugar(Lugar lugar) throws SQLException {
        String sql = "INSERT INTO lugares (idViaje, numeroAsiento, estado) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lugar.getViaje().getIdViaje());
            ps.setInt(2, lugar.getNumeroAsiento());
            ps.setBoolean(3, lugar.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                lugar.setIdLugar(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id del lugar");
            }
            
            System.out.println("Lugar creado.");
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo crear el lugar." + e.getMessage());
            throw e;
        }
    }
    
    public Lugar buscarLugarDeUnViaje(int numeroAsiento, Viaje viaje) throws SQLException {
        Lugar lugar = null;
        
        String sql = "SELECT l.idLugar, l.numeroAsiento, v.idViaje, l.estado "
                          + "FROM lugares l "
                          + "INNER JOIN viajes v ON l.idViaje = v.idViaje "
                          + "WHERE v.idViaje = ? "
                          + "AND l.numeroAsiento = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, viaje.getIdViaje());
            ps.setInt(2, numeroAsiento);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int idLugar = rs.getInt("idLugar");
                int numAsiento = rs.getInt("numeroAsiento");
                boolean activo = rs.getBoolean("estado");
                
                lugar = new Lugar(idLugar, viaje, numAsiento, activo);
                return lugar;
            }
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar el lugar." + e.getMessage());
            throw e;
        }
        return null;
    }
    
}
