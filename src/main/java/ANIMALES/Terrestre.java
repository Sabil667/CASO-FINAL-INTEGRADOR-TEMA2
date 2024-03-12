package ANIMALES;

public class Terrestre extends Animal {
    private String tipoPatas;

    public Terrestre(String nombre, int edad, int salud, int hambre, String tipoPatas) {
        super(nombre, edad, salud, hambre, "Herbívoro");
        this.tipoPatas = tipoPatas;
    }

    public void correr() {
        System.out.println(this.nombre + " está corriendo en el suelo.");
    }

    public String getDescripcion() {
        return this.tipoPatas;
    }

    public static class Elefante extends Terrestre {
        public Elefante() {
            super("Elefante", 15, 100, 0, "Grande");
        }
    }

    public static class Tigre extends Terrestre {
        public Tigre() {
            super("Tigre", 10, 100, 0, "Garras afiladas");
        }
    }
}