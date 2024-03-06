import HABITATS.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de hábitats
        HabitatAcuatico habitatAcuatico = new HabitatAcuatico("Acuario", "Zona Este");
        HabitatTerrestre habitatTerrestre = new HabitatTerrestre("Sabana Africana", "Zona Sur");
        Aviario aviario = new Aviario("Bosque de Aves", "Zona Oeste", 20, true, true, "Plumaje Brillante", "Exterior");

        // Monitorear condiciones de los hábitats
        habitatAcuatico.monitorearCondiciones();
        habitatTerrestre.monitorearCondiciones();
        aviario.monitorearCondiciones();
    }
}
