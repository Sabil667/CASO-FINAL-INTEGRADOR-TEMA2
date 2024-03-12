package ANIMALES;

public class Acuatico extends Animal {
    private String tipoAletas;

    public Acuatico(String nombre, int edad, int salud, int hambre, String tipoAletas) {
        super(nombre, edad, salud, hambre, "Piscívoro");
        this.tipoAletas = tipoAletas;
    }

    public void nadar() {
        System.out.println(this.nombre + " está nadando en el agua.");
    }

    public String getDescripcion() {
        return this.tipoAletas;
    }

    @Override
    public String toString() {
        return "Acuático - " + super.toString();
    }

    public static class Tiburon extends Acuatico {
        public Tiburon() {
            super("Tiburón", 20, 100, 0, "Aletas grandes");
        }
    }

    public static class Delfin extends Acuatico {
        public Delfin() {
            super("Delfín", 10, 100, 0, "Aletas cortas");
        }
    }
}