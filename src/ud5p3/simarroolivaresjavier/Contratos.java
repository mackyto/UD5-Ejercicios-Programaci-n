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
public class Contratos {
    
    private int id;
    private LocalDate fechaFirma;
    private LocalDate fechaFinal;
    private double importe;
    private Viviendas vivienda;
    private Clientes cliente;
    
    private int idProximo = 10000;
    
    public Contratos (LocalDate fechaFirma, LocalDate fechaFinal, double importe, Viviendas vivienda, Clientes cliente){
        
        this.fechaFirma = fechaFirma;
        this.fechaFinal = fechaFinal;
        this.importe = importe;
        this.vivienda = vivienda;
        this.cliente = cliente;
        
        id = idProximo++;
        
    }


    
    
}
