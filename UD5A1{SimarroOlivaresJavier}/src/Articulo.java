/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 4.4. Añade a la clase Artículo métodos públicos con las siguientes funcionalidades:
 * 
 *         • Método para imprimir la información del artículo por pantalla.
 *         • Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
 *         • Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
 *         • Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario).
 *         • Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario).
 * 
 * @author macky
 */
public class Articulo {
    
    // Datos de la clase
    private String nombre;
    private double precioSinIva;
    private int iva;
    private int existencias;
    
    // Constructor completo de objeto.
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
    
    // Setters recarga de Datos.
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
    
    // Getters salida de Datos.
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
    
    // Imprimir Datos.
    public void imprimir(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio sin iva: " + precioSinIva);
        System.out.println("Iva: " + iva);
        System.out.println("Exixtencias: " + existencias);
        System.out.println("------------------------------------------------------------");
    }
    
    // calcula precio mas iva
    public double getPVP(){
        return precioSinIva + precioSinIva * iva /100;
    }
    
    // Calcula el precio mas iva con descuento
    public double getPVPDescuento(int descuento){
        double precioDescuento =  precioSinIva - precioSinIva * descuento /100;
        return precioDescuento + precioDescuento * iva /100; 
    }
    
    // Elimina unidades de inventario si es posible.
    public boolean venta(int cantidad){
        if (existencias >= cantidad && cantidad > 0){
            existencias -= cantidad;
            return true;
        }else{return false;}
    }
    
    // Añade unidades al inventario siempre que sea posible.
    public boolean archivar(int cantidad){
        if (cantidad > 0){
            existencias += cantidad;
            return true;
        }else{return false;}
    }
    
}
