package HABITATS;

// Clase abstracta Habitat
public abstract class Habitat {
    protected String nombre;
    protected String ubicacion;

    public Habitat(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Método abstracto para ser implementado por las subclases
    public abstract void monitorearCondiciones();
}
