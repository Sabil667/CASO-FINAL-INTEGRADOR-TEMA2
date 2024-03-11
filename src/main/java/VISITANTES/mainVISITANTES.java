package VISITANTES;

import ANIMALES.*;
import HABITATS.*;
import java.util.Scanner;
import MANTENIMIENTOSEGURIDAD.*;
import RECURSOS.Recurso;

public class mainVISITANTES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recurso recurso = new Recurso("param1","param2", 123);

        System.out.println("Bienvenido al Sistema de Tours Especializados:");
        System.out.println("¿Eres un empleado o un visitante?");
        System.out.println("1. Empleado");
        System.out.println("2. Visitante");
        System.out.print("Seleccione una opción: ");
        int opcionUsuario = scanner.nextInt();

        if (opcionUsuario == 1) { System.out.println("¿Eres de mantenimiento o seguridad?");
            System.out.println("1. Mantenimiento");
            System.out.println("2. Seguridad");
            System.out.print("Seleccione una opción: ");
            int opcionEmpleado = scanner.nextInt();

            if (opcionEmpleado == 1) {
                ProgramaMantenimiento programaMantenimiento = new ProgramaMantenimiento();
                SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
                Camara camara = new Camara("Entrada Principal");
                Sensor sensor = new Sensor("Entrada Principal");

                sistemaSeguridad.getCamaras().add(camara);
                sistemaSeguridad.getSensores().add(sensor);

                ProgramaMantenimiento mantenimiento = new ProgramaMantenimiento(new java.util.Date(), "Mantenimiento de rutina", false);
                programaMantenimiento.programaMantenimiento(mantenimiento);

                Scanner scannerEmpleado = new Scanner(System.in);

                while (true) {
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Ver la cámara");
                    System.out.println("2. Ver el sensor");
                    System.out.println("3. Ver la fecha y descripción del mantenimiento");
                    System.out.println("4. Ver recursos");
                    System.out.println("5. Salir");

                    int opcion = scannerEmpleado.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Ubicación de la cámara: " + camara.getUbicacion());
                            break;
                        case 2:
                            System.out.println("Ubicación del sensor: " + sensor.getUbicacion());
                            break;
                        case 3:
                            System.out.println("Fecha: " + mantenimiento.getFecha());
                            System.out.println("Descripción: " + mantenimiento.getDescripcion());
                            break;
                        case 4:
                            recurso.mostrarRecursos();
                            break;
                        case 5:
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    }
                }
            }
        } else if (opcionUsuario == 2) {
            System.out.println("¿Cuál es tu preferencia animal?");
            System.out.println("1. Animales terrestres");
            System.out.println("2. Animales acuáticos");
            System.out.println("3. Animales aviarios");
            System.out.print("Seleccione una opción: ");
            int opcionAnimal = scanner.nextInt();

            switch (opcionAnimal) {
                case 1:
                    System.out.println("¡Bienvenido al tour especializado en animales terrestres!");
                    HABITATS.Terrestre habitatTerrestre = new HABITATS.Terrestre("Bosque", 28.0f, 60.0f, true, "Arcilloso");
                    monitorearCondicionesHabitat(habitatTerrestre);
                    ANIMALES.Terrestre animalTerrestre = new ANIMALES.Terrestre("Nombre del animal", "Descripción del animal");
                    System.out.println("Información del animal: " + animalTerrestre.getNombre() + ", " + animalTerrestre.getDescripcion());
                    break;
                case 2:
                    System.out.println("¡Bienvenido al tour especializado en animales acuáticos!");
                    HABITATS.Acuatico habitatAcuatico = new HABITATS.Acuatico("Acuario", 25.0f, 80.0f, true, 7.5f);
                    monitorearCondicionesHabitat(habitatAcuatico);
                    ANIMALES.Acuatico animalAcuatico = new ANIMALES.Acuatico("Nombre del animal", "Descripción del animal");
                    System.out.println("Información del animal: " + animalAcuatico.getNombre() + ", " + animalAcuatico.getDescripcion());
                    break;
                case 3:
                    System.out.println("¡Bienvenido al tour especializado en animales aviarios!");
                    HABITATS.Aviario habitatAviario = new HABITATS.Aviario("Aviario", 22.0f, 75.0f, true, 15);
                    monitorearCondicionesHabitat(habitatAviario);
                    ANIMALES.Aviario animalAviario = new ANIMALES.Aviario("Nombre del animal", "Descripción del animal");
                    System.out.println("Información del animal: " + animalAviario.getNombre() + ", " + animalAviario.getDescripcion());
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } else {
            System.out.println("Opción inválida. Saliendo del programa.");
        }
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