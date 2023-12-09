
package app_capas;

import java.util.ArrayList;

public class Facade {
   //primera pantalla lista de departamentos
    public ArrayList<DepartamentoDTO> buscardepatamentos(){
        DepartamentoDAO dao=new DepartamentoDAO();
        ArrayList<DepartamentoDTO> listaDep=dao.buscarTodos();
        return listaDep;
    }
    //segunda pantalla lista de empleados de un departamento especifico
    public ArrayList<EmpleadoDTO> buscarEmpleados(int numeroD){
        EmpleadoDAO dao=new EmpleadoDAO();
        ArrayList<EmpleadoDTO> listaEmp=dao.buscarEmpleados(numeroD);
        return listaEmp;
    }
    
    //mostrar las 4 ultimas contrataciones
    public ArrayList<EmpleadoDTO> ultimoEmpleados(){
        EmpleadoDAO dao=new EmpleadoDAO();
        ArrayList<EmpleadoDTO> listaUl=dao.ultimosEmpleado();
        return listaUl;
    }
}
