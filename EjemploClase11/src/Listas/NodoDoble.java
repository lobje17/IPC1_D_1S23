/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author lobje
 */
public class NodoDoble {
    private int valor;
    private NodoDoble next;
    private NodoDoble back;

    public NodoDoble(int valor, NodoDoble next, NodoDoble back) {
        this.valor = valor;
        this.next = next;
        this.back = back;
    }
    
    public NodoDoble(int valor, NodoDoble back) {
        this.valor = valor;
        this.next = null;
        this.back = back;
    }
    
    public NodoDoble(int valor) {
        this.valor = valor;
        this.next = null;
        this.back = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getBack() {
        return back;
    }

    public void setBack(NodoDoble back) {
        this.back = back;
    }
    
    
}
