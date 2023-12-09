
package App;


public class Theads implements Runnable{
    private String nombre;

    public Theads(String nombre) {
        this.nombre = nombre;
    }
    //metodo que ejecutara el hilo
    @Override
    public void run(){
        try {
            //poner adormir el hilo una cantidad de siegundos
            Thread.sleep(1000);
            System.out.println("Soy "+nombre);
            
        } catch (Exception e) {
            System.out.println("Error al ejecutar el Thread: "+e.getMessage());
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        //se deben crear instancia de hilo y dentro crear la instancia de la clase que lo ejecutara
        Thread hilo1 = new Thread(new Theads("Alejandra"));
        Thread hilo2 = new Thread(new Theads("Linda"));
        Thread hilo3 = new Thread(new Theads("Yessica"));
        
        //se inicia los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
        
        //esperar a que termine el hilo
        hilo1.join();
       
        System.out.println("Final del programa");
    }
}
