package VISITANTES;

import java.util.Scanner;
import VISITANTES.*;

public class mainVISITANTES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        System.out.println("Bienvenido al Sistema de Tours Especializados:");
        System.out.println("1. Tour para Niños");
        System.out.println("2. Tour para Adultos");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Selección de tour
        Tour tour;
        if (opcion == 1) {
            tour = new TourNiños();
        } else if (opcion == 2) {
            tour = new TourAdultos();
        } else {
            System.out.println("Opción inválida. Saliendo del programa.");
            return;
        }

        tour.comenzar();

        // Menú de guías de animales
        System.out.println("Seleccione una guía de animales:");
        System.out.println("1. Animales Terrestres");
        System.out.println("2. Animales Acuáticos");
        System.out.println("3. Animales Aviarios");
        System.out.print("Seleccione una opción: ");
        int opcionGuia = scanner.nextInt();

        // Selección de guía de animales
        GuiaAnimales guia;
        if (opcionGuia == 1) {
            guia = new GuiaAnimalesTerrestres();
        } else if (opcionGuia == 2) {
            guia = new GuiaAnimalesAcuaticos();
        } else if (opcionGuia == 3) {
            guia = new GuiaAnimalesAviarios();
        } else {
            System.out.println("Opción inválida. Saliendo del programa.");
            return;
        }

        guia.mostrarAnimales();

        // Aquí podrías agregar más opciones, como información adicional sobre los animales o actividades específicas
    }
}
