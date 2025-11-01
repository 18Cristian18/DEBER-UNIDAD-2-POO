package uni1a;

import java.util.ArrayList;

public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private ArrayList<Pelicula> peliculas;

    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void mostrarInformacion() {
        System.out.println("Actor: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad);
        System.out.println("Películas en las que participa:");
        if (peliculas.isEmpty()) {
            System.out.println("  - No tiene películas registradas.");
        } else {
            for (Pelicula p : peliculas) {
                System.out.println("  - " + p.getTitulo());
            }
        }
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
