/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herenciasEjemplo.AsignaturaPresencial;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    private AsignaturaPresencial[] asignaturas;

    public Estudiante(String n, String a, int e, AsignaturaPresencial[] asignaturas) {
        super(n, a, e);
        this.setAsignaturas(asignaturas);
    }

    @Override
    public void setEdad(int n) {
        if (n < 18) {
            edad = 18;
            return;
        }
        edad = n;
    }

    public void setAsignaturas(AsignaturaPresencial[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public AsignaturaPresencial[] getAsignaturas() {
        return this.asignaturas;
    }

    public double getMatricula() {
        double result = 0;
        for (AsignaturaPresencial asignatura : this.asignaturas) result += Double.valueOf(asignatura.getCosto());
        return result;
    }
    
    public String getInformacionMatricula() {
        String result = "";
        for (AsignaturaPresencial asignatura : this.asignaturas) result += asignatura.toString();
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s - Valor de la matricula: $%f\nInformacion de las materias:\n%s", super.toString(), getMatricula(), this.getInformacionMatricula());
    }

    // @Override
    // public String toString(){
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
