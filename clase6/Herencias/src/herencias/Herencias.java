/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herenciasEjemplo.AsignaturaPresencial;
import javax.swing.JOptionPane;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AsignaturaPresencial[] asignaturasE = new AsignaturaPresencial[2];
                
        asignaturasE[0] = new AsignaturaPresencial(
                "Programacion",
                "Comun",
                "100",
                "180"
        );
        asignaturasE[1] = new AsignaturaPresencial(
                "Estructura de datos",
                "Comun",
                "300",
                "180"
        );        
        
        Estudiante e = new Estudiante("Bruno", "Esparza", 19, asignaturasE);
        JOptionPane.showMessageDialog(null, e);
    }
    
}
