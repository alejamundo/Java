
package app_capas;
import java.sql.*;
import java.util.ArrayList;

public class EmpleadoDAO {
    //traer todos los empleadosque pertenezcan al mismo numeor de departamento
    public ArrayList<EmpleadoDTO> buscarEmpleados(int numeroD){
        Connection cn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        
        try {
            cn=Conexion.getConnection();
            String sql="SELECT id,nombre,numerod,fecha FROM empleados WHERE numerod=?";
            pstm=cn.prepareStatement(sql);
            pstm.setInt(1, numeroD);
            rs=pstm.executeQuery();
            ArrayList<EmpleadoDTO> listaEmpleado=new ArrayList<>();
            EmpleadoDTO dto=null;
            
            while (rs.next()) {                
                dto=new EmpleadoDTO();
                dto.setNumerod(rs.getInt(3));
                dto.setNombre(rs.getString(2));
                dto.setFecha(rs.getDate(4));
                listaEmpleado.add(dto);
            }
            return listaEmpleado;
        } catch (Exception e) {
            System.out.println("Error al buscar: "+e.getMessage());
        }finally{
            try {
                if(pstm!=null)pstm.close();
                if(rs!=null)rs.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar pstm--rs");
            }
        }
        return null;
    }
    
    //traer a  los 4 ultimos empleados en contractar
    public ArrayList<EmpleadoDTO> ultimosEmpleado(){
        Connection cn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        
        try {
            cn=Conexion.getConnection();
            String sql="SELECT TOP 4 * FROM empleados ORDER BY fecha DESC";
            pstm=cn.prepareStatement(sql);
            rs=pstm.executeQuery();
            ArrayList<EmpleadoDTO> listaEmp=new ArrayList<>();
            EmpleadoDTO dto=null;
            while (rs.next()) {                
                dto=new EmpleadoDTO();
                dto.setId(rs.getInt(1));
                dto.setNombre(rs.getString(2));
                dto.setNumerod(rs.getInt(3));
                dto.setFecha(rs.getDate(4));
                listaEmp.add(dto);
            }
            return listaEmp;
        } catch (Exception e) {
            System.out.println("Error al buscar Ultimos empleados en contratar: "+e.getMessage());
        }finally{
            try {
                if(pstm!=null)pstm.close();
                if(rs!=null)rs.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar pstm -- rs: "+e.getMessage());
            }
        }
        return null;
    }
    
}
