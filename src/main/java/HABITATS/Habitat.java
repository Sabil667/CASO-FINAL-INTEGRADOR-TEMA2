package HABITATS;

public abstract class Habitat {
    protected String nombre;
    protected float temperatura;
    protected float humedad;
    protected boolean limpieza;

    public Habitat(String nombre, float temperatura, float humedad, boolean limpieza) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public abstract void monitorearCondiciones();

    public void registrarTemperatura(float temperatura) {
        this.temperatura = temperatura;
        System.out.println("Se ha registrado la temperatura en el hábitat " + nombre + ": " + temperatura + "°C");
    }

    public void registrarHumedad(float humedad) {
        this.humedad = humedad;
        System.out.println("Se ha registrado la humedad en el hábitat " + nombre + ": " + humedad + "%");
    }

    public void limpiarHabitat() {
        this.limpieza = true;
        System.out.println("El hábitat " + nombre + " ha sido limpiado.");
    }
}
