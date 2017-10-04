/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("Ingrese un numero para presentar la tabla de multiplicar: ");
        numero = input.nextInt();
        
        tablaMultiplicar(numero);
    }
    
    public static void tablaMultiplicar (int num) {
        
        for (int i = 0; i < 12; i++) {
            System.out.print(num+" * "+(i+1)+" = "+((i+1)*num)+"\n");
        }
        
    }
    
}
