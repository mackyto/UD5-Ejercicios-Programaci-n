/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package nominas;

/**
 * 
 * 
 * 
 * @author macky
 */

public class Nominas {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Tabla tS25 = new Tabla();
        Cotizacion cc = new Cotizacion();
        Complementos cpt = new Complementos();
        
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

    }
    
}
