package MANTENIMIENTOSEGURIDAD;

import java.util.Date;
import java.util.Scanner;

public class mainMANTENIMIENTO {
    public static void main(String[] args) {
        // Crear instancias de las clases
        ProgramaMantenimiento programaMantenimiento = new ProgramaMantenimiento();
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        Camara camara = new Camara("Entrada Principal");
        Sensor sensor = new Sensor("Entrada Principal");

        // Agregar la cámara y el sensor al sistema de seguridad
        sistemaSeguridad.getCamaras().add(camara);
        sistemaSeguridad.getSensores().add(sensor);

        // Programar un mantenimiento
        Mantenimiento mantenimiento = new Mantenimiento(new Date(), "Mantenimiento de rutina", false);
        programaMantenimiento.programarMantenimiento(mantenimiento);

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ver la cámara");
            System.out.println("2. Ver el sensor");
            System.out.println("3. Ver la fecha y descripción del mantenimiento");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ver la cámara
                    System.out.println("Ubicación de la cámara: " + camara.getUbicacion());
                    break;
                case 2:
                    // Ver el sensor
                    System.out.println("Ubicación del sensor: " + sensor.getUbicacion());
                    break;
                case 3:
                    // Ver la fecha y descripción del mantenimiento
                    System.out.println("Fecha: " + mantenimiento.getFecha());
                    System.out.println("Descripción: " + mantenimiento.getDescripcion());
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
