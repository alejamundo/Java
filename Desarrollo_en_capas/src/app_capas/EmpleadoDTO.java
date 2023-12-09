
package app_capas;
import java.util.Date;

public class EmpleadoDTO {
    private int id;
    private String nombre;
    private int numerod;
    private Date fecha;

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + nombre + ", #Departamento=" + numerod + ", fecha=" + fecha + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerod() {
        return numerod;
    }

    public void setNumerod(int numerod) {
        this.numerod = numerod;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
