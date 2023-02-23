/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Producto;

/**
 *
 * @author lobje
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, double precio, int cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad=cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
