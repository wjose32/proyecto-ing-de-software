/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1.Proyecto.FuncionesAuxiliares;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author WELLINGTON
 */
public class CodificarContraseña { 
    //algoritmo SHA1 para la encriptacion de contraseñas
    public static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }  
}
