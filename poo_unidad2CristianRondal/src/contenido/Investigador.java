package contenido;

public class Investigador {
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    public Investigador(String nombre, String especialidad, int aniosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void mostrarInvestigador() {
        System.out.println("Investigador: " + nombre + ", Especialidad: " + especialidad +
                ", Años de experiencia: " + aniosExperiencia);
    }
}