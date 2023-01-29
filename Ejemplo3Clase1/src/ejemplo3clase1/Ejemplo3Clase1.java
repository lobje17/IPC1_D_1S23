/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3clase1;

import java.util.Scanner;
/**
 *
 * @author lobje
 */
public class Ejemplo3Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variable que almacenara los valores que se obtengan desde el teclado
        Scanner entrada = new Scanner(System.in);
        
        String nombre = "";
        int numero_de_nombre = 0;
        String [] arreglo = new String[5];
        // {null, null, null, null, null}
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nombre");
            nombre = entrada.nextLine();
            arreglo[numero_de_nombre] = nombre;
            numero_de_nombre = numero_de_nombre + 1;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("El nombre ingresado fue "+arreglo[i]);
        }
        */
        
        /*  
            OPERADORES ARITMETICOS
                +, -, *, /
            OPERADORES RELACIONALES
                <, >, <=, >=, !=, == 
            OPERADORES LOGICOS
                &&, !, ||
                edad == 12 || edad == 13
                edad = 12
                !(edad == 12)
                !(true)
                false
        */
        
        String [][] arreglo2D = new String [5][3];
        
        /* 
                nombre carnet edad
        columna   0      1      2
        */
        arreglo2D[1][2] = "25";
        
        arreglo2D[0][0] = "Jose";
        arreglo2D[0][1] = "123456789";
        arreglo2D[0][2] = "20";
        
        arreglo2D[1][0] = "Pedro";
        arreglo2D[1][1] = "123456789";
        arreglo2D[1][2] = "21";
        
        boolean encontrado = false;
        
        for (int i = 0; i < 5; i++) {
            if(arreglo2D[i][0] != null)
            {
                if(arreglo2D[i][0].equals("Jose")){
                    System.out.println("Si es Jose");
                    break;
                }
            }
            else{
                System.out.println("No se encontro al estudiante");
                break;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            
            if(arreglo2D[i][0] != null)
            {                        
                System.out.print("Nombre "+arreglo2D[i][0]);                      
                System.out.print(" Carnet "+arreglo2D[i][1]);                       
                System.out.println(" Edad "+arreglo2D[i][2]);
            }
            else
            {
                break;
            }
        }
        
        /*Actualizar datos*/
        
        String edad_actualizada = "22";
        String estudiante_buscado = "Pedro";
        for (int i = 0; i < 5; i++) {
            if(arreglo2D[i][0] != null)
            {
                if(arreglo2D[i][0].equals(estudiante_buscado)){
                    arreglo2D[i][2] = edad_actualizada;
                    break;
                }
            }
            else{
                System.out.println("No se encontro al estudiante");
                break;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            
            if(arreglo2D[i][0] != null)
            {                        
                System.out.print("Nombre "+arreglo2D[i][0]);                      
                System.out.print(" Carnet "+arreglo2D[i][1]);                       
                System.out.println(" Edad "+arreglo2D[i][2]);
            }
            else
            {
                break;
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Actualice de datos");
        System.out.println("Ingrese su nombre");
        estudiante_buscado = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        edad_actualizada = entrada.nextLine();
        
        for (int i = 0; i < 5; i++) {
            if(arreglo2D[i][0] != null)
            {
                if(arreglo2D[i][0].equals(estudiante_buscado)){
                    arreglo2D[i][2] = edad_actualizada;
                    break;
                }
            }
            else{
                System.out.println("No se encontro al estudiante");
                break;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            
            if(arreglo2D[i][0] != null)
            {                        
                System.out.print("Nombre "+arreglo2D[i][0]);                      
                System.out.print(" Carnet "+arreglo2D[i][1]);                       
                System.out.println(" Edad "+arreglo2D[i][2]);
            }
            else
            {
                break;
            }
        }
    } 
}
