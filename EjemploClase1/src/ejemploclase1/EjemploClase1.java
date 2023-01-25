/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase1;

/**
 *
 * @author lobje
 */
public class EjemploClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Hola mundo");
        System.out.print("Hola mundo");
        
        int numero = 10;
        System.out.println(numero);
        System.out.println(numero);
        
        String mensaje = "Hola mundo";
        System.out.println(mensaje);
        
        char caracte = '4';
        System.out.println(caracte);
        
        double decimal = 1.22;
        System.out.println(decimal);
        
        boolean b = false;
        System.out.println(b);
        // com
        
        /*
        
        
        
        sss
        Declaracion constante
        */
        final int nuemro2 = 15;
        System.out.println(nuemro2);
        
        numero = 89;
        int x = 1;
        System.out.println(numero);
        
        /*
        Arreglos
        */
        
        
        int [] arreglo1 = new int[2];
        //                 0 1 2 3 4
        int [] arreglo2 = {1,2,3,4,5};
        // Los indices 0 hasta tamaño-1
        System.out.println(arreglo2[2]);
        
        
        System.out.println(arreglo2[0]);
        arreglo2[0] = 56;        
        System.out.println(arreglo2[0]);
        
        int [][] matriz = new int [3][20];
        
        /*
            0,0  0,1    5 0
            1,0  1,1    0 
            2,0  2,1
        */
        //     fila, columna
        matriz[0][0] = 5;
        
        System.out.println(matriz[0][19]);
        
        /*
        for
        while
        do while
        */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        String a = "d";
        
        while (a!="salir") {            
            System.out.println("a");
            a = "salir";
        }
        
        a = "a";
        do{
            System.out.println("Una vez");
            a = "salir";
        } while(a!="salir");
        
        /*
        Sentencias de control:
            Permiten decidir que accion se va a realizar
        if - else
        switch
        */
        a = "as";
        if(a=="salir")
        {
            System.out.println("Saliedo del programa");
        }
        else if(a=="as")
        {
            System.out.println("programa");
        }
        else{
            System.out.println("Seguimos el programa");
        }
        
        
    }
    
    
    
}
