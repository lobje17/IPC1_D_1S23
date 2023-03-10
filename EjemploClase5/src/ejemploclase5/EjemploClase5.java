/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase5;

import InterfazGrafica.ventanas.Login;
import Objetos.Categoria.ListaCategorias;
import Objetos.Cupones.ListaCupones;
import Objetos.Usuarios.ListUser;

/**
 *
 * @author lobje
 */
public class EjemploClase5 {

    /**
     * @param args the command line arguments
     */
//    public static int conteo = 0;
//    public  int conteo2 = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCupones cupones = new ListaCupones();
        ListaCategorias categorias = new ListaCategorias();
        ListUser usuarios = new ListUser();
        
        Login login = new Login();
        login.setListas(categorias, cupones, usuarios);
        login.setVisible(true);
//        Administrador admin = new Administrador();
//        admin.setVisible(true);
//        admin.setListas(categorias, cupones, usuarios);
    }
    
}
