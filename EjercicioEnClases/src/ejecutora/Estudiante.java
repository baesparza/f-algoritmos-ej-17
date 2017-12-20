package ejecutora;

import java.util.ArrayList;

/**
 *
 * @author baesparza
 */
public class Estudiante {
    private String nombre, apellido;
    private ArrayList<Nota> listaNotas;

    public Estudiante(String nombre, String apellido, ArrayList<Nota> listaNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaNotas = listaNotas;
    }
    
    /**
     * Setter's
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
    /**
     * Getter's
     */
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public ArrayList<Nota> getListaNotas() {
        return this.listaNotas;
    }
    
    
    /**
     * fill or return word with missing spaces
     * @param word String of any size
     * @return word with missing spaces
     */
    private String parseItem(String word) {
        if (word.length() >= 10) return word; // check if word is full
        
        // fill missing spaces
        for (int i = word.length(); i <= 10; i++) {
            word += " ";// add blanck spaces
        }
        return word;
    }

    @Override
    public String toString() {
        return String.format(
                "%s;%s;%d(%s);%d(%s);%d",
                this.nombre,// nombre
                this.apellido,// apellido
                this.listaNotas.get(0).getNota(), this.listaNotas.get(0).getAsignatura(), 
                this.listaNotas.get(1).getNota(), this.listaNotas.get(1).getAsignatura(),
                Integer.valueOf( // integer value of division
                        (this.listaNotas.get(0).getNota()+this.listaNotas.get(1).getNota())/2
                )
        );
    }
    
    public String printConsole() {
        return String.format(
                "%s\t%s\t%s\t%s\t%s",
                this.parseItem(this.nombre),// nombre
                this.parseItem(this.apellido),// apellido
                this.parseItem( // fill missing space's
                        String.valueOf( // transform grade to string
                                this.listaNotas.get(0).getNota()
                        ) + " " + this.listaNotas.get(0).getAsignatura() // add grade name
                ),
                this.parseItem( // fill missing space's
                        String.valueOf( // transform grade to string
                                this.listaNotas.get(1).getNota()
                        ) + " " + this.listaNotas.get(1).getAsignatura() // add grade name
                ),
                this.parseItem( // fill missing space's
                        String.valueOf( // transform prom to string
                                Integer.valueOf( // integer value of division
                                        (this.listaNotas.get(0).getNota()+this.listaNotas.get(1).getNota())/2
                                )
                        )
                )
        );
    }
}
