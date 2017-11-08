package herenciasEjemplo;

/**
 *
 * @author baesparza
 */
public class Asignatura {
    
    private String nombre;
    private String tipo;
    private String costo;
    
    public Asignatura(String nombre, String tipo, String costo) {
        this.setNombre(nombre);
        this.setTipo(tipo);
        this.setCosto(costo);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String getCosto() {
        return this.costo;
    }
    
    @Override
    public String toString() {
        return String.format(" - %s\n"
                + "\t%s\n"
                + "\tCosto: $%s",
                this.getNombre(),
                this.getTipo(),
                this.getCosto());
    }
}
