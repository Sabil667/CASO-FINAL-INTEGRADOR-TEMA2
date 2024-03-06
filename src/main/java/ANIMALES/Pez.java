package ANIMALES;

public class Pez extends Animal {

    public Pez(String nombre, String especie, int edad, String dieta) {
        super(nombre, especie, edad, dieta);
    }

    @Override
    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    @Override
    public void registrarSalud() {
        // Lógica para registrar la salud del pez
        System.out.println("Registrando salud de " + nombre);
    }

    @Override
    public void registrarComportamiento(String comportamiento) {
        // Lógica para registrar el comportamiento del pez
        System.out.println("Registrando comportamiento de " + nombre + ": " + comportamiento);
    }
}
