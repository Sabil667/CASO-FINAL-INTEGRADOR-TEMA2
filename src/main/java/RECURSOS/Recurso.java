package RECURSOS;
public class Recurso {

    public void mostrarRecursos() {
        // Lógica para mostrar los recursos disponibles
        System.out.println("Recursos disponibles: ...");
    }
    String nombre;
    String tipo;
    int cantidad;

    public Recurso(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    // Agrega getters y setters según sea necesario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
