
package app_capas;

public class DepartamentoDTO {
    private int numerod;
    private String nombred;
    private String localidad;

    @Override
    public String toString() {
        return "Departamento{" + "número=" + numerod + ", nombre=" + nombred + ", localidad=" + localidad + '}';
    }

    
    public int getNumerod() {
        return numerod;
    }

    public void setNumerod(int numerod) {
        this.numerod = numerod;
    }

    public String getNombred() {
        return nombred;
    }

    public void setNombred(String nombred) {
        this.nombred = nombred;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
}
