package clase3;

import Principal.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author baesparza
 */
public class Clase3 {

    /**
     * Tarea Extra Clase 1:
     * 
     * Crear las siguientes clases.
     * 
     * Titulo
     *  - Atributos: nombre, nombre_universidad
     * 
     * Asignatura
     *  - Atributos: nombre, creditos
     * 
     * Docente
     *  - Atributos: nombres, apellidos, titulo_tercer_nivel, titulo_cuarto_nivel, asignatura_1, asignatura2
     * 
     * Consideraciones
     *  - Las clases deben tener las atributos como privados.
     *  - El método principal del proyecto, estará en una clase llamada Principal,
     *  - Crear e imprimir dos objetos tipo Docente.
     */
    
    public static void main(String[] args) {
        
        // casos planteados para verificar resultados
        // test        
        Principal principal = new Principal();

        // Presentar resultados
        JOptionPane.showMessageDialog(null, principal.getCaso1().toString());

        JOptionPane.showMessageDialog(null, principal.getCaso2().toString());
        
    }    
    
}
