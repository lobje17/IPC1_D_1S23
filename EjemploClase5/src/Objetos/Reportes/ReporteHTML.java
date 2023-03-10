/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Reportes;

import Objetos.Factura.Factura;
import Objetos.Factura.ProductoAgregado;
import Objetos.Usuarios.Usuario;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 *
 * @author lobje
 */
public class ReporteHTML {
    /* Varible para crear la cadena para formar el archivo HTML */
    String reporte;
    String nombre;
    public ReporteHTML() {
        this.reporte = "";
        this.nombre = "";
    }
    
    /* ********************************************************************************************* *
      * Funcion que recibe:
      *     - El nombre con el que se va a crea el archivo 
      *     - Factura lleva todos los datos de los productos de la compra
      *     - User que es de tipo usuario y lleva toda la información del cliente
      * ********************************************************************************************* */
    public boolean CrearDoc(String nombre, Factura fact, Usuario user){
        this.nombre = nombre;
        try {
            
            /* Se crea el archivo con el nombre que se le envia*/
            FileOutputStream archivo = new FileOutputStream(nombre+".html"); 
            /* Esta instancia de OutputStreamWriter nos permitira escribir en el archivo */
            OutputStreamWriter  osw = new OutputStreamWriter (archivo, StandardCharsets.UTF_8);
            /* Metodo para crear el reporte */
            crearReporte(nombre, fact, user);
            /* Se escribe la cadena para formar el contenido del archivo */
            osw.write(this.reporte);
            /* Se cierra el documento esto siempre se debe hacer para que no se presente
            ningun problema*/
            osw.close();
            archivo.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error "+e);
            return false;
        }
    }
    
    public void crearReporte(String titulo, Factura fact, Usuario user){
        /* Estructura basica de un archivo HTML */
        this.reporte += "<!DOCTYPE html>\n";
        this.reporte += "<html>\n";
        this.reporte += "<head>\n";
        this.reporte += "\t<meta charset=\"utf-8\">\n";
        this.reporte += "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
        /* Titulo a mostrar en la pestaña del navegador */
        this.reporte += "\t<title>"+titulo+"</title>\n";
        this.reporte += "</head>\n";
        this.reporte += "<body>\n";
        /* Titulo a mostrar en la pagina */
        this.reporte += "<h1>"+titulo+"</h1>\n";
        /* Salto de linea */
        nextLine();
        /* Datos del usuario */
        datosUsuario(user);
        /* Salto de linea */
        nextLine();
        /* Creacion de la tabla de productos*/
        nuevaTabla(fact);
        /* Cierre del cuerpo y del archivo HTML */
        this.reporte += "</body>\n";
        this.reporte += "</html>";
    }
    
    
    private void datosUsuario(Usuario user){
        /*  Se crea la etiqueta que abre una lista para mostrar los datos del usuario */
        this.reporte += "\t<ul>\n";
        /* Se agregan los elemento a la lista */
        nextData("Nombre del cliente: "+ user.getNombre());
        nextData("Rol del cliente: " + user.getRol());
        nextData("Fecha: " + String.valueOf(LocalDateTime.now()));
        /*  Se crea la etiqueta que cierra la lista */
        this.reporte += "\t<ul>\n";
    }
    
    private void nextData(String dato){
        /* Se crea la etiqueta para mostrar el elemento */
        this.reporte += "\t\t<li>"+dato+"</li>\n";
    }
    
    /* **************************************************************************************************************** * 
      * **************************************************************************************************************** *
      * **************************************************************************************************************** */
    private void nuevaTabla(Factura fact){
        /* Se crea la etiqueta que abre para una tabla */
        this.reporte += "\t<table border=\"1\">\n";
        /* Se agrega el titulo de la pagina */
         addTitulosCulomns();
        
        /* Se verifica que la factura que se envia sea diferente de null  */
        if(fact!=null){
            /* Se obtiene el numero de productos en la factura */
            int cantidad = fact.Cantidad();/*Encabezado*/
            /* Se crea una variable de tipo Producto agregado que servira para almacenar
              * temporalmente los datos de los productos de la lista */
            ProductoAgregado tmp;
            /* For que recorre la lista de productos */
            for (int i = 0; i < cantidad; i++) {
                /* Se obtiene un elemento de la listas */
                tmp = fact.getProductoAgregado(i);
                /* Se agraga una nueva fila con los datos del producto */
                addRow(i+1, tmp.getNombre(), tmp.getCantidad(), tmp.getPrecio(), tmp.getTotal());
            }
        }
        /* Se crea la etiqueta que cierra la tabla */
        this.reporte += "\t</table>\n";
    }
    
    private void addTitulosCulomns(){
        /* Se crea la etiqueta que abre la fila*/
        openRow();
        addColumn("No.");
        addColumn("Producto");
        addColumn("Cantidad");
        addColumn("Precio");
        addColumn("Subtotal");
        /* Se crea la etiqueta que cierra la fila */
        closeRow();
    }
    
    private void addRow(int No, String producto, int cantidad, double precio, double subtotal){
        openRow();
        addColumnNumber(No);
        addColumn(producto);
        addColumnNumber(cantidad);
        addColumnNumber(precio);
        addColumnNumber(subtotal);
        closeRow();
    }
    
    private void addColumn(String dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    }
    
    private void addColumnNumber(int dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    }
    
    private void addColumnNumber(double dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    } 
    
    private void openRow(){
        /* Se crea la etiqueta que abre la fila */
        this.reporte += "\t\t<tr>\n";        
    }
    
    private void closeRow(){
        /* Se crea la etiqueta que cierra la fila */
        this.reporte += "\t\t</tr>\n";
    } 
    
    private void openColumn(){
        /* Se crea la etiqueta que abre la columna */
        this.reporte += "\t\t\t<th>";        
    }
    
    private void closeColumn(){
        /* Se crea la etiqueta que cierra la columna */
        this.reporte += "</th>\n";
    } 
    
    private void nextLine(){
        /* Se crea la etiqueta para un salto de linea */
        this.reporte += "\t<br>\n";
    }
    
    public boolean AbrirArchivo(){
        try {
            /* Se obtiene el archivo a traves de File
              * al realizar la instancia se debe colocar la ruta del archivo
              * en este caso solo se coloca el nombre y la extension debido a que
              * se encuentra en la misma carpeta del proyecto */
            File path = new File(nombre+".html");
            /* Se abrira el archivo */
            Desktop.getDesktop().open(path);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
