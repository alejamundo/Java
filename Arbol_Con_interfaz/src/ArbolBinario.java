
import java.util.LinkedList;

public class ArbolBinario {

    private Nodo raiz;
    private int num_nodos;
    private int alt;

    public ArbolBinario() {
        raiz = null;
        num_nodos = 0;
        alt = 0;
    }

    //Metodo para insertar un dato en el arbol...no acepta repetidos :)
    public void insertar(int dato) {
        if (existe(dato)) {
            return;
        }
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null;
            Nodo tmp = raiz;
            while (tmp != null) {
                anterior = tmp;
                if (dato < tmp.getDato()) {
                    tmp = tmp.getIzq();
                } else {
                    tmp = tmp.getDer();
                }
            }
            if (dato < anterior.getDato()) {
                anterior.setIzq(nuevo);
            } else {
                anterior.setDer(nuevo);
            }
        }
        num_nodos++;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getNumNodos() {
        return num_nodos;
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void inorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDer(), recorrido);
        }
    }

    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        Nodo aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
        }
        return false;
    }

    private void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }

    public int contarRaices() {
        int cont = 0;
        if (getRaiz() == null) {
            cont = 0;
        }
        boolean esPadre = true;
        Nodo nodo = getRaiz();

        while (nodo != null) {
            if (nodo.getIzq() != null || nodo.getDer() != null) {
                cont++;
            }

            if (nodo.getIzq() != null) {
                nodo = nodo.getIzq();
            } else if (nodo.getDer() != null) {
                nodo = nodo.getDer();
            } else {
                Nodo padre = encontrarPadre(nodo);
                if (padre == null) {
                    nodo = null;
                } else {
                    nodo = padre.getDer();
                }
            }
        }
        return cont;
    }

    private Nodo encontrarPadre(Nodo nodo) {
        Nodo actual = getRaiz();
        Nodo padre = null;

        while (actual != null) {
            if (nodo.getDato() < actual.getDato()) {
                padre = actual;
                actual = actual.getIzq();
            } else if (nodo.getDato() > actual.getDato()) {
                actual = actual.getDer();
            } else {
                break;
            }
        }

        return padre;
    }
    
    public int buscarNivel(Nodo nodo, int dato, int nivelActual) {
        if (nodo == null) {
            return -1; // Dato no encontrado
        }

        if (dato == nodo.getDato()) {
            return nivelActual; // Dato encontrado, retornar el nivel actual
        } else if (dato < nodo.getDato()) {
            return buscarNivel(nodo.getIzq(), dato, nivelActual + 1); // Buscar en el subárbol izquierdo
        } else {
            return buscarNivel(nodo.getDer(), dato, nivelActual + 1); // Buscar en el subárbol derecho
        }
    }

}
