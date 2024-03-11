package MANTENIMIENTOSEGURIDAD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramaMantenimiento {
    private List<Camara> camaras;
    private List<Sensor> sensores;
    private Date fecha;
    private String descripcion;
    private boolean completado;

    public ProgramaMantenimiento() {
        this.camaras = new ArrayList<>();
        this.sensores = new ArrayList<>();
    }

    public ProgramaMantenimiento(Date fecha, String descripcion, boolean completado) {
        this();
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.completado = completado;
    }

    public List<Camara> getCamaras() {
        return camaras;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void monitorearAccesos() {
        for (Camara camara : camaras) {
            camara.grabar();
        }
    }

    public void monitorearMovimientos() {
        for (Sensor sensor : sensores) {
            sensor.detectarMovimiento();
        }
    }

    public void programaMantenimiento(ProgramaMantenimiento mantenimiento) {
    }
}