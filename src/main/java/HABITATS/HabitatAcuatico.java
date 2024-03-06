package HABITATS;

// Subclase Acuático
public class HabitatAcuatico extends Habitat {
    private float temperaturaAgua;
    private float nivelPH;

    public HabitatAcuatico(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }

    @Override
    public void monitorearCondiciones() {
        // Implementación específica para monitorear hábitats acuáticos
        System.out.println("Monitoreando condiciones del hábitat acuático " + nombre);
        // Código para monitorear temperatura del agua, nivel de pH, etc.
    }
}
