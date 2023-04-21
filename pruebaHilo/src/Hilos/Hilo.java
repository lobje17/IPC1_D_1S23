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
    JLabel actual;
 
    int tiempo;         /* VARIBLE USADA PARA LA VELOCIDAD DEL MOVIMIENTO */
    int posFinalX;       /* POSICION FINAL X DEL LABEL EN EL TABLERO */
    int posInicioX;      /* POSICION INICIAL X DEL LABEL */
    int posFinalY;       /* POSICION FINAL Y DEL LABEL EN EL TABLERO */
    int posInicioY;      /* POSICION INICIAL Y DEL LABEL */
    int dimension;   /* TAMAÑO DEL LABEL EN ESTE EJEMPLO SE MANEJARA DE FORMA CUADRADA */
    
    public Hilo(JLabel actual, int posInicioX,  int posFinalX, int posInicioY,  int posFinalY, int tiempo){
        this.dimension = 100;
        this.actual = actual;
        this.posInicioX = posInicioX;
        this.posFinalX = posFinalX;
        this.posFinalY = posFinalY;
        this.posInicioY = posInicioY;
        this.tiempo = tiempo;
    }
    
    @Override
    public void run(){
        while(true)
        {
            realizarMov();
        }
    }
    
    private void realizarMov(){
        try {
            Thread.sleep(this.tiempo);
            if(posInicioX<posFinalX){
                this.actual.setBounds(posInicioX, posInicioY, dimension, dimension);
                posInicioX+= 2;
            }
            if(posInicioY<posFinalY){
                this.actual.setBounds(posInicioX, posInicioY, dimension, dimension);
                posInicioY+=2;
            }
            if(posInicioX>posFinalX && posInicioY>posFinalY){
                 this.stop();
            }
        } catch (InterruptedException ex) {
        }
    }
}
