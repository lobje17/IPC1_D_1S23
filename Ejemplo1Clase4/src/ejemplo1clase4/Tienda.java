package ejemplo1clase4;


import java.util.Scanner;
import ejemplo1clase4.Prooductos.ListaProductos;
import Cupones.ListadoCupones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lobje
 */
public class Tienda {
    
    public Scanner entrda = new Scanner(System.in);
    public String opcion = "";
    public ListaProductos productos;
    public ListadoCupones cupones;
    
    public Tienda(){
        productos = new ListaProductos();
        this.cupones = new ListadoCupones();
        Iniciar();
    }
    
    public void Iniciar(){        
        // TODO code application logic here
        while (!opcion.equals("10")) {
            ListaOpciones();
            Menu();
        }
    }
    
    /*Menu principal*/
    private void ListaOpciones()
    {
        Mensaje("*************************************");
        Mensaje("Bienvenido al sistema");
        Mensaje("Puede realizar las siguientes opciones");
        Mensaje("1. Registrar producto");
        Mensaje("2. Registrar cupon");
        Mensaje("3. Mostrar listado productos");
        Mensaje("10. Salir");
        Mensaje("");
        opcion = ObtenerDato("Ingresar el numero de la opcion");
        
        Mensaje("*************************************");
    }
    
    private void Menu()
    {
        switch (opcion) {
            case "1":
                RegistrarProductos();
                break;
            case "2":
                RegistrarCupon();
                break;
            case "3":
                productos.MostrarLista();
                break;
            case "4":
                cupones.MostrarLista();
                break;
            case "5":
                //CalcularPromedioEstudiates();
                break;
            case "6":
                //OrdenarListado();
                break;
            default:
                Mensaje("Saliendo del programa");
        }
    }
    
    
    private void RegistrarProductos()
    {
        String nombre="";
        double precio=0.0;
        
        boolean ingresado = false;
        do{
            nombre = ObtenerDato("Ingrese un nombre");
            precio = Double.parseDouble(ObtenerDato("Ingrese el precio"));
            
            ingresado = productos.Registro(nombre, precio);
            
            if(!ingresado) Mensaje("Error en los dato, ingreselos nuevamente!!");
        }while(!ingresado);
    }
    
    private void RegistrarCupon()
    {
        String codigo="";
        double porcentaje=0.0;
        
        boolean ingresado = false;
        do{
            codigo = ObtenerDato("Ingrese un nombre");
            porcentaje = Double.parseDouble(ObtenerDato("Ingrese el precio"));
            
            ingresado = cupones.Registro(codigo, porcentaje);
            
            if(!ingresado) Mensaje("Error en los dato, ingreselos nuevamente!!");
        }while(!ingresado);
    }
    
    /**/
    public String ObtenerDato(String msj)
    {
        Mensaje(msj);
        return entrda.nextLine();
    }
    
    private void Mensaje(String msj)
    {
        System.out.println(msj);
    }
    
}
