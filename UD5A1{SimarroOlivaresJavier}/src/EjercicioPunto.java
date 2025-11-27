/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *.1. Crea un programa con una clase llamada Punto que representará un punto de
 *    dos dimensiones en un plano. Solo contendrá dos atributos enteros
 *    llamados x e y (coordenadas).
 * 
 *          x int
 * 
 *          y int
 * 
 *    En el main de la clase principal instancia 3 objetos Punto con las
 *    coordenadas (5,0), (10,10) y (-3,7). Muestra por pantalla sus coordenadas
 *    (utiliza un println para cada punto). Modifica todas las coordenadas
 *    (prueba distintos operado res como = + - += *=...) y vuelve a imprimirlas
 *    por pantalla
 *  
 * @author macky
 */
public class EjercicioPunto {
    
    public static void main(String[] args){
        
        Punto primer = new Punto(5,0); // Inicia las instancias y carga valores a los objetos con el constructor.
        Punto segun = new Punto(10,10);
        Punto tercer = new Punto(-3,7);
        
        System.out.println("Las coordenadas del primer punto son (" + primer.x + "," + primer.y + ")"); // Imprime los valoresde los objetos. 
        System.out.println("Las coordenadas del segundo punto son (" + segun.x + "," + segun.y + ")");
        System.out.println("Las coordenadas del tercer punto son (" + tercer.x + "," + tercer.y + ")");
        
        primer.x++ ; primer.y += 13; // modifica los parametros iniciales.
        segun.x  -= 5 ; segun.y /= 3;
        tercer.x  *= 5 ; tercer.y = 3;   
        
        System.out.println(); // Separación de objetos.
        
        System.out.println("Las coordenadas modificadas del primer punto son (" + primer.x + "," + primer.y + ")"); // Imprime valores modificados de los objetos.
        System.out.println("Las coordenadas modificadas del segundo punto son (" + segun.x + "," + segun.y + ")");
        System.out.println("Las coordenadas modificadas del tercer punto son (" + tercer.x + "," + tercer.y + ")");
        
    }
    
}
