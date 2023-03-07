/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ej;


/**
 *
 * @author edush
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    
    
    private String nombre;
    
    public Estudiante(){}
    
    public Estudiante(String nombre){
        this.nombre=nombre;
    }   
    
    public void suma(int a, int b){
        System.out.println("La suma es: "+(a+b));
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
}
