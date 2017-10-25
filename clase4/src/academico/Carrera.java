package academico;

/**
 *
 * @author Salas
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public Carrera(){
        modalidad = "distancia";
    }
    
    public Carrera(String md){
        modalidad = md;
    }
    
    public Carrera(String md, String n){
        modalidad = md;
        nombre = n;
    }
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecer_modalidad(String n){
        modalidad = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Modalidad %s - Carrera %s\n",
                obtener_modalidad(), this.obtener_nombre());
        return cadena;
    }

}

