package QUIOSCO;

import ANIMALES.*;
import HABITATS.*;
import java.util.*;

public class Quiosco {

    private List<Animal> animales;
    private List<Habitat> habitats;
    private Scanner scanner;

    public Quiosco(List<Animal> animales, List<Habitat> habitats) {
        this.animales = animales;
        this.habitats = habitats;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n========================================");
            System.out.println("Bienvenido al Quiosco Interactivo:");
            System.out.println("========================================\n");
            System.out.println("1. Ver información del hábitat terrestre\n");
            System.out.println("2. Ver información del hábitat acuático\n");
            System.out.println("3. Ver información del hábitat aviario\n");
            System.out.println("4. Salir\n");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Asume que tienes un método para obtener el hábitat terrestre
                    Habitat habitatTerrestre = obtenerHabitatTerrestre();
                    System.out.println(habitatTerrestre);
                    break;

                case 2:
                    // Asume que tienes un método para obtener el hábitat acuático
                    Habitat habitatAcuatico = obtenerHabitatAcuatico();
                    System.out.println(habitatAcuatico);
                    break;

                case 3:
                    // Asume que tienes un método para obtener el hábitat aviario
                    Habitat habitatAviario = obtenerHabitatAviario();
                    System.out.println(habitatAviario);
                    break;

                case 4:
                    System.out.println("Saliendo del quiosco interactivo.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }

    // Métodos para obtener los hábitats
    // Estos métodos son solo ejemplos y deben ser reemplazados por los métodos reales para obtener los hábitats
    private Habitat obtenerHabitatTerrestre() {
        // Reemplaza esto con el método real para obtener el hábitat terrestre
        return habitats.get(0);
    }

    private Habitat obtenerHabitatAcuatico() {
        // Reemplaza esto con el método real para obtener el hábitat acuático
        return habitats.get(1);
    }

    private Habitat obtenerHabitatAviario() {
        // Reemplaza esto con el método real para obtener el hábitat aviario
        return habitats.get(2);
    }
}