package herenciasEjemplo;

/**
 *
 * @author baesparza
 */
public class AsignaturaDistancia extends Asignatura{
    
    private String numeroCreditos;
    
   public AsignaturaDistancia(){
        super("Asignatura indefinida", "Tipo Indefinido", "Costo Indefinido");
        this.numeroCreditos = "Numero de horas indefinido";
    }
            
    public AsignaturaDistancia(String nombre, String tipo, String costo){
        super(nombre, tipo, costo);
        this.numeroCreditos = "Numero de horas indefinido";
    }
            
    public AsignaturaDistancia(String nombre, String tipo, String costo, String numeroCreditos){
        super(nombre, tipo, costo);
        this.setNumeroCreditos(numeroCreditos);
    }
    
    public AsignaturaDistancia(String numeroCreditos){
        super("Asignatura indefinida", "Tipo Indefinido", "Costo Indefinido");
        this.setNumeroCreditos(numeroCreditos);
    }

    public void setNumeroCreditos(String numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
    
    public String getNumeroCreditos(){
        return this.numeroCreditos;
    }
    
    @Override
    public String toString() {
        return String.format("%s\n"
                + "\tNumero de creditos: %s\n",
                super.toString(),
                this.getNumeroCreditos());
    }
}
