package ANIMALES;

public class Ave extends Animal {
    private boolean vuela;

    public Ave(String nombre, String especie, int edad, String dieta, boolean vuela) {
        super(nombre, especie, edad, dieta);
        this.vuela = vuela;
    }

    @Override
    public void alimentar(String comida) {
        System.out.println(nombre + " está picoteando " + comida);
    }

    @Override
    public void registrarSalud() {
        // Lógica para registrar la salud del ave
        System.out.println("Registrando salud de " + nombre);
    }

    @Override
    public void registrarComportamiento(String comportamiento) {
        // Lógica para registrar el comportamiento del ave
        System.out.println("Registrando comportamiento de " + nombre + ": " + comportamiento);
    }
}
