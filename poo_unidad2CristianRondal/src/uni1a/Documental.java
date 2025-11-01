package uni1a;

import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores = new ArrayList<>();

    // Constructor
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    // Método para agregar investigadores
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    // Método que muestra toda la información del documental
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println("Investigadores participantes:");
        
        if (investigadores.isEmpty()) {
            System.out.println("  - No hay investigadores registrados.");
        } else {
            for (Investigador i : investigadores) {
                i.mostrarInvestigador();
            }
        }
        System.out.println();
    }
}
