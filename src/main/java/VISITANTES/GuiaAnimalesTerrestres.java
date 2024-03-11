package VISITANTES;

import ANIMALES.*;

public class GuiaAnimalesTerrestres extends GuiaAnimales {
    public GuiaAnimalesTerrestres() {
        super();
        this.animales.add(new Terrestre.Elefante());
        this.animales.add(new Terrestre.Tigre());
    }

    @Override
    public void mostrarAnimales() {
        System.out.println("Animales Terrestres:");
        for (Animal animal : this.animales) {
            System.out.println(animal);
        }
    }
}