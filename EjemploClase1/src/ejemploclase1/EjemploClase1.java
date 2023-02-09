/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase1;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

/**
 *
 * @author lobje
 */
public class EjemploClase1 {

    /**
     * @param args the command line arguments
     */
    public static String [] a = {"a", "b", "c", "d"};
    public static String [] b = new String [4];
    
    public static void main(String[] args) {
        // TODO code application logic here
//        b[0] = a[0];
//        System.out.println(a[0]);
//        System.out.println(b[0]);
//        b[0] = "jajaja";
//        
//        System.out.println(a[0]);
//        System.out.println(b[0]);
        
//        Scanner entrada = new Scanner(System.in);
//        Scanner entrada2 = new Scanner(System.in);
//        String a = "";
//        int b = 0;
//        a = entrada.nextLine();
//        System.out.println("Aqui 1 "+a);
//        b = entrada.nextInt();
//        System.out.println("Aqui 2 "+b);
//        System.out.println("KKKK");
//        System.out.println("KKKK");
//        String c = "";
//        c = entrada.next();
//        System.out.println("Aqui 3"+c);
        

        String [][] datos = {{"1.0", "2.0"}, {"12.0", "265.0"}, {"127.0", "26.0"}};
        
        double [][]nuevosDatos = cambioADouble(datos);
        
        System.out.println("Se sumaron los datos recibidos "+(nuevosDatos[0][1]*nuevosDatos[1][1]));
    }
    
    public static double [][] cambioADouble(String [][] datos)
    {
        double [][]nuevosDatos = new double[3][2];
        for (int i = 0; i < datos.length; i++) {
            
            System.out.println(datos[i][0]+"   "+datos[i][1]);
            
                nuevosDatos[i][0] = Double.parseDouble(datos[i][0]);
                nuevosDatos[i][1] = Double.parseDouble(datos[i][1]);
        }
        return nuevosDatos;
    }
    
    public static void general()
    {System.out.print("Hola mundo");
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
        
        int [][] matriz = new int [3][5];
        
        /*
            0,0  0,1    5 0
            1,0  1,1    0 
            2,0  2,1
        */
        //     fila, columna
        matriz[0][0] = 5;
        
        System.out.println(matriz[0][0]);
        
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
        
        int val1 = 2;
        switch (val1) {
            case 0:
                System.out.println("Primera posicion");
                break;
            case 1:
                System.out.println("Primera segunda");
                break;
            case 2:
                System.out.println("Primera tercera");
                break;
            default:
                System.out.println("Ultima posicion");
        }      
        
        char val2 = 'a';
        
        switch (val2) {
            case 'a':
                System.out.println(val2);
                break;
            default:
                System.out.println("Fin");
        }
        
        
        System.out.println("Valores del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo2[i]);
        }
        
        
        System.out.println("Mostrando el contenido de la matriz");
        matriz[1][2] = 15;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Fila "+(i+1)+"    ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("-");
            }
            System.out.println("");
        }
        
        
        /*
        Obteniendo valores desde el teclado
        */
        
        Scanner entrada = new Scanner(System.in);
        
        String texto = "";
        
        System.out.println("Ingrese su cadena de texto");
        texto = entrada.nextLine();
        System.out.println("Ingresamos lo siguiente " + texto);
        
        
        System.out.println("Ingrese un numero: ");
        texto = entrada.nextLine();
        
        // Realizando casteo
        int numeroIn = parseInt(texto);
        
        numeroIn = numeroIn * 2;
        System.out.println("El valor de numeroIn es "+numeroIn);
        
        String val3 = obtenerValorArray(numeroIn); // "asjskags"
        
        System.out.println(val3);
        
        mostraDatosArray(arreglo2);
        
        int [] arr2 = new int[8];
        mostraDatosArray(arr2);
        
        System.out.println( matriz.length);
        System.out.println( matriz[0].length);
    }
    
    public static void mostraDatosArray(int [] arr)
    {
        System.out.println("Estamos imprimiendo los datos del arrglo de tamano "+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    /* Devuelve un valor*/
    public static String obtenerValorArray(int i)
    {
        if(i==1){
            return "Es el primer valor";
        }
        return "No esta en las opciones";
    }
}
