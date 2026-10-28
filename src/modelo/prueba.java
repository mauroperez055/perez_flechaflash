
package modelo;

import control.ColectivoData;
import control.Conexion;
import control.PasajeroData;
import control.ViajeData;
import java.sql.SQLException;
import java.sql.Time;

public class prueba {
    
    private Conexion conexion;
    private PasajeroData pasajeroData;
    private ColectivoData colectivoData;
    private ViajeData viajeData;

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Pasajero pasajero = new Pasajero(38749011, "Mauro Gabriel", "Perez", "mauroperez055@gmail.com", "2657285374", true);
        Colectivo colectivo = new Colectivo("AB-123-CD", "Mercedes Benz", "2026", 62, "Chano", true);
        
        new prueba().conectarPasajero(pasajero);
        new prueba().conectarColectivo(colectivo);
//        new prueba().conectarViaje();
    }
    
    public void conectarPasajero(Pasajero pasajero) throws SQLException {
        conexion = new Conexion("jdbc:mariadb://localhost/perezmauro_flechaflash", "root", "");

        pasajeroData = new PasajeroData(conexion);
        
//        pasajeroData.cargarPasajero(pasajero);
//        
//        Pasajero pasajeroEncontrado = pasajeroData.buscarPasajeroDni(38749011);
//        System.out.println(pasajeroEncontrado.toString());
//        pasajeroData.actualizarPasajero(pasajero);
//            
//        pasajero.setIdPasajero(1);
//        pasajeroData.bajaLogicaPasajero(pasajero);
//        pasajeroData.altaLogicaPasajero(pasajero);
//
//        for (Pasajero pas : pasajeroData.listarTodosLosPasajeros()) {
//            System.out.println(pas.toString());
//        }
//        
//        for (Pasajero pas : pasajeroData.listarPasajerosActivos()) {
//            System.out.println(pas.toString());
//        }
//
//        for (Pasajero pas : pasajeroData.listarPasajerosInactivos()) {
//            System.out.println(pas.toString());
//        }
//         
//        pasajero.setIdPasajero(3);
//        pasajeroData.eliminarPasajero(pasajero);
        
    }
    
    public void conectarColectivo(Colectivo colectivo) throws SQLException {
            conexion = new Conexion("jdbc:mariadb://localhost/perezmauro_flechaflash", "root", "");
            colectivoData = new ColectivoData(conexion);
//
//            colectivoData.cargarColectivo(colectivo);
//
            Colectivo cole = colectivoData.buscarColectivoMatricula("ab-123-cd");
            new prueba().conectarViaje(cole);
//            cole.setChofer("Leo Ponzio");
            
            
//            colectivoData.actualizarColectivo(cole);
            
//            for (Colectivo colec : colectivoData.listarTodosLosColectivos()) {
//                System.out.println(colec.toString());
//            }
//            
//            for (Colectivo colec : colectivoData.listarColectivosActivos()) {
//                System.out.println(colec.toString());
//            }
//
//            for (Colectivo colec : colectivoData.listarColectivosInactivos()) {
//                System.out.println(colec.toString());
//            }
//        
//            colectivoData.eliminarColectivo(cole);
        
    }
    
    public void conectarViaje(Colectivo cole) throws SQLException {
        conexion = new Conexion("jdbc:mariadb://localhost/perezmauro_flechaflash", "root", "");
        viajeData = new ViajeData(conexion);
        
//        Viaje viaje = new Viaje("Villa Mercedes", "Córdoba", Time.valueOf("21:00:00"), Time.valueOf("05:30:00"), cole, 50000, true);
//        viajeData.cargarViaje(viaje);
//        viaje.setIdViaje(10);
//        Viaje viajeEnc = viajeData.buscarViaje(viaje);
//        System.out.println(viajeEnc.toString());

//        for (Viaje viaje : viajeData.listarViajeOrigen("merce")) {
//            System.out.println(viaje.toString());
//        }

        for (Viaje viaje : viajeData.listarViajeDestino("san luis")) {
            System.out.println(viaje.toString());
        }
    }
}
