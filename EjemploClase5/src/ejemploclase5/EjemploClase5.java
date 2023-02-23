/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase5;

import InterfazGrafica.ventas.Administrador;
import Objetos.Categoria.ListaCategorias;
import Objetos.ListaCupones;

/**
 *
 * @author lobje
 */
public class EjemploClase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCupones cupones = new ListaCupones();
        ListaCategorias categorias = new ListaCategorias();
        
        Administrador admin = new Administrador();
        admin.setVisible(true);
        admin.setListas(categorias, cupones);
        
    }
    
}
