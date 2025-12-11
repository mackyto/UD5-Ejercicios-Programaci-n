/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nominas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

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
        System.out.printf("Cuenta de Contratación \t\t\t\t\t\t\t\t Puesto \t %s\n", todos.getPersonal().get(i).getPuesto());     
        System.out.printf("46 / 1234567 / 25 \t\t\t\t\t\t\t\t Grupo %d   Nivel %d   Categoria %d\n\n", todos.getPersonal().get(i).getGrupo(),todos.getPersonal().get(i).getNivel(), todos.getPersonal().get(i).getCategoria());
        int dias = fechaActual.lengthOfMonth();
        Month mesActual = fechaActual.getMonth();
        String mes = mesActual.getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.printf("Periodo de liquidación\t 1/ %s/ %d     al     %d/ %s/ %d\t\t\tNº de días %d\n\n\n", mes, fechaActual.getYear(), dias, mes, fechaActual.getYear(), dias);
        
        System.out.printf("Clave  Concepto \t\t\t\t\t\t Cantidad \t Importe \t Retenciones\n\n");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        
        
        
        
    } 

}
