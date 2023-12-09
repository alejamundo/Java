
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Forma_pagoDAO {
    Conexion cn = new Conexion();
    PreparedStatement pstm = null;
    ResultSet rs = null;

    //metodo que me liste todos los medio de pago
    public ArrayList<Forma_pagoDTO> getforma_pago() {
        ArrayList formas = new ArrayList();
        String sql = "SELECT * FROM forma_pago";

        try {
            pstm = cn.getConexion().prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Forma_pagoDTO dto = new Forma_pagoDTO();
                dto.setId_forma_pago(rs.getInt("id_forma_pago"));
                dto.setDescription(rs.getString("descripcion"));
                dto.setRecarga(rs.getDouble("recarga"));
                formas.add(dto);
            }
            System.out.println("************************");

        } catch (Exception e) {
            System.out.println("Error al consultar los cursos: " + e.getMessage());
        }
        return formas;
    }
   
}

