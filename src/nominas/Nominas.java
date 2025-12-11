/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package nominas;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

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

        // Instancia las clases de datos.
        Tabla tS25 = new Tabla();
        Cotizacion cc = new Cotizacion();
        Complementos cpt = new Complementos();
        LocalDate fechaActual = LocalDate.now();
        Todos todos = new Todos();                
        Scanner kl = new Scanner(System.in);
        
        //Declara las variables.
        int i;
        
        System.out.println("Indique La opción:");
        System.out.println();
        System.out.println("1 - Imprimir nómina");
        System.out.println();
        System.out.println("2 - Añadir Datos");
        System.out.println();
        System.out.println("3 - Terminar");

        int opcion = kl.nextInt();
        
        switch (opcion) {
        
        case 1: 
        
        case 2: 
    
        case 3: break;
        
        default: System.out.println("opcion no valida"); 

        }
    
    }    
        
    
    public int seleccionarDatos(){
        
        Todos todos = new Todos();  
        Scanner kl = new Scanner(System.in);
        int i, seleccion;
        
        System.out.println();System.out.println();
        System.out.println("Empleado");
        System.out.println();
        
        for (i = 0; i < todos.getPersonal().size(); i++){
        
            System.out.printf("%d - %s", i + 1, todos.getPersonal().get(i).getNombreCompleto());
        
        }
        do{

            seleccion = kl.nextInt() - 1;
                     
        }while(seleccion < 0 || seleccion < todos.getPersonal().size());
        
        return seleccion;
        
    }
    
    public void imprimirNomina(){
        
        Todos todos = new Todos();  
        Scanner kl = new Scanner(System.in);
        int i = seleccionarDatos();
                
        System.out.printf("Empresa. \t\t\t\t\t\t\t Trabajador\n");
        System.out.printf("MAZCU.FIT S.L. \t\t\t\t\t\t\t %s\n\n", todos.getPersonal().get(1).getNombreCompleto());
                
                
        
    }


    
        
}
