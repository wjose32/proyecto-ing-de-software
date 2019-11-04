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
public class CompararContraseñas {
    //metodo para comparar que las contraseñas ingresadas por el usuario coincidan
    //al momento de cambiar las contraseñas para nuevos usuarios
    public static boolean ConfirmarPass(char[] j1,char[] j2) {
        boolean valor = true;
        int puntero = 0;
        if (j1.length != j2.length){
            valor = false;
        }
        else{
            while((valor)&&(puntero < j1.length)){
                if (j1[puntero] != j2[puntero]){
                    valor = false;
                }
                puntero++;
            }
        }
        return valor;
}
    
}
