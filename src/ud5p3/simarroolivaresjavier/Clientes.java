/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p3.simarroolivaresjavier;

import java.time.LocalDate;

/**
 *
 * @author macky
 * 
 */

public class Clientes {
    
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private double nomina;
    private double balance;
    private Contratos contrato;
    
    public Clientes(String nombre, String apellidos, LocalDate fechaNacimiento, double nomina, double balance, Contratos contrato){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nomina = nomina;
        this.balance = balance;
        this.contrato = contrato;
              
    }

    public Clientes(String nombre, String apellidos, LocalDate fechaNacimiento, double nomina, double balance){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nomina = nomina;
        this.balance = balance;
              
    }    
    
    
    // Setters.
    public void setNombre (String nombre){
    
        this.nombre = nombre;
        
    }
    
    public void setApellidos (String apellidos){
    
        this.apellidos = apellidos;
    
    }

    public void setFechaNacimiento (LocalDate fechaNacimiento){
        
        this.fechaNacimiento = fechaNacimiento;
    
    }
    
    public void setNomina (double nomina){
        
        this.nomina = nomina;
        
    }
    
    public void setBalance (){
    
        this.balance = balance;
        
    }
    
    public void setconttrato (Contratos contrato){
    
        this.contrato = contrato;
    
    }
    
    
    // Getters.
    public String getNombre (){
    
        return nombre;
        
    }
    
    public String getApellidos (){
    
        return apellidos;
    
    }

    public LocalDate getFechaNacimiento (){
        
        return fechaNacimiento;
    
    }
    
    public double getNomina (){
        
        return nomina;
        
    }
    
    public double getBalance (){
    
        return balance;
        
    }
    
    public Contratos getcontrato (){
    
        return contrato;
    
    }
    
    
}
