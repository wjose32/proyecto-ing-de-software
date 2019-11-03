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
public class ConvertirMayusculas {
    
    public static String ConvertirMayusculasPL(String cadena){
        //se estandariza la cadena a minusculas en caso
        //en caso de dos mayusculas seguidas el ingresar los datos
        cadena=ConvertirMinusculasC(cadena);
        //se convierte a cadena de caracteres el string recibido
        char[] caracteres = cadena.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        
        // el -2 es para evitar una excepción al caernos del arreglo
        for (int i = 0; i < cadena.length()- 2; i++) 
            // Es 'palabra'
            if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
                // Reemplazamos
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
        
        return new String(caracteres);
    }
    
    private static String ConvertirMinusculasC(String cadena1){
        
        String cMins = cadena1.toLowerCase();
        
        return cMins;
    }
}
