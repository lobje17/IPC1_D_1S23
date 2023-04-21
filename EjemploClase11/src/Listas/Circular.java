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
public class Circular  extends EstructuraDeDatos{

    private NodoDoble inicio;
    public Circular() {
        this.inicio = null;
    }
    
    @Override
    public void add(Object e) {
        
        if(inicio==null)
        {
            NodoDoble tmp = new  NodoDoble((int)e);
            tmp.setBack(tmp);
            tmp.setNext(tmp);
            inicio = tmp;
            
            index++;
            Mensaje("El elemento con valor "+e +" se agrego correctamente");
        }
        else
        {
            NodoDoble tmp = inicio;
            
            if(index==1){
                    if(tmp.getValor()!=(int)e){
                        NodoDoble NewDato = new  NodoDoble((int)e, tmp, tmp);                    
                        tmp.setNext(NewDato);
                        tmp.setBack(NewDato);

                        index++;
                        Mensaje("El elemento con valor "+e +" se agrego correctamente");
                    }
                    else {
                        Mensaje("El elemento con valor "+e +" ya existe en la lista");
                    }
            }
            else
            {
                for (int i = 0; i < this.index; i++) {
                    if(tmp !=null){
                        if(tmp.getValor()!=(int)e){
                            if(index==i+1){     
                                NodoDoble NewDato = new  NodoDoble((int)e, tmp.getNext(), tmp);                    
                                tmp.getNext().setBack(NewDato);
                                tmp.setNext(NewDato);

                                index++;
                                Mensaje("El elemento con valor "+e +" se agrego correctamente");
                            }
                            else{
                                 tmp = tmp.getNext();
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        if(!vacia()) {
            boolean eliminado = false;
            NodoDoble tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if(tmp.getValor()==(int)e){
                    tmp.getBack().setNext(tmp.getNext());
                    tmp.getNext().setBack(tmp.getBack());
                    Mensaje("El elemento con valor "+e+" se ha eliminado");
                    index--;
                    eliminado = true;
                    break;
                }
                else tmp = tmp.getNext();
            }
            
            if(!eliminado) Mensaje("No se encontro el elemento con el valor " + e);
        }
    }
    
    public void mostrar(){
        if(!vacia()) {
            NodoDoble tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                //Mensaje("Elemento No. " + (i+1)+ " es "+tmp.getValor());
                System.out.print(tmp.getValor()+" <--> ");
                tmp = tmp.getNext();
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    public void modificar(int val, int newVal){
        if(!vacia()) {
            boolean encontrado = false;
            NodoDoble tmp = inicio;
            for (int i = 0; i < this.index; i++) {
                if(tmp.getValor()==(int)val){
                    tmp.setValor(newVal);
                    Mensaje("El elemento con valor "+val+" se ha cambiado al valor "+newVal);
                    encontrado = true;
                    break;
                }
                else tmp = tmp.getNext();
            }
            
            if(!encontrado) Mensaje("No se encontro el elemento con el valor " + val);
        }
    }
    
    private boolean vacia(){
        if(index==0){
            Mensaje("Lista vacia");
            return true;
        }
        return false;
    }
    
    private void Mensaje(String m){
        System.out.println("--> " + m);
    }
}
