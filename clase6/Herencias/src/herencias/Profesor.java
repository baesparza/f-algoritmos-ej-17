package herencias;

/**
 *
 * @author baesparza
 */
public final class Profesor extends Persona {
    
    private double sueldo;
    
    public Profesor() {
        super("Bruno", "Esparza", 19);
    }
    
    public Profesor(double sueldo){
        super("Bruno", "Esparza", 19);
        this.setSueldo(sueldo);
    }
    
    public Profesor(String n, String a, int e, double sueldo){
        super(n, a, e);
        this.setSueldo(sueldo);
    }
    
    public void setSueldo (double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
}
