package app_capas;

import java.util.ArrayList;
import java.sql.*;

public class DepartamentoDAO {

    public ArrayList<DepartamentoDTO> buscarTodos() {

        Connection cn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            cn = Conexion.getConnection();
            String sql = "SELECT * FROM departamento";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            ArrayList<DepartamentoDTO> lista=new ArrayList<>();
            DepartamentoDTO objetoDTO;

            while (rs.next()) {
                objetoDTO = new DepartamentoDTO();
                objetoDTO.setNumerod(rs.getInt(1));
                objetoDTO.setNombred(rs.getString(2));
                objetoDTO.setLocalidad(rs.getString(3));
                //agg al array
                lista.add(objetoDTO);
            }
            return lista;

        } catch (Exception e) {
            System.out.println("Error al buscar: " + e.getMessage());
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (rs != null) {
                    rs.close();
                }
                
            } catch (Exception e) {
                System.out.println("Error al cerrar pstm--rs: " + e.getMessage());
            }
        }
        return null;
    }
}
