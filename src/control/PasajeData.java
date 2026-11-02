
package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Time;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import modelo.Pasaje;

public class PasajeData {
    private Connection conexion = null;

    public PasajeData(Conexion conex) {
        this.conexion = conex.buscarConexion();
    }
    
    public void crearPasaje(Pasaje pasaje) throws SQLException {
        String sql = "INSERT INTO pasajes VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getLugar().getIdLugar());
            ps.setInt(3, pasaje.getViaje().getIdViaje());
            ps.setDate(4, Date.valueOf(pasaje.getFechaVenta()));
            ps.setTime(5, Time.valueOf(pasaje.getHoraVenta()));
            ps.setDouble(6, pasaje.getPrecio());
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
}
