
package pack1;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private Date fecha;
    private String pais;
    private String genero;

    public Persona(String nombre, String apellido, String documento, Date fecha, String pais, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fecha = fecha;
        this.pais = pais;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", fecha=" + fecha + ", pais=" + pais + ", genero=" + genero + '}';
    }

  

    
    
    
    public static void main(String[] args) {
        //crear dos personas
        Date fecha=new Date(93,11,6);
        Date fecha2=new Date(94,3,7);
        
        Persona p1=new Persona("alejandra","Orrego", "123", fecha,"Medellí","Mujer");
        Persona p2=new Persona("Linda", "Higuita", "34556", fecha2,"Antioquia","Mujer");
        System.out.println(p1);
        System.out.println(p2);
    }
  
    

}
