package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String conductor;
    private int numeroEpisodios;
    private String temaPrincipal;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String conductor, int numeroEpisodios, String temaPrincipal) {
        super(titulo, duracionEnMinutos, genero);
        this.conductor = conductor;
        this.numeroEpisodios = numeroEpisodios;
        this.temaPrincipal = temaPrincipal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n=== Detalles del Podcast ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración promedio: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Conductor: " + conductor);
        System.out.println("Número de episodios: " + numeroEpisodios);
        System.out.println("Tema principal: " + temaPrincipal);
    }
}