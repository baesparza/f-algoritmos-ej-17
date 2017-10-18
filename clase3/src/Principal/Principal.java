package Principal;

import PersonalDocente.Docente;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    private Docente caso1, caso2;
    
    public Principal() {
        caso1 = new Docente(
                "Luis V",
                "Perez J",
                "Matemáticas", 8,
                "Física", 6,
                "Físico Matemáticas", "Universidad Politécnica",
                "Docencia Matemática", "Universidad Valenciana"
        );
        
        caso2 = new Docente(
                "Ana M",
                "Velez P",
                "Literatura", 9,
                "Literatura", 10,
                "Ciencias Sociales", "Universidad Salesiana",
                "Docencia Social", "Universidad Cataluña"
        );
    }
    
    public Docente getCaso1() {
        return this.caso1;
    }
    
    public Docente getCaso2() {
        return this.caso2;
    }
    
}
