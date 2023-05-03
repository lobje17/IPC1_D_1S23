/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivoBinario;

import Listas.ListaUsuarios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lobje
 */
public class ArchivoB {

    public ArchivoB() {
    }
    
    public void escribir(String nameFile, ListaUsuarios usuarios){
        try{
            File fileB = new File(nameFile);
            FileOutputStream fos = new FileOutputStream(fileB);
            ObjectOutputStream es = new ObjectOutputStream(fos);
            es.writeObject(usuarios);
            es.close();
            fos.close();
            
//            if(!fileB.exists()){
//                
//            }
//            else mensaje("El archivo con nombre "+nameFile+" ya existe");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
            
    }
    
    public ListaUsuarios obtenerLista(String nameFile){
        ListaUsuarios usuarios = new ListaUsuarios();
        
        try{
            File fileB = new File(nameFile);
            if(fileB.exists()){
                FileInputStream fis = new FileInputStream(fileB);
                ObjectInputStream entrada;
                while (fis.available()>0) { 
                    entrada = new ObjectInputStream(fis);
                    usuarios = (ListaUsuarios)entrada.readObject();
                    //entrada.close();
                }
                //fis.close();
                return usuarios;
            }
            return usuarios;
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return usuarios;
    }
    
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
