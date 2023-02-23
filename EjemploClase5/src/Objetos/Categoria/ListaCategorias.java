/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Categoria;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaCategorias {
    private ArrayList<Categoria> categorias;

    public ListaCategorias() {
        this.categorias = new ArrayList<>();
    }
    
    public boolean registroCategoria(String nombre){
        
        if(existCategoria(nombre)==-1){
            this.categorias.add(new Categoria(nombre));
            return true;
        }
        return false;
    }
    
    public int registroProduct(String cat, String nombre, double precio, int cantidad)
    {
        int indice = existCategoria(cat);
        
        int result = this.categorias.get(indice).getProductos().Registro(nombre, precio, cantidad);
        return result;
    }
    
    private int existCategoria(String nombre){
        int cantidad = this.categorias.size();
        String name;
        for (int i = 0; i < cantidad; i++) {
            name = this.categorias.get(i).getNombre();
            
            if(name.equals(nombre)) return i;
        }
        return -1;
    }
    
    /**/
    public int cantidad(){
        return this.categorias.size();
    }
    
    public Categoria getCategoria(int i){
        return this.categorias.get(i);
    }
}
