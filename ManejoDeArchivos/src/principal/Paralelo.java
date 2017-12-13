package principal;

import java.util.ArrayList;

/**
 *
 * @author baesparza
 */
public class Paralelo {
    private ArrayList<Estudiante> estudiantes;
    
    public Paralelo(ArrayList<Estudiante> estudiantes) {
        this.setEstudiantes(estudiantes);
    }

    /**
     * Setter's
     */
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) { this.estudiantes = estudiantes; }
    
    /**
     * Getter's
     */
    public ArrayList<Estudiante> getEstudiantes() { return this.estudiantes; }
    
    /**
     * calcularPromedioEdad
     * @return promedio de la edad de los estudiantes
     */
    public float calcularPromedioEdad() {
        float promedio = 0;
        for (Estudiante e: this.estudiantes) promedio += e.getEdad();
        return promedio/this.estudiantes.size();
    }
}
