/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class Persona {
    
    String dni;
    String nombre;
    String apellidos;
    int edad;        
    
    // Constructor todos los parametros. "[0-9]{8}a-zA-Z"
    public Persona(String dni, String nombre, String apellidos, int edad){
    
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    
    public Persona(String dni,String nombre, String apellidos){
    
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
            
    }
                
}
