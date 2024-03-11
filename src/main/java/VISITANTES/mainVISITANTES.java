package VISITANTES;

import ANIMALES.*;
import HABITATS.*;
import java.util.Scanner;

public class mainVISITANTES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        System.out.println("\n========================================");
        System.out.println("Bienvenido al Sistema de Tours Especializados:");
        System.out.println("========================================\n");
        System.out.println("1. Tour para Niños\n");
        System.out.println("2. Tour para Adultos\n");
        System.out.println("3. Quiosco Interactivo\n");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Selección de tour
        Tour tour;
        if (opcion == 1) {
            tour = new TourNiños();
            tour.comenzar();
        } else if (opcion == 2) {
            tour = new TourAdultos();
            tour.comenzar();
        } else if (opcion == 3) {
            // Crear instancias de los hábitats
            HABITATS.Acuatico habitatAcuatico = new HABITATS.Acuatico("Acuario", 25.0f, 80.0f, true, 7.5f);
            HABITATS.Terrestre habitatTerrestre = new HABITATS.Terrestre("Bosque", 28.0f, 60.0f, true, "Arcilloso");
            HABITATS.Aviario habitatAviario = new HABITATS.Aviario("Aviario", 22.0f, 75.0f, true, 15);
            int opcionHabitat;
            do {
                System.out.println("\n--- Menú de Opciones ---");
                System.out.println("1. Monitorear condiciones de todos los hábitats");
                System.out.println("2. Ver detalles del hábitat acuático");
                System.out.println("3. Ver detalles del hábitat terrestre");
                System.out.println("4. Ver detalles del hábitat de aviario");
                System.out.println("5. Salir");
                System.out.print("Ingrese la opción deseada: ");

                opcionHabitat = scanner.nextInt();

                switch (opcionHabitat) {
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
            } while (opcionHabitat != 5);
        } else {
            System.out.println("Opción inválida. Saliendo del programa.");
            return;
        }

        // Menú de guías de animales
        int opcionGuia;
        do {
            System.out.println("\n========================================");
            System.out.println("Seleccione una guía de animales:");
            System.out.println("========================================\n");
            System.out.println("1. Animales Terrestres\n");
            System.out.println("2. Animales Acuáticos\n");
            System.out.println("3. Animales Aviarios\n");
            System.out.println("4. Salir\n");
            System.out.print("Seleccione una opción: ");
            opcionGuia = scanner.nextInt();

            // Selección de guía de animales
            GuiaAnimales guia;
            if (opcionGuia == 1) {
                guia = new GuiaAnimalesTerrestres();
                guia.mostrarAnimales();
            } else if (opcionGuia == 2) {
                guia = new GuiaAnimalesAcuaticos();
                guia.mostrarAnimales();
            } else if (opcionGuia == 3) {
                guia = new GuiaAnimalesAviarios();
                guia.mostrarAnimales();
            } else if (opcionGuia == 4) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcionGuia != 4);
    }

    private static void monitorearCondicionesTodos(HABITATS.Acuatico habitatAcuatico, HABITATS.Terrestre habitatTerrestre, HABITATS.Aviario habitatAviario) {
        System.out.println("\n--- Monitoreando condiciones de todos los hábitats ---");
        habitatAcuatico.monitorearCondiciones();
        habitatTerrestre.monitorearCondiciones();
        habitatAviario.monitorearCondiciones();
    }

    private static void monitorearCondicionesHabitat(HABITATS.Acuatico habitat) {
        System.out.println("\n--- Monitoreando condiciones del hábitat acuático ---");
        habitat.monitorearCondiciones();
    }

    private static void monitorearCondicionesHabitat(HABITATS.Terrestre habitat) {
        System.out.println("\n--- Monitoreando condiciones del hábitat terrestre ---");
        habitat.monitorearCondiciones();
    }

    private static void monitorearCondicionesHabitat(HABITATS.Aviario habitat) {
        System.out.println("\n--- Monitoreando condiciones del hábitat aviario ---");
        habitat.monitorearCondiciones();
    }
}