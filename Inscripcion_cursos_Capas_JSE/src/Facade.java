
import java.util.ArrayList;


public class Facade {
    //lo unico que hace esta clase es comunicar el dao y dto
    //para luego mostrar por medio de la capa de app
    public ArrayList<CursoDTO> getCursos(){
        CursoDAO dao=new CursoDAO();
        return  dao.getCursos();
    }
    
    //obtener forma de pago
    public ArrayList<Forma_pagoDTO> getforma_pago(){
        Forma_pagoDAO dao=new Forma_pagoDAO();
        return  dao.getforma_pago();
    }
    
    //insertar inscripto
    public int registrarInscripcion(InscripcionDTO dto){
        InscripcionDAO dao=new InscripcionDAO();
        return dao.insertarInscripto(dto);
        
    }
    
}
