package clase4;

import carrera.Carrera;

/**
 *
 * @author baesparza
 */
public class Clase4 {
    
    /**
     * uso de constructores
     */

    public static void main(String[] args) {
        Carrera c = new Carrera();
        c.setNombre("Informatica");
        c.setModalidad("Distancia");
        
        System.out.println(c);
        
        /*** case 2 ***/
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2);

        /*** case 3 ***/
        
        Carrera c3 = new Carrera("Semipresencial", "Informatica");
        System.out.print(c3);

    }
    
}
