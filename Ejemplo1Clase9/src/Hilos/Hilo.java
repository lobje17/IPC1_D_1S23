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
    
    JLabel ficha;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidad;
    boolean ejecutar;
    int dimension;

    public Hilo(JLabel ficha, int posInicialX, int posFinalX, int posInicialY, int posFinalY, int veocidad) {
        this.ficha = ficha;
        this.posInicialX = posInicialX;
        this.posFinalX = posFinalX;
        this.posInicialY = posInicialY;
        this.posFinalY = posFinalY;
        this.veocidad = veocidad;
        this.ejecutar = true;
        this.dimension = 100;
    }
    
    public void detener(){
        this.ejecutar = false;
    }
    
    @Override
    public void run(){
        while(this.ejecutar){
            try {
                Thread.sleep(veocidad);
                moverlabel();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    private void moverlabel(){
        if(posInicialX<posFinalX){
            this.ficha.setBounds(posInicialX, posInicialY, dimension, dimension);
            posInicialX+=2;
        }
        if(posInicialY<posFinalY){
            this.ficha.setBounds(posInicialX, posInicialY, dimension, dimension);
            posInicialY+=2;
        }
        
        if(posInicialX>posFinalX && posInicialY>posFinalY) detener();
    }
}
