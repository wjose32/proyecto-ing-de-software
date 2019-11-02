/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2.Proyecto.FuncionesAuxiliares;

/**
 *
 * @author WELLINGTON
 */
public class CrearUsuario {
    
    public static String creaUsuario(String nombres, String apellidos){
        
        String nombre = recortarCadena(nombres);
        String apellido =recortarCadena(apellidos);
        
        String usuario=(nombre.charAt(0)+apellido+CrearPasswordTemporal.getPassword(CrearPasswordTemporal.NUMEROS, 2)).toLowerCase();
        
        return usuario;
    }
    
    private static String recortarCadena(String cadena){
        
        String[] partes=cadena.split(" ",1);
        String parte = partes[0];
        
        return parte;
    }
    
}
