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
        Imagen newImagen = (Imagen)e;
        if(inicio==null)
        {
            newImagen.setBack(newImagen);
            newImagen.setNext(newImagen);
            inicio = newImagen;
            
            nodoAgregado(newImagen.getNombre());
        }
        else
        {
            Imagen actual = inicio;
            
            if(index==1){
                    if(!actual.getNombre().equals(newImagen.getNombre())){
                        newImagen.setBack(actual);
                        newImagen.setNext(actual);
                        actual.setNext(newImagen);
                        actual.setBack(newImagen);

                        nodoAgregado(newImagen.getNombre());
                    }
                    else {
                        Mensaje("El elemento con valor "+newImagen.getNombre() +" ya existe en la lista");
                    }
            }
            else
            {
                for (int i = 0; i < this.index; i++) {
                    if(actual !=null){
                        if(!actual.getNombre().equals(newImagen.getNombre())){
                            if(index==i+1){
                                newImagen.setNext(actual.getNext());
                                newImagen.setBack(actual);
                                actual.getNext().setBack(newImagen);
                                actual.setNext(newImagen);
                            }
                            else actual = actual.getNext();
                        }
                        else {
                            Mensaje("El elemento con valor "+newImagen.getNombre() +" ya existe en la lista");
                            break;
                        }
                    }
                }
            }
        }
    }
    
    private void nodoAgregado(String nombre){
        index++;
        Mensaje("El elemento con valor "+nombre +" se agrego correctamente");
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
            Imagen actual = inicio;

            for (int i = 0; i < this.index; i++) {
                if(actual.getNombre().equals(nombre)){
                    actual.getBack().setNext(actual.getNext());
                    actual.getNext().setBack(actual.getBack());
                    Mensaje("El elemento con valor "+nombre+" se ha eliminado");
                    index--;
                    eliminado = true;
                    break;
                }
                else actual = actual.getNext();
            }
            
            if(!eliminado) Mensaje("No se encontro el elemento con el valor " + nombre);
        }
    }
    
    public void mostrar(){
        if(!vacia()) {
            Imagen actual = inicio;

            for (int i = 0; i < this.index; i++) {
                //Mensaje("Elemento No. " + (i+1)+ " es "+actual.getValor());
                System.out.print(actual.getNombre()+" <--> ");
                actual = actual.getNext();
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    public void modificar(String nombre, String ruta){
        if(!vacia()) {
            boolean encontrado = false;
            Imagen actual = inicio;
            
            for (int i = 0; i < this.index; i++) {
                if(actual.getNombre().equals(nombre)){
                    actual.setRuta(ruta);
                    Mensaje("El elemento con nombre "+nombre+" se ha cambiado la ruta de almacenamiento");
                    encontrado = true;
                    break;
                }
                else actual = actual.getNext();
            }
            
            if(!encontrado) Mensaje("No se encontro el elemento con el nombre " + nombre);
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
