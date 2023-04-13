/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase11;

import Listas.Doble;
import Listas.Simple;

/**
 *
 * @author lobje
 */
public class EjemploClase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simple listaS = new Simple();
        listaS.add(56);
        listaS.add(25);
        listaS.add(1);
        listaS.add(25);
        listaS.delete(25);
        listaS.mostrar();
        
        
        listaS.add(25);
        listaS.mostrar();
        
        listaS.delete(56);
        listaS.mostrar();
        
        listaS.add(56);
        listaS.mostrar();
        
        listaS.delete(1);
        listaS.mostrar();
        
        listaS.add(1);
        listaS.mostrar();
        
        
        listaS.delete(1);
        listaS.delete(56);
        listaS.delete(25);
        listaS.mostrar();
        
        listaS.modificar(0, 0);
        
        
        listaS.add(56);
        listaS.add(25);
        listaS.add(1);
        listaS.mostrar();
        
        
        listaS.modificar(1, 100);
        listaS.mostrar();
        
        
        
        System.out.println("\n\n\n****************************************************************");
        
        Doble listaD = new Doble();
        
        listaD.add(12);
        listaD.mostrar();
        listaD.add(37);
        listaD.mostrar();
        listaD.add(81);
        listaD.mostrar();
        
        listaD.delete(37);
        listaD.mostrar();
        
        listaD.modificar(1, 181);
        listaD.mostrar();
        
        
        listaD.modificar(81, 181);
        listaD.mostrar();
    }
    
}
