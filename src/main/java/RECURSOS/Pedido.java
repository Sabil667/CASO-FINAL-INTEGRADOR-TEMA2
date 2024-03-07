package RECURSOS;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Proveedor proveedor;
    private Map<Recurso, Integer> items = new HashMap<>();

    public Pedido(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void agregarItem(Recurso recurso, int cantidad) {
        items.put(recurso, cantidad);
    }

    public Map<Recurso, Integer> getItems() {
        return items;
    }
}
