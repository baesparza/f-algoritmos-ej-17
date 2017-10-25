package academico;

/**
 *
 * @author baesparza
 */
public class Asignatura {
    
    private Carrera carrera;
    
    private String nombre;
    private int creditos;
    
    public Asignatura(Carrera carrera) {
        this.carrera = carrera;
        this.nombre = "Informatica";
        this.creditos = 5;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Asignatura: \n"
                        + "\tCarrera: %s\n"
                        + "\tModalidad: %s\n"
                        + "\tNombre: %s\n"
                        + "\tCreditos: %s\n",
                this.carrera.getNombre(),
                this.carrera.getModalidad(),
                this.nombre,
                this.creditos);
    }
}
