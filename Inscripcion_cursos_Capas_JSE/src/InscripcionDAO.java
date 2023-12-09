
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InscripcionDAO {

    public int insertarInscripto(InscripcionDTO dto) {
        String sql = "INSERT INTO inscripcion VALUES(?,?,?,?)";
        Conexion con = new Conexion();
        PreparedStatement pstm=null;
        ResultSet rs=null;
        int i=0;
        
        try {
            
            Connection cn = con.getConexion();
            pstm=cn.prepareStatement(sql);
            pstm.setString(1, dto.getNombre());
            pstm.setString(2, dto.getTelefono());
            pstm.setInt(3, dto.getId_curso());
            pstm.setInt(4, dto.getId_forma_pago());
            
            pstm.executeUpdate();
            System.out.println("Registro realizado con exito");
            
        } catch (Exception e) {
            System.out.println("error al insertar un inscripción: "+e.getMessage());
            e.printStackTrace();
        }
        return i;
    }

}
