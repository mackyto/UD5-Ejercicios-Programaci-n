/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;        
    
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
    
    
    public void setPersonaNombre (String nombre){
        this.nombre = nombre;}

    public void setPersonaApellidos (String apellidos){
        this.apellidos = apellidos;}
    
    public void setPersonaDni (String dni){
        if (dni.matches("[0-9]{8}[a-zA-Z]")){this.dni = dni;
        }else{System.err.println("Error al introducir los datos del DNI");
        this.dni = "NULL";}}

    public void setPersonaEdad (int edad){
        this.edad = edad;}
    
    
    
    public String getPersonaNombre (){
        return nombre;}
    
    public String getPersonaApellidos (){
        return apellidos;}
    
    public String getPersonaDni (){
        return dni;}
    
    public int getPersonaEdad (){
        return edad;}
    
}
