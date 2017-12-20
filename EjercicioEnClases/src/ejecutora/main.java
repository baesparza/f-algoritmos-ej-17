package ejecutora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class main {

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        CrearArchivoTexto app = new CrearArchivoTexto();
        
        for (int i = 0; i < 3; i++) {  
            estudiantes.add(
                    // create new student and send params
                    new Estudiante(
                            printAndScann("Ingrese el nombre del estudiante"), // pedir nombre
                            printAndScann("Ingrese el apellido del estudiante"), // pedir apellido
                            // create arraylist of notas1
                            new ArrayList<>(
                                // set defaul values for notas
                                Arrays.asList(
                                        // create each nota object
                                        new Nota(
                                                printAndScann("Ingrese el nombre de la asignatura 1"), // ask nota1 name
                                                printAndScann("Ingrese la nota") // ask nota1 value
                                        ),
                                        new Nota(
                                                printAndScann("Ingrese el nombre de la asignatura 2"),// ask nota2 name
                                                printAndScann("Ingrese la nota") //// ask nota2 value
                                        )
                                ))// end of create array de notas
                    )// end create student
            );// end push new object
        }// end for
        
        
        System.out.println("Nombre    \tApellido  \tNota 1    \tNota 2    \tPromedio  ");
        // use arraylist for each
        estudiantes.forEach(e->System.out.println(e.printConsole()));
        
        app.abrirArchivo();
        app.agregarRegistros(estudiantes);
        app.cerrarArchivo();
    }
    
    public static String printAndScann(String msg) {
        System.out.println(msg);
        return input.nextLine();
    }
}
