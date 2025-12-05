/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 4.2. Añade a la clase Persona los siguientes métodos públicos: 
 * 
 *           • public void imprime() Imprime la información del objeto: “DNI:… Nombre:… etc.” 
 *           • public boolean esMayorEdad() Devuelve true si es mayor de edad (false si no).
 *           • public boolean esJubilado() Devuelve true si tiene 65 años o más (false si no).
 *           • public int diferenciaEdad(Persona p) Devuelve la diferencia de edad entre ‘this’ y p. Pág. 8 de 10
 * 
 *      Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento
 * 
 * @author macky
 */
public class Persona {
    
    // Datos almacenados
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;        
    
    // Constructor todos los parametros. con match "[0-9]{8}a-zA-Z" para el DNi.
    public Persona(String dni, String nombre, String apellidos, int edad){
    
        if (dni.matches("[0-9]{8}[a-zA-Z]")){this.dni = dni;
        }else{System.err.println("Error al introducir los datos del DNI");
        this.dni = "NULL";}
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    
    // Constructor solo datos sin edad y match en DNI.
    public Persona(String dni, String nombre, String apellidos){
    
        if (dni.matches("[0-9]{8}[a-zA-Z]")){this.dni = dni;
        }else{System.err.println("Error al introducir los datos del DNI");
        this.dni = "NULL";}
        this.nombre = nombre;
        this.apellidos = apellidos;
            
    }
    
    // Setters de entrada
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
    
    
    // Getters de salida
    public String getPersonaNombre (){
        return nombre;}
    
    public String getPersonaApellidos (){
        return apellidos;}
    
    public String getPersonaDni (){
        return dni;}
    
    public int getPersonaEdad (){
        return edad;}
    
    // Impresion de datos.
    public void impresion(){
        System.out.printf("%s %s con DNI %s con %d años de edad", nombre, apellidos, dni, edad);
    }
    
    // ¿Mayor de edad?
    public boolean esMayorEdad (){
        return (edad >= 18); 
    }
   
    // ¿Es jubilado?
    public boolean esjubilado (){
        return (edad >= 65); 
    }
         
    public int diferenciaEdad (int edad){
        return Math.abs(this.edad - edad);
        
    }
    
}
