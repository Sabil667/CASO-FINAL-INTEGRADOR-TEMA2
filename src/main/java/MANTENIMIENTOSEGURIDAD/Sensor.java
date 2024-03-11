package MANTENIMIENTOSEGURIDAD;

public class Sensor {
    private String ubicacion;

    public Sensor(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void detectarMovimiento() {
        System.out.println("El sensor en " + ubicacion + " ha detectado movimiento.");
    }

    public String getUbicacion() {
        return ubicacion;
    }
}