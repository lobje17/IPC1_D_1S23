/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1clase4.Prooductos;
import ejemplo1clase4.Prooductos.Producto;
import java.util.ArrayList;
/**
 *
 * @author lobje
 */
public class ListaProductos {
    ArrayList<Producto> productos;
    
    public ListaProductos()
    {
        this.productos = new ArrayList<>();
    }
    
    public boolean Registro(String nombre, double precio)
    {
        if(ExistProduct(nombre)==-1)
        {
            if(precio>0)
            {
                // Forma No.1 de agrgar elementos
                Producto newProduct = new Producto(nombre, precio);
                productos.add(newProduct);
                // Forma No. 2 de agrgar elementos
                // productos.add(new Producto(nombre, precio)); 
                System.out.println("Producto registrado");
                return true;
            }
            else System.out.println("El precio debe ser mayor a cero");
        }
        else System.out.println("Ya existe el producto");
        return false;
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
}
