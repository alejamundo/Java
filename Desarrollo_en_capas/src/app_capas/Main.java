package app_capas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //DepartamentoDAO dao=new DepartamentoDAO();
        //ArrayList<DepartamentoDTO> lista=dao.buscarTodos();

        // for (DepartamentoDTO dto : lista) {
        //   System.out.println(dto);
        //}
        //EmpleadoDAO dao=new EmpleadoDAO();
        //ArrayList<EmpleadoDTO> listaEmpleados=dao.buscarEmpleados(2);
        //for (EmpleadoDTO listaEmpleado : listaEmpleados) {
        //  System.out.println(listaEmpleado);
        //}
        Facade facade = new Facade();
        ArrayList<DepartamentoDTO> listaDep = facade.buscardepatamentos();
        mostrarDep(listaDep);

        System.out.println("Ingrese un departamento");
        Scanner teclado = new Scanner(System.in);
        int numeroD = teclado.nextInt();

        ArrayList<EmpleadoDTO> listaEmp = facade.buscarEmpleados(numeroD);
        mostrarEmpl(numeroD, listaEmp);

        
        ArrayList<EmpleadoDTO> listaUl=facade.ultimoEmpleados();
        mostrarUlt(listaUl);
    }

    public static void mostrarDep(ArrayList<DepartamentoDTO> listaDep) {
        System.out.println("Departamentos");
        System.out.println("_____________________");
        for (DepartamentoDTO departamentoDTO : listaDep) {
            System.out.print(departamentoDTO.getNumerod() + "\t");
            System.out.print(departamentoDTO.getNombred() + "\t");
            System.out.println(departamentoDTO.getLocalidad() );

        }
        System.out.println("_____________________");
    }

    public static void mostrarEmpl(int numeroD, ArrayList<EmpleadoDTO> listaEmp) {
        System.out.println("Empleados con departamento: " + numeroD);
        System.out.println("_____________________________");

        for (EmpleadoDTO empleadoDTO : listaEmp) {
            System.out.print(empleadoDTO.getNumerod() + "\t");
            System.out.print(empleadoDTO.getNombre() + "\t");
            System.out.println(empleadoDTO.getFecha());
        }
        System.out.println("___________________________");
    }
    public static void mostrarUlt(ArrayList<EmpleadoDTO> listaUl){
        System.out.println("Ultimas Contractacciones");
        System.out.println("__________________________");
        
        for (EmpleadoDTO empleadoDTO : listaUl) {
            System.out.print(empleadoDTO.getId()+"\t");
            System.out.print(empleadoDTO.getNombre()+"\t");
            System.out.print(empleadoDTO.getNumerod()+"\t");
            System.out.println(empleadoDTO.getFecha());
        }
        System.out.println("_____________________________");
    }
}
