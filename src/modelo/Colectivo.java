
package modelo;

public class Colectivo {
    private int idColectivo;
    private String matricula;
    private String marca;
    private String modelo;
    private int capacidad;
    private String chofer;
    private boolean activo;

    public Colectivo() {
    }

    public Colectivo(int idColectivo, String matricula, String marca, String modelo, int capacidad, String chofer, boolean activo) {
        this.idColectivo = idColectivo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.chofer = chofer;
        this.activo = activo;
    }
    
    public Colectivo(String matricula, String marca, String modelo, int capacidad, String chofer, boolean activo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.chofer = chofer;
        this.activo = activo;
    }

    public int getIdColectivo() {
        return idColectivo;
    }

    public void setIdColectivo(int idColectivo) {
        this.idColectivo = idColectivo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Colectivo--" + ""
                + "\nidColectivo: " + idColectivo + ", "
                + "\nmatricula: " + matricula + ", "
                + "\nmarca: " + marca + ", "
                + "\nmodelo: " + modelo + ", "
                + "\ncapacidad: " + capacidad + ", "
                + "\nchofer: " + chofer + ", "
                + "\nactivo: " + activo;
    }
    
    
}
