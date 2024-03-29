package HABITATS;

public class Aviario extends Habitat {
    private int cantidadPajaros;

    public Aviario(String nombre, float temperatura, float humedad, boolean limpieza, int cantidadPajaros) {
        super(nombre, temperatura, humedad, limpieza);
        this.cantidadPajaros = cantidadPajaros;
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Monitoreando condiciones del aviario " + nombre);
        System.out.println("Temperatura ambiente: " + temperatura + "°C");
        System.out.println("Humedad del aire: " + humedad + "%");
        System.out.println("Cantidad de pájaros: " + cantidadPajaros);
        System.out.println("¿Hábitat limpio? " + (limpieza ? "Sí" : "No"));
    }

    @Override
    public String toString() {
            return "Hábitat Aviario:\n" +
                    "Nombre: " + getNombre() + "\n" +
                    "Temperatura: " + getTemperatura() + "°C\n" +
                    "Humedad: " + getHumedad() + "%\n" +
                    "¿Hábitat limpio? " + (isLimpieza() ? "Sí" : "No") + "\n" +
                    "Cantidad de Pájaros: " + cantidadPajaros;
        }
}
