/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase12;

import Grafico.VentanaInicio;
import Listas.Imagen;
import Listas.ListaImagen;

/**
 *
 * @author lobje
 */
public class EjemploClase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaInicio vi = new VentanaInicio();
        vi.setVisible(true);
        
        ListaImagen li = new ListaImagen();
        
        li.add(new Imagen("Primero",""));
        li.add(new Imagen("Primero",""));
        li.mostrar();
        
    }
    
}
