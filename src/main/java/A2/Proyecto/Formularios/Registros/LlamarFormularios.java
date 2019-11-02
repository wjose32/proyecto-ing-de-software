/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2.Proyecto.Formularios.Registros;

/**
 *
 * @author WELLINGTON
 */
public class LlamarFormularios {
    
    public static void llamarRegistroUsuarios(){
        RegistrarUsuario ru = new RegistrarUsuario();
        ru.setVisible(true);
    }
    
    public static void llamarRegistroProveedores(){
        RegistrarProveedor rp = new RegistrarProveedor();
        rp.setVisible(true);
    }
    
    public static void llamarRegistroClientes(){
        RegistrarCliente rc = new RegistrarCliente();
        rc.setVisible(true);
    }
    
    public static void llamarRegistroMarca(){
        RegistrarMarca rm = new RegistrarMarca();
        rm.setVisible(true);
    }
    
    public static void llamarRegistroCategoria(){
        RegistrarCategoria rcat = new RegistrarCategoria();
        rcat.setVisible(true);
    }
    
    public static void llamarRegistroProducto(){
        RegistrarProducto rp = new RegistrarProducto();
        rp.setVisible(true);
    }
    
    public static void llamarRegistroCompra(){
        RegistrarCompra rc = new RegistrarCompra();
        rc.setVisible(true);
    }
    
    public static void llamarRegistroVenta(){
        RegistrarVenta rv = new RegistrarVenta();
        rv.setVisible(true);
    }
    
    public static void llamarLogin(){
        Login log = new Login();
        log.setVisible(true);
    }
    
    public static void llamarAdmin(){
        Administracion admin = new Administracion();
        admin.setVisible(true);
    }
    
    public static void llamarInvitado(){
        Invitado inv = new Invitado();
        inv.setVisible(true);
    }
    
    public static void llamarUsuarios(){
        Usuarios us = new Usuarios();
        us.setVisible(true);
    }
    
    public static void llamarEliminarUsuario(){
        EliminarUsuario us = new EliminarUsuario();
        us.setVisible(true);
    }
    
    public static void llamarVentas(){
        Ventas us = new Ventas();
        us.setVisible(true);
    }
    
   
    
    
}
