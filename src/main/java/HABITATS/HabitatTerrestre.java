package HABITATS;

// Subclase Terrestre
public class HabitatTerrestre extends Habitat {
    private float temperatura;
    private float humedad;

    public HabitatTerrestre(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }

    @Override
    public void monitorearCondiciones() {
        // Implementación específica para monitorear hábitats terrestres
        System.out.println("Monitoreando condiciones del hábitat terrestre " + nombre);
        // Código para monitorear temperatura, humedad, etc.
    }
}
