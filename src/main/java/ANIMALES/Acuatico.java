package ANIMALES;

public class Acuatico extends Animal {
    private String tipoAletas;

    public Acuatico(String nombre, int edad, int salud, int hambre, String tipoAletas) {
        super(nombre, edad, salud, hambre, "Piscívoro"); // Por ejemplo, puedes establecer una dieta predeterminada
        this.tipoAletas = tipoAletas;
    }

    public void nadar() {
        System.out.println(this.nombre + " está nadando en el agua.");
    }
}
