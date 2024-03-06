package ANIMALES;

public class Aviario extends Animal {
    private String tipoPlumaje;

    public Aviario(String nombre, int edad, int salud, int hambre, String tipoPlumaje) {
        super(nombre, edad, salud, hambre, "Omnívoro"); // Por ejemplo, puedes establecer una dieta predeterminada
        this.tipoPlumaje = tipoPlumaje;
    }

    public void volar() {
        System.out.println(this.nombre + " está volando en el aviario.");
    }
}
