/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaProducto {
    

    ArrayList<Producto> productos;
    
    public ListaProducto()
    {
        this.productos = new ArrayList<>();
    }
    
    public int Registro(String nombre, String precio, String color, String foto)
    {
        this.productos.add(new Producto(nombre, precio, color, foto));
        return 1;
    }
    
    public void MostrarLista()
    {
        for (int i = 0; i < productos.size(); i++) {
            System.out.print("Nombre "+productos.get(i).getNombre()+"    ");
            System.out.print("Precio "+productos.get(i).getPrecio()   +"    ");
            System.out.print("Color " +productos.get(i).getColor()+"    ");
            System.out.println("Foto " +productos.get(i).getFoto()+"    ");
        }
    }
    
    
    public void actualizar(String nombre, String precio, String color, String foto)
    {
        int cantidad = Cantidad();
        Producto tmp;
        
        for (int i = 0; i < cantidad; i++) {
            tmp = obtener(i);
            if(tmp.getNombre().equals(nombre)) {
                this.productos.get(i).setColor(color);
                this.productos.get(i).setFoto(foto);
                this.productos.get(i).setPrecio(precio);
            }
        }
    }
    
    public void eliminar(String nombre)
    {
        Producto tmp;
        
        for (int i = 0; i < Cantidad(); i++) {
            tmp = obtener(i);
            if(tmp.getNombre().equals(nombre)) {
                this.productos.remove(i);
            }
        }
    }
    
    public Producto obtener(String nombre){
        int cantidad = Cantidad();
        Producto tmp;
        
        for (int i = 0; i < cantidad; i++) {
            tmp = obtener(i);
            if(tmp.getNombre().equals(nombre)) return tmp;
        }
        return null;
    }
    
    public Producto obtener(int indice){
        return this.productos.get(indice);
    }
    
    public int Cantidad(){
        return this.productos.size();
    }
}
