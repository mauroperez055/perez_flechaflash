
package control;

import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Time;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.ArrayList;
import modelo.Lugar;
import modelo.Pasaje;
import modelo.Pasajero;
import modelo.Viaje;

public class PasajeData {
    private Connection conexion = null;
    private PasajeroData pasajeroData;
    private ViajeData viajeData;
    private LugarData lugarData;

    public PasajeData(Conexion conex, PasajeroData pasajeroData, ViajeData viajeData, LugarData lugarData) {
        this.conexion = conex.buscarConexion();
        this.pasajeroData = pasajeroData;
        this.viajeData = viajeData;
        this.lugarData = lugarData;
    }
    
    public void crearPasaje(Pasaje pasaje) throws SQLException {
        String sql = "INSERT INTO pasajes (idPasajero, idLugar, idViaje, fechaVenta, horaVenta, precio, estado) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getLugar().getIdLugar());
            ps.setInt(3, pasaje.getLugar().getViaje().getIdViaje());
            ps.setDate(4, Date.valueOf(pasaje.getFechaVenta()));
            ps.setTime(5, Time.valueOf(pasaje.getHoraVenta()));
            ps.setDouble(6, pasaje.getPrecio());
            ps.setBoolean(7, true);
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id del pasaje");
            }
            
            System.out.println("Pasaje creado correctamente.");
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo crear el pasaje." + e.getMessage());
            throw e;
        }
    }
    
    public Pasaje buscarPasaje(int idPasaje) throws SQLException {

        String sql = "SELECT p.*, l.numeroAsiento "
                        + "FROM pasajes p "
                        + "INNER JOIN lugares l ON p.idLugar = l.idLugar "
                        + "WHERE p.idPasaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int id = rs.getInt("idPasaje");
                int idPasajero = rs.getInt("idPasajero");
                int numeroAsiento = rs.getInt("numeroAsiento");
                int idViaje = rs.getInt("idViaje");
                LocalDate fechaVenta = rs.getDate("fechaVenta").toLocalDate();
                LocalTime horaVenta = rs.getTime("horaVenta").toLocalTime();
                double precio = rs.getDouble("precio");
                boolean estado = rs.getBoolean("estado");
                
                Pasajero pasajero = pasajeroData.buscarPasajeroId(idPasajero);
                Viaje viaje = viajeData.buscarViaje(idViaje);
                Lugar lugar = lugarData.buscarLugarDeUnViaje(numeroAsiento, viaje);
                
                Pasaje pasaje = new Pasaje(pasajero, lugar, viaje, fechaVenta, horaVenta, precio, estado);
                pasaje.setIdPasaje(idPasaje);

                return pasaje;
            }
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar el pasaje." + e.getMessage());
            throw e;
        }
        return null;
    }
    
    public ArrayList<Object[]> listarPasajesPorPasajero(
        int idPasajero, int mes, int anio) throws SQLException {

        ArrayList<Object[]> pasajes = new ArrayList<>();

        LocalDate fechaInicio = YearMonth.of(anio, mes).atDay(1);
        LocalDate fechaFin = YearMonth.of(anio, mes).plusMonths(1).atDay(1);

        String sql = "SELECT p.idPasaje, p.fechaVenta, p.horaVenta, "
                        + "l.numeroAsiento, v.origen, v.destino, "
                        + "v.fechaSalida, p.precio, c.matricula "
                        + "FROM pasajes p "
                        + "INNER JOIN lugares l ON p.idLugar = l.idLugar "
                        + "INNER JOIN viajes v ON p.idViaje = v.idViaje "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE p.idPasajero = ? "
                        + "AND p.fechaVenta >= ? "
                        + "AND p.fechaVenta < ? "
                        + "AND p.estado = 1 "
                        + "ORDER BY p.fechaVenta DESC, p.horaVenta ASC";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql); 

            ps.setInt(1, idPasajero);
            ps.setDate(2, Date.valueOf(fechaInicio));
            ps.setDate(3, Date.valueOf(fechaFin));
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                    Object[] fila = {
                        rs.getInt("idPasaje"),
                        rs.getDate("fechaVenta") + " - "
                        + rs.getTime("horaVenta"),
                        rs.getInt("numeroAsiento"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getDate("fechaSalida"),
                        rs.getDouble("precio"),
                        rs.getString("matricula")
                    };

                    pasajes.add(fila);
                }
        } catch (SQLException e) {
            System.out.println("No se pudo obtener los pasajes." + e.getMessage());
            throw e;
        }
        
        return pasajes;
    }
}
