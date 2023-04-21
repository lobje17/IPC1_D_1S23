/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author lobje
 */
public class Imagen {
    private String nombre;
    private String ruta;
    private Imagen next;
    private Imagen back;

    public Imagen(String nombre, String ruta, Imagen next, Imagen back) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.next = next;
        this.back = back;
    }

    public Imagen(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Imagen getNext() {
        return next;
    }

    public void setNext(Imagen next) {
        this.next = next;
    }

    public Imagen getBack() {
        return back;
    }

    public void setBack(Imagen back) {
        this.back = back;
    }
    
    
}
