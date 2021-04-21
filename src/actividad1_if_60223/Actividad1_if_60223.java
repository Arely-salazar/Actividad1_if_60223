/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1_if_60223;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Actividad1_if_60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miConsola = new Scanner(System.in);
           
        System.out.println( "Año actual");
        int a = miConsola.nextInt();  
        System.out.println( "Inserte un año");
        int b = miConsola.nextInt();
        int c ;
       if (a > b){
        c = a - b;
        System.out.println( "Han pasado " + c + "años");
        } else {
           c = b - a ;
           System.out.println("Faltan " + c + " años");
       
    }
    
}
}