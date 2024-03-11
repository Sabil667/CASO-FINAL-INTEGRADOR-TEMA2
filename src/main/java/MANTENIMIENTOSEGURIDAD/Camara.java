package MANTENIMIENTOSEGURIDAD;

public class Camara {
    private String ubicacion;

    public Camara(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void grabar() {
        System.out.println("La cámara en " + ubicacion + " está grabando.");
    }

    public String getUbicacion() {
        return ubicacion;
    }
}