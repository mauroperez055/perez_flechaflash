
package modelo;

public class Lugar {
    private int idLugar;
    private Colectivo colectivo;
    private int numeroAsiento;
    private boolean activo;

    public Lugar(int idLugar, Colectivo colectivo, int numeroAsiento, boolean activo) {
        this.idLugar = idLugar;
        this.colectivo = colectivo;
        this.numeroAsiento = numeroAsiento;
        this.activo = activo;
    }
    
    public Lugar(Colectivo colectivo, int numeroAsiento, boolean activo) {
        this.colectivo = colectivo;
        this.numeroAsiento = numeroAsiento;
        this.activo = activo;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
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
                + "\ncolectivo: " + colectivo + ", "
                + "\nnumeroAsiento: " + numeroAsiento + ", "
                + "\nactivo: " + activo;
    }
    
    
}
