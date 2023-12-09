
package stringbuffer;

public class StringBuffer {

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Hola");
        s.append("\t como estas?");
        int capacidad=s.capacity();
        System.out.println("reversa: "+s.reverse());
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Builder: "+s);
        String sb = new StringBuffer().toString();
        
    }


    
}
