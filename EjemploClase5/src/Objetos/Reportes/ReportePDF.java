/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Reportes;

import Objetos.Factura.Factura;
import Objetos.Factura.ProductoAgregado;
import Objetos.Usuarios.Usuario;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author lobje
 */
public class ReportePDF {   

    String nombre;
    public ReportePDF() {
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
        Document documento = null;
        try {
            /* Se crea el archivo con el nombre que se le envia*/
            FileOutputStream archivo = new FileOutputStream(nombre+".pdf");
            /* Se crea un documento esto ya es específico de itextpdf */
            documento = new Document();
            /* Esta instancia nos permitira escribir en el archivo llamado docomento en mi caso */
            PdfWriter.getInstance(documento, archivo);
            /* Se abre el documento para poder escribir en el */
            documento.open();
            /* Se agrega un parrafo con el texto factura */
            documento.add(nuevoTitulo("Factura\n\n"));
            /* Se agrega un parrafo con todos los datos del usuario */
            documento.add(datosUsuario(user));
            /* Se agrega una tabla con todos los productos comprados */
            documento.add(nuevaTabla(fact));
            /* Se cierra el documento esto siempre se debe hacer para que no se presente
            ningun problema*/
            documento.close();
            return true;
        } 
        /* El catch se usara para atrapar cualquier posible error que suceda */
        catch (DocumentException | FileNotFoundException e) {
            /* Se muestra en consola el error que se presento */
            System.out.println("Error "+e);
            /* Si surge un error se cierra de igual forma el documento*/
            if(documento!=null)documento.close();
            return false;
        }
    }
    
    private Paragraph nuevoTitulo(String titulo){
        /* Se crea un tipo de fuente para aplicarle al texto del parrafo */
        Font fuente = new Font();
        /* Tipo de letra */
        fuente.setFamily(Font.FontFamily.HELVETICA.toString());
        /* Color de letra */
        fuente.setColor(BaseColor.BLUE);
        /* Tamaño de letra */
        fuente.setSize(18);
        /* Estilo para la letra como negrita, cursiva, etc. */
        fuente.setStyle(Font.BOLDITALIC);
        
        /* Se crea un parrafo con el texto enviado como parametro y se le aplica la fuente */
        Paragraph parrafo = new Paragraph(titulo, fuente);
        /* Se le indica que se va a mostrar el texto centrado en el archivo */
        parrafo.setAlignment(1);
        /* Se regresa el parrafo para agregarlo al documento */
        return parrafo;
    }
    
    private Paragraph datosUsuario(Usuario user){
        String datos = "";
        /* Se crea la cadena a mostrar en el parrafo */
        datos += "Nombre del cliente: "+ user.getNombre() + "\n";
        datos += "Rol del cliente: " + user.getRol() + "\n";
        datos += "Fecha: " + String.valueOf(LocalDateTime.now()) + "\n\n";
        /* */
        Paragraph parrafo = new Paragraph(datos);
        /* Se le indica que se va a mostrar el texto a la derecha */
        parrafo.setAlignment(0);
        /* Se regresa el parrafo para agregarlo al documento */
        return parrafo;
    }
    
    /* **************************************************************************************************************** * 
      * **************************************************************************************************************** *
      * **************************************************************************************************************** */
    /* Funion para crear una tabla con los datos del producto */
    private PdfPTable nuevaTabla(Factura fact){
        /* Se crea una tabla para mostrar los datos de los productos */
        PdfPTable tabla = new PdfPTable(5);
        /* Se crea una celda que corresponde a una columna de la tabla */
        tabla.addCell(encabezado("No."));
        tabla.addCell(encabezado("Producto"));
        tabla.addCell(encabezado("Cantidad"));
        tabla.addCell(encabezado("Precio"));
        tabla.addCell(encabezado("Subtotal"));
        /* Se crea un arreglo para indicar el tamaño de cada columna */
        int [] dim = {25, 100, 40, 40, 40};
        try {
            /* Se le asigna los tamaños de las columnas a la tabla */
            tabla.setWidths(dim);
        } catch (DocumentException ex) {
            /* Se muestra el error capturado */
            System.out.println("Error en el tamaño "+ex);
        }
        
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
                /* Se crea una celda que corresponde a una columna de la tabla con los datos del producto */
                tabla.addCell(nuevaCelda(""+(i+1), i));
                tabla.addCell(nuevaCelda(tmp.getNombre(), i));
                tabla.addCell(nuevaCelda(String.valueOf(tmp.getCantidad()), i));
                tabla.addCell(nuevaCelda(String.valueOf(tmp.getPrecio()), i));
                tabla.addCell(nuevaCelda(String.valueOf(tmp.getTotal()), i));
            }
        }
        return tabla;
    }
    
    /* Funcion que crea una celda o bien una columna */
    private PdfPCell nuevaCelda(String texto, int indice){
        /* Se crea un Chunk para el texto a mostrar en la columna o celda */
        Chunk contenido = new Chunk(texto);
        /* Se le asigna un estilo al igual que en el titulo de archivo */
        contenido.setFont(new com.itextpdf.text.Font(Font.FontFamily.TIMES_ROMAN, 13, Phrase.ALIGN_CENTER, BaseColor.BLACK));
        /* Se crea una celda con una instacia de Phase que contedra el conteido */
        PdfPCell celda = new PdfPCell(new Phrase(contenido));
        /* El parametro inidice se usara para decidir el color amostrar por fila */
        if((indice%2)==0) celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        else celda.setBackgroundColor(BaseColor.GRAY);
        /* Se le asigna un color al borde de la celda */
        celda.setBorderColor(BaseColor.BLACK);
        /* El relleno se refiere al espacio en blanco que se encuentra alrededor del contenido */
        celda.setPadding(5);
        /* Indica el grosor del borde */
        celda.setBorder(5);
        /* Se utilizan para centrar el contenido en la celda */
        celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
        return celda;
    }
    
    private PdfPCell encabezado(String texto){
        Chunk contenido = new Chunk(texto);
        contenido.setFont(new com.itextpdf.text.Font(Font.FontFamily.TIMES_ROMAN, 13, Phrase.ALIGN_CENTER, BaseColor.WHITE));
        
        PdfPCell celda = new PdfPCell(new Phrase(contenido));
        celda.setBackgroundColor(BaseColor.BLUE);
        celda.setBorderColor(BaseColor.BLACK);
        celda.setPadding(5);
        celda.setBorder(5);
        celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
        return celda;
    }
    
    public boolean AbrirArchivo(){
        try {
            /* Se obtiene el archivo a traves de File
              * al realizar la instancia se debe colocar la ruta del archivo
              * en este caso solo se coloca el nombre y la extension debido a que
              * se encuentra en la misma carpeta del proyecto */
            File path = new File(nombre+".pdf");
            /* Se abrira el archivo */
            Desktop.getDesktop().open(path);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
