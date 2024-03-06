package ANIMALES;

public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected String dieta;
    protected boolean saludable;

    public Animal(String nombre, String especie, int edad, String dieta) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dieta = dieta;
        this.saludable = true; // Al inicio, el animal se considera saludable
    }

    public abstract void alimentar(String comida);

    public abstract void registrarSalud();

    public abstract void registrarComportamiento(String comportamiento);
}
