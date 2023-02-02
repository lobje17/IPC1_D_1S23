/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1clase2;

/**
 *
 * @author lobje
 */
public class Ejemplo1Clase2 {

    /**
     * @param args the command line arguments
     */
    /*Declaracion global*/
    public static int []nuevo = new int[2];
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(4));
    }
    
    /*
        4*3*2*1 
    
    */
    
    public static int factorial(int numero)
    {
        if(numero<0)
        {
            return 0;
        }
        if(numero==0)
        {
            return 1;
        }
        else
        {
            return numero * factorial(numero-1);
        }
    }
}
