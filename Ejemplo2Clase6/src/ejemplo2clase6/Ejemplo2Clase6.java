/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2clase6;

import Grafico.VentanaP;
import Objetos.ListaProducto;

/**2
 *
 * @author lobje
 */
public class Ejemplo2Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaProducto productos = new ListaProducto();
        VentanaP v = new VentanaP();
        v.recibirLista(productos);
        v.setVisible(true);
    }
    
}
