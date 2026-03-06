import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();
        int opcion;

        do {
            System.out.println("\n===== Lista Doblemente Enlazada =====");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atras");
            System.out.println("5. Mostrar tamano de la lista");
            System.out.println("6. Mostrar si la lista esta vacia");
            System.out.println("7. Buscar elemento por valor");
            System.out.println("8. Buscar elemento por indice");
            System.out.println("9. Borrar un elemento");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    int valorInicio = scanner.nextInt();
                    lista.insertarAlInicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    int valorFinal = scanner.nextInt();
                    lista.insertarAlFinal(valorFinal);
                    break;
                case 3:
                    lista.recorrerAdelante();
                    break;
                case 4:
                    lista.recorrerAtras();
                    break;
                case 5:
                    lista.mostrarTamano();
                    break;
                case 6:
                    lista.mostrarSiEstaVacia();
                    break;
                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = scanner.nextInt();
                    lista.buscarPorValor(valorBuscar);
                    break;
                case 8:
                    System.out.print("Ingrese el indice a buscar: ");
                    int indiceBuscar = scanner.nextInt();
                    lista.buscarPorIndice(indiceBuscar);
                    break;
                case 9:
                    System.out.print("Ingrese el valor a borrar: ");
                    int valorBorrar = scanner.nextInt();
                    lista.borrarElemento(valorBorrar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}