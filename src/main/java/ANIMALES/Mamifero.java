package ANIMALES;

public class Mamifero extends Animal {
    private boolean amamanta;

    public Mamifero(String nombre, String especie, int edad, String dieta, boolean amamanta) {
        super(nombre, especie, edad, dieta);
        this.amamanta = amamanta;
    }

    @Override
    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    @Override
    public void registrarSalud() {
        // Lógica para registrar la salud del mamífero
        System.out.println("Registrando salud de " + nombre);
    }

    @Override
    public void registrarComportamiento(String comportamiento) {
        // Lógica para registrar el comportamiento del mamífero
        System.out.println("Registrando comportamiento de " + nombre + ": " + comportamiento);
    }
}
