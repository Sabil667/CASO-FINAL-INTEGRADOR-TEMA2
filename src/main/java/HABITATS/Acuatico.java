package HABITATS;

public class Acuatico extends Habitat {
    private float nivelPH;

    public Acuatico(String nombre, float temperatura, float humedad, boolean limpieza, float nivelPH) {
        super(nombre, temperatura, humedad, limpieza);
        this.nivelPH = nivelPH;
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Monitoreando condiciones del hábitat acuático " + nombre);
        System.out.println("Temperatura del agua: " + temperatura + "°C");
        System.out.println("Humedad del ambiente: " + humedad + "%");
        System.out.println("Nivel de pH: " + nivelPH);
        System.out.println("¿Hábitat limpio? " + (limpieza ? "Sí" : "No"));
    }
    @Override
    public String toString() {
        return "Habitat Acuatico: \n" +
                "Nombre: " + getNombre() + '\n' +
                "Temperatura: " + getTemperatura() +"°C\n" +
                "Humedad: " + getHumedad() + "%\n" +
                "Limpieza: " + (isLimpieza() ? "Sí" : "No") + '\n' +
                "Nivel de pH: " + nivelPH;

    }


}
