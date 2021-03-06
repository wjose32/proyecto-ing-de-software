/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1.Proyecto.Formularios.Registros;

import S1.Proyecto.Controladores.UsuarioJpaController;
import S1.Proyecto.Entidades.Usuario;
import S1.Proyecto.FuncionesAuxiliares.CodificarContraseña;
import javax.swing.JOptionPane;
 

/**
 *
 * @author WELLINGTON
 */
public class Login extends javax.swing.JFrame {
    
    
    /**
     * Creates new form RegistrarUsuario
     */
    public Login() {
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
        ustxt = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Usuario");

        ustxt.setText("jTextField1");
        ustxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ustxtKeyTyped(evt);
            }
        });

        entrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
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
        jLabel5.setText("INICIO DE SESION");

        apellidotxt.setText("Contraseña");

        passtxt.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(apellidotxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(ustxt)))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cerrar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ustxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cerrar)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void ustxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ustxtKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_ustxtKeyTyped

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // se verifica que todos los campos esten llenos
        if((ustxt.getText().equals("")) || (passtxt.getText().equals(""))){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                //coloca el cursor en el campo en blanco
                if(passtxt.getText().equals("")){passtxt.requestFocus();}
                if(ustxt.getText().equals("")){ustxt.requestFocus();}
            }
            else{
                try {
                    //se busca el usuario ingresado para poder realizar
                    //la autenticacion
                    UsuarioJpaController CUsuario = new UsuarioJpaController();
                    Usuario usuario = CUsuario.findUsuario(ustxt.getText());
                    
                    String passTemporal=CodificarContraseña.sha1(passtxt.getText());
                    //se verifica que la contraseña ingresada sea la correcta
                    if(passTemporal.equals(usuario.getPass())){
                        //si el usuario ingresa por primera vez al sistema
                        //este le solicita que actualice la contraseña generada
                        //por el sistema, a una ingresada por el usuario
                        if(usuario.getNuevoUsuario()==1){
                            JOptionPane.showMessageDialog(null, "DEBE ACUALIZAR SU CONTRASEÑA \n","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                            //se invoca al formulario de cambio de contraseña
                            LlamarFormularios.llamarCambioContraseña();
                            //se enviaa el nombre de usuario al form de cambio de contraseña
                            CambioContraseña.lus.setText(ustxt.getText());
                            dispose();
                        }else{
                            
                            //si no es la primera vez que el usuario ingresa
                            //se procede a verificar si el usuario tiene
                            //privilegios de administrador, o no
                            //y se muestra el form correspondiente
                            if(usuario.getTipo()==0){
                             //System.out.println(usuario.getPass());
                            LlamarFormularios.llamarInvitado();
                            dispose();
                            }

                            if(usuario.getTipo()==1){
                                //System.out.println(usuario.getPass());
                                LlamarFormularios.llamarAdmin();
                                dispose();
                            }
                        }  
                    }else{
                        
                        //si la contraseña no es correcta se muestra la alerta
                        JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA \n"+"           Vuelva a Intentarlo \n","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        passtxt.setText("");
                        passtxt.requestFocus();
                    }
                        
                        
                        

                } catch (Exception e){
                    //si el usuario no es correcto, o no existe se muestra la alerta
                    JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO \n"+"      Vuelva a Intentarlo","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    limpiar();
                }
            
            }
        
    }//GEN-LAST:event_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidotxt;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField ustxt;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar los campos
private void limpiar() {                                          
        ustxt.setText("");
        passtxt.setText("");
        
        ustxt.requestFocus();      
}

}
