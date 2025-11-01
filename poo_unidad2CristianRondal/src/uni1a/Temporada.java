package uni1a;

public class Temporada {
    private int numero;
    private int cantidadEpisodios;
    private int anioLanzamiento;

    public Temporada(int numero, int cantidadEpisodios, int anioLanzamiento) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anioLanzamiento = anioLanzamiento;
    }

    public void mostrarTemporada() {
        System.out.println("Temporada " + numero + ": " + cantidadEpisodios + " episodios, año " + anioLanzamiento);
    }
}