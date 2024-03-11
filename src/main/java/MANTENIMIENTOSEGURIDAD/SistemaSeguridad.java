package MANTENIMIENTOSEGURIDAD;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridad {
    private List<Camara> camaras;
    private List<Sensor> sensores;

    public SistemaSeguridad() {
        this.camaras = new ArrayList<>();
        this.sensores = new ArrayList<>();
    }

    public List<Camara> getCamaras() {
        return camaras;
    }

    public List<Sensor> getSensores() {
        return sensores;
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
}

