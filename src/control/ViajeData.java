
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Time;
import java.sql.Date;
import java.time.LocalDate;
import modelo.Colectivo;
import modelo.Viaje;

public class ViajeData {
    private Connection conexion = null;

    public ViajeData(Conexion conex) {
        this.conexion = conex.buscarConexion();
    }
    
    public void cargarViaje(Viaje viaje) throws SQLException {
        String sql = "INSERT INTO viajes (origen, destino, fechaSalida, fechaLlegada, horaSalida, horaLlegada, idColectivo, precio, estado)"
                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, viaje.getOrigen());
            ps.setString(2, viaje.getDestino());
            ps.setDate(3, Date.valueOf(viaje.getFechaSalida()));
            ps.setDate(4, Date.valueOf(viaje.getFechaLlegada()));
            ps.setTime(5, viaje.getHoraSalida());
            ps.setTime(6, viaje.getHoraLlegada());
            ps.setInt(7, viaje.getColectivo().getIdColectivo());
            ps.setDouble(8, viaje.getPrecio());
            ps.setBoolean(9, viaje.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                viaje.setIdViaje(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id del viaje.");
            }
            System.out.println("Viaje cargado correctamente.");
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo guardar el viaje." + e.getMessage());
            throw e;
        }
    }

    public Viaje buscarViaje(int idViaje) throws SQLException {
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.fechaSalida, v.fechaLlegada, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idViaje);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int idV = rs.getInt("idVIaje");
                String origen = rs.getString("origen");
                String destino = rs.getString("destino");
                LocalDate fechaSalida = rs.getDate("fechaSalida").toLocalDate();
                LocalDate fechaLlegada = rs.getDate("fechaLlegada").toLocalDate();
                Time horaSalida = rs.getTime("horaSalida");
                Time horaLlegada = rs.getTime("horaLlegada");
                double precio = rs.getDouble("precio");
                boolean estado = rs.getBoolean("estadoViaje");
                
                int idColectivo = rs.getInt("idColectivo");
                String matricula = rs.getString("matricula");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int capacidad = rs.getInt("capacidad");
                String chofer = rs.getString("chofer");
                boolean estadoCole = rs.getBoolean("estadoCole");
                
                Colectivo colectivo = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estadoCole);
                
                Viaje viajeEncontrado = new Viaje(idV, origen, destino, fechaSalida, fechaLlegada, horaSalida, horaLlegada, colectivo, precio, estado);
                return viajeEncontrado;
            }
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar el viaje." + e.getMessage());
            throw e;
        }
        
        return null;
    }
    
    public void actualizarViaje(Viaje viaje) throws SQLException {
        String sql = "UPDATE viajes SET origen = ?, destino = ?, fechaSalida = ?, fechaLlegada = ?, horaSalida = ?, horaLlegada = ?, idColectivo = ? WHERE idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, viaje.getOrigen());
            ps.setString(2, viaje.getDestino());
            ps.setDate(3, Date.valueOf(viaje.getFechaSalida()));
            ps.setDate(4, Date.valueOf(viaje.getFechaLlegada()));
            ps.setTime(5, viaje.getHoraSalida());
            ps.setTime(6, viaje.getHoraLlegada());
            ps.setInt(7, viaje.getColectivo().getIdColectivo());
            ps.setInt(8, viaje.getIdViaje());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Viaje actualizado correctamente.");
            } else {
                System.out.println("No se encontró el viaje.");
            }
            
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar el viaje." + e.getMessage());
            throw e;
        }
    }
    
    public void bajaLógicaViaje(Viaje viaje) throws SQLException {
        String sql ="UPDATE viajes SET estado = 0 WHERE idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, viaje.getIdViaje());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Viaje dado de baja correctamente.");
            } else {
                System.out.println("No se encontró el viaje.");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo dar de baja el viaje." + e.getMessage());
            throw e;
        }
    }
    
    public void altaLógicaViaje(Viaje viaje) throws SQLException {
        String sql ="UPDATE viajes SET estado = 1 WHERE idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, viaje.getIdViaje());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Viaje dado de alta correctamente.");
            } else {
                System.out.println("No se encontró el viaje.");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo dar de alta el viaje." + e.getMessage());
            throw e;
        }
    }
    
    public void eliminarViaje(Viaje viaje) throws SQLException {
        String sql = "DELETE FROM viajes WHERE idViaje = ?";
        
        try {
           PreparedStatement ps = conexion.prepareStatement(sql);
           ps.setInt(1, viaje.getIdViaje());
           
           int exito = ps.executeUpdate();
           
           if (exito == 1) {
               System.out.println("Viaje eliminado correctamente.");
           } else {
               System.out.println("No se pudo eliminar el viaje.");
           }
       } catch (SQLException e) {
            System.out.println("No se pudo encontrar el viaje." + e.getMessage());
            throw e;
       }
    }
    
    /* Listar rutas activas desde un origen con su colectivo y chofer */
    public ArrayList<Viaje> listarViajeOrigen(String origen) throws SQLException {
        ArrayList<Viaje> viajesOrigen = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.fechaSalida, v.fechaLlegada, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.origen "
                        + "LIKE ? "
                        + "AND v.estado = 1";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + origen + "%");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idViaje = rs.getInt("idVIaje");
                String origenViaje = rs.getString("origen");
                String destino = rs.getString("destino");
                LocalDate fechaSalida = rs.getDate("fechaSalida").toLocalDate();
                LocalDate fechaLlegada = rs.getDate("fechaLlegada").toLocalDate();
                Time horaSalida = rs.getTime("horaSalida");
                Time horaLlegada = rs.getTime("horaLlegada");
                double precio = rs.getDouble("precio");
                boolean estado = rs.getBoolean("estadoViaje");
                
                int idColectivo = rs.getInt("idColectivo");
                String matricula = rs.getString("matricula");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int capacidad = rs.getInt("capacidad");
                String chofer = rs.getString("chofer");
                boolean estadoCole = rs.getBoolean("estadoCole");
                
                Colectivo cole = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estadoCole);
                Viaje viaje = new Viaje(idViaje, origenViaje, destino, fechaSalida, fechaLlegada, horaSalida, horaLlegada, cole, precio, estado);
                
                viajesOrigen.add(viaje);
            }
            
            return viajesOrigen;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }
    
    /* Listar rutas activas hacia un destino con su colectivo y chofer */
    public ArrayList<Viaje> listarViajeDestino(String destino) throws SQLException {
        ArrayList<Viaje> viajesDestino = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.fechaSalida, v.fechaLlegada, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.destino "
                        + "LIKE ? "
                        + "AND v.estado = 1";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + destino + "%");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idViaje = rs.getInt("idVIaje");
                String origenViaje = rs.getString("origen");
                String destinoViaje = rs.getString("destino");
                LocalDate fechaSalida  = rs.getDate("fechaSalida").toLocalDate();
                LocalDate fechaLlegada = rs.getDate("fechaLlegada").toLocalDate();
                Time horaSalida = rs.getTime("horaSalida");
                Time horaLlegada = rs.getTime("horaLlegada");
                double precio = rs.getDouble("precio");
                boolean estado = rs.getBoolean("estadoViaje");
                
                int idColectivo = rs.getInt("idColectivo");
                String matricula = rs.getString("matricula");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int capacidad = rs.getInt("capacidad");
                String chofer = rs.getString("chofer");
                boolean estadoCole = rs.getBoolean("estadoCole");
                
                Colectivo cole = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estadoCole);
                Viaje viaje = new Viaje(idViaje, origenViaje, destinoViaje, fechaSalida, fechaLlegada, horaSalida, horaLlegada, cole, precio, estado);
                
                viajesDestino.add(viaje);
            }
            
            return viajesDestino;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }
    
    /* Todos los viajes activos */
    public ArrayList<Viaje> listarViajesActivos() throws SQLException {
        ArrayList<Viaje> viajesActivos = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.fechaSalida, v.fechaLlegada, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.estado = 1";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idViaje = rs.getInt("idVIaje");
                String origenViaje = rs.getString("origen");
                String destinoViaje = rs.getString("destino");
                LocalDate fechaSalida = rs.getDate("fechaSalida").toLocalDate();
                LocalDate fechaLlegada = rs.getDate("fechaLlegada").toLocalDate();
                Time horaSalida = rs.getTime("horaSalida");
                Time horaLlegada = rs.getTime("horaLlegada");
                double precio = rs.getDouble("precio");
                boolean estado = rs.getBoolean("estadoViaje");
                
                int idColectivo = rs.getInt("idColectivo");
                String matricula = rs.getString("matricula");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int capacidad = rs.getInt("capacidad");
                String chofer = rs.getString("chofer");
                boolean estadoCole = rs.getBoolean("estadoCole");
                
                Colectivo cole = new Colectivo(idColectivo, matricula, marca, modelo, capacidad, chofer, estadoCole);
                Viaje viaje = new Viaje(idViaje, origenViaje, destinoViaje, fechaSalida, fechaLlegada, horaSalida, horaLlegada, cole, precio, estado);
                
                viajesActivos.add(viaje);
            }
            
            return viajesActivos;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }

    /* 3. Ver colectivos y choferes asignados a un Viaje determinado (origen, destino), ordenados por hora de salida */
    public ArrayList<Viaje> viajeInfoColectivo(Viaje viaje) throws SQLException {
        ArrayList<Viaje> viajeInfoColectivo = new ArrayList<>();
        String sql = "SELECT v.origen, v.destino, v.fechaSalida, v.horaSalida, v.fechaLlegada, v.horaLlegada, c.idColectivo, c.chofer "
                         + "FROM viajes v "
                         + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                         + "WHERE v.origen LIKE ? "
                         + "AND v.destino LIKE ? "
                         + "ORDER BY v.horaSalida ASC";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + viaje.getOrigen() + "%");
            ps.setString(2, "%" + viaje.getDestino() + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Colectivo cole = new Colectivo();
                Viaje viajeDelCole = new Viaje();
                
                cole.setIdColectivo(rs.getInt("idColectivo"));
                cole.setChofer(rs.getString("chofer"));
                
                viajeDelCole.setOrigen(rs.getString("origen"));
                viajeDelCole.setDestino(rs.getString("destino"));
                viajeDelCole.setHoraSalida(rs.getTime("horaSalida"));
                viajeDelCole.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                viajeDelCole.setFechaLlegada(rs.getDate("fechaLlegada").toLocalDate());
                viajeDelCole.setHoraLlegada(rs.getTime("horaLlegada"));
                viajeDelCole.setColectivo(cole);
                
                viajeInfoColectivo.add(viaje);
            }
            
            return viajeInfoColectivo;
        } catch (SQLException e) {
            System.out.println("No fue posible realizar la consulta." + e.getMessage());
            throw e;
        }
    }
}
