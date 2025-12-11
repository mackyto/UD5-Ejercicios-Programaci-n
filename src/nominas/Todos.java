/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nominas;

import java.util.ArrayList;

/**
 *
 * @author macky
 */
public class Todos {
               
    private ArrayList<Empleado> personal = new ArrayList<>();
    
    public Todos() {
    
        personal = new ArrayList<>();
        inicializarEmpleados();
    
    }
    
    private void  inicializarEmpleados(){
        
        Empleado cain = new Empleado( "Cain", "Jefe Primus", "12345678Z", "46/01234567/89", "Del bosque", 25, "Manises", "Valencia", 46104, 5, 1, 1, 4, "CEO"); 
        Empleado sporticus = new Empleado("Sporticus","Broncas Siempre","29160712R","46/01234568/89","Colon", 9, "Puzol", "Valencia", 46560, 3, 2, 1, 4, "IT"); 
        Empleado other = new Empleado("Other", "Can Throw","12345689J","46/01234567/89","Jarafuel", 25, "Manises", "Valencia", 46104, 5, 5, 1, 4, "Auxiliar");
        
        personal.add(cain);
        personal.add(sporticus);
        personal.add(other);

        System.out.println("Se han añadido " + personal.size() + " empleados");
        
    } 
    
    public ArrayList<Empleado> getPersonal() {
    
        return personal;
    
    }
    
}
