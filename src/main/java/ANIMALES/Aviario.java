package ANIMALES;

public class Aviario extends Animal {
    private String tipoPlumaje;
    private String descripcion;

    public Aviario(String nombre, int edad, int salud, int hambre, String tipoPlumaje, String descripcion) {
        super(nombre, edad, salud, hambre, "Omnívoro");
        this.tipoPlumaje = tipoPlumaje;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void volar() {
        System.out.println(this.nombre + " está volando en el aviario.");
    }

    @Override
    public String toString() {
        return "Aviario - " + super.toString();
    }

    public static class Aguila extends Aviario {
        public Aguila() {
            super("Águila", 7, 95, 10, "Marrón", "Descripción del águila");
        }
    }

    public static class Colibri extends Aviario {
        public Colibri() {
            super("Colibrí", 1, 100, 0, "Colorido", "Descripción del colibrí");
        }
    }
}