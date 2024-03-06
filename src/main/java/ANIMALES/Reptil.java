package ANIMALES;

public class Reptil extends Animal {

    public Reptil(String nombre, String especie, int edad, String dieta) {
        super(nombre, especie, edad, dieta);
    }

    @Override
    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    @Override
    public void registrarSalud() {
        // Lógica para registrar la salud del reptil
        System.out.println("Registrando salud de " + nombre);
    }

    @Override
    public void registrarComportamiento(String comportamiento) {
        // Lógica para registrar el comportamiento del reptil
        System.out.println("Registrando comportamiento de " + nombre + ": " + comportamiento);
    }
}
