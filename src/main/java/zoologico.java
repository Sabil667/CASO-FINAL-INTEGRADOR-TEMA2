import HABITATS.*;
import ANIMALES.*;
import java.util.Scanner;
import MANTENIMIENTOSEGURIDAD.*;
import RECURSOS.*;

public class zoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Inventario inventario = new Inventario();
        Recurso carne = new Recurso("Carne", "Alimento", 100);
        Recurso antibiotico = new Recurso("Antibiótico", "Medicina", 50);
        Recurso jaula = new Recurso("Jaula", "Equipamiento", 5);
        inventario.agregarRecurso(carne);
        inventario.agregarRecurso(antibiotico);
        inventario.agregarRecurso(jaula);


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

            switch (opcionEmpleado) {
                case 1:
                    ProgramaMantenimiento programaMantenimiento = new ProgramaMantenimiento();
                    ProgramaMantenimiento mantenimiento = new ProgramaMantenimiento(new java.util.Date(), "Mantenimiento de rutina", false);
                    programaMantenimiento.programaMantenimiento(mantenimiento);

                    Scanner scannerEmpleado = new Scanner(System.in);

                    while (true) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Ver la fecha y descripción del mantenimiento");
                        System.out.println("2. Ver recursos");
                        System.out.println("3. Salir");

                        int opcion = scannerEmpleado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Fecha: " + mantenimiento.getFecha());
                                System.out.println("Descripción: " + mantenimiento.getDescripcion());
                                break;
                            case 2:
                                inventario.mostrarInventario();
                                break;
                            case 3:
                                System.out.println("Saliendo del programa...");
                                System.exit(0);
                            default:
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        }
                    }

                case 2:
                    SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
                    Camara camara = new Camara("Entrada Principal");
                    Sensor sensor = new Sensor("Entrada Principal");

                    sistemaSeguridad.getCamaras().add(camara);
                    sistemaSeguridad.getSensores().add(sensor);

                    Scanner scannerSeguridad = new Scanner(System.in);

                    while (true) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Ver la cámara");
                        System.out.println("2. Ver el sensor");
                        System.out.println("3. Salir");

                        int opcion = scannerSeguridad.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ubicación de la cámara: " + camara.getUbicacion());
                                break;
                            case 2:
                                System.out.println("Ubicación del sensor: " + sensor.getUbicacion());
                                break;
                            case 3:
                                System.out.println("Saliendo del programa...");
                                System.exit(0);
                            default:
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        }
                    }

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

// Resto del código...
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


                    // Crear instancias de los animales terrestres
                    ANIMALES.Terrestre leon = new ANIMALES.Terrestre("León", 8, 100, 0, "Garras");
                    ANIMALES.Terrestre tigre = new ANIMALES.Terrestre("Tigre", 6, 90, 15, "Garras afiladas");

                    // Mostrar la información de los animales terrestres
                    ANIMALES.Main.mostrarInformacionAnimales(leon, tigre);
                    break;


                case 2:
                    System.out.println("¡Bienvenido al tour especializado en animales acuáticos!");
                    ANIMALES.Acuatico tiburon = new ANIMALES.Acuatico("Tiburon", 20, 100, 0, "Aletas largas");
                    ANIMALES.Acuatico delfin = new ANIMALES.Acuatico("Delfín", 4, 98, 5, "Aletas cortas");

                    ANIMALES.Main.mostrarInformacionAnimales(tiburon, delfin);
                    break;
                case 3:
                    System.out.println("¡Bienvenido al tour especializado en animales aviarios!");
                    ANIMALES.Aviario Colibri = new ANIMALES.Aviario("Colibri", 5, 100, 0, "Colorido", "Descripción del loro");
                    ANIMALES.Aviario Aguila = new ANIMALES.Aviario("Águila", 7, 95, 10, "Marrón","Descripcion del aguila");

                    ANIMALES.Main.mostrarInformacionAnimales(Colibri, Aguila);

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