package herenciasEjemplo;

/**
 *
 * @author baesparza
 */
public class Principal {
    
    public static void main(String[] args) {
        
        AsignaturaPresencial asignaturaPresencial = new  AsignaturaPresencial(
                "Programacion",
                "Comun",
                "100",
                "180"
        );
        System.out.println(asignaturaPresencial);
        
        AsignaturaDistancia asignaturaDistancia = new  AsignaturaDistancia(
                "Literatura",
                "Troncal",
                "300",
                "6"
        );
        System.out.println(asignaturaDistancia);
    }
}
