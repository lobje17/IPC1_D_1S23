/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
import java.io.Serializable;

/**
 *
 * @author lobje
 */
public class ListaUsuarios implements Serializable{
    private Usuario start;
    private Usuario last;
    private int cantidad;

    public ListaUsuarios() {
        this.start = null;
        this.last = null;
    }
    
    
    public void add(String nombre, String apellido, int edad, String nacionalidad, String DPI){
        Usuario newUser = new Usuario(nombre, apellido, edad, nacionalidad, DPI);
        
        if(start==null){
            start = newUser;
            last = start;
            usuarioAgregado(nombre, DPI);
        }
        else if(find(DPI)==null){
            newUser.setBack(last);
            last.setNext(newUser);
            last = newUser;
            usuarioAgregado(nombre, DPI);
        }
        else mensaje("El usuario con DPI "+DPI+" ya esta registrado");
    }
    
    public void usuarioAgregado(String nombre, String DPI){
        mensaje("Se registro al usuario:\n\tNombre: "+nombre+"\n\tDPI: "+DPI);
        cantidad++;
    }
    
    public Usuario find(String DPI){
        Usuario tmp = start;
        
        while(tmp!=null){
            if(tmp.getDPI().equals(DPI)) return tmp;
            else tmp = tmp.getNext();
        }
        return null;
    }
    
    public void mostrar(){
        Usuario tmp = start;
        
        while(tmp!=null){
            mensaje(tmp.getDPI());
            tmp = tmp.getNext();
        }
    }
    
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
