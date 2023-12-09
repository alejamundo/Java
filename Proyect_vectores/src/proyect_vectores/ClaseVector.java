package proyect_vectores;

import javax.swing.JOptionPane;

public class ClaseVector {

    private int tam;
    private int vec[];

    //Método Constructor
    public ClaseVector(int tam) {
        this.tam = tam;
        this.vec = new int[tam];
    }

    //Método Mostrar 1
    public String mostrar() {
        String salida = "";
        for (int i = 0; i < tam; i++) {
            salida = salida + vec[i] + "  ";
        }
        return salida;
    }

    //Método Llenar 
    public void llenar() {
        for (int i = 0; i < tam; i++) {
            vec[i] = (int) (Math.random() * 10 + 1);
        }
    }

    //Método Sumar dos vectores 2
    public ClaseVector sumar(ClaseVector B) {
        ClaseVector R = new ClaseVector(tam);
        for (int i = 0; i < tam; i++) {
            R.setDato(vec[i] + B.getDato(i), i);
        }
        return R;
    }

    //Método ordenar 7
    public void ordenar(ClaseVector A) {
        for (int i = 0; i < A.getTam(); i++) {
            for (int j = 1; j < (A.getTam() - i); j++) {
                if (A.getDato(j - 1) > A.getDato(j)) {
                    int temporal = A.getDato(j - 1);
                    A.setDato(A.getDato(j), j - 1);
                    A.setDato(temporal, j);
                }
            }
        }
    }

    //Método ordenar2 de mayor a menor
    public void ordenar2(ClaseVector A) {
        for (int i = 0; i < A.getTam(); i++) {
            for (int j = 1; j < (A.getTam() - i); j++) {
                if (A.getDato(j - 1) < A.getDato(j)) {
                    int temporal = A.getDato(j - 1);
                    A.setDato(A.getDato(j), j - 1);
                    A.setDato(temporal, j);

                }
            }
        }
    }

    public boolean comparar(ClaseVector A, ClaseVector B) {
        boolean son_iguales = false;
        int cont = 0;
        if (A.getTam() == B.getTam()) {
            for (int i = 0; i < tam; i++) {
                if (A.getDato(i) == B.getDato(i)) {
                    cont++;
                }
            }
            if (cont == tam) {
                son_iguales = true;
            }
        }
        return son_iguales;
    }

    //Método unir dos vectores 4
    public ClaseVector union(ClaseVector A, ClaseVector B) {
        //creo un vector grande para unir los dos vectors en uno
        ClaseVector vector_union = new ClaseVector(A.getTam() + B.getTam());
        //Almaceno el vector A en el vector Union
        for (int i = 0; i < A.getTam(); i++) {
            vector_union.setDato(A.getDato(i), i);
        }
        int posicionB = 0;
        //empiezo a ingrzar datos desde donde quede luego de meter A
        for (int i = A.getTam(); i < A.getTam() + B.getTam(); i++) {
            vector_union.setDato(B.getDato(posicionB++), i);
        }
        //ordeno vector union y detecto datos repetidos
        ordenar(vector_union);
        int tamFinal = 0;
        for (int i = 0; i < vector_union.getTam() - 1; i++) {
            if (vector_union.getDato(i) != vector_union.getDato(i + 1)) {
                vector_union.setDato(vector_union.getDato(i), tamFinal++);
            }
        }
        //ingreso al vector el ultimo numero 
        vector_union.setDato(vector_union.getDato(vector_union.getTam() - 1), tamFinal++);
        //en j tengo almacenado el tamaño real del vector union quitando 
        //los datos que se repiten
        ClaseVector vectorUnionFinal = new ClaseVector(tamFinal);
        for (int i = 0; i < tamFinal; i++) {
            vectorUnionFinal.setDato(vector_union.getDato(i), i);
        }

        return vectorUnionFinal;
    }

