package PersonalDocente;

import Institucion.Asignatura;

/**
 *
 * @author baesparza
 */
public class Docente {
        
    // cada profesor tiene 
    /**
     * @param nombres nombres del profesor
     * @param apellidos apellido del profesor
     * @param tituloTercerNivel primer titulo
     * @param tituloCuartoNivel segundo titulo
     * @param asignatura1 primera asignatura
     * @param asignatura2 segunda asignatura
    */
        
    private String nombres, apellidos;
    private Titulo tituloTercerNivel, tituloCuartoNivel;
    private Asignatura asignatura1, asignatura2;
        
    public Docente(
            String nombres,
            String apellidos,
            String nombreAsignatura1,
            int numeroCreditosAsignatura1,
            String nombreAsignatura2,
            int numeroCreditosAsignatura2,
                String nombreTitulo1,
                String nombreUniversidad1,
                String nombreTitulo2,
                String nombreUniversidad2
        ) {
            // los valores se envian en el constructor de cada objeto
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.asignatura1 = new Asignatura(nombreAsignatura1, numeroCreditosAsignatura1);
            this.asignatura2 = new Asignatura(nombreAsignatura2, numeroCreditosAsignatura2);
            this.tituloTercerNivel = new Titulo(nombreTitulo1, nombreUniversidad1);
            this.tituloCuartoNivel = new Titulo(nombreTitulo2, nombreUniversidad2);
        }
        
         @Override
        public String toString() {
            // para imprimir el formato pedido
            // para poder obtener los nombres o creditos o lugates usamos metodos get de cada clase
            return String.format(
                    "Datos del Docente:\n"
                            + "Nombres: %s\n"
                            + "Apellidos: %s\n"
                            + "Tiene a su cargo las asignaturas: \n"
                            + "    Asignatura 1: %s con número de créditos %d\n"
                            + "    Asignatura 2: %s con número de créditos %d\n"
                            + "El docente tiene los siguientes títulos académicos\n"
                            + "    Título 3er nivel: Licenciado en %s - %s\n"
                            + "    Título 4er nivel: Licenciado en %s - %s\n",
                    this.nombres,
                    this.apellidos,
                    this.asignatura1.getNombre(), this.asignatura1.getCreditos(),
                    this.asignatura2.getNombre(), this.asignatura2.getCreditos(),
                    this.tituloTercerNivel.getNombre(), this.tituloTercerNivel.getNombreUniversidad(),
                    this.tituloCuartoNivel.getNombre(), this.tituloCuartoNivel.getNombreUniversidad()
            );
        }
    }