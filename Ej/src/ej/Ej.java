/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej;

import java.util.ArrayList;

/**
 *
 * @author edush
 */
public class Ej {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e=new Estudiante();
        e.suma(10, 5);
        agregarEstudiante();
        mostrarEstudiantes();
    }
    
    public static void agregarEstudiante(){
        estudiantes.add(new Estudiante("Luis"));
        estudiantes.add(new Estudiante("Carlos"));
        estudiantes.add(new Estudiante("Ana"));
    }
    
    public static void mostrarEstudiantes(){
        for (int i = 0; i < estudiantes.size(); i++) {
        System.out.println(estudiantes.get(i).getNombre());
}
    }
    
}
