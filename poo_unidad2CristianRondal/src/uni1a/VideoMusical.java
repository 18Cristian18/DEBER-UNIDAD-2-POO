package uni1a;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String album;
    private String director;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String album, String director) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.album = album;
        this.director = director;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n=== Detalles del Video Musical ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Director: " + director);
    }
}