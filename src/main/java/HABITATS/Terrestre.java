package HABITATS;

public class Terrestre extends Habitat {
    private String tipoSuelo;

    public Terrestre(String nombre, float temperatura, float humedad, boolean limpieza, String tipoSuelo) {
        super(nombre, temperatura, humedad, limpieza);
        this.tipoSuelo = tipoSuelo;
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Monitoreando condiciones del hábitat terrestre " + nombre);
        System.out.println("Temperatura ambiente: " + temperatura + "°C");
        System.out.println("Humedad del suelo: " + humedad + "%");
        System.out.println("Tipo de suelo: " + tipoSuelo);
        System.out.println("¿Hábitat limpio? " + (limpieza ? "Sí" : "No"));
    }
    @Override
    public String toString() {
        return "Terrestre{" +
                "nombre='" + getNombre() + '\'' +
                ", temperatura=" + getTemperatura() +
                ", humedad=" + getHumedad() +
                ", limpieza=" + isLimpieza() +
                ", tipoSuelo='" + tipoSuelo + '\'' +
                '}';
    }

}
