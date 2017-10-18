package PersonalDocente;

/**
 *
 * @author baesparza
 */
public class Titulo {
    
    // class titulo
    // los valores se envian en el constructor
    private String nombre;
    private String nombreUniversidad;
        
    public Titulo(String nombre, String nombreUniversidad) {
        this.nombre = nombre;
        this.nombreUniversidad = nombreUniversidad;
    }
        
    public String getNombre() {
        return this.nombre;
    }
       
    public String getNombreUniversidad() {
        return this.nombreUniversidad;
    }
}