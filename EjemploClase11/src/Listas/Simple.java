/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Handlers.EstructuraDeDatos;

/**
 *
 * @author lobje
 */
public class Simple extends EstructuraDeDatos{

    private Nodo inicio;
    public Simple() {
        this.inicio = null;
    }
    
    @Override
    public void add(Object e) {
        if(inicio==null)
        {
            inicio = new Nodo((int)e);
            index++;
            Mensaje("El elemento con valor "+e +" se agrego correctamente");
        }
        else
        {
            Nodo tmp = inicio;
            
            for (int i = 0; i < this.index; i++) {
                if(tmp !=null){
                    if(tmp.getValor()!=(int)e){
                        if(tmp.next==null){
//                            Nodo nuevo =new Nodo((int)e, null);
//                            tmp.next = nuevo;
                            
                            tmp.next = new Nodo((int)e);
                            index++;
                            Mensaje("El elemento con valor "+e +" se agrego correctamente");
                        }
                        else{
                             tmp = tmp.next;
                        }
                    }
                    else {
                        Mensaje("El elemento con valor "+e +" ya existe en la lista");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return index;
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        if(index==0) Mensaje("Lista vacia");
        else{
            Nodo tmp1 = inicio;
            Nodo tmp2 = inicio.next;
            /* Se verifica que solo un elemento en la lista*/
            if(tmp2==null){
                if(tmp1.getValor()==(int)e){
                    inicio = null;
                    index--;
                    Mensaje("El elemento con valor "+e+" se ha eliminado");
                }
                else Mensaje("No existe un elemento con el valor "+e);
            }
            /* Si la lista tiene 2 o mas elementos */
            else{
                /* Si el elemento a eliminar en la lista es el primero */
                if(tmp1.getValor()==(int)e){
                    inicio = tmp1.next;
                    index--;
                    Mensaje("El elemento con valor "+e+" se ha eliminado");
                }
                else{
                    for (int i = 0; i < this.index; i++) {
                        if(tmp2 != null){
                            if(tmp2.getValor()==(int)e){
                                tmp1.next = tmp2.next;
                                index--;
                                Mensaje("El elemento con valor "+e+" se ha eliminado");
                                break;
                            }
                            else{
                                tmp1 = tmp2;
                                tmp2 = tmp2.next;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void Mensaje(String m){
        System.out.println("--> " + m);
    }
    
    public void mostrar(){
        if(index==0) Mensaje("Lista vacia");
        else{
            Nodo tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                //Mensaje("Elemento No. " + (i+1)+ " es "+tmp.getValor());
                System.out.print(tmp.getValor()+" --> ");
                tmp = tmp.next;
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    public void modificar(int val, int newVal){
        boolean eliminado = false;
        if(index==0) Mensaje("Lista vacia");
        else{
            Nodo tmp = inicio;
            for (int i = 0; i < this.index; i++) {
                if(tmp.getValor()==(int)val){
                    tmp.setValor(newVal);
                    Mensaje("El elemento con valor "+val+" se ha cambiado al valor "+newVal);
                    //eliminado = true;
                    break;
                }
                else tmp = tmp.next;
            }
            
            //if(!eliminado) Mensaje("No se encontro el elemento con el valor " + val);
        }
    }
}
