package ejecutora;

/**
 *
 * @author baesparza
 */
public class Nota {
    private String asignatura;
    private int nota;

    public Nota(String asignatura, String nota) {
        this.asignatura = asignatura;
        this.nota = Integer.valueOf(nota);
    }
    
    /**
     * setter's
     */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public void setNota(String nota) {
        this.nota = Integer.valueOf(nota);
    }

    /**
     * Getter's
     */
    public String getAsignatura() {
        return this.asignatura;
    }
    public int getNota() {
        return this.nota;
    }
    
}
