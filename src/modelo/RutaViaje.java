
package modelo;

import java.time.LocalTime;

public class RutaViaje {
    private int idRuta;
    private String origen;
    private String destino;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private Colectivo colectivo;
    private double precio;
    private boolean activo;

    public RutaViaje(int idRuta, String origen, String destino, LocalTime horaSalida, LocalTime horaLlegada, Colectivo colectivo, double precio, boolean activo) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.colectivo = colectivo;
        this.precio = precio;
        this.activo = activo;
    }
    
    public RutaViaje(String origen, String destino, LocalTime horaSalida, LocalTime horaLlegada, Colectivo colectivo, double precio, boolean activo) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.colectivo = colectivo;
        this.precio = precio;
        this.activo = activo;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
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

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
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
        return "RutaViaje--" + 
                   "\nidRuta: " + idRuta + ", "
                + "\norigen: " + origen + ", "
                + "\ndestino: " + destino + ", "
                + "\nhoraSalida: " + horaSalida + ", "
                + "\nhoraLlegada: " + horaLlegada + ", "
                + "\ncolectivo: " + colectivo + ", "
                + "\nprecio: " + precio + ", "
                + "\nactivo: " + activo;
    }
    
    
}
