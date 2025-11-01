package contenido;

public class Temporada {
    // Atributos
    private int numero;
    private int cantidadEpisodios;
    private int anioLanzamiento;

    // Constructor
    public Temporada(int numero, int cantidadEpisodios, int anioLanzamiento) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anioLanzamiento = anioLanzamiento;
    }

    // Método para mostrar información
    public void mostrarTemporada() {
        System.out.println("Temporada " + numero + ": " + cantidadEpisodios + 
                           " episodios, año " + anioLanzamiento);
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
}
