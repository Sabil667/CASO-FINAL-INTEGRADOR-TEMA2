package RECURSOS;

import java.util.Scanner;

public class r {
    public static void main(String[] args) {

        // Crear instancias de las clases
        Inventario inventario = new Inventario();
        Recurso carne = new Recurso("Carne", "Alimento", 100);
        Recurso antibiotico = new Recurso("Antibiótico", "Medicina", 50);
        Recurso jaula = new Recurso("Jaula", "Equipamiento", 5);

        // Agregar recursos al inventario
        inventario.agregarRecurso(carne);
        inventario.agregarRecurso(antibiotico);
        inventario.agregarRecurso(jaula);

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para almacenar la opción del usuario
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Mostrar el inventario
                    inventario.mostrarInventario();
                    break;
                case 2:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 2);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}