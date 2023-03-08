/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Factura;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaFactura {
    

    ArrayList<ProductoAgregado> productos;
    
    public ListaFactura()
    {
        this.productos = new ArrayList<>();
    }
    
    public int Registro(String nombre, double precio, int cantidad)
    {
        if(ExistProduct(nombre)==-1)
        {
            if(precio>0)
            {
                if(cantidad > 0){
                    // Forma No.1 de agrgar elementos
                    ProductoAgregado newProduct = new ProductoAgregado(nombre, precio, cantidad);
                    productos.add(newProduct);
                    // Forma No. 2 de agrgar elementos
                    // productos.add(new Producto(nombre, precio)); 
                    //System.out.println("Producto registrado");
                    return 1;
                }
                return 2;
            }
             return 3;//System.out.println("El precio debe ser mayor a cero");
        }
        return 4; //System.out.println("Ya existe el producto");
        //return false;
    }
    
    private int ExistProduct(String nombre)
    {
        String nombreBuscado = "";
        for (int i = 0; i < productos.size(); i++) {
            nombreBuscado = productos.get(i).getNombre();
            
            if(nombreBuscado.equals(nombre)) return i;
        }
        return -1;
    }
    
    public void MostrarLista()
    {
        for (int i = 0; i < productos.size(); i++) {
            System.out.print("Nombre "+productos.get(i).getNombre()+"    ");
            System.out.println("Precio "+productos.get(i).getPrecio());
        }
    }
    
    public ProductoAgregado Obtener(int indice){
        return this.productos.get(indice);
    }
    
    public int Cantidad(){
        return this.productos.size();
    }
}
