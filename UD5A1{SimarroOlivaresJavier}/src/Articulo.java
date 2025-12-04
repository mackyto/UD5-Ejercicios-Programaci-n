/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class Articulo {
    
    private String nombre;
    private double precioSinIva;
    private int iva;
    private int existencias;
    
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
            
        }else{System.err.println("Alguno de los valores nombre, precio, iva o existencias no son válidos.");}
        
    }
    
    public void setArticuloNombre (String nombre){
        if(nombre.matches("[a-zA-Z]+")){this.nombre = nombre;
        }else{System.err.println("¡¡¡ERROR!!! en el nombre");}
    }
    
    public void setArticuloPrecioSinIva (double precioSinIva){
        if(precioSinIva > 0){this.precioSinIva = precioSinIva;
        }else{System.err.println("¡¡¡ERROR!!! en el precio sin iva");}
    }
    
    public void setArticuloIva (int iva){
        if(iva > 0 && iva < 100){this.iva = iva;
        }else{System.err.println("¡¡¡ERROR!!! la fiscalidad no tiene sentido");}
    }
    
    public void setArticuloExistencias (int existencias){
        if(existencias >= 0){this.existencias = existencias;
        }else{System.err.println("¡¡¡ERROR!!! las existencias no pueden ser negativas en este almacén");}
    }
    
    public String getArticulosNombre (){
        return nombre;
    }
    
    public double getArticuloPrecioSinIva (){
        return precioSinIva;
    }
    
    public int getArticuloIva (){
        return iva;
    }
    
    public int getArticuloExistencias (){
        return existencias;
    }
    
}
