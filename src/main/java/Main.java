import HABITATS.*;
import ANIMALES.*;

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


            // Crear instancias de animales
            Mamifero leon = new Mamifero("León", "Panthera leo", 5, "Carne", true);
            Ave aguila = new Ave("Águila", "Aquila chrysaetos", 10, "Carne y pescado", true);
            Reptil cocodrilo = new Reptil("Cocodrilo", "Crocodylus niloticus", 15, "Carne");
            Pez pezGlobo = new Pez("Pez Globo", "Tetraodontidae", 3, "Crustáceos y moluscos");

            // Alimentar a los animales
            leon.alimentar("carne");
            aguila.alimentar("pescado");
            cocodrilo.alimentar("pescado");
            pezGlobo.alimentar("crustáceos");

            // Registrar salud y comportamiento de los animales
            leon.registrarSalud();
            leon.registrarComportamiento("El león está descansando bajo la sombra de un árbol.");
            aguila.registrarSalud();
            aguila.registrarComportamiento("El águila está volando sobre su territorio.");
            cocodrilo.registrarSalud();
            cocodrilo.registrarComportamiento("El cocodrilo está tomando el sol cerca del agua.");
            pezGlobo.registrarSalud();
            pezGlobo.registrarComportamiento("El pez globo está nadando en el acuario.");
        }
    }


