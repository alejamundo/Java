package proyect_vectores;

import javax.swing.JOptionPane;

public class Proyect_vectores {

    public static void main(String[] args) {
        int opc;
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño del vector A"));

        ClaseVector A = new ClaseVector(tam);
        A.llenar();

        tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño del vector B"));
        ClaseVector B = new ClaseVector(tam);
        B.llenar();

        String menu = "Menu de opciones\n"
                + "1. Mostrar\n"
                + "2. Sumar\n"
                + "3. Comparar\n"
                + "4. Unión de vectores sin Repetidos\n"
                + "5. Intersección\n"
                + "6. Diferencia Simétrica\n"
                + "7. Ordenar \n"
                + "8. Busqueda Binaria\n"
                + "0. Salir\n"
                + "Digite la Opción:";

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1: 
                    A.ordenar(A);
                    JOptionPane.showMessageDialog(null, "Datos del vector A\n" +A.mostrar()
                            + "\nDatos del vector B\n" + B.mostrar());
                    break;
                case 2:

                    ClaseVector C = new ClaseVector(tam);
                    if (A.getTam() == B.getTam()) {
                        C = A.sumar(B);
                        JOptionPane.showMessageDialog(null, "Datos del vector A\n" + A.mostrar()
                                + "\nDatos del vector B\n" + B.mostrar()
                                + "\nDatos del vector Suma\n" + C.mostrar());

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden sumar porqué el tamaño de los vectores es Diferente");
                    }
                    break;
                case 3:
                    if (A.comparar(A, B)) {
                        JOptionPane.showMessageDialog(null, "Los vectores A y B son Iguales");
                    } else {
                        JOptionPane.showMessageDialog(null, "Los vectores A y B NO son Iguales");

                    }

                    break;
                case 4:
                    ClaseVector VectorUnion = A.union(A, B);
                    JOptionPane.showMessageDialog(null, "Datos del vector A\n" + A.mostrar()
                            + "\nDatos del vector B\n" + B.mostrar()
                            + "\nDatos del vector Union\n" + VectorUnion.mostrar());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Datos del vector A\n" + A.mostrar()
                            + "\nDatos del vector B\n" + B.mostrar()
                            + "\nDatos del vector Intersección\n" + A.interseccion(A, B).mostrar());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Datos del vector A\n" + A.mostrar()
                            + "\nDatos del vector B\n" + B.mostrar()
                            + "\nDatos del vector de Diferencia simetrica\n" + A.diferenciaSimetrica(A, B).mostrar());

                    break;
                case 7:
                    A.ordenar(A);
                    JOptionPane.showMessageDialog(null, "El vector A ha sido Ordenado");

                    break;
                case 8:
                    int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa dato a buscar"));
                    if (A.busquedaBinaria(dato, A) != -1) {
                        JOptionPane.showMessageDialog(null, "El Dato se encontro en la pocision: " + A.busquedaBinaria(dato, A));
                    }else{
                        JOptionPane.showMessageDialog(null, "Dato no encontrado");
                    }
                    
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        } while (opc != 0);
    }

}
