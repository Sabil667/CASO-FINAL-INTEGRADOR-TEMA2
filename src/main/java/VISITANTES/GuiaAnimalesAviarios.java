package VISITANTES;

import ANIMALES.*;

public class GuiaAnimalesAviarios extends GuiaAnimales {
    public GuiaAnimalesAviarios() {
        super();
        this.animales.add(new Aviario.Aguila());
        this.animales.add(new Aviario.Colibri());
    }

    @Override
    public void mostrarAnimales() {
        System.out.println("Animales Aviarios:");
        for (Animal animal : this.animales) {
            System.out.println(animal);
        }
    }
}