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
            System.out.println("1. Ver información de animales\n");
            System.out.println("2. Ver información de hábitats\n");
            System.out.println("3. Salir\n");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInformacionAnimales();
                    break;
                case 2:
                    mostrarInformacionHabitats();
                    break;
                case 3:
                    System.out.println("Saliendo del quiosco interactivo.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }

    private void mostrarInformacionAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }

    private void mostrarInformacionHabitats() {
        for (Habitat habitat : habitats) {
            System.out.println("Nombre del hábitat: " + habitat.getNombre());
            System.out.println("Temperatura: " + habitat.getTemperatura());
            System.out.println("Humedad: " + habitat.getHumedad());
            System.out.println("Limpieza: " + (habitat.isLimpieza() ? "Limpio" : "Sucio"));
            System.out.println("----------------------------------------");
        }
    }
}