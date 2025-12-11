/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nominas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macky
 */
public class pruebas {

    public static void main(String[] args) {

        
        Todos todos = new Todos();  
        Scanner kl = new Scanner(System.in);
        int i, seleccion;
        
        System.out.println();System.out.println();
        System.out.println("Empleado");
        System.out.println();
        
        for (i = 0; i < todos.getPersonal().size(); i++){
        
            System.out.printf("%d - %s\n\n", i + 1, todos.getPersonal().get(i).getNombreCompleto());
        
        }
        do{

            seleccion = kl.nextInt();
                     
        }while(seleccion <= 0 || seleccion > todos.getPersonal().size());
        
       // return seleccion - 1;
        
    } 

}
