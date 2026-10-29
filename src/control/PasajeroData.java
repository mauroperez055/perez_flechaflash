
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pasajero;

public class PasajeroData {
    private Connection conexion = null;
    
    public PasajeroData(Conexion conex) {
        this.conexion = conex.buscarConexion();
    }
    
    public void cargarPasajero(Pasajero pasajero) throws SQLException {
        String sql = "INSERT INTO pasajeros (dni, nombre, apellido, correo, telefono, estado) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasajero.getDni());
            ps.setString(2, pasajero.getNombre());
            ps.setString(3, pasajero.getApellido());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                pasajero.setIdPasajero(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id del pasajero.");
            }
            
            System.out.println("Pasajero insertado correctamente.");
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo insertar el pasajero." + e.getMessage());
//            return;
            throw e;
        }
    }
    
    public Pasajero buscarPasajeroDni(int dni) throws SQLException {
        String sql = "SELECT * FROM pasajeros WHERE dni = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int idPasajero = rs.getInt("idPasajero");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                boolean estado = rs.getBoolean("estado");
                
                Pasajero pasajeroEncontrado = new Pasajero(idPasajero, dni, nombre, apellido, correo, telefono, estado);
                
                return pasajeroEncontrado;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar el pasajero." + e.getMessage());
            throw e;
        }
        return null;
    }
    
    public void actualizarPasajero(Pasajero pasajero) throws SQLException {
        String sql ="UPDATE pasajeros SET dni = ?, nombre = ?, apellido = ?, correo = ?, telefono = ? WHERE idPasajero = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, pasajero.getDni());
            ps.setString(2, pasajero.getNombre());
            ps.setString(3, pasajero.getApellido());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setInt(6, pasajero.getIdPasajero());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Pasajero actualizado correctamente.");
                return;
            } else {
                System.out.println("No se encontró el pasajero.");
                return;
            }
            
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar el pasajero." + e.getMessage());
            throw e;
        }
    }
    
    public void bajaLogicaPasajero(Pasajero pasajero) throws SQLException {
        String sql ="UPDATE pasajeros SET estado = 0 WHERE idPasajero = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, pasajero.getIdPasajero());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Pasajero dado de baja correctamente.");
            } else {
                System.out.println("No se encontró el pasajero.");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo dar de baja el alumno." + e.getMessage());
            throw e;
        }
    }
    
   public void altaLogicaPasajero(Pasajero pasajero) throws SQLException {
        String sql ="UPDATE pasajeros SET estado = 1 WHERE idPasajero = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, pasajero.getIdPasajero());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Pasajero dado de alta correctamente.");
                return;
            } else {
                System.out.println("No se encontró el pasajero.");
                return;
            }
        } catch (SQLException e) {
            System.out.println("No se pudo dar de alta el alumno." + e.getMessage());
            throw e;
        }
    }
   
   public void eliminarPasajero(Pasajero pasajero) throws SQLException {
        String sql = "DELETE FROM pasajeros WHERE idPasajero = ?";
        
        try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ps.setInt(1, pasajero.getIdPasajero());
           
           int exito = ps.executeUpdate();
           
           if (exito == 1) {
               System.out.println("Pasajero eliminado correctamente.");
           } else {
               System.out.println("No se pudo eliminar el pasajero.");
           }
       } catch (SQLException e) {
            System.out.println("No se pudo encontrar el alumno." + e.getMessage());
            throw e;
       }
    }
   
   public ArrayList<Pasajero> listarTodosLosPasajeros() throws SQLException{
       ArrayList<Pasajero> todosLosPasajeros = new ArrayList<>();
       String sql = "SELECT * FROM pasajeros";
       try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               int idPasajero = rs.getInt("idPasajero");
               int dni = rs.getInt("dni");
               String nombre = rs.getString("nombre");
               String apellido = rs.getString("apellido");
               String correo = rs.getString("correo");
               String telefono = rs.getString("telefono");
               boolean estado = rs.getBoolean("estado");
               
               Pasajero pasajero = new Pasajero(idPasajero, dni, nombre, apellido, correo, telefono, estado);
               
               todosLosPasajeros.add(pasajero);
           }
           
           return todosLosPasajeros;
       } catch (SQLException e) {
           System.out.println("No se pudo obtener los pasajeros." + e.getMessage());
           throw e;
       }
   }
   
   public ArrayList<Pasajero> listarPasajerosActivos() throws SQLException{
       ArrayList<Pasajero> pasajerosActivos = new ArrayList<>();
       String sql = "SELECT * FROM pasajeros WHERE estado = 1";
       try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               int idPasajero = rs.getInt("idPasajero");
               int dni = rs.getInt("dni");
               String nombre = rs.getString("nombre");
               String apellido = rs.getString("apellido");
               String correo = rs.getString("correo");
               String telefono = rs.getString("telefono");
               boolean estado = rs.getBoolean("estado");
               
               Pasajero pasajero = new Pasajero(idPasajero, dni, nombre, apellido, correo, telefono, estado);
               
               pasajerosActivos.add(pasajero);
           }
           
           return pasajerosActivos;
       } catch (SQLException e) {
           System.out.println("No se pudo obtener los pasajeros." + e.getMessage());
           throw e;
       }
   }
   
   public ArrayList<Pasajero> listarPasajerosInactivos() throws SQLException{
       ArrayList<Pasajero> pasajerosInactivos = new ArrayList<>();
       String sql = "SELECT * FROM pasajeros WHERE estado = 0";
       try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               int idPasajero = rs.getInt("idPasajero");
               int dni = rs.getInt("dni");
               String nombre = rs.getString("nombre");
               String apellido = rs.getString("apellido");
               String correo = rs.getString("correo");
               String telefono = rs.getString("telefono");
               boolean estado = rs.getBoolean("estado");
               
               Pasajero pasajero = new Pasajero(idPasajero, dni, nombre, apellido, correo, telefono, estado);
               
               pasajerosInactivos.add(pasajero);
           }
           
           return pasajerosInactivos;
       } catch (SQLException e) {
           System.out.println("No se pudo obtener los pasajeros." + e.getMessage());
           throw e;
       }
   }
   
}
