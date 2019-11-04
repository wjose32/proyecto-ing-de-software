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
        //se extraen subcadenas en nombre y apellido
        //para poder gener un usuario segun la primera
        //letra del nombre, y las tres primeras letras del apellido
        //y un numero aleatorio
        String nombre = nombres.substring(0, 1);
        String apellido =apellidos.substring(0, 3);
        
        //se genera el usuario con las subcadenas generadas, y se convierte toda la cadena a minusculas
        String usuario=(nombre+apellido+CrearPasswordTemporal.getPassword(CrearPasswordTemporal.NUMEROS, 2)).toLowerCase();
        
        return usuario;
    }
    
}
