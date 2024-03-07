package RECURSOS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AdministracionRecursos {
    private List<Recurso> inventario = new ArrayList<>();
    private List<Proveedor> proveedores = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarRecurso(Recurso recurso) {
        inventario.add(recurso);
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void realizarPedido(Proveedor proveedor, Map<Recurso, Integer> items) {
        Pedido pedido = new Pedido(proveedor);
        for (Map.Entry<Recurso, Integer> entry : items.entrySet()) {
            Recurso recurso = entry.getKey();
            int cantidad = entry.getValue();
            pedido.agregarItem(recurso, cantidad);
        }
        pedidos.add(pedido);
    }

    // Métodos adicionales para gestionar inventario, proveedores y pedidos

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Recurso recurso : inventario) {
            System.out.println(recurso.getNombre() + ": " + recurso.getCantidad());
        }
    }

    public void mostrarProveedores() {
        System.out.println("Proveedores:");
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor.getNombre());
        }
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("Proveedor: " + pedido.getProveedor().getNombre());
            System.out.println("Items:");
            for (Map.Entry<Recurso, Integer> entry : pedido.getItems().entrySet()) {
                System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdministracionRecursos administrador = new AdministracionRecursos();

        Recurso alimento = new Recurso("Alimento", 100);
        Recurso medicina = new Recurso("Medicina", 50);

        Proveedor proveedor1 = new Proveedor("Proveedor1");
        Proveedor proveedor2 = new Proveedor("Proveedor2");

        administrador.agregarRecurso(alimento);
        administrador.agregarRecurso(medicina);

        administrador.agregarProveedor(proveedor1);
        administrador.agregarProveedor(proveedor2);

        Map<Recurso, Integer> itemsPedido = new HashMap<>();
        itemsPedido.put(alimento, 50);
        itemsPedido.put(medicina, 20);

        administrador.realizarPedido(proveedor1, itemsPedido);

        // Puedes continuar agregando más funcionalidades y mejoras según tus necesidades

        administrador.mostrarInventario();
        administrador.mostrarProveedores();
        administrador.mostrarPedidos();
    }
}
