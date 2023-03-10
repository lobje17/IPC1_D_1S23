/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Categoria;

import Objetos.Producto.ListaProductos;

/**
 *
 * @author lobje
 */
public class Categoria {
    private String nombre;
    private ListaProductos productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ListaProductos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaProductos getProductos() {
        return productos;
    }

    public void setProductos(ListaProductos productos) {
        this.productos = productos;
    }
}
