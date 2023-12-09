
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CursoDAO {

    Conexion cn = new Conexion();
    PreparedStatement pstm = null;
    ResultSet rs = null;

    //metodo que me liste todos los cursos disponibles 
    public ArrayList<CursoDTO> getCursos() {
        ArrayList cursos = new ArrayList();
        String sql = "SELECT * FROM curso";

        try {
            pstm = cn.getConexion().prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                CursoDTO dto = new CursoDTO();
                dto.setId_curso(rs.getInt("id_curso"));
                dto.setDescripcion(rs.getString("descripcion"));
                dto.setPrecio(rs.getDouble("precio"));
                cursos.add(dto);
            }
            System.out.println("************************");

        } catch (Exception e) {
            System.out.println("Error al consultar los cursos: " + e.getMessage());
        }
        return cursos;
    }
}
