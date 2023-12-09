
package app_capas;
import java.sql.*;
public class Conexion {
    private static Connection con=null;

    private Conexion() {
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
            System.out.println("Error al conectar: "+e.getMessage());
        }
    }
    
    public static Connection getConnection(){
        if (con==null) {
            new Conexion();
        }
        return con;
    }
    
}
