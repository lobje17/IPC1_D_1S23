/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lobje
 */
public class ArchivoE9 {
    
    String extensionTxt = ".txt";
    public void Crear(String nombreArchivo){
        try {
            File f = new File(nombreArchivo+extensionTxt);
            boolean creado = f.createNewFile();
            if(creado) {
                System.out.println("Archivo con el nombre "+nombreArchivo+" creado");
            }
            else System.out.println("Archivo con el nombre "+nombreArchivo+" ya existe");
            
        } catch (IOException e) {
            System.out.println("Archivo con el nombre "+nombreArchivo+" ya existe");
        }
    }
    
    public void Leer(String nombreArchivo){
        try{
            File f = new File(nombreArchivo+extensionTxt);
            FileReader fr = new FileReader(f);
            int contenido = fr.read();
            System.out.println("Contenido " + contenido);
            while(contenido!=-1){
                System.out.println((char)contenido);
                contenido = fr.read();
            }
            fr.close();
            
            
        } catch (IOException e) {
        }
    }
    
    public void Escribir(String nombreArchivo, String contenido){
        try {
        File f = new File(nombreArchivo);
            FileWriter fw = new FileWriter(f);
            
            fw.write(contenido);
            fw.close();
        } catch (IOException ex) {
        }
        
    }
}
