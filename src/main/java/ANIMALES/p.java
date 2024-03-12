package ANIMALES;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de las clases
        Aviario loro = new Aviario("Loro", 5, 100, 0, "Colorido", "Descripción del loro");
        Terrestre leon = new Terrestre("León", 8, 100, 0, "Garras");
        Acuatico pezDorado = new Acuatico("Pez Dorado", 2, 100, 0, "Aletas largas");

        // Crear animales adicionales
        Aviario aguila = new Aviario("Águila", 7, 95, 10, "Marrón","Descripcion del aguila");
        Terrestre tigre = new Terrestre("Tigre", 6, 90, 15, "Garras afiladas");
        Acuatico delfin = new Acuatico("Delfín", 4, 98, 5, "Aletas cortas");

        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Mostrar información de los animales");
            System.out.println("2. Alimentar a los animales");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInformacionAnimales(loro, leon, pezDorado, aguila, tigre, delfin);
                    break;
                case 2:
                    alimentarAnimales(loro, leon, pezDorado, aguila, tigre, delfin);
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    public static void mostrarInformacionAnimales(Animal... animales) {
        for (Animal animal : animales) {
            System.out.println("\n--- Información de " + animal.nombre + " ---");
            System.out.println("Edad: " + animal.edad);
            System.out.println("Salud: " + animal.salud);
            System.out.println("Hambre: " + animal.hambre);
            System.out.println("Dieta: " + animal.dieta);
        }
    }

    private static void alimentarAnimales(Animal... animales) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Alimentar a los Animales ---");
        System.out.print("Ingrese la cantidad de comida a dar: ");
        int cantidadComida = scanner.nextInt();

        for (Animal animal : animales) {
            animal.alimentar(cantidadComida);
            System.out.println(animal.nombre + " ha sido alimentado. Nueva hambre: " + animal.hambre);
        }
    }
}
