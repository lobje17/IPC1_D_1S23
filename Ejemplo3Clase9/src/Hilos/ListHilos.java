/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lobje
 */
public class ListHilos extends Thread{
    
    private boolean ejecutaHilo;
    JLabel ficha;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidadGenerar;
    int dimension;
    int cantidad;
    int contador;
    JFrame v;

    public ListHilos(JFrame v) {
        this.ejecutaHilo = true;
        //this.ficha = ficha;
        this.posInicialX = 10;
        this.posFinalX = 400;
        this.posInicialY = 10;
        this.posFinalY = 400;
        this.veocidadGenerar = 1000;
        this.dimension = 100;
        this.cantidad = 10;
        this.contador = 0;
        this.v = v;
    }
    
    
    
    @Override
    public void run(){
        while(ejecutaHilo){
            try {
                Thread.sleep(veocidadGenerar);
                if(contador<cantidad) CrearFichas();
            } catch (InterruptedException ex) {
            }
        }
    }
    
    private void CrearFichas(){
        JLabel ficha = new JLabel("Este es el \nlabel No. "+contador);
        ficha.setVisible(true);
       
        v.getContentPane().add(ficha);
        Hilo h = new Hilo(ficha, posInicialX, posFinalX, posInicialY, posFinalY);
        h.start();
        contador++;
    }
}