    //Método intersección 5
    public ClaseVector interseccion(ClaseVector A, ClaseVector B) {
        int tamVectorInter = 0;
        //como tamaño al vector interseccion le daremos el tamaño de vector A
        ClaseVector vectorInter = new ClaseVector(A.getTam() + 5);
        for (int i = 0; i < A.getTam(); i++) {
            for (int j = 0; j < B.getTam(); j++) {
                if (A.getDato(i) == B.getDato(j)) {
                    vectorInter.setDato(A.getDato(i), tamVectorInter);
                    tamVectorInter++;
                }
            }
        }
        ClaseVector vectorInterFinal = new ClaseVector(tamVectorInter);
        for (int i = 0; i < tamVectorInter; i++) {
            vectorInterFinal.setDato(vectorInter.getDato(i), i);
        }
        //Eliminar repetidos
        int countCeros = 0;
        for (int i = 0; i < vectorInterFinal.getTam(); i++) {
            for (int j = 0; j < vectorInterFinal.getTam(); j++) {
                if (i != j) {//no elimina primera posicion
                    if (vectorInterFinal.getDato(i) == vectorInterFinal.getDato(j)) {
                        vectorInterFinal.setDato(0, i);
                        countCeros++;
                    }
                }
            }
        }
        A.ordenar(vectorInterFinal);
        ClaseVector R;
        int count = 0;
        for (int i = 0; i < vectorInterFinal.getTam(); i++) {
            if (vectorInterFinal.getDato(i) != 0) {
                count++;
            }

        }
        //tamaño del vector sin repetidos
        R = new ClaseVector(count);
        for (int i = 0; i < R.getTam(); i++) {
            R.setDato(vectorInterFinal.getDato(countCeros), i);
            countCeros++;
        }
        return R;
    }

    //Método diferencia simetrica 6
    public ClaseVector diferenciaSimetrica(ClaseVector A, ClaseVector B) {
        A.ordenar(A);
        A.ordenar(B);
        ClaseVector R = new ClaseVector(A.getTam() + B.getTam());
        int count;
        int pos = 0;
        //Evaluar con A
        for (int i = 0; i < A.getTam(); i++) {
            count = 0;
            for (int j = 0; j < B.getTam(); j++) {
                if (A.getDato(i) == B.getDato(j)) {
                    count++;
                }
            }
            if (count == 0) {
                R.setDato(A.getDato(i), i);
                pos++;
            }
        }
        //Evaluar con B
        for (int i = 0; i < B.getTam(); i++) {
            count = 0;
            for (int j = 0; j < A.getTam(); j++) {
                if (B.getDato(i) == A.getDato(j)) {
                    count++;
                }

            }
            if (count == 0) {
                R.setDato(B.getDato(i), pos);
                pos++;
            }
        }
        //ordenar eliminar repetidos 
        ordenar2(R);
        int tamR = 0;
        for (int i = 0; i < R.getTam(); i++) {
            if (R.getDato(i) == 0) {
                tamR++;
            }
        }
        int t = R.getTam() - tamR;
        ClaseVector Vector_Diferencia = new ClaseVector(t);
        for (int i = 0; i < t; i++) {
            Vector_Diferencia.setDato(R.getDato(i), i);
        }
        //Eliminar repetidos

        int countCeros = 0;
        for (int i = 0; i < Vector_Diferencia.getTam(); i++) {
            for (int j = 0; j < Vector_Diferencia.getTam(); j++) {
                if (i != j) {//no elimina primera posicion
                    if (Vector_Diferencia.getDato(i) == Vector_Diferencia.getDato(j)) {
                        Vector_Diferencia.setDato(0, j);
                        countCeros++;
                    }
                }
            }
        }
        ordenar2(Vector_Diferencia);
        int countt = 0;
        for (int i = 0; i < Vector_Diferencia.getTam(); i++) {
            if (Vector_Diferencia.getDato(i) != 0) {
                countt++;
            }

        }
        //eliminar ceros
        ClaseVector Vector_diferencia_final = new ClaseVector(countt);
        for (int i = 0; i < countt; i++) {
            Vector_diferencia_final.setDato(Vector_Diferencia.getDato(i), i);
        }
        return Vector_diferencia_final;
    }

    //Método Busqueda binaria 
    public int busquedaBinaria(int dato, ClaseVector A) {
        ordenar(A);
        int inicio=0;
        int fin=A.getTam()-1;
        int posicion=0;
        int resultado=-1;
        
        while (inicio<=fin) {            
            posicion=(inicio+fin)/2;
            if (A.getDato(posicion)==dato) {
                resultado=posicion;
                break;
            }else if(A.getDato(posicion)<dato){
                inicio=posicion+1;
            }else{
                fin=posicion-1;
            }
        }
        return resultado;
    }

    //Método para obtener el tamaño del vector
    public int getTam() {
        return tam;
    }

    //Método para obtener un valor de una posición del vector
    public int getDato(int pos) {
        return (vec[pos]);
    }

    //Método para asignar un valor a una posición del vector
    public void setDato(int dato, int pos) {
        vec[pos] = dato;
    }
}
