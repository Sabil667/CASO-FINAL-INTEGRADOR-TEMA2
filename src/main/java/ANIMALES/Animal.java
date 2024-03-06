package ANIMALES;

public class Animal {
    public String nombre;
    public int edad;
    public int salud;
    public int hambre;
    public String dieta;

    public Animal(String nombre, int edad, int salud, int hambre, String dieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.hambre = hambre;
        this.dieta = dieta;
    }

    public void alimentar(int cantidad) {
        this.hambre -= cantidad;
        if (this.hambre < 0) {
            this.hambre = 0;
        }
    }

    public void registrarSalud(int valor) {
        this.salud = valor;
    }

    public void registrarComportamiento(String comportamiento) {
        System.out.println(this.nombre + " está mostrando el comportamiento: " + comportamiento);
    }

    public void registrarDieta(String nuevaDieta) {
        this.dieta = nuevaDieta;
        System.out.println(this.nombre + " tiene una nueva dieta: " + nuevaDieta);
    }
}
