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
        
        Articulo articulo = new Articulo("Pijama", 10, 21, 100); // Instancia el objeto pijama y assigna valores a sus atributos.
        
//        articulo.nombre = "Pijama";
//        articulo.precioSinIva = 10;
//        articulo.iva = 21;
//        articulo.existencias= 100;
        
        // Descuento aplicable.
        int descuento = 15; 
        
        // declara incremento de precio por inflación general.
        double inflacion = 3.5;
        
        // Imprime resultados.
        articulo.imprimir();
        System.out.printf("Precio PVP %.2f€\n\n",articulo.getPVP()); 
        
        // Incluye un descuento al precio.
        System.out.printf("Precio PVP con descuento del %d%% %.2f€\n\n", descuento, articulo.getPVPDescuento(descuento));
        
        // calcula y suma el precio sin iva mas la inflacion.
        articulo.setArticuloPrecioSinIva(articulo.getArticuloPrecioSinIva() + articulo.getArticuloPrecioSinIva() * inflacion / 100);
        
        // Imprime resultado con inflación.
        System.out.printf("%s - Precio:%.2f - IVA:%d - PVP %.2f\n\n", articulo.getArticulosNombre(), articulo.getArticuloPrecioSinIva(), articulo.getArticuloIva(), articulo.getArticuloPrecioSinIva() + articulo.getArticuloPrecioSinIva() * articulo.getArticuloIva() /100);
        
        // vende 13 articulos.
        if(articulo.venta(13)){
            System.out.println("Venta realizada con exito");
        }else{
            System.err.println("Error en la assignacion, no hay existencias para acometer la operación ");
        }
        
        articulo.imprimir();
        
        // Devolución de los articulos.
        if(articulo.archivar(13)){
            System.out.println("Operación realizada con exito");
        }else{
            System.err.println("Error en la assignacion, datos no válidos. ");
        } 
        
        articulo.imprimir();
        
    }
    
    
}
