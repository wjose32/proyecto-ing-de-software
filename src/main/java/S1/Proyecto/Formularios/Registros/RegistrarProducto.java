/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1.Proyecto.Formularios.Registros;

import S1.Proyecto.FuncionesAuxiliares.CrearCodigo;
import S1.Proyecto.Controladores.CategoriaJpaController;
import S1.Proyecto.Controladores.MarcaJpaController;
import S1.Proyecto.Controladores.ProductoJpaController;
import S1.Proyecto.Controladores.ProveedoresJpaController;
import S1.Proyecto.Entidades.Categoria;
import S1.Proyecto.Entidades.Marca;
import S1.Proyecto.Entidades.Producto;
import S1.Proyecto.Entidades.Proveedores;
import java.util.List;
import javax.swing.JOptionPane;
 

/**
 *
 * @author WELLINGTON
 */
public class RegistrarProducto extends javax.swing.JFrame {
    //se instancian los controladores
    MarcaJpaController CMarca = new MarcaJpaController();
    CategoriaJpaController CCategoria = new CategoriaJpaController();
    ProveedoresJpaController CProveedor = new ProveedoresJpaController();
    
    
    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarProducto() {
            initComponents();
            marcatxt.removeAllItems();
            cattxt.removeAllItems();
            provtxt.removeAllItems();
            
            limpiar();
            cargarInfo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        marcatxt = new javax.swing.JComboBox<>();
        nomtxt = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        canttxt = new javax.swing.JTextField();
        provtxt = new javax.swing.JComboBox<>();
        cattxt = new javax.swing.JComboBox<>();
        precioxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Precio");

        marcatxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        marcatxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invitado", "Administrador" }));

        nomtxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nomtxt.setText("jTextField1");
        nomtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomtxtKeyTyped(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(0, 154, 154));
        registrar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(229, 88, 100));
        cerrar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cerrar.setText("Cerrar");
        cerrar.setAlignmentX(1.0F);
        cerrar.setAlignmentY(1.0F);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("REGISTRO DE PRODUCTOS");

        apellidotxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        apellidotxt.setText("Marca");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Categoria");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Proveedor");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Cantidad");

        canttxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        canttxt.setText("jTextField2");
        canttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                canttxtKeyTyped(evt);
            }
        });

        provtxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        provtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cattxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cattxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        precioxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        precioxt.setText("jTextField1");
        precioxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                precioxtPropertyChange(evt);
            }
        });
        precioxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(apellidotxt)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cattxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(provtxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomtxt)
                        .addComponent(marcatxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(canttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(precioxt))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registrar)
                                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cattxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(precioxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        LlamarFormularios.llamarRegistros();
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void nomtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomtxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'Z') && (c<' ' || c>' ') && (c<'ñ' || c>'ñ') && (c<'Ñ' || c>'Ñ')) evt.consume();
    }//GEN-LAST:event_nomtxtKeyTyped

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        //se verifica que no existan campos vacios antes del registro
        if((nomtxt.getText().equals("")) || (canttxt.getText().equals("")) || 
               (precioxt.getText().equals("") )){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                //coloca el cursor en el campo en blanco
                if(precioxt.getText().equals("")){precioxt.requestFocus();}
                if(canttxt.getText().equals("")){canttxt.requestFocus();}
                if(nomtxt.getText().equals("")){nomtxt.requestFocus();}
            }
            else{
                 
                try {
                    //accion de insertar datos en la base de datos  
                    Producto producto = new Producto();
                    ProductoJpaController CProducto = new ProductoJpaController();
                    //se obtiene el nombre del item seleccionado
                    //en los combo box
                    String marcaAux=marcatxt.getSelectedItem().toString();
                    String categoriaAux=cattxt.getSelectedItem().toString();
                    String proveedorAux=provtxt.getSelectedItem().toString();
                    
                    //se genera el codigo del producto con base al nombre
                    //marca, categoria y un numero aleatorio
                    producto.setCodigo(CrearCodigo.creaCodigoProducto(nomtxt.getText(), marcaAux, categoriaAux));
                    
                    producto.setNombre(nomtxt.getText());
                    producto.setMarca(marcaAux);
                    producto.setCategoria(categoriaAux);
                    producto.setProveedor(proveedorAux);
                    producto.setCantidad(Integer.parseInt(canttxt.getText()));
                    producto.setEstado("En Stock");
                    producto.setPrecio(Float.parseFloat(precioxt.getText()));
                    
                    //se ingresa el producto
                    CProducto.create(producto);
                    javax.swing.JOptionPane.showMessageDialog(null,"PRODUCTO REGISTRADO\n","REGISTRO",javax.swing.JOptionPane.INFORMATION_MESSAGE);

                    limpiar();

                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            
            }
        
    }//GEN-LAST:event_registrarActionPerformed

    private void canttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canttxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0'|| c>'9')) evt.consume();
    }//GEN-LAST:event_canttxtKeyTyped

    private void precioxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0'|| c>'9')&& (c<'.'||c>'.')) evt.consume();

    }//GEN-LAST:event_precioxtKeyTyped

    private void precioxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_precioxtPropertyChange

    }//GEN-LAST:event_precioxtPropertyChange

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
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidotxt;
    private javax.swing.JTextField canttxt;
    private javax.swing.JComboBox<String> cattxt;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> marcatxt;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JTextField precioxt;
    private javax.swing.JComboBox<String> provtxt;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables

    
    //metodo para limpiar los campos existentes
private void limpiar() {                                          

        nomtxt.setText("");
        canttxt.setText("");
        precioxt.setText("");
        
        marcatxt.setSelectedItem(0);
        cattxt.setSelectedItem(0);
        provtxt.setSelectedItem(0);
        
        
        nomtxt.requestFocus();      
}
    //metodo para cargar a los combobox
    //la informacion de marca, categoria y proveedor
    private void cargarInfo() {

        try {
            //Llenacombox de marcas existentes
            List<Marca> listM = CMarca.findMarcaEntities();
            for(int i=0;i<listM.size();i++){
                //System.out.println(""+listM.get(i).getNombre());
                marcatxt.addItem(listM.get(i).getNombre());
            }
            //Llenacombox de categorias existentes
            List<Categoria> listC = CCategoria.findCategoriaEntities();
            for(int i=0;i<listC.size();i++){
                //System.out.println(""+listM.get(i).getNombre());
                cattxt.addItem(listC.get(i).getNombre());
            }
            
            //Llenacombox de proveedores existentes
            List<Proveedores> listP = CProveedor.findProveedoresEntities();
            for(int i=0;i<listP.size();i++){
                //System.out.println(""+listM.get(i).getNombre());
                provtxt.addItem(listP.get(i).getNombre());
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }


}
