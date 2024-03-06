package HABITATS;

// Subclase Aviario
public class Aviario extends Habitat {
    private int cantidadPajaros;
    private boolean vuela;
    private boolean tienePico;
    private String tipoPlumaje;
    private String tipoAviario;

    public Aviario(String nombre, String ubicacion, int cantidadPajaros, boolean vuela, boolean tienePico, String tipoPlumaje, String tipoAviario) {
        super(nombre, ubicacion);
        this.cantidadPajaros = cantidadPajaros;
        this.vuela = vuela;
        this.tienePico = tienePico;
        this.tipoPlumaje = tipoPlumaje;
        this.tipoAviario = tipoAviario;
    }

    @Override
    public void monitorearCondiciones() {
        // Implementación específica para monitorear aviarios
        System.out.println("Monitoreando condiciones del aviario " + nombre);
        System.out.println("Cantidad de pájaros: " + cantidadPajaros);
        System.out.println("¿Pájaros vuelan? " + (vuela ? "Sí" : "No"));
        System.out.println("¿Pájaros tienen pico? " + (tienePico ? "Sí" : "No"));
        System.out.println("Tipo de plumaje: " + tipoPlumaje);
        System.out.println("Tipo de aviario: " + tipoAviario);
        // Aquí se podría agregar más código para monitorear otras condiciones del aviario
    }

    // Getters y setters (métodos de acceso) para las variables adicionales
    public int getCantidadPajaros() {
        return cantidadPajaros;
    }

    public void setCantidadPajaros(int cantidadPajaros) {
        this.cantidadPajaros = cantidadPajaros;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isTienePico() {
        return tienePico;
    }

    public void setTienePico(boolean tienePico) {
        this.tienePico = tienePico;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public String getTipoAviario() {
        return tipoAviario;
    }

    public void setTipoAviario(String tipoAviario) {
        this.tipoAviario = tipoAviario;
    }
}
