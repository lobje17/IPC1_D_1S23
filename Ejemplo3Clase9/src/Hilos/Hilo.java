/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;
import javax.swing.JLabel;

/**
 *
 * @author lobje
 */
public class Hilo extends Thread{
    private boolean ejecutaHilo;
    JLabel ficha;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidad;
    int dimension;

    public Hilo(JLabel ficha, int posInicialX, int posFinalX, int posInicialY, int posFinalY) {
        this.ficha = ficha;
        this.posInicialX = posInicialX;
        this.posFinalX = posFinalX;
        this.posInicialY = posInicialY;
        this.posFinalY = posFinalY;
        this.ejecutaHilo = true;
        this.dimension = 100;
        this.veocidad = 25;
    }
    
   
    @Override
    public void run(){
        while(ejecutaHilo){
            try {
                Thread.sleep(veocidad);
                Moverficha();
            } catch (InterruptedException ex) {
            }
        }
    }
    
    private void Moverficha(){
            if(posInicialX<posFinalX) {
                ficha.setBounds(posInicialX, posInicialY, dimension, dimension);
                posInicialX+=3;
            }
            if(posInicialX>=posFinalX){
                if(posInicialY<posFinalY) {
                    ficha.setBounds(posInicialX, posInicialY, dimension, dimension);
                    posInicialY+=3;
                }
            }
            if(posInicialX>=posFinalX && posInicialY>=posFinalY) this.ejecutaHilo = false;
    }
}
