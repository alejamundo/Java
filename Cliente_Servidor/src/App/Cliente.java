package App;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Cliente {

    public static void main(String[] args) throws IOException {
        ObjectInputStream entrada = null;
        ObjectOutputStream salida = null;

        Socket extencion = null;
        
        try {
            //instanciamos el servidor con la ip y el puerto
            extencion=new Socket("192.168.1.13" , 5432);
            salida=new ObjectOutputStream(extencion.getOutputStream());
            entrada=new ObjectInputStream(extencion.getInputStream()); 
            
            //envio un nombre
            salida.writeObject("Alejandra");
            
            //resivo la respuesta
            String respuesta=(String) entrada.readObject();
            System.out.println(respuesta); 
            
        } catch (Exception e) {
            System.out.println("Error del lado cliente: "+e.getMessage());
        }finally{
            if(entrada!=null)entrada.close();
            if(salida!=null)salida.close();
            if(extencion!=null)extencion.close();
        }
    }

}
