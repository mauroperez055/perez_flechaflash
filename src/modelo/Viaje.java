
package modelo;

import java.time.LocalTime;
import java.sql.Time;

public class Viaje {
    private int idViaje;
    private String origen;
    private String destino;
    private Time horaSalida;
    private Time horaLlegada;
    private Colectivo colectivo;
    private double precio;
    private boolean activo;

    public Viaje(int idViaje, String origen, String destino, Time horaSalida, Time horaLlegada, Colectivo colectivo, double precio, boolean activo) {
        this.idViaje = idViaje;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.colectivo = colectivo;
        this.precio = precio;
        this.activo = activo;
    }
    
    public Viaje(String origen, String destino, Time horaSalida, Time horaLlegada, Colectivo colectivo, double precio, boolean activo) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.colectivo = colectivo;
        this.precio = precio;
        this.activo = activo;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Time getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Viaje--" + 
                   "\nidViaje: " + idViaje + ", "
                + "\norigen: " + origen + ", "
                + "\ndestino: " + destino + ", "
                + "\nhoraSalida: " + horaSalida + ", "
                + "\nhoraLlegada: " + horaLlegada + ", "
                + "\nprecio: " + precio + ", "
                + "\nactivo: " + activo + ", "
                + "\ncolectivo: " + colectivo;
    }
    
    
}
