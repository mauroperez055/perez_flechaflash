
package modelo;

public class Lugar {
    private int idLugar;
    private Viaje viaje;
    private int numeroAsiento;
    private boolean activo;
    
    public Lugar() {
    }

    public Lugar(int idLugar, Viaje viaje, int numeroAsiento, boolean activo) {
        this.idLugar = idLugar;
        this.viaje = viaje;
        this.numeroAsiento = numeroAsiento;
        this.activo = activo;
    }
    
    public Lugar(Viaje viaje, int numeroAsiento, boolean activo) {
        this.viaje = viaje;
        this.numeroAsiento = numeroAsiento;
        this.activo = activo;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Lugar--" + 
                   "\nidLugar: " + idLugar + ", "
                + "\nnumeroAsiento: " + numeroAsiento + ", "
                + "\nactivo: " + activo
                + "\n" + viaje;
    }
    
    
}
