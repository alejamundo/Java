package config;
//1)primer paso importar clases de conexion

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Conexion {

    public Connection getConnection() {
        //2) crear el string con la URL de conexion
        String url = "jdbc:sqlserver://localhost:1433;" //el localhost es el nombre del servidor, y el 1433 el puerto
                + "database =Registro;"
                + "user =Aleja;" //Ingresa aquí el nombre del usuario creado
                + "password =1234;" //la contrase{a
                + "loginTimeout =30;"
                + "encrypt=true;"
                + "trustServerCertificate=true";
        //3)intentar conectar con el servidor sql server
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Conectado al servidor Sql");
            //return con;
        } catch (SQLException e) {
            System.out.println("Imposible la conección");
            System.out.println(e.getMessage());
        }

        return con;
    }

}