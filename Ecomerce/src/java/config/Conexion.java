package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private Connection con = null;
    private String url = "jdbc:sqlserver://localhost:1433;"
            + "database=carrito_compras;"
            + "user=danger;"
            + "password=1234;"
            + "encrypt=true;"
            + "loginTimeout=30;"
            + "trustServerCertificate=true;";
           

    public Connection getConexion() {
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Conectado a la BD");
        } catch (Exception e) {
            System.out.println("No se pudo conectar: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Conexion cn = new Conexion();
        cn.getConexion();
    }
}
