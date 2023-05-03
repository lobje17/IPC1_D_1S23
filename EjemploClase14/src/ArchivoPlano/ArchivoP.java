/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivoPlano;

import Listas.ListaUsuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lobje
 */
public class ArchivoP {
    
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
    
    public void cargarUsuarion(String nombreArchivo, ListaUsuarios usuarios){
        try{
            File f = new File(nombreArchivo+extensionTxt);
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader brf = new BufferedReader(fr);

                String contenido = brf.readLine();

                while(contenido!=null){
                    System.out.println(contenido);
                    AddUser(contenido, usuarios);
                    
                    contenido = brf.readLine();
                }
                fr.close(); 
            }
            else mensaje("El archivo con nombre "+nombreArchivo+" no existe");
        } catch (IOException e) {
        }
    }
    
    private void AddUser(String contenido, ListaUsuarios usuarios){
        String datos [] = contenido.split(",");
        usuarios.add(datos[0], datos[1], Integer.valueOf(datos[2]), datos[3], datos[4]);
    }
    
    public void Escribir(String nombreArchivo, String contenido){
        try {
        File f = new File(nombreArchivo+extensionTxt);
            FileWriter fw = new FileWriter(f);
            
            fw.write(contenido);
            fw.close();
        } catch (IOException ex) {
        }
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
