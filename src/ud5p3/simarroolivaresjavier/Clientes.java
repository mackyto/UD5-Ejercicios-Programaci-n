/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5p3.simarroolivaresjavier;

import java.time.LocalDate;

/**
 *
 * @author macky
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
        
        
        
        
    }
    
    
    
}
