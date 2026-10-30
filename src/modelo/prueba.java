
package modelo;

import control.ColectivoData;
import control.Conexion;
import control.LugarData;
import control.PasajeroData;
import control.ViajeData;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class prueba {
    
    private Conexion conexion;
    private PasajeroData pasajeroData;
    private ColectivoData colectivoData;
    private ViajeData viajeData;
    private LugarData lugarData;

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Pasajero pasajero = new Pasajero(38749011, "Mauro Gabriel", "Perez", "mauroperez055@gmail.com", "2657285374", true);
        Colectivo colectivo = new Colectivo("AB-123-CD", "Mercedes Benz", "2026", 62, "Chano", true);
        
        new prueba().conectarPasajero(pasajero);
        new prueba().conectarColectivo(colectivo);
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
            Colectivo cole = colectivoData.buscarColectivoMatricula("lig-219");
            
            this.conectarViaje(cole);
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
        
//        Viaje viaje = new Viaje("San Luis", "Villa Mercedes", LocalDate.of(2026, Month.NOVEMBER, 25), LocalDate.of(2026, Month.NOVEMBER, 25), Time.valueOf("08:15:00"), Time.valueOf("09:30:00"), cole, 80000, true);
//        viajeData.cargarViaje(viaje);

        Viaje viaje = new Viaje();
        
        viaje.setIdViaje(20);
        Viaje viajeEnc = viajeData.buscarViaje(viaje.getIdViaje());
//        viajeEnc.setColectivo(cole);
//        System.out.println(viajeEnc.toString());

//        for (Viaje viaje : viajeData.listarViajeOrigen("merce")) {
//            System.out.println(viaje.toString());
//        }

//        for (Viaje viaje : viajeData.listarViajeDestino("san luis")) {
//            System.out.println(viaje.toString());
//        }
        
//        for (Viaje viaje : viajeData.listarViajesActivos()) {
//            System.out.println(viaje.toString());
//        }
        
//        viajeData.actualizarViaje(viajeEnc);
//        viajeData.eliminarViaje(viajeEnc);
//        viajeData.bajaLógicaViaje(viajeEnc);
//        viajeData.altaLógicaViaje(viajeEnc);

           this.conectarLugar(viajeEnc);
    }
    
    public void conectarLugar(Viaje viaje) throws SQLException {
        conexion = new Conexion("jdbc:mariadb://localhost/perezmauro_flechaflash", "root", "");
        lugarData = new LugarData(conexion);
        
//        Lugar lugar = new Lugar(viaje, 9, true);
//        lugarData.crearLugar(lugar);

//        Lugar lugar = lugarData.buscarLugarDeUnViaje(25, viaje);
//        lugar.setNumeroAsiento(7);
//        lugarData.actualizarLugar(lugar);
//        lugarData.eliminarLugar(1);
//        lugarData.bajaLogicaLugar(2);
        lugarData.altaLogicaLugar(2);
    }
}
