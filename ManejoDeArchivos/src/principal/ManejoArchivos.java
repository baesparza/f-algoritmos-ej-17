package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class ManejoArchivos {
    private Scanner input;
    
    /**
     * permite al usuario abrir el archivo
     */
    public void abrirArchivo() {
        try {
            input = new Scanner(new File( "./assets/datos.csv" ) );
        }
        catch ( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Error al abrir el archivo." );
            System.exit( 1 );
        }
    }
    
    /**
     * ee registros del archivo, usando el objeto Scanner
     * @return arreglo con los datos del archivo cargados
     */
    public ArrayList<Estudiante> leerRegistros() { 
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        try {
            while(input.hasNext()) {
                String cadena = input.nextLine();
                
                ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split("\\|")));
                estudiantes.add(new Estudiante( // pasamos un nuevo estudiante con los datos del archivo
                        registro.get(0),
                        registro.get(1),
                        Integer.parseInt(registro.get(2))
                ));
            }
        } catch ( NoSuchElementException elementException ) {
            System.err.println( "El archivo no esta bien formado." );
            input.close();
            System.exit( 1 );
        } catch ( IllegalStateException stateException ) {
            System.err.println( "Error al leer del archivo." );
            System.exit( 1 );
        }
        return estudiantes;
    }
    
    /**
     * cierra el archivo y termina la aplicacion
     */
    public void cerrarArchivo() { if ( input != null ) input.close(); }
}
