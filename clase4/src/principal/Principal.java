package principal;

import academico.Asignatura;
import academico.Carrera;

/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carrera c1 = new Carrera("presencial", "Contabilidad");
        Carrera c2 = new Carrera("Economia", "distancia");
        
        Asignatura a1 = new Asignatura(c1);
        Asignatura a2 = new Asignatura(c2);
        
        System.out.println(a1);
        System.out.println(a2);
    }
}