/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1.Proyecto.FuncionesAuxiliares;

/**
 *
 * @author WELLINGTON
 */
public class CrearUsuario {
    
    public static String creaUsuario(String nombres, String apellidos){
        
        String nombre = nombres.substring(0, 1);
        String apellido =apellidos.substring(0, 3);
        
        String usuario=(nombre+apellido+CrearPasswordTemporal.getPassword(CrearPasswordTemporal.NUMEROS, 2)).toLowerCase();
        
        return usuario;
    }
    
   /* private static String recortarCadena(String cadena){
        
        String[] partes=cadena.split(" ",1);
        String parte = partes[0];
        
        return parte;
    }*/
    
}
