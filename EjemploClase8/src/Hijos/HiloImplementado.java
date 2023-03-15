/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hijos;

/**
 *
 * @author lobje
 */
public class HiloImplementado implements Runnable{
    Thread hilo;
    
    public void CrearHilo(){
        if(hilo==null){
            this.hilo = new Thread(this);
            this.hilo.start();
        }
    }
    
    @Override
    public void run() {
        System.out.println("Hilo implementado");
    }
    
}
