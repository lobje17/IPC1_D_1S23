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
public class Factura {
    private String nombre;
    private String fecha;
    private ArrayList<ProductoAgregado> productos;
    
    public Factura(String nombre, String fecha)
    {
        this.nombre = nombre;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }
    
    public int Agregar(String nombre, double precio, int cantidad)
    {
        int indice = ExistProduct(nombre);
        if(indice==-1)
        {
            if(precio>0)
            {
                if(cantidad > 0){
                    // Forma No.1 de agrgar elementos
//                    ProductoAgregado newProduct = new ProductoAgregado(nombre, precio, cantidad);
//                    productos.add(newProduct);
                    // Forma No. 2 de agrgar elementos
                     productos.add(new ProductoAgregado(nombre, precio, cantidad)); 
                    //System.out.println("Producto registrado");
                    return 1;
                }
                return 2;
            }
             return 3;//System.out.println("El precio debe ser mayor a cero");
        }
        productos.get(indice).agregarMasProductos(cantidad);
        return 4;
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
    
    public double obtenerTotal(){
        double total = 0.0;
        int cantidad = cantidad();
        for (int i = 0; i < cantidad; i++) {
            total += this.productos.get(i).getTotal();
        }
        return total;
    }
    
    public ProductoAgregado Obtener(int indice){
        return this.productos.get(indice);
    }
    
    public int Cantidad(){
        return this.productos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<ProductoAgregado> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoAgregado> productos) {
        this.productos = productos;
    }
    
    public int cantidad(){
        return this.productos.size();
    }
}
