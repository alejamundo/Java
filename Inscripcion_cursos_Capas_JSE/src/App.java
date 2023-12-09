
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class App extends JFrame {

    static Facade f = new Facade();

    public static void main(String[] args) {
        mostrarPantalla();
        obtener_cursos();
        obtener_formas();
        InscripciónCurso();
    }

    //metodos
    public static void mostrarPantalla() {
        new Pantalla_inscripción().setVisible(true);
    }

    public static void obtener_cursos() {
        ArrayList<CursoDTO> cursos = f.getCursos();

        for (CursoDTO curso : cursos) {
            Pantalla_inscripción.combocourse.addItem(curso.getDescripcion());
        }
    }

    public static void obtener_formas() {
        ArrayList<Forma_pagoDTO> forma = f.getforma_pago();

        for (Forma_pagoDTO formas : forma) {
            Pantalla_inscripción.combopay.addItem(formas.getDescription());
        }

    }

    public static void InscripciónCurso() {
        //tomo los datos del la pantalla luego de que le den confirmas
        Pantalla_inscripción.btnconfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre=Pantalla_inscripción.txtname.getText();
                String telefono=Pantalla_inscripción.txtiphone.getText();
                String curso= (String) Pantalla_inscripción.combocourse.getSelectedItem();
                String forma=(String) Pantalla_inscripción.combopay.getSelectedItem();
                int nforma=0,ncurso=0;
                if (curso.equals("Java Enterprise (JEE)")) {
                    ncurso=1;
                }else if (curso.equals("Java Aplicaction (JSE)")) {
                    ncurso=2;
                }else if (curso.equals("JUnit (Java)")) {
                    ncurso=3;
                }
                
                if (forma.equals("Tarjeta de crédito (1 pago)")) {
                    nforma=1;
                }else if (forma.equals("Tarjeta de crédito (6 pago)")) {
                    nforma=2;
                }else if (forma.equals("Tarjeta de crédito (12 pago)")) {
                    nforma=3;
                }
                
                InscripcionDTO dto=new InscripcionDTO();
                dto.setId_curso(ncurso);
                dto.setId_forma_pago(nforma);
                dto.setNombre(nombre);
                dto.setTelefono(telefono);
                f.registrarInscripcion(dto);
            }
        });

    }
}
