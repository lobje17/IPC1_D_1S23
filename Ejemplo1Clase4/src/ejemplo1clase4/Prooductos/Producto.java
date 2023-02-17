/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1clase4.Prooductos;

/**
 *
 * @author lobje
 */
public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void actualizDatos()
    {
        cambiarNombre();
    }
    
    private void cambiarNombre()
    {
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
}
