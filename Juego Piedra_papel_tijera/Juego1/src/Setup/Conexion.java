package Setup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

    private final String url = "jdbc:mysql://localhost/bd_juego";
    PreparedStatement psPrepararSentencia;
    Connection CN = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            CN = DriverManager.getConnection(url, "root", "");

            if (CN != null) {
                System.out.println("Conexión BD exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Conexion BD Denegada: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Conexion BD Denegada, ruta " + e);
        }
    }

    public Connection conectado() {
        return CN;
    }
}
