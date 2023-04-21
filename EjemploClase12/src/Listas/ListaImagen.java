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
public class ListaImagen  extends EstructuraDeDatos{
    
    private Imagen inicio;
    public ListaImagen() {
        this.inicio = null;
    }
    
    @Override
    public void add(Object e) {
        Imagen NewDato = (Imagen)e;
        if(inicio==null)
        {
            NewDato.setBack(NewDato);
            NewDato.setNext(NewDato);
            inicio = NewDato;
            
            index++;
            Mensaje("El elemento con valor "+NewDato.getNombre() +" se agrego correctamente");
        }
        else
        {
            Imagen tmp = inicio;
            
            if(index==1){
                    if(!tmp.getNombre().equals(NewDato.getNombre())){
                        NewDato.setBack(tmp);
                        NewDato.setNext(tmp);
                        tmp.setNext(NewDato);
                        tmp.setBack(NewDato);

                        index++;
                        Mensaje("El elemento con valor "+NewDato.getNombre() +" se agrego correctamente");
                    }
                    else {
                        Mensaje("El elemento con valor "+NewDato.getNombre() +" ya existe en la lista");
                    }
            }
            else
            {
                for (int i = 0; i < this.index; i++) {
                    if(tmp !=null){
                        if(!tmp.getNombre().equals(NewDato.getNombre())){
                            if(index==i+1){
                                NewDato.setNext(tmp.getNext());
                                NewDato.setBack(tmp);
                                tmp.getNext().setBack(NewDato);
                                tmp.setNext(NewDato);

                                index++;
                                Mensaje("El elemento con valor "+NewDato.getNombre() +" se agrego correctamente");
                            }
                            else{
                                 tmp = tmp.getNext();
                            }
                        }
                        else {
                            Mensaje("El elemento con valor "+NewDato.getNombre() +" ya existe en la lista");
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
        String nombre = (String)e;
        if(!vacia()) {
            boolean eliminado = false;
            Imagen tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if(tmp.getNombre().equals(nombre)){
                    tmp.getBack().setNext(tmp.getNext());
                    tmp.getNext().setBack(tmp.getBack());
                    Mensaje("El elemento con valor "+nombre+" se ha eliminado");
                    index--;
                    eliminado = true;
                    break;
                }
                else tmp = tmp.getNext();
            }
            
            if(!eliminado) Mensaje("No se encontro el elemento con el valor " + nombre);
        }
    }
    
    public void mostrar(){
        if(!vacia()) {
            Imagen tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                //Mensaje("Elemento No. " + (i+1)+ " es "+tmp.getValor());
                System.out.print(tmp.getNombre()+" <--> ");
                tmp = tmp.getNext();
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    public void modificar(int val, int newVal){
//        if(!vacia()) {
//            boolean encontrado = false;
//            Imagen tmp = inicio;
//            for (int i = 0; i < this.index; i++) {
//                if(tmp.getValor()==(int)val){
//                    tmp.setValor(newVal);
//                    Mensaje("El elemento con valor "+val+" se ha cambiado al valor "+newVal);
//                    encontrado = true;
//                    break;
//                }
//                else tmp = tmp.getNext();
//            }
//            
//            if(!encontrado) Mensaje("No se encontro el elemento con el valor " + val);
//        }
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
