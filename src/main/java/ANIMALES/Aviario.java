package ANIMALES;

public class Aviario extends Animal {
    private String tipoPlumaje;

    public Aviario(String nombre, int edad, int salud, int hambre, String tipoPlumaje) {
        super(nombre, edad, salud, hambre, "Omnívoro");
        this.tipoPlumaje = tipoPlumaje;
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
            super("Águila", 7, 95, 10, "Marrón");
        }
    }

    public static class Colibri extends Aviario {
        public Colibri() {
            super("Colibrí", 1, 100, 0, "Colorido");
        }
    }
}