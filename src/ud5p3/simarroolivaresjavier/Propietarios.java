/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p3.simarroolivaresjavier;

/**
 *
 * @author macky
 */
public class Propietarios {
    
    private String nombre;
    private String apellidos;
    private double balance;
    private Viviendas vivienda;
    

    // Constructor.
    public Propietarios (String nombre, String apellidos, double balance, Viviendas vivienda){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.balance = balance;
        this.vivienda = vivienda;
                 
    } 
    
    // Setters.
    public void setNombre (String nombre){
       
        this.nombre = nombre;
        
    }
        
    public void setapellidos (String apellidos){
        
        this.apellidos = apellidos;
            
    }
        
    public void setBalance (double balance){
        
        this.balance = balance;
    
    }
        
    public void settVivienda (Viviendas vivienda){
        
        this.vivienda = vivienda;
    
    }
    
    
    // Getters.   
    public String getNombre (String nombre){
       
        return nombre;
        
    }
        
    public String getapellidos (String apellidos){
        
        return apellidos;
            
    }
        
    public double getBalance (double balance){
        
        return balance;
    
    }
        
    public Viviendas getVivienda (Viviendas vivienda){
        
        return vivienda;
    
    }
    
    
    
        
}
