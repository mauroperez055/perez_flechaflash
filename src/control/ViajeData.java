
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Time;
import modelo.Colectivo;
import modelo.Viaje;

public class ViajeData {
    private Connection conexion = null;

    public ViajeData(Conexion conex) {
        this.conexion = conex.buscarConexion();
    }
    
    public void cargarViaje(Viaje viaje) throws SQLException {
        String sql = "INSERT INTO viajes (origen, destino, horaSalida, horaLlegada, idColectivo, precio, estado)"
                         + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, viaje.getOrigen());
            ps.setString(2, viaje.getDestino());
            ps.setTime(3, viaje.getHoraSalida());
            ps.setTime(4, viaje.getHoraLlegada());
            ps.setInt(5, viaje.getColectivo().getIdColectivo());
            ps.setDouble(6, viaje.getPrecio());
            ps.setBoolean(7, viaje.isActivo());
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

    public Viaje buscarViaje(Viaje viaje) throws SQLException {
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, viaje.getIdViaje());
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int idViaje = rs.getInt("idVIaje");
                String origen = rs.getString("origen");
                String destino = rs.getString("destino");
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
                
                Viaje viajeEncontrado = new Viaje(idViaje, origen, destino, horaSalida, horaLlegada, colectivo, precio, estado);
                return viajeEncontrado;
            }
            
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar el viaje." + e.getMessage());
            throw e;
        }
        
        return null;
    }
    
    public ArrayList<Viaje> listarViajeOrigen(String origen) throws SQLException {
        ArrayList<Viaje> viajesOrigen = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.origen "
                        + "LIKE ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + origen + "%");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idViaje = rs.getInt("idVIaje");
                String origenViaje = rs.getString("origen");
                String destino = rs.getString("destino");
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
                Viaje viaje = new Viaje(idViaje, origenViaje, destino, horaSalida, horaLlegada, cole, precio, estado);
                
                viajesOrigen.add(viaje);
            }
            
            return viajesOrigen;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }
    
    public ArrayList<Viaje> listarViajeDestino(String destino) throws SQLException {
        ArrayList<Viaje> viajesDestino = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.destino "
                        + "LIKE ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + destino + "%");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idViaje = rs.getInt("idVIaje");
                String origenViaje = rs.getString("origen");
                String destinoViaje = rs.getString("destino");
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
                Viaje viaje = new Viaje(idViaje, origenViaje, destinoViaje, horaSalida, horaLlegada, cole, precio, estado);
                
                viajesDestino.add(viaje);
            }
            
            return viajesDestino;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
        
    }
}
