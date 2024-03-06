package HABITATS;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de los hábitats
        Acuatico habitatAcuatico = new Acuatico("Acuario", 25.0f, 80.0f, true, 7.5f);
        Terrestre habitatTerrestre = new Terrestre("Bosque", 28.0f, 60.0f, true, "Arcilloso");
        Aviario habitatAviario = new Aviario("Aviario", 22.0f, 75.0f, true, 15);

        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Monitorear condiciones de todos los hábitats");
            System.out.println("2. Ver detalles del hábitat acuático");
            System.out.println("3. Ver detalles del hábitat terrestre");
            System.out.println("4. Ver detalles del hábitat de aviario");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    monitorearCondicionesTodos(habitatAcuatico, habitatTerrestre, habitatAviario);
                    break;
                case 2:
                    monitorearCondicionesHabitat(habitatAcuatico);
                    break;
                case 3:
                    monitorearCondicionesHabitat(habitatTerrestre);
                    break;
                case 4:
                    monitorearCondicionesHabitat(habitatAviario);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void monitorearCondicionesTodos(Acuatico habitatAcuatico, Terrestre habitatTerrestre, Aviario habitatAviario) {
        System.out.println("\n--- Monitoreando condiciones de todos los hábitats ---");
        habitatAcuatico.monitorearCondiciones();
        habitatTerrestre.monitorearCondiciones();
        habitatAviario.monitorearCondiciones();
    }

    private static void monitorearCondicionesHabitat(Habitat habitat) {
        System.out.println("\n--- Monitoreando condiciones del hábitat ---");
        habitat.monitorearCondiciones();
    }
}