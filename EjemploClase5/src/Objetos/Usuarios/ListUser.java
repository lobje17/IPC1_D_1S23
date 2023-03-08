/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Usuarios;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListUser {
    
    private ArrayList <Usuario> listUsuarios;

    public ListUser() {
        this.listUsuarios = new ArrayList<>();
        /*CREACION DE USUARIO ADMINISTRADOR*/
        listUsuarios.add(new Usuario("yo","yo", "Administrador"));
        listUsuarios.add(new Usuario("a","a", "Clienta"));
    }
    
    public boolean RegistrarUsuario(String nombre, String contrasena, String rol){
        int indice = existUser(nombre);
        if(indice>-1) return false;
        
        this.listUsuarios.add(new Usuario(nombre, contrasena, rol));
        return true;
    }
    
    public int isLoginOk(String nombre, String contrasena)
    {
        int indice = existUser(nombre);
        /*SI NO EXISTE RETORNA  -1*/
        if(indice==-1) return -1;
        /*SI EXISTE VERIFICA SUS DATOS*/
        if(this.listUsuarios.get(indice).getContrasena().equals(contrasena)) {
            /* SI EL ROL ES ADMINISTRADOR RETORNA 1 */
            if(this.listUsuarios.get(indice).getRol().equals("Administrador")) return 1;
            /* SI EL ROL EN CLIENTE RETORNA 2 */
            return 2; 
        }
        /* SI NO SON IGUALES RETORNA 0 */
        return 0;
    }
    
    private int existUser(String nombre)
    {
        Usuario userTmp;
        for (int i = 0; i < listUsuarios.size(); i++) {
            userTmp = listUsuarios.get(i);
            if(userTmp.getNombre().equals(nombre) ) return i;
        }
        return -1;
    }
}
