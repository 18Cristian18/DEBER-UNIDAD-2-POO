package contenido;

public class Actor {
    // Atributos
    private String nombre;
    private int edad;
    private String nacionalidad;

    // Constructor
    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Actor: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad);
    }

    // Getters
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
