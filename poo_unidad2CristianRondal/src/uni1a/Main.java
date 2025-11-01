package uni1a;

public class Main {
    public static void main(String[] args) {

        // Crear una película
        Pelicula pelicula1 = new Pelicula("El Gran Viaje", 120, "Aventura", "DreamWorks");
        Pelicula pelicula2 = new Pelicula("Sombras del Pasado", 105, "Drama", "Paramount");

        // Crear un actor
        Actor actor1 = new Actor("Juan Pérez", 35, "Ecuatoriano");

        // Relacionar el actor con sus películas
        actor1.agregarPelicula(pelicula1);
        actor1.agregarPelicula(pelicula2);

        // Mostrar detalles de las películas
        pelicula1.mostrarDetalles();
        pelicula2.mostrarDetalles();

        // Mostrar información del actor
        actor1.mostrarInformacion();
        
        
        SerieDeTV serie1 = new SerieDeTV("El Misterio de Quito", 45, "Suspenso", 2);
        Temporada t1 = new Temporada(1, 10, 2023);
        Temporada t2 = new Temporada(2, 8, 2024);

        serie1.agregarTemporada(t1);
        serie1.agregarTemporada(t2);

        serie1.mostrarDetalles();
        
        
     // === Documental e Investigadores ===
        Investigador inv1 = new Investigador("María Torres", "Biología Marina", 12);
        Investigador inv2 = new Investigador("Carlos Pérez", "Ecología", 8);

        Documental doc1 = new Documental("Océanos del Futuro", 90, "Ciencia", "Vida marina");
        doc1.agregarInvestigador(inv1);
        doc1.agregarInvestigador(inv2);

        doc1.mostrarDetalles();
        
     // === VideoMusical ===
        VideoMusical vm1 = new VideoMusical("Vuelve", 4, "Pop", "Morat", "Balas Perdidas", "Juan López");
        vm1.mostrarDetalles();

        // === Podcast ===
        Podcast p1 = new Podcast("Tecnología al Día", 45, "Educativo", "Carlos Ruiz", 10, "Innovaciones digitales");
        p1.mostrarDetalles();

    }
}