package MANTENIMIENTOSEGURIDAD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramaMantenimiento {
    private List<Mantenimiento> mantenimientos;

    public ProgramaMantenimiento() {
        this.mantenimientos = new ArrayList<>();
    }

    public void programarMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimientos.add(mantenimiento);
    }

    public void rastrearMantenimientos() {
        for (Mantenimiento mantenimiento : mantenimientos) {
            System.out.println("Fecha: " + mantenimiento.getFecha() +
                    ", Descripción: " + mantenimiento.getDescripcion() +
                    ", Es urgente: " + (mantenimiento.isEsUrgente() ? "Sí" : "No"));
        }
    }
}

public class Mantenimiento {
    private Date fecha;
    private String descripcion;
    private boolean esUrgente;

    public Mantenimiento(Date fecha, String descripcion, boolean esUrgente) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.esUrgente = esUrgente;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEsUrgente() {
        return esUrgente;
    }
}