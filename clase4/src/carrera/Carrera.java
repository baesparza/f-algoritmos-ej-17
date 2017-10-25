package carrera;

/**
 *
 * @author baesparza
 */
public class Carrera {

    private String nombre;
    private String modalidad;
    
    public Carrera() { }
    
    public Carrera(String modalidad) {
        this.modalidad = modalidad;
    }
    
    public Carrera(String modalidad, String nombre) {
        this.nombre = nombre;
        this.modalidad = modalidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return this.modalidad;
    }
}