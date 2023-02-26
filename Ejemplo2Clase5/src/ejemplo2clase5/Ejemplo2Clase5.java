/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2clase5;

import Objetos.Fruta;
import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class Ejemplo2Clase5 {

    public static ArrayList<Fruta> frutas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frutas = new ArrayList<>();
        
        //frutas
        Fruta fruta1 = new Fruta("Manzana", "Rojo");
        Fruta fruta2 = new Fruta("Pera", "Verde");
        Fruta fruta3 = new Fruta("Uva", "Morada");
        Fruta fruta4 = new Fruta("Naranja", "Naranja");
        
        frutas.add(fruta1);
        frutas.add(fruta2);
        frutas.add(fruta3);
        frutas.add(fruta4);
        System.out.println("Tamano "+frutas.size());
        VerFrutas();
        
    }
    
    public static void VerFrutas()
    {
        Fruta frutaActual;
        for (int i = 0; i < frutas.size(); i++) {
            frutaActual = frutas.get(i);
            System.out.println("Nombre: "+frutaActual.getNombre()+"  Color: "+frutaActual.getColor());
        }
    }
    
}
