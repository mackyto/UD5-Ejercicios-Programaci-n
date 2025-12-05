/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 2.2. Crea un programa con una clase llamada Persona que representará los
 *      datos principales de una persona: dni, nombre, apellidos y edad. 
 * 
 *              dni: String
 *              nombre: String
 *              apellidos: String
 *              edad: Integer.
 * 
 *      En el main de la clase principal instancia dos objetos de la clase
 *      Persona. Luego, pide por teclado los datos de ambas personas (guárdalos
 *      en los objetos). Por último, imprime dos mensajes por pantalla (uno por
 *      objeto) con un mensaje del estilo “Azucena Luján García con DNI … es/no
 *      es mayor de edad”
 * 
 * @author macky
 */
public class EjercicioPersona {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in); // Declara Instancias Scanner y persona
        
        Persona persona1 = new Persona("Jose","Torres Arcilla","12345678Q",69);
        Persona persona2 = new Persona("","","00000000o");
        
        // Solicita y assigna valores a los atributos de clase del primer objeto
        // System.out.print("Indica el nombre de la primera persona: "); 
        // persona1.setPersonaNombre(kl.nextLine());
        // System.out.print("Indica los apellidos de " + persona1.getPersonaNombre() + ": ");
        // persona1.setPersonaApellidos(kl.nextLine());
        // System.out.print("Indica el dni de " + persona1.getPersonaNombre() + ": ");
        // persona1.setPersonaDni(kl.nextLine());
        // System.out.print("Indica la edad de " + persona1.getPersonaNombre() + ": ");
        // persona1.setPersonaEdad(kl.nextInt());
        
        // kl.nextLine(); // Elimina el bufer de retorno de carro
        
        System.out.print("Indica el nombre de la segunda persona: "); // Solicita y assigna valores a los atributos de clase del segundo objeto
        persona2.setPersonaNombre(kl.nextLine());
        System.out.print("Indica los apellidos de " + persona2.getPersonaNombre() + ": ");
        persona2.setPersonaApellidos(kl.nextLine());
        System.out.print("Indica el dni de " + persona2.getPersonaNombre() + ": ");
        persona2.setPersonaDni(kl.nextLine());
        System.out.print("Indica la edad de " + persona2.getPersonaNombre() + ": ");
        persona2.setPersonaEdad(kl.nextInt());

        System.out.printf("%s %s con DNI %s ", persona1.getPersonaNombre(), persona1.getPersonaApellidos(), persona1.getPersonaDni()); // Imprime los resultados del primer objeto.
        if (persona1.esMayorEdad()){System.out.print("no ");}
        System.out.print("es mayor de edad");
        if (persona1.esjubilado()){System.out.print(" y es jubilado");}        
        System.out.println();
        
        persona2.impresion(); // Imprime los resultados del segundo objeto.
        if (persona2.getPersonaEdad() < 18){System.out.print("no ");}
        System.out.print("es mayor de edad");
        if (persona1.esjubilado()){System.out.print(" y es jubilado");}   
        System.out.println();
        
        System.out.println("y la diferencia de Edad entre ambos es de " + persona1.diferenciaEdad(persona2.getPersonaEdad()) + " años");
        
        kl.close();
        
    }
    
}
