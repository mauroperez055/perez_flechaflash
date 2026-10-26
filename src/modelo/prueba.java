
package modelo;

import control.ColectivoData;
import control.Conexion;
import control.PasajeroData;
import java.sql.SQLException;

public class prueba {
    
    private Conexion conexion;
    private PasajeroData pasajeroData;
    private ColectivoData colectivoData;

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
//        Pasajero objeto = new Pasajero(38749011, "Mauro Gabriel", "Perez", "mauroperez055@gmail.com", "2657285374", true);
        Colectivo objeto = new Colectivo("XYZ-789", "Scania", "2023", 30, "Chiqui Tapia Boton", true);
//        new prueba().conectar(objeto);
        new prueba().conectar(objeto);
    }
    
    public void conectar(Object objeto) throws SQLException {
        conexion = new Conexion("jdbc:mariadb://localhost/perezmauro_flechaflash", "root", "");

        if (objeto instanceof Pasajero) {
//            pasajeroData = new PasajeroData(conexion);
        
//        pasajeroData.cargarPasajero(pasajero);
        
//        Pasajero pasajeroEncontrado = pasajeroData.buscarPasajeroDni(38749011);
//        System.out.println(pasajeroEncontrado.toString());
//        pasajeroData.actualizarPasajero(pasajero);
            
//        pasajero.setIdPasajero(1);
//        pasajeroData.bajaLogicaPasajero(pasajero);
//        pasajeroData.altaLogicaPasajero(pasajero);

//        for (Pasajero pas : pasajeroData.listarTodosLosPasajeros()) {
//            System.out.println(pas.toString());
//        }
        
//        for (Pasajero pas : pasajeroData.listarPasajerosActivos()) {
//            System.out.println(pas.toString());
//        }

//        for (Pasajero pas : pasajeroData.listarPasajerosInactivos()) {
//            System.out.println(pas.toString());
//        }
         
//        pasajero.setIdPasajero(3);
//        pasajeroData.eliminarPasajero(pasajero);
        }
        
        if (objeto instanceof Colectivo) {
            colectivoData = new ColectivoData(conexion);
            Colectivo colectivo = (Colectivo) objeto;
            
//            colectivoData.cargarColectivo(colectivo);

            Colectivo cole = colectivoData.buscarColectivoMatricula("xyz-789");
//            cole.setChofer("Leo Ponzio");
//            System.out.println(cole.toString());
            
//            colectivoData.actualizarColectivo(cole);
            
//            for (Colectivo cole : colectivoData.listarTodosLosColectivos()) {
//                System.out.println(cole.toString());
//            }
            
//            for (Colectivo cole : colectivoData.listarColectivosActivos()) {
//                System.out.println(cole.toString());
//            }

//            for (Colectivo cole : colectivoData.listarColectivosInactivos()) {
//                System.out.println(cole.toString());
//            }
        
            colectivoData.eliminarColectivo(cole);
        }
        
    }
}
