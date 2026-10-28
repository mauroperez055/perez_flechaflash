
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
        String sql = "SELECT * FROM colectivos WHERE matricula = ?";
        
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
    
    public void actualizarColectivo(Colectivo colectivo) throws SQLException {
        String sql = "UPDATE colectivos SET matricula = ?, marca = ?, modelo = ?, capacidad = ?, chofer = ? WHERE idColectivo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setString(5, colectivo.getChofer());
            ps.setInt(6, colectivo.getIdColectivo());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Colectivo actualizado correctamente.");
            } else {
                System.out.println("No se encontró el colectivo.");
            }
            
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar el colectivo." + e.getMessage());
            throw e;
        }
    }
    
    public void bajaLógicaColectivo(Colectivo colectivo) throws SQLException {
        String sql ="UPDATE colectivos SET estado = 0 WHERE idColectivo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, colectivo.getIdColectivo());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Colectivo dado de baja correctamente.");
            } else {
                System.out.println("No se encontró el colectivo.");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo dar de baja el colectivo." + e.getMessage());
            throw e;
        }
    }
    
    public void altaLógicaColectivo(Colectivo colectivo) throws SQLException {
        String sql ="UPDATE colectivos SET estado = 1 WHERE idColectivo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, colectivo.getIdColectivo());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Colectivo dado de alta correctamente.");
            } else {
                System.out.println("No se encontró el colectivo.");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo dar de alta el colectivo." + e.getMessage());
            throw e;
        }
    }
    
    public ArrayList<Colectivo> listarTodosLosColectivos() throws SQLException {
        ArrayList<Colectivo> todosLosColectivos = new ArrayList<>();
       String sql = "SELECT * FROM colectivos";
       try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               int idColectivo = rs.getInt("idColectivo");
               String matricula = rs.getString("matricula");
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               int capacidad = rs.getInt("capacidad");
               String chofer = rs.getString("chofer");
               boolean estado = rs.getBoolean("estado");
               
               Colectivo colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estado);
               
               todosLosColectivos.add(colectivo);
           }
           
           return todosLosColectivos;
       } catch (SQLException e) {
           System.out.println("No se pudo obtener los colectivos." + e.getMessage());
           throw e;
       }
    }
    
    public ArrayList<Colectivo> listarColectivosActivos() throws SQLException {
        ArrayList<Colectivo> todosColectivosActivos = new ArrayList<>();
       String sql = "SELECT * FROM colectivos WHERE estado = 1";
       try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               int idColectivo = rs.getInt("idColectivo");
               String matricula = rs.getString("matricula");
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               int capacidad = rs.getInt("capacidad");
               String chofer = rs.getString("chofer");
               boolean estado = rs.getBoolean("estado");
               
               Colectivo colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estado);
               
               todosColectivosActivos.add(colectivo);
           }
           
           return todosColectivosActivos;
       } catch (SQLException e) {
           System.out.println("No se pudo obtener los colectivos." + e.getMessage());
           throw e;
       }
    }
    
    public ArrayList<Colectivo> listarColectivosInactivos() throws SQLException {
        ArrayList<Colectivo> todosColectivosInactivos = new ArrayList<>();
       String sql = "SELECT * FROM colectivos WHERE estado = 0";
       try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               int idColectivo = rs.getInt("idColectivo");
               String matricula = rs.getString("matricula");
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               int capacidad = rs.getInt("capacidad");
               String chofer = rs.getString("chofer");
               boolean estado = rs.getBoolean("estado");
               
               Colectivo colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estado);
               
               todosColectivosInactivos.add(colectivo);
           }
           
           return todosColectivosInactivos;
       } catch (SQLException e) {
           System.out.println("No se pudo obtener los colectivos." + e.getMessage());
           throw e;
       }
    }
    
    
    public void eliminarColectivo(Colectivo colectivo) throws SQLException {
        String sql = "DELETE FROM colectivos WHERE idColectivo = ?";
        
        try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ps.setInt(1, colectivo.getIdColectivo());
           
           int exito = ps.executeUpdate();
           
           if (exito == 1) {
               System.out.println("Colectivo eliminado correctamente.");
           } else {
               System.out.println("No se pudo eliminar el colectivo.");
           }
       } catch (SQLException e) {
            System.out.println("No se pudo encontrar el colectivo." + e.getMessage());
            throw e;
       }
    }
}
