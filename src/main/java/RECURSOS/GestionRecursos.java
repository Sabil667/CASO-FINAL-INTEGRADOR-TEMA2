package RECURSOS;

public class GestionRecursos {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Recurso carne = new Recurso("Carne", "Alimento", 100);
        Recurso antibiotico = new Recurso("Antibiótico", "Medicina", 50);
        Recurso jaula = new Recurso("Jaula", "Equipamiento", 5);

        inventario.agregarRecurso(carne);
        inventario.agregarRecurso(antibiotico);
        inventario.agregarRecurso(jaula);

        inventario.mostrarInventario();
    }
}
