/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 2.4. Crea un programa con una clase llamada Articulo con los siguientes
 *      atributos: nombre, precio (sin IVA), iva (siempre será 21) y existencias
 *      (representa cuántos quedan en el almacén). En el main de la clase
 *      principal instancia un objeto de la clase artículo. Asigna valores a
 *      todos sus atributos (los que quieras) y muestra por pantalla un mensaje
 *      del estilo “Pijama - Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el
 *      precio Pág. 4 de 10 de venta al público, es decir, el precio con IVA).
 *      Luego, cambia el precio y vuelve a imprimir el mensaje  * 
 * 
 *              nombre: String
 * 
 *              precioSinIva: double
 * 
 *              iva: int
 * 
 *              existencias: int
 * 
 * 
 * @author macky
 */
public class EjercicioArticulo {
    
    public static void main(String[] args){
        
        Articulo articulo = new Articulo(); // Isntancia el articulo pijama y assigna valores a sus atributos.
        articulo.nombre = "Pijama";
        articulo.precioSinIva = 10;
        articulo.iva = 21;
        articulo.existencias= 100;
        
    }
    
    
}
