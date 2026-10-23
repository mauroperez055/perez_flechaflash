
package modelo;

import control.Conexion;
import control.PasajeroData;
import java.sql.SQLException;

public class prueba {
    
    private Conexion conexion;
    private PasajeroData pasajeroData;

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Pasajero pasajero = new Pasajero(38749011, "Mauro Gabriel", "Perez", "mauroperez055@gmail.com", "2657285374", true);
        
        new prueba().conectar(pasajero);
    }
    
    public void conectar(Pasajero pasajero) throws SQLException {
        conexion = new Conexion("jdbc:mariadb://localhost/perezmauro_flechaflash", "root", "");

        pasajeroData = new PasajeroData(conexion);
        
//        pasajeroData.cargarPasajero(pasajero);
        
//        Pasajero pasajeroEncontrado = pasajeroData.buscarPasajeroDni(38749011);
//        System.out.println(pasajeroEncontrado.toString());
//        pasajeroData.actualizarPasajero(pasajero);
            
//        pasajero.setIdPasajero(1);
//        pasajeroData.bajaLogicaPasajero(pasajero);
//        pasajeroData.altaLogicaPasajero(pasajero);

        for (Pasajero pas : pasajeroData.listarTodosLosPasajeros()) {
            System.out.println(pas.toString());
        }
        
//        for (Pasajero pas : pasajeroData.listarPasajerosActivos()) {
//            System.out.println(pas.toString());
//        }

//        for (Pasajero pas : pasajeroData.listarPasajerosInactivos()) {
//            System.out.println(pas.toString());
//        }
         
//        pasajero.setIdPasajero(3);
//        pasajeroData.eliminarPasajero(pasajero);
    }
}
