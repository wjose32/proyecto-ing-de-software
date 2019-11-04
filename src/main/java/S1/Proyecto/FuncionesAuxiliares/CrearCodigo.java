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
    //metodo que crea codigo, para utilizacion en proveedores
    public static String creaCodigo(String nombres){
        //si el proveedor cuenta con mas de una palabra en el nombre
        //se separa el primer nombre
        String nombre = recortarCadena(nombres);
        //se extrae la primer letra del nombre
        //se agrega un numero aleatorio para 
        //la creacion del codigo de proveedor
        String codigo = (nombre.substring(0, 2)+
                         CrearPasswordTemporal.getPassword(
                                  CrearPasswordTemporal.NUMEROS, 2)).toUpperCase(); 
        return codigo;
    }
    //metodo para crear codigo de productos, en base a la primera letra del nombre
    //marca, y categoria, y un numero aleatorio.
    public static String creaCodigoProducto(String nombres,String marcas,String categorias){
        //en caso de que el nombre, marca o categoria
        //cuenten con mas de una palabra, se separa la primera palabra
        //de esa cadena para la generacion del codigo
        String nombre = recortarCadena(nombres);
        String marca = recortarCadena(marcas);
        String categoria = recortarCadena(categorias);
        //se extrae la primer letra de las palabras y se genera un numero aleatorio para 
        //terminar de crear el codigo
        String codigo = (nombre.substring(0, 1)+
                         marca.substring(0, 1)+
                         categoria.substring(0, 1)+
                         CrearPasswordTemporal.getPassword(
                                  CrearPasswordTemporal.NUMEROS, 2)).toUpperCase(); 
        return codigo;
    }
    //metodo que recorta la cadena
    //devolviendo la primera palabra de esa cadena
    private static String recortarCadena(String cadena){
        
        String[] partes=cadena.split(" ",1);
        String parte = partes[0];
        
        return parte;
    }
    
}
