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
public class MovimientoFicha {
    boolean tipoFicha;
    int tablero[][] = new int[3][3];

    public MovimientoFicha() {
        this.tipoFicha = true;
    }
    
    private void siguienteFicha(){
        this.tipoFicha = !tipoFicha;
    }
    
    public void moverFiccha(JLabel ficha, int posInicialX, int posFinalX, int posInicialY, int posFinalY, int veocidad){
        Hilo h = new Hilo(ficha, posInicialX, posFinalX, posInicialY, posFinalY, veocidad);
        h.start();
    }
}
