/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2clase1;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

/**
 *
 * @author lobje
 */
public class Ejemplo2Clase1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Arreglo de dos dimensiones que 
    representaran el Tablero para totito
    */
    static String [][] tablero = new String[3][3];
    // Variable que almacenara el valor numerico de la fila
    static int fila = 0;
    // Variable que almacenara el valor numerico de la columna
    static int columna = 0;
    
    /*Metodo principal*/
    public static void main(String[] args) {
        // TODO code application logic here
        juego();
    }
    
    /*Metodo el en cual se ejecutara el juego*/
    public static void juego()
    {
        String simbolo = "";
        boolean fin = false;
        
        while(true){
            mostrarTablero();
            mensaje("");
            
            simbolo = obtenerCoordenadas();
            guardarSimbolo(simbolo);
            fin = verificarSiExisteGanador();
            
            if(fin){
                /*Sentencia que nos permite terminar el ciclo*/
                break;
            }
            
            /*
            Verificar los espacios disponibles
            */
        }
        
        if(fin)
        {
            mostrarTablero();
            mensaje("Gano el simbolo "+simbolo);
        }
    }
    
    /*Metodo que almacenara el simbolo que se ingreso en el tablero del juego*/
    public static void guardarSimbolo(String simbolo)
    {
        tablero[fila][columna] = simbolo;
    }
    
    /*
    Funcion usada para obtener los datos desde el teclado
        - Se obtiene la fila
        - Se obtiene la columan
        - Se obtiene el simbolo y al final devuelve un texto,
          en nuestro caso seria X u O
    */
    public static String obtenerCoordenadas()
    {
        // Variable para obtener el texto desde el teclado
        Scanner entrada = new Scanner(System.in);
        String texto = "";
        
        // Se muestra un mensaje indicando que se necesita
        mensaje("Ingrese la fila");
        // Se obtiene el texto desde el teclado
        texto = entrada.nextLine();
        // Llamamos a la funcion para que nos convierta de texto a numero
        fila = castNumero(texto);
        
        // Se muestra un mensaje indicando que se necesita
        mensaje("Ingrese la columna");
        // Se obtiene el texto desde el teclado
        texto = entrada.nextLine();
        // Llamamos a la funcion para que nos convierta de texto a numero
        columna = castNumero(texto);
        
        // Se muestra un mensaje indicando que se necesita
        mensaje("Ingrese el simbolo X / O");
        // Se obtiene el texto desde el teclado
        String simbolo = entrada.nextLine();
        return simbolo;
    }

    /*Funcion que convierte una cadena de texto a un numero entero*/
    public static int castNumero(String texto)
    {
        return parseInt(texto);
    }
    
    /*Metodo que muestra un mensaje en la consola*/
    public static void mensaje(String texto)
    {
        System.out.println(texto);
    }
    
    /*Metodo que muestra el tablero en la consola*/
    public static void mostrarTablero()
    {
        mensaje("-----------------------------");
        mensaje("Tablero");
        /*Ciclo for que recorre todas las filas a traves de los indices
        desde cero hasta el tamaño - 1*/
        for (int i = 0; i < tablero.length; i++) {
            /*
            Ciclo while que recorre todas las columnas a traves del indice j
            desde 0 hasta tamaño-1
            para este ejemplo seria de 0 a 2
            */
            int j = 0;
            while(j<tablero[i].length)
            {
                /*Se mostrara en consola el simbolo de cada columna*/
                System.out.print(tablero[i][j]+" ");
                j = j + 1;
            }
            /*Se realiza un salto de linea para la siguiente fila*/
            mensaje("");
        }
        mensaje("-----------------------------");
    }
    
    /*
    Funcion de tipo boolean esta funcion devuelve un valor verdadero o falso
    Verifica una columna
    */
    public static boolean VerficarColumna(int columna)
    {
        /*
        Se obtiene el valor almacenado en cada fila 
        La columna es la misma para todas las filas
        */
        String fila1 = tablero[0][columna];
        String fila2 = tablero[1][columna];
        String fila3 = tablero[2][columna];
        
        /*
        Se verifica que cada fila no contenga un valor nulo
            - El valor nulo es el valor por defecto para
              una variable o arreglo tipo String
            - El simbolos && indican que se tienen que cumplir las condicione
              que tiene a la derecha e izquierda del simbolo
              en nuestro caso las 3 condiciones
        */
        if(fila1 != null && fila2 != null && fila3 != null)
        {
            /*
            Se verifica que cada una de las filas tenga el mismo simbolo
            en nuestro caso X u O
            */
            if(fila1.equals(fila2) && fila1.equals(fila3))
            {
                // Si se cumplen las condiciones retornara un valor verdadero
                return true;
            }
            /*
            Con una sola condicion que no cumpla nos indica que los simbolos
            no son iguales y retornara un valor falso             
            */
            return false;
        }        
        /*
        Con una sola condicion que no cumpla nos indica que al menos un
        espacios de las filas no tiene simbolo y retornara un valor falso             
        */
        return false;
    }
        
    /*
    Funcion de tipo boolean esta funcion devuelve un valor verdadero o falso
    Verifica una fila
    */
    public static boolean VerficarFila(int fila)
    {
        /*
        Se obtiene el valor almacenado en cada columna 
        La fila es la misma para todas las columnas
        */
        String col1 = tablero[fila][0];
        String col2 = tablero[fila][1];
        String col3 = tablero[fila][2];
        
        /*
        Se verifica que cada columna no contenga un valor nulo
            - El valor nulo es el valor por defecto para
              una variable o arreglo tipo String
            - El simbolos && indican que se tienen que cumplir las condicione
              que tiene a la derecha e izquierda del simbolo
              en nuestro caso las 3 condiciones
        */
        if(col1 != null && col2 != null && col3 != null)
        {
            /*
            Se verifica que cada una de las columnas tenga el mismo simbolo
            en nuestro caso X u O
            */
            if(col1.equals(col2) && col1.equals(col3))
            {
                // Si se cumplen las condiciones retornara un valor verdadero
                return true;
            }
            /*
            Con una sola condicion que no cumpla nos indica que los simbolos
            no son iguales y retornara un valor falso             
            */
            return false;
        }
        /*
        Con una sola condicion que no cumpla nos indica que al menos un
        espacios de las columnas no tiene simbolo y retornara un valor falso             
        */
        return false;
    }
        
    /*
    Funcion de tipo boolean esta funcion devuelve un valor verdadero o falso
    Verifica la diagonal desde la parte izquierda superior hasta la parte
    derecha inferior
    */
    public static boolean VerficarDiagolI_D()
    {
        /*
        Se obtiene el valor almacenado en cada posicion en la diagonal
        de la izquierda superior a derecha inferior
        */
        String fila1 = tablero[0][0];
        String fila2 = tablero[1][1];
        String fila3 = tablero[2][2];
        
        /*
        Se verifica que cada valor en la diagonal no contenga un valor nulo
            - El valor nulo es el valor por defecto para
              una variable o arreglo tipo String
            - El simbolos && indican que se tienen que cumplir las condicione
              que tiene a la derecha e izquierda del simbolo
              en nuestro caso las 3 condiciones
        */
        if(fila1 != null && fila2 != null && fila3 != null)
        {
            /*
            Se verifica que cada una de las columnas tenga el mismo simbolo
            en nuestro caso X u O
            */
            if(fila1.equals(fila2) && fila1.equals(fila3))
            {
                // Si se cumplen las condiciones retornara un valor verdadero
                return true;
            }
            /*
            Con una sola condicion que no cumpla nos indica que los simbolos
            no son iguales y retornara un valor falso             
            */
            return false;
        }
        /*
        Con una sola condicion que no cumpla nos indica que los simbolos
        no son iguales y retornara un valor falso             
        */
        return false;
    }
    
    /*
    Funcion de tipo boolean esta funcion devuelve un valor verdadero o falso
    Verifica la diagonal desde la parte derecha superior hasta la parte
    izquierda inferior
    */
    public static boolean VerficarDiagolD_I()
    {
        /*
        Se obtiene el valor almacenado en cada posicion en la diagonal
        de la izquierda superior a derecha inferior
        */
        String fila1 = tablero[0][2];
        String fila2 = tablero[1][1];
        String fila3 = tablero[2][0];
        
        /*
        Se verifica que cada valor en la diagonal no contenga un valor nulo
            - El valor nulo es el valor por defecto para
              una variable o arreglo tipo String
            - El simbolos && indican que se tienen que cumplir las condicione
              que tiene a la derecha e izquierda del simbolo
              en nuestro caso las 3 condiciones
        */
        if(fila1 != null && fila2 != null && fila3 != null)
        {
            /*
            Se verifica que cada una de las columnas tenga el mismo simbolo
            en nuestro caso X u O
            */
            if(fila1.equals(fila2) && fila1.equals(fila3))
            {
                // Si se cumplen las condiciones retornara un valor verdadero
                return true;
            }
            /*
            Con una sola condicion que no cumpla nos indica que los simbolos
            no son iguales y retornara un valor falso             
            */
            return false;
        }
        /*
        Con una sola condicion que no cumpla nos indica que los simbolos
        no son iguales y retornara un valor falso             
        */
        return false;
    }
    
    /*
    Funcion de tipo boolean
    Se usara para verificar si existen tres simbolos alineados en cualquie
    direccion
    */
    public static boolean verificarSiExisteGanador()
    {
        // Variable usada para almacenar el valor verdadero o falso
        boolean gano = false;
        
        /* 
        Ciclo for con el se recorrera cada una de las filas
        verificando si en alguna de ellas se completo con el mismo simbolo
        */
        for (int i = 0; i < 3; i++) {
            gano = VerficarFila(i);
            if(gano == true){
            /*
            Si se encontro tres simbolo iguales alineados retornara
            un valor verdadero
            */
                return true;
            }
        }
        
        /* 
        Ciclo for con el se recorrera cada una de las columnas
        verificando si en alguna de ellas se completo con el mismo simbolo
        */
        for (int i = 0; i < 3; i++) {
            gano = VerficarColumna(i);
            if(gano){
            /*
            Si se encontro tres simbolo iguales alineados retornara
            un valor verdadero
            */
                return true;
            }
        }
        
        /*Se verificara si la diagonal que inicia en la parte izquierda superior
        hacia la parte derecha inferior se completo con el mismo simbolo*/
        gano = VerficarDiagolI_D();
        if(gano == true){
            /*
            Si se encontro tres simbolo iguales alineados retornara
            un valor verdadero
            */
            return true;
        }
        
        /*Se verificara si la diagonal que inicia en la parte dercha superior
        hacia la parte izquierda inferior se completo con el mismo simbolo*/
        gano = VerficarDiagolD_I();
        if(gano){
            /*
            Si se encontro tres simbolo iguales alineados retornara
            un valor verdadero
            */
            return true;
        }
        
        /*
        Si aun no hay tres simbolos iguales en la misma linea o
        bien sin no hay ganador retornara un valor falso
        */
        return gano;
    }
}
