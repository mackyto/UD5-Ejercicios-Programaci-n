/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nominas;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author macky
 */
public class pruebas {

    public static void main(String[] args) {

        Tabla tS25 = new Tabla();
        Cotizacion cc = new Cotizacion();
        Complementos cpt = new Complementos();
        LocalDate fechaActual = LocalDate.now();
                
        String nombre, apellidos;
        String dni;
        int categoria, grupo;
        int trienios;
    
        System.out.println(tS25.getBase(4,1));
        
        System.out.println(cc.getBaseMinima(cc.getTramo(2157.85)));
        System.out.println(cc.getBaseMaxima(cc.getTramo(2157.85)));
        System.out.println(cc.getTramoMinimo(cc.getTramo(2157.85)));
        System.out.println(cc.getTramoMaximo(cc.getTramo(2157.85)));
        
        System.out.println(cpt.getComplementoDestino());
        System.out.println(cpt.getComplementoEspecifico(3));


        Month mes = fechaActual.getMonth();
        
        System.out.println(fechaActual.getYear());
        System.out.println(fechaActual.getMonthValue());
        System.out.println(mes);        
        
        Todos todos = new Todos();
        
        System.out.println(todos.getPersonal().get(1).getNombreCompleto());
        
        
    } 

}
