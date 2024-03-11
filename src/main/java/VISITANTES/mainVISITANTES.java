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

        if (opcionUsuario == 1) {
            System.out.println("¿Eres de mantenimiento o seguridad?");
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
            HABITATS.Acuatico habitatAcuatico = new HABITATS.Acuatico("Acuario", 25.0f, 80.0f, true, 7.5f);
            HABITATS.Terrestre habitatTerrestre = new HABITATS.Terrestre("Bosque", 28.0f, 60.0f, true, "Arcilloso");
            HABITATS.Aviario habitatAviario = new HABITATS.Aviario("Aviario", 22.0f, 75.0f, true, 15);

            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Monitorear condiciones de todos los hábitats");
            System.out.println("2. Ver detalles del hábitat acuático");
            System.out.println("3. Ver detalles del hábitat terrestre");
            System.out.println("4. Ver detalles del hábitat de aviario");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcionHabitat = scanner.nextInt();

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