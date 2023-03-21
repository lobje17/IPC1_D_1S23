/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase8;

import Hijos.HiloHeredado;
import Hijos.HiloImplementado;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lobje
 */
public class EjemploClase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HiloHeredado hiloH1 = new HiloHeredado(1);
        HiloHeredado hiloH2 = new HiloHeredado(2);
        HiloHeredado hiloH3 = new HiloHeredado(3);
        HiloHeredado hiloH4 = new HiloHeredado(4);
        
        
        HiloImplementado hiloI = new HiloImplementado();
        //hiloI.CrearHilo();
        
        hiloH1.start();
        hiloH2.start();
        System.out.println("Main");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            //Logger.getLogger(EjemploClase8.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("En espera en el main");
        }
        System.out.println("Main");
        hiloH1.stop();
        hiloH2.stop();
//        hiloH3.start();
//        hiloH4.start();
        
        
        //hiloI.run();
    }
    
}
