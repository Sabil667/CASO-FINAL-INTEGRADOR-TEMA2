package VISITANTES;

import ANIMALES.*;

public class GuiaAnimalesAcuaticos extends GuiaAnimales {
    public GuiaAnimalesAcuaticos() {
        super();
        this.animales.add(new Acuatico.Tiburon());
        this.animales.add(new Acuatico.Delfin());
    }

    @Override
    public void mostrarAnimales() {
        System.out.println("Animales Acuáticos:");
        for (Animal animal : this.animales) {
            System.out.println(animal);
        }
    }
}