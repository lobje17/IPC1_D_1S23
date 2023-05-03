/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
import java.io.Serializable;

/**
 *
 * @author lobje
 */
public class Usuario implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private String DPI;
    private Usuario next;
    private Usuario back;

    public Usuario(String nombre, String apellido, int edad, String nacionalidad, String DPI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public Usuario getNext() {
        return next;
    }

    public void setNext(Usuario next) {
        this.next = next;
    }

    public Usuario getBack() {
        return back;
    }

    public void setBack(Usuario back) {
        this.back = back;
    }
    
    
}
