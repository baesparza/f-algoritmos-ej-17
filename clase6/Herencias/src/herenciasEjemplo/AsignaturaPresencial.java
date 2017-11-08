package herenciasEjemplo;

/**
 *
 * @author baesparza
 */
public class AsignaturaPresencial extends Asignatura {
            
    private String numeroHoras;

    public AsignaturaPresencial(){
        super("Asignatura indefinida", "Tipo Indefinido", "Costo Indefinido");
        this.numeroHoras = "Numero de horas indefinido";
    }
            
    public AsignaturaPresencial(String nombre, String tipo, String costo){
        super(nombre, tipo, costo);
        this.numeroHoras = "Numero de horas indefinido";
    }
            
    public AsignaturaPresencial(String nombre, String tipo, String costo, String numeroHoras){
        super(nombre, tipo, costo);
        this.setNumeroHoras(numeroHoras);
    }
    
    public AsignaturaPresencial(String numeroHoras){
        super("Asignatura indefinida", "Tipo Indefinido", "Costo Indefinido");
        this.setNumeroHoras(numeroHoras);
    }

    public void setNumeroHoras(String numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
    
    public String getNumeroHoras(){
        return this.numeroHoras;
    }
    
    @Override
    public String toString() {
        return String.format("%s\n"
                + "\tNumero de horas: %s\n",
                super.toString(),
                this.getNumeroHoras());
    }
}
