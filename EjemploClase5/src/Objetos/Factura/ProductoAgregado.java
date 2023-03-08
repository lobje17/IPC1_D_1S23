/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Factura;

/**
 *
 * @author lobje
 */
public class ProductoAgregado {
    private String nombre;
    private double precio;
    private int cantidad;
    private double total;

    public ProductoAgregado(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = calcularTotal(cantidad);
    }

    private double calcularTotal(int cantidad){
        return  cantidad * this.precio;
    }
    
    public void agregarMasProductos(int cantidad){
        this.total += calcularTotal(cantidad);
        this.cantidad += cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
