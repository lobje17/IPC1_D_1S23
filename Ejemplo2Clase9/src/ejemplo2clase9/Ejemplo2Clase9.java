/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2clase9;

import Archivos.ArchivoE9;

/**
 *
 * @author lobje
 */
public class Ejemplo2Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArchivoE9 a = new ArchivoE9();
        String nombre = "PrimerArchivo3";
        //a.Crear(nombre);
        a.Escribir(nombre, "Archivo 3 creado");
        System.out.println("AA1");
        a.Leer(nombre);
        System.out.println("AA2");
    }
    
}
