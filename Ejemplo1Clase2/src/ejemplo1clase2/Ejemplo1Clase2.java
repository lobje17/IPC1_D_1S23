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
        System.out.println("AAAAAAAAaa");
       a(false);
        a(true);
    }
    
    
    public static void a(boolean verDatos)
    {
        if(verDatos)
        {
            System.out.println(nuevo[1]);
        }
        else
        {
            nuevo[1] = 20;
        }
    }
}
