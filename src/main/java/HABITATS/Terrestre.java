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
        return "Habitat Terrestre: \n" +
                "Nombre: " + getNombre() + '\n' +
                "Temperatura: " + getTemperatura() +"°C\n" +
                "Humedad: " + getHumedad() + "%\n" +
                "Limpieza: " + (isLimpieza() ? "Sí" : "No") + '\n' +
                "Tipo de Suelo='" + tipoSuelo + '\'' +
                '}';
    }

}
