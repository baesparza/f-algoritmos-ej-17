package Institucion;

/**
 *
 * @author baesparza
 */
public class Asignatura {
        
    // class asignatura
    // los valores se envian en el constructor
    private String nombre;
    private int creditos;
       
    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }
        
    public String getNombre() {
        return this.nombre;
    }
        
    public int getCreditos() {
        return this.creditos;
    }
}
