public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;
    private int tamano;

    public ListaDoble() {
        cabeza = null;
        cola = null;
        tamano = 0;
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        tamano++;
        System.out.println("Elemento " + dato + " insertado al inicio.");
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cola == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        tamano++;
        System.out.println("Elemento " + dato + " insertado al final.");
    }

    public void recorrerAdelante() {
        if (cabeza == null) {
            System.out.println("La lista esta vacia.");
            return;
        }
        System.out.print("Lista (adelante): ");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" <-> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void recorrerAtras() {
        if (cola == null) {
            System.out.println("La lista esta vacia.");
            return;
        }
        System.out.print("Lista (atras): ");
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.anterior != null) System.out.print(" <-> ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    public void mostrarTamano() {
        System.out.println("Tamano de la lista: " + tamano);
    }

    public void mostrarSiEstaVacia() {
        if (tamano == 0) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("La lista NO esta vacia. Tiene " + tamano + " elemento(s).");
        }
    }

    public void buscarPorValor(int valor) {
        if (cabeza == null) {
            System.out.println("La lista esta vacia.");
            return;
        }
        Nodo actual = cabeza;
        int indice = 0;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.dato == valor) {
                System.out.println("Elemento " + valor + " encontrado en el indice " + indice + ".");
                encontrado = true;
            }
            actual = actual.siguiente;
            indice++;
        }
        if (!encontrado) {
            System.out.println("Elemento " + valor + " no encontrado en la lista.");
        }
    }

    public void buscarPorIndice(int indice) {
        if (indice < 0 || indice >= tamano) {
            System.out.println("Indice fuera de rango. La lista tiene " + tamano + " elemento(s).");
            return;
        }
        Nodo actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        System.out.println("Elemento en el indice " + indice + ": " + actual.dato);
    }

    public void borrarElemento(int valor) {
        if (cabeza == null) {
            System.out.println("La lista esta vacia.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }
                tamano--;
                System.out.println("Elemento " + valor + " eliminado de la lista.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Elemento " + valor + " no encontrado en la lista.");
    }
}