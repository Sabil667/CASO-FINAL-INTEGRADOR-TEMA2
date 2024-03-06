package ANIMALES;

public class Terrestre extends Animal {
    private String tipoPatas;

    public Terrestre(String nombre, int edad, int salud, int hambre, String tipoPatas) {
        super(nombre, edad, salud, hambre, "Herbívoro"); // Por ejemplo, puedes establecer una dieta predeterminada
        this.tipoPatas = tipoPatas;
    }

    public void correr() {
        System.out.println(this.nombre + " está corriendo en el suelo.");
    }
}
