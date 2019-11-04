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
public class CrearPasswordTemporal {
//    constantes que se utilizan para la creacion de codigo
//    de usuarios, proveedores, productos y contraseña
    public static final String NUMEROS = "0123456789";
 
    public static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
    public static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
 
    
    public static String getPinNumber() {
	return getPassword(NUMEROS, 4);
    }
    //metodo que envia la longitud requerida del pass
    public static String getPassword() {
        return getPassword(8);
    }
    //metodo que envia la cadena de numeros y letras, con la longitud requerida
    public static String getPassword(int length) {
        return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
    }
    //metodo para generar una cadena con letras y numeros, de longitud aleatoria
    //para la creacion de contraseña temporal
    public static String getPassword(String key, int length) {
        String pswd = "";
        
        for (int i = 0; i < length; i++) {
            pswd+=(key.charAt((int)(Math.random() * key.length())));
	}
 
      	return pswd;
    }
    
}
