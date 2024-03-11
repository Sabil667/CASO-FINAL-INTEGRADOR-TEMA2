package VISITANTES;

import ANIMALES.Animal;
import java.util.ArrayList;

public abstract class GuiaAnimales {
    protected ArrayList<Animal> animales;

    public GuiaAnimales() {
        this.animales = new ArrayList<>();
    }

    public abstract void mostrarAnimales();
}