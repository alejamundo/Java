package clases;
import java.sql.*;

public class main {
    static Connection cn=null;
    static PreparedStatement pstm=null;
    static ResultSet rs=null;

    public static void main(String[] args) {
        listar();
        transacción();
    }
    
    public static void transacción(){
        try {
            //obtengo la conexion
            cn=ConexionSingleton.getConnection();
            
            //seteo el auto commit
            cn.setAutoCommit(false);
            
            //defini y ejecuto las transacción
            pstm=cn.prepareStatement("DELETE  FROM empleados WHERE numerod=?");
            pstm.setInt(1, 1);
            int rstd=pstm.executeUpdate();
            
            //valido si se efecto el update en una sola fila como se esperaba
            if (rstd==2) {
                cn.commit();
                System.out.println("Se elimino un registro");
            }else{
                
                System.out.println("Error al eliminar un solo registro ");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }finally{
            try {
                //rollback por si las dudas y hay que devolver los cambios generados
                if (cn !=null) cn.close();
                if (pstm != null) pstm.close();   
                
            } catch (Exception e) {
                System.out.println("Erros: "+e.getMessage());
            }
        }
    }

    public static void listar() {
        
        
        try {
            cn = ConexionSingleton.getConnection();
            pstm = cn.prepareStatement("SELECT * FROM empleados");
            rs = pstm.executeQuery();

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Ndep: " + rs.getInt("numerod"));
                System.out.println("Fecha: " + rs.getDate("fecha"));
                System.out.println("__________________________________");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error al conectar: "+e.getMessage());
        }finally{
            try {
                //rs.close();
                //pstm.close();
                //cn.close();
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
            
            System.out.println("Cierre de coneciones");
        }

    }

}
