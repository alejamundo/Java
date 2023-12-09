
package clases;
import java.sql.*;
public class ConexionSingleton {
    //crear una variable statica que almacene la conexion;
    private static Connection con=null;
    
    //crearemos un constructor privado el cual garantizara una solo instancia;
    private ConexionSingleton() {
        String url="jdbc:sqlserver://localhost:1433;"
                + "database=trabajadores;"
                + "user=Aleja;"
                + "password=1234;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30";
        
        try {
            con=DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    //como el constructor es privado debemos crear un metodo que llame el constructo 
    //desde la propia clase
    public static Connection getConnection(){
        if (con==null) {
            new ConexionSingleton();//se creo una unica instancia de la conexion
        }
        return con;
    }
    
    //ya podrmos usar esa conexion desde cualquier parte de nuestro programa;
    
}
