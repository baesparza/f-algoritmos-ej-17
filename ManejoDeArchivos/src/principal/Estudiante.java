package principal;

/**
 *
 * @author baesparza
 */
public class Estudiante {
    private String nombre, apellido;
    private int edad;
    
    public Estudiante(String nombre, String apellido, int edad) {
        this.setNombe(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    }

    /**
     * Setter's
     */
    public void setNombe(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setEdad(int edad) { this.edad = edad; }

    
    /**
     * Getter's
     */
    public String getNombre() { return this.nombre; }
    public String getApellido() { return this.apellido; }
    public int getEdad() { return this.edad; }
}
