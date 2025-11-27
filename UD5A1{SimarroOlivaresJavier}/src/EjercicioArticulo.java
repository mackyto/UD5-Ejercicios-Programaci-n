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
 *      precio de venta al público, es decir, el precio con IVA). Luego, cambia
 *      el precio y vuelve a imprimir el mensaje  * 
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
        
        Articulo articulo = new Articulo(); // Instancia el objeto pijama y assigna valores a sus atributos.
        articulo.nombre = "Pijama";
        articulo.precioSinIva = 10;
        articulo.iva = 21;
        articulo.existencias= 100;
        
        double inflación = 3.5; // declara incremento de precio por inflación general.
        
        // Imprime resultados
        System.out.printf("%s - Precio:%.2f - IVA:%d - PVP %.2f\n\n", articulo.nombre, articulo.precioSinIva, articulo.iva, articulo.precioSinIva + articulo.precioSinIva * articulo.iva /100);
        
        //añade inflación al precio
        articulo.precioSinIva += articulo.precioSinIva * inflación /100;
        
        // Imprime resultado con inflación
        System.out.printf("%s - Precio:%.2f - IVA:%d - PVP %.2f\n\n", articulo.nombre, articulo.precioSinIva, articulo.iva, articulo.precioSinIva + articulo.precioSinIva * articulo.iva /100);

        
    }
    
    
}
