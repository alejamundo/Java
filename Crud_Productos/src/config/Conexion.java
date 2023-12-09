
package config;
import java.sql.*;

public class Conexion {
    String url="jdbc:sqlserver://localhost;"
            + "database=inventario;"
            + "user=Aleja;"
            + "password=1234;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";
    Connection con=null;
    public Connection getConnection(){
        try {
            con=DriverManager.getConnection(url);
            System.out.println("Conectado correctamente");
        } catch (SQLException ex) {
            System.out.println("La conección fallo: "+ex.getMessage());
        }
        return con;
    }
   
}
