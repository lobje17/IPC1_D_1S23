/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hijos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lobje
 */
public class HiloHeredado extends Thread{
    int numHilo;

    public HiloHeredado(int numHilo) {
        this.numHilo = numHilo;
    }
    
    
    
    @Override
    public void run() {
        
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Hilo heredado No. "+ numHilo + "  Iteracion  " +i);
//        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(HiloHeredado.class.getName()).log(Level.SEVERE, null, ex);
                //System.out.println("En espera");
            }
            System.out.println("Hilo heredado No. "+ numHilo + "  Iteracion  ");
        }
    }
    
    public void Detener(){
        //this.stop();
        this.interrupt();
        //Thread.interrupted();
    }
}
