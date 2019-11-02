/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2.Proyecto.Formularios.Registros;

import A2.Proyecto.Controladores.UsuarioJpaController;
import A2.Proyecto.Entidades.Usuario;
import A2.Proyecto.FuncionesAuxiliares.*;
import javax.swing.JOptionPane;
 

/**
 *
 * @author WELLINGTON
 */
public class RegistrarUsuario extends javax.swing.JFrame {
    
    
    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarUsuario() {
        initComponents();
        limpiar();
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
        tipotxt = new javax.swing.JComboBox<>();
        nomtxt = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aptxt = new javax.swing.JTextField();
        dirtxt = new javax.swing.JTextField();
        teltxt = new javax.swing.JTextField();
        emtxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo");

        tipotxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invitado", "Administrador" }));

        nomtxt.setText("jTextField1");
        nomtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomtxtKeyTyped(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cerrar.setText("CERRAR");
        cerrar.setAlignmentX(1.0F);
        cerrar.setAlignmentY(1.0F);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("REGISTRO DE USUARIOS");

        apellidotxt.setText("Apellido");

        jLabel6.setText("Direccion");

        jLabel7.setText("Telefono");

        jLabel8.setText("E-mail");

        aptxt.setText("jTextField2");
        aptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aptxtKeyTyped(evt);
            }
        });

        dirtxt.setText("jTextField3");
        dirtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dirtxtKeyTyped(evt);
            }
        });

        teltxt.setText("jTextField4");
        teltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teltxtKeyTyped(evt);
            }
        });

        emtxt.setText("jTextField1");
        emtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emtxtKeyTyped(evt);
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
                    .addComponent(apellidotxt)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomtxt)
                    .addComponent(dirtxt)
                    .addComponent(aptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addComponent(tipotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cerrar)
                        .addGap(8, 8, 8)))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        LlamarFormularios.llamarAdmin();
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void nomtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomtxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'Z') && (c<' ' || c>' ') && (c<'ñ' || c>'ñ') && (c<'Ñ' || c>'Ñ')) evt.consume();
    }//GEN-LAST:event_nomtxtKeyTyped

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        if((nomtxt.getText().equals("")) || (aptxt.getText().equals("")) || 
               (dirtxt.getText().equals("")) || (teltxt.getText().equals("")) || 
               (emtxt.getText().equals("") )){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                //coloca el cursor en el campo en blanco
                if(emtxt.getText().equals("")){emtxt.requestFocus();}
                if(teltxt.getText().equals("")){teltxt.requestFocus();}
                if(dirtxt.getText().equals("")){dirtxt.requestFocus();}
                if(aptxt.getText().equals("")){aptxt.requestFocus();}
                if(nomtxt.getText().equals("")){nomtxt.requestFocus();}
            }
            else{
                 
                try {
                    //accion de insertar datos en la base de datos  
                    Usuario usuario = new Usuario();
                    UsuarioJpaController CUsuario = new UsuarioJpaController();

                    usuario.setUsuario(CrearUsuario.creaUsuario(nomtxt.getText(), aptxt.getText()));
                    
                    usuario.setNombre(nomtxt.getText());
                    usuario.setApellido(aptxt.getText());
                    usuario.setDireccion(dirtxt.getText());
                    usuario.setTelefono(teltxt.getText());
                    usuario.setEmail(emtxt.getText());

                    usuario.setUsuario(CrearUsuario.creaUsuario(nomtxt.getText(), aptxt.getText()));

                    usuario.setPass(CrearPasswordTemporal.getPassword(
                                    CrearPasswordTemporal.MINUSCULAS
                                  + CrearPasswordTemporal.NUMEROS
                                  + CrearPasswordTemporal.MAYUSCULAS, 10));

                    if (tipotxt.getSelectedItem().toString() == "Invitado") {
                        usuario.setTipo(0);
                    } else if (tipotxt.getSelectedItem().toString() == "Administrador") {
                        usuario.setTipo(1);
                    }

                    usuario.setNuevoUsuario(1);

                    CUsuario.create(usuario);
                    javax.swing.JOptionPane.showMessageDialog(null,"Usuario:           "+usuario.getUsuario()+"\n"+"Contraseña:    "+usuario.getPass()+"\n","USUARIO REGISTRADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);

                    limpiar();

                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            
            }
        
    }//GEN-LAST:event_registrarActionPerformed

    private void aptxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aptxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'Z') && (c<' ' || c>' ') && (c<'ñ' || c>'ñ') && (c<'Ñ' || c>'Ñ')) evt.consume();
    }//GEN-LAST:event_aptxtKeyTyped

    private void teltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teltxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0'|| c>'9')) evt.consume();
        
        if(teltxt.getText().length()==8){
            evt.consume();
        }
    }//GEN-LAST:event_teltxtKeyTyped

    private void dirtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirtxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'Z') && (c<' ' || c>' ') && (c<'ñ' || c>'ñ') && (c<'Ñ' || c>'Ñ')&&(c<'0'|| c>'9')) evt.consume(); 
    }//GEN-LAST:event_dirtxtKeyTyped

    private void emtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emtxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A'||c>'Z') && (c<'-' || c>'-') && (c<'_'|| c>'_')&& (c<'.'|| c>'.')&& (c<'0'|| c>'9')&& (c<'@'|| c>'@')) evt.consume();
    }//GEN-LAST:event_emtxtKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidotxt;
    private javax.swing.JTextField aptxt;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField dirtxt;
    private javax.swing.JTextField emtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField teltxt;
    private javax.swing.JComboBox<String> tipotxt;
    // End of variables declaration//GEN-END:variables

private void limpiar() {                                          

        nomtxt.setText("");
        aptxt.setText("");
        dirtxt.setText("");
        teltxt.setText("");
        emtxt.setText("");
        tipotxt.setSelectedItem(0);
        
        nomtxt.requestFocus();      
}

}
