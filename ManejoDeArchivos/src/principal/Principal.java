package principal;

/**
 *
 * @author baesparza
 */
public class Principal {

    public static void main(String[] args) {
        ManejoArchivos a = new ManejoArchivos();
        
        a.abrirArchivo();
        
        Paralelo p = new Paralelo(a.leerRegistros());
        
        a.cerrarArchivo();
        
        System.out.println(p.calcularPromedioEdad());
    }
    
}
