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
        Todos todos = new Todos();
        int i = 1;
        
        System.out.printf("Empresa. \t\t\t\t\t\t\t\t\t Trabajador\n");
        System.out.printf("MAZCU.FIT S.L. \t\t\t\t\t\t\t\t\t %s\n", todos.getPersonal().get(i).getNombreCompleto());
        System.out.printf("Dirección de Empresa \t\t\t\t\t\t\t\t %s, %d\n", todos.getPersonal().get(i).getCalle(), todos.getPersonal().get(i).getNumero());
        System.out.printf("46940 Manises (Valencia)\t\t\t\t\t\t\t %d %s %s\n", todos.getPersonal().get(i).getCp(), todos.getPersonal().get(i).getCiudad(), todos.getPersonal().get(i).getProvincia());
        System.out.printf("CIF: A12345678 \t\t\t\t\t\t\t\t\t NIF: %s\t NSS: %s\n\n", todos.getPersonal().get(i).getDni(), todos.getPersonal().get(i).getNss());
        System.out.printf("Cuenta de Contratación \t\t\t\t\t\t\t\t\t Puesto %s\n\n", todos.getPersonal().get(i).getDni(), todos.getPersonal().get(i).getNss());     
        
    } 

}
