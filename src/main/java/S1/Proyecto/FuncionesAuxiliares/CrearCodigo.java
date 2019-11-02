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
public class CrearCodigo {
    
    public static String creaCodigo(String nombres){
        
        String nombre = recortarCadena(nombres);
        
        String codigo = (nombre.substring(0, 2)+
                         CrearPasswordTemporal.getPassword(
                                  CrearPasswordTemporal.NUMEROS, 2)).toUpperCase(); 
        return codigo;
    }
    
    public static String creaCodigoProducto(String nombres,String marcas,String categorias){
        
        String nombre = recortarCadena(nombres);
        String marca = recortarCadena(marcas);
        String categoria = recortarCadena(categorias);
        
        String codigo = (nombre.substring(0, 1)+
                         marca.substring(0, 1)+
                         categoria.substring(0, 1)+
                         CrearPasswordTemporal.getPassword(
                                  CrearPasswordTemporal.NUMEROS, 2)).toUpperCase(); 
        return codigo;
    }
    
    private static String recortarCadena(String cadena){
        
        String[] partes=cadena.split(" ",1);
        String parte = partes[0];
        
        return parte;
    }
    
}
