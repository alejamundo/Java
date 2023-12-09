package App;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ObjectInputStream entrada = null;
        ObjectOutputStream salida = null;

        Socket extencion = null;
        ServerSocket server = new ServerSocket(5432);

        while (true) {//bucle infinito
            try {
                //La extencion me la da el server
                extencion = server.accept();
                System.out.println("Se conectaron desde la ip: " + extencion.getInetAddress());

                //enmascaro la entrada y salida de byte
                entrada = new ObjectInputStream(extencion.getInputStream());
                salida = new ObjectOutputStream(extencion.getOutputStream());

                //leo el nombre que envia el cliente
                String nombre = (String) entrada.readObject();

                //armo el saludo personalizado que le enviare al cliente
                String saludo = "Hola " + nombre + " : tiempo actual: " + System.currentTimeMillis();

                //envio el saludo al quiente
                salida.writeObject(saludo);
                System.out.println("Saludo enviado");
            } catch (Exception e) {
                System.out.println("Error al conectar con cliente: "+e.getMessage());
            }finally{
                if (salida!=null)salida.close();
                if (entrada!=null)entrada.close();
                if (extencion!=null)extencion.close();
                
                    
                
            }

        }
        
    }
}
