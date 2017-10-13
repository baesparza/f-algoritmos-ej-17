/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase3;

/**
 *
 * @author Usuario
 */
public class ejemploclase3 {
    
    public static void main(String[] Arg) {
        Computadora laptop = new Computadora();
        
        laptop.setVelocidadProcesaror(2.3);
        
        System.out.println(laptop.getvelocidadProcesador());
        
        laptop.setVelocidadProcesaror(10.3);
        
        System.out.println(laptop.getvelocidadProcesador());
        
        System.out.println(laptop.toString());
    }    
}
