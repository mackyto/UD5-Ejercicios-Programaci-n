/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 */
package ud5p3.simarroolivaresjavier;

/**
 *
 * @author macky
 *
 */

public class Viviendas {

    private String direccion;
    private double tamaño;
    private int habitaciones;
    private int baños;
    private Contratos contrato;
    private Propietarios propietario;
    
    // Constructor.
    public Viviendas (String direccion, double tamaño, int habitaciones, int baños, Contratos contrato, Propietarios propietario){
        
        this.direccion = direccion;
        this.tamaño = tamaño;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.contrato = contrato;
        this.propietario = propietario;        
        
    }

        // Setters.
        public void setDireccion (String direccion){
        
            this.direccion = direccion;
        
        }
        
        public void setTamaño (double tamaño){
        
            this.tamaño = tamaño;
        
        }
        
        public void setHabitaciones (int habitaciones){
        
            this.habitaciones = habitaciones;
        
        }
        
        public void setBaños (int baños){
        
            this.baños = baños;
        
        }

        public void setConttrato (Contratos contrato){
        
            this.contrato = contrato;
        
        }
        
        public void setPropietario (Propietarios propietario){
        
            this.propietario = propietario;  
        
        }
    
        // Getteres.
        public String getDireccion (){
        
            return direccion;
        
        }
        
        public double getTamaño (){
        
            return tamaño;
        
        }
        
        public int getHabitaciones (){
        
            return habitaciones;
        
        }
        
        public int getBaños (){
        
            return baños;
        
        }

        public Contratos getContrato (){
        
            return contrato;
        
        }
        
        public Propietarios getPropietario (){
        
            return propietario;  
        
        }        
        
        
        
        
}
