import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    String url="jdbc:sqlserver://localhost:1433;"
            + "database=inscripcion_cursos;"
            + "user=Aleja;"
            + "password=1234;"
            + "loginTimeout=30;"
            + "encrypt=true;"
            + "trustServerCertificate=true";
    Connection con=null;
    public Connection getConexion(){
        try {
            con=DriverManager.getConnection(url);
            System.out.println("Se conecto correctamente");
        } catch (Exception e) {
            System.out.println("Error al conectarse conla BD: "+e.getMessage());
        }
        return con;
    }
}
