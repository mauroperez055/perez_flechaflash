
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Comparator;
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

    public Viaje buscarViaje(int idViaje) throws SQLException {
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
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
                
                Viaje viajeEncontrado = new Viaje(idV, origen, destino, horaSalida, horaLlegada, colectivo, precio, estado);
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
        String sql = "UPDATE viajes SET origen = ?, destino = ?, horaSalida = ?, horaLlegada = ?, idColectivo = ?, precio = ? WHERE idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, viaje.getOrigen());
            ps.setString(2, viaje.getDestino());
            ps.setTime(3, viaje.getHoraSalida());
            ps.setTime(4, viaje.getHoraLlegada());
            ps.setInt(5, viaje.getColectivo().getIdColectivo());
            ps.setDouble(6, viaje.getPrecio());
            ps.setInt(7, viaje.getIdViaje());
            
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
    
    /* Llama al metodo privado para obtener los viajes activos desde un origen */
    public ArrayList<Viaje> listarViajeOrigen(String origen) throws SQLException {
        return listarViajesPorCriterio("origen",  origen);
    }
    
    /* Llama al metodo privado para obtener los viajes activos hacia un destino */
    public ArrayList<Viaje> listarViajeDestino(String destino) throws SQLException {
        return listarViajesPorCriterio("destino",  destino);
    }
    
    /* 
        Metodo privado que recibe un criterio de busqueda (origen o destino) 
        y un valor que toma el origen o el destino y devuelve una lista de viajes activos
    */
    private ArrayList<Viaje> listarViajesPorCriterio(String criterio, String valor) throws SQLException {
        ArrayList<Viaje> viajesCriterio = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v." + criterio + " = ? "
                        + "ORDER BY v.horaSalida ASC";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, valor);
            
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
                
                viajesCriterio.add(viaje);
            }
            
            return viajesCriterio;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }
    
    public ArrayList<String> listarDestinos() throws SQLException {
        ArrayList<String> destinos = new ArrayList<>();
        
        String sql = "SELECT DISTINCT destino FROM viajes ORDER BY destino";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            destinos.add(rs.getString("destino"));
        }

        return destinos;
    }
    
    public ArrayList<String> listarOrigenes() throws SQLException {
        ArrayList<String> origenes = new ArrayList<>();
        
        String sql = "SELECT DISTINCT origen FROM viajes ORDER BY origen";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            origenes.add(rs.getString("origen"));
        }

        return origenes;
    }
    
    /* Todos los viajes activos */
    public ArrayList<Viaje> listarViajesActivos() throws SQLException {
        ArrayList<Viaje> viajesActivos = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "WHERE v.estado = 1 "
                        + "ORDER BY v.horaSalida ASC";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
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
                
                viajesActivos.add(viaje);
            }
            
            return viajesActivos;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }
    
    /* listar todos los viajes */
    public ArrayList<Viaje> listarViajes() throws SQLException {
        ArrayList<Viaje> viajes = new ArrayList<>();
        String sql = "SELECT v.idViaje, v.origen, v.destino, v.horaSalida, v.horaLlegada, v.idColectivo, v.precio, v.estado AS estadoViaje, "
                        + "c.matricula, c.marca, c.modelo, c.capacidad, c.chofer, c.estado AS estadoCole "
                        + "FROM viajes v "
                        + "INNER JOIN colectivos c ON v.idColectivo = c.idColectivo "
                        + "ORDER BY v.horaSalida ASC";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
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
                
                viajes.add(viaje);
            }
            
            return viajes;
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar los viajes." + e.getMessage());
            throw e;
        }
    }

    /* 3. Ver colectivos y choferes asignados a un Viaje determinado (origen, destino), ordenados por hora de salida */
    public ArrayList<Viaje> viajeInfoColectivo(Viaje viaje) throws SQLException {
        ArrayList<Viaje> viajeInfoColectivo = new ArrayList<>();
        String sql = "SELECT v.origen, v.destino, v.horaSalida, v.horaLlegada, c.idColectivo, c.chofer "
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
    
    public boolean tienePasajes(int idViaje) throws SQLException {
        String sql ="SELECT EXISTS ( "
                        + "SELECT 1 "
                        + "FROM pasajes "
                        + "WHERE idViaje = ? "
                        + ") AS tienePasajes;";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idViaje);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getBoolean("tienePasajes");
            }
            
            return false;
        } catch (SQLException e) {
            System.out.println("No se pudo verificar si tiene pasajes." + e.getMessage());
            throw e;
        }
    }
    
    public String verificarDisponibilidad(Viaje viaje) throws SQLException {
        String sql = "SELECT horaSalida, horaLlegada FROM viajes WHERE idColectivo = ? AND estado = 1 AND idViaje <> ?";
        
        // usamos las horas en minutos porque es mas facil comparar enteros
        int inicioNuevo = horasAMinutos(viaje.getHoraSalida());
        int finNuevo = horasAMinutos(viaje.getHoraLlegada());
        
        // si el viaje termina pasando la medianoche necesitamos sumarle un dia entero en minutos
        if (finNuevo < inicioNuevo) {
            finNuevo += 1440;
        }
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, viaje.getColectivo().getIdColectivo());
            ps.setInt(2, viaje.getIdViaje());
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int inicioExistente = horasAMinutos(rs.getTime("horaSalida"));
                int finExistente = horasAMinutos(rs.getTime("horaLlegada"));
                
                // si el viaje que ya existe termina pasada la medianoche tenemos que sumar un dia entero en minutos
                if (finExistente < inicioExistente) {
                    finExistente += 1440;
                }
                
                // como los viajes son programados diariamente hay que comparar en intervalos
                // del dia anterior y siguiente 
                for (int desplazamiento = -1440; desplazamiento <= 1440; desplazamiento += 1440) {
                    int inicioDesplazado = inicioExistente + desplazamiento;
                    int finDesplazado = finExistente + desplazamiento;
                    
                    boolean superposicion = inicioNuevo < finDesplazado && finNuevo > inicioDesplazado;
                    
                    if (superposicion) {
                        return "El colectivo ya tiene asignado un viaje en ese rango horario.";
                    }
                }
                
            }
        } catch (SQLException e) {
            System.out.println("No se pudo verificar la disponibilidad" + e.getMessage());
            throw e;
        }
        
        // si no se encuentra ninguna superposicion
        return null;
    }
    
    private int horasAMinutos(Time hora) {
        return hora.toLocalTime().toSecondOfDay() / 60;
    }

    public void eliminarLugaresAnteriores(int idViaje) throws SQLException {
        String sql ="DELETE FROM lugares WHERE idViaje = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idViaje);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                System.out.println("Se eliminaron los lugares del viaje " + idViaje);
            } else {
                System.out.println("No se pudo eliminar los lugares.");
            }
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar los lugares." + e.getMessage());
            throw e;
        }
    }
}
