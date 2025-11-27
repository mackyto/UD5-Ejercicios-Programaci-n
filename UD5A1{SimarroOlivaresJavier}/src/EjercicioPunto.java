/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class EjercicioPunto {
    
    public static void main(String[] args){
        
        Punto primer = new Punto();
        primer.x  = 5 ; primer.y = 0;

        Punto segon = new Punto();
        segon.x  = 10 ; segon.y = 10;
        
        Punto tercer = new Punto();
        tercer.x  = -3 ; tercer.y = 7;
        
        
        System.out.println("Las coordenadas del primer punto son (" + primer.x + "," + primer.y + ")");
        System.out.println("Las coordenadas del segundo punto son (" + segon.x + "," + segon.y + ")");
        System.out.println("Las coordenadas del tercer punto son (" + tercer.x + "," + tercer.y + ")");
        
        primer.x++ ; primer.y += 13;
        segon.x  -= 5 ; segon.y /= 3;
        tercer.x  *= 5 ; tercer.y = 3;   
        
        System.out.println();
        
        System.out.println("Las coordenadas modificadas del primer punto son (" + primer.x + "," + primer.y + ")");
        System.out.println("Las coordenadas modificadas del segundo punto son (" + segon.x + "," + segon.y + ")");
        System.out.println("Las coordenadas modificadas del tercer punto son (" + tercer.x + "," + tercer.y + ")");
        
    }
    
}
