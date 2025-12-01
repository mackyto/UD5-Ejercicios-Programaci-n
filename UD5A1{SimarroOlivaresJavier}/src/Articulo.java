/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class Articulo {
    
    String nombre;
    double precioSinIva;
    int iva;
    int existencias;
    
    public Articulo(String nombre, double precioSinIva, int iva, int existencias){
        
        // Verificación de datos.
        //
        //      Nombre, solo texto, 1 caracter mínimo.
        //      precioSinIva, valor mayor que cero.
        //      existencias, valor positivo.
        //      iva, valor positivo.
        //
        if(nombre.matches("[a-zA-Z]+") && precioSinIva >= 10 && existencias > 0 && iva > 0){
            
            this.nombre = nombre;
            this.precioSinIva = precioSinIva;
            this.iva = iva;
            this.existencias = existencias;
            
        }else{System.out.println("Alguno de los valores nombre, precio, iva o existencias no son válidos.");}
        
    }
    
    
}
