/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica.ventanas;

import Objetos.Categoria.Categoria;
import Objetos.Categoria.ListaCategorias;
import Objetos.Cupones.ListaCupones;
import Objetos.Factura.Factura;
import Objetos.Factura.ProductoAgregado;
import Objetos.Producto.ListaProductos;
import Objetos.Reportes.ReporteHTML;
import Objetos.Reportes.ReportePDF;
import Objetos.Usuarios.ListUser;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lobje
 */
public class Venta extends javax.swing.JFrame {

    ListaCupones cupones;
    ListaCategorias categorias;
    ListUser usuarios;
    Factura fact;
    String nombreUser;
    DefaultTableModel modelo;
    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
//        System.out.println("Conteo en Venta "+ejemploclase5.EjemploClase5.conteo);
//        ejemploclase5.EjemploClase5.conteo = 240;
    }

    public void setListas(ListaCategorias categorias, ListaCupones cupones, ListUser usuarios, String nameUser){
        this.categorias = categorias;
        this.cupones = cupones;
        this.usuarios = usuarios;
        this.nombreUser = nameUser;
        llenarOpcionesCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opcionesCategoria = new javax.swing.JComboBox<>();
        opcionesProducto = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCupon = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnGenerarPDF = new javax.swing.JButton();
        btnGenerarHTML = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Comprar");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Producto");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Categoria");

        opcionesCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaActionPerformed(evt);
            }
        });

        btnComprar.setText("Realizar compra");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cupon de descuento");

        btnAgregar.setText("Agregar producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCupon, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(opcionesProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(opcionesCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opcionesCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(opcionesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnComprar)
                .addGap(38, 38, 38))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cliente");

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tableProductos);

        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        btnGenerarPDF.setText("Generar factura PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        btnGenerarHTML.setText("Genererar factura HTML");
        btnGenerarHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarHTMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarHTML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarPDF)
                    .addComponent(btnGenerarHTML))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnCerrarSesion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionesCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaActionPerformed
        // TODO add your handling code here:
        //llenarOpcionesCategoria();
       if(opcionesCategoria.getSelectedItem()!=null) llenarOpcionesProducto();
    }//GEN-LAST:event_opcionesCategoriaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(this.fact == null) this.fact = new Factura(this.nombreUser, String.valueOf(LocalDateTime.now()));
        agregarProductoAFactura();
        llenarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        mensaje(String.valueOf(this.fact.obtenerTotal()));
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        // TODO add your handling code here:
        ReportePDF pdf = new ReportePDF();
        boolean creado = pdf.CrearDoc("Uno", fact, this.usuarios.obtener(nombreUser));
        if(creado){
            mensaje("Archivo creado correctamente");
            boolean encontrado = pdf.AbrirArchivo();
            if(!encontrado){
                mensaje("No se encontro el archivo");
            }
        }
        else{
            mensaje("Surgio un error al tratar de crear el archivo\nverifique si ya existe uno con el mismo nombre\no lo tiene abierto");
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void btnGenerarHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarHTMLActionPerformed
        // TODO add your handling code here:
        ReporteHTML html = new ReporteHTML();
        boolean creado = html.CrearDoc("Uno", fact, this.usuarios.obtener(nombreUser));
        if(creado){
            mensaje("Archivo creado correctamente");
            boolean encontrado = html.AbrirArchivo();
            if(!encontrado){
                mensaje("No se encontro el archivo");
            }
        }
        else{
            mensaje("Surgio un error al tratar de crear el archivo\nverifique si ya existe uno con el mismo nombre\no lo tiene abierto");
        }
    }//GEN-LAST:event_btnGenerarHTMLActionPerformed

    
    /* ******************************************************************************************************************
     * ******************************************************************************************************************
     * ****************************************************************************************************************** */
    private void llenarOpcionesCategoria(){
        int cantidad = this.categorias.cantidad();
        this.opcionesCategoria.removeAllItems();
        if(cantidad>0) this.opcionesCategoria.addItem("Todos");
        
        String nombre = "";
        for (int i = 0; i < cantidad; i++) {
            nombre = this.categorias.getCategoria(i).getNombre();
            this.opcionesCategoria.addItem(nombre);            
        }
        if(cantidad>0) this.opcionesCategoria.setSelectedItem("Todos");
    }
    
    private void llenarOpcionesProducto(){
        this.opcionesProducto.removeAllItems();
       String nombre = String.valueOf(this.opcionesCategoria.getSelectedItem());
       //this.opcionesCategoria.setSelectedItem(nombre);
        
        if(nombre.equals("Todos")){
            int cantidad = this.categorias.cantidad();
            Categoria cat;
            for (int i = 0; i < cantidad; i++) {
                cat = this.categorias.getCategoria(i);
                agregarDatosProductoPorCategoria(cat.getProductos());          
            }
        }
        else{
            Categoria cat = this.categorias.getCategoria(nombre);
        
            if(cat!=null){
                agregarDatosProductoPorCategoria(cat.getProductos());
            }
        }
    }
    
    private void agregarDatosProductoPorCategoria(ListaProductos productos){
        int cantidad = productos.Cantidad();
        String nombre = "";
        
        for (int i = 0; i < cantidad; i++) {
            nombre = productos.Obtener(i).getNombre();
            this.opcionesProducto.addItem(nombre);            
        }
    }
    
    /* ******************************************************************************************************************
     * ******************************************************************************************************************
     * ****************************************************************************************************************** */
    private void agregarProductoAFactura(){
        
        if(this.opcionesProducto.getSelectedItem()!=null){
            String nombre = String.valueOf(this.opcionesProducto.getSelectedItem());
            int cantidad = getCantidad();
            double precio = getPrecio();

            if(cantidad>-1 && precio>0) this.fact.Agregar(nombre, precio, cantidad);
        }
    }    
    
    private int  getCantidad(){
        try {
            return Integer.parseInt(this.txtCantidad.getText());
        } catch (Exception e) {
            mensaje("El campo de cantidad solo acepta valores enteros");
            return -1;
        }
    }
    
    private double  getPrecio(){
            String nombre = String.valueOf(this.opcionesCategoria.getSelectedItem());
            ListaProductos listP = this.categorias.getCategoria(nombre).getProductos();
            
            String nombreP = String.valueOf(this.opcionesProducto.getSelectedItem());
            return listP.Obtener(nombreP).getPrecio();
    }
    /* ******************************************************************************************************************
     * ******************************************************************************************************************
     * ****************************************************************************************************************** */
    
    public void llenarTabla(){
        this.modelo = new DefaultTableModel();
        modelo.addColumn("No.");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
                
        int cantidad = this.fact.cantidad();
        int No_ = 0;
        ProductoAgregado tmp;
        for (int i = 0; i < cantidad; i++) {
            tmp = this.fact.Obtener(i);
            //addRowTable(i, codigo, porc);
            addRowTable(i, tmp.getNombre(), tmp.getCantidad(), tmp.getPrecio(), tmp.getTotal());
        }
        
        this.tableProductos.setModel(modelo);
        this.tableProductos.getColumnModel().getColumn(0).setMaxWidth(30);
    }
    
    private void addRowTable(int id, String nombre, int cantidad, double precio, double total){
        modelo.addRow(new Object[]{String.valueOf(id), nombre, String.valueOf(cantidad), String.valueOf(precio), String.valueOf(total)});
        this.tableProductos.setModel(modelo);
    }
    
    /* ******************************************************************************************************************
     * ******************************************************************************************************************
     * ****************************************************************************************************************** */
    private void salir(){
        Login login = new Login();
        login.setListas(categorias, cupones, usuarios);
        login.setVisible(true);
        this.dispose();
    }
    
    private void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    /* ******************************************************************************************************************
     * ******************************************************************************************************************
     * ****************************************************************************************************************** */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnGenerarHTML;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcionesCategoria;
    private javax.swing.JComboBox<String> opcionesProducto;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCupon;
    // End of variables declaration//GEN-END:variables
}
