package RECURSOS;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Recurso> inventario;

    public Inventario() {
        this.inventario = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        inventario.add(recurso);
    }

    // Agrega otros métodos según sea necesario
    public void mostrarInventario() {
        for (Recurso recurso : inventario) {
            System.out.println("Nombre: " + recurso.getNombre() +
                    ", Tipo: " + recurso.getTipo() +
                    ", Cantidad: " + recurso.getCantidad());
        }
    }
}
