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
 * 
 *  
 * @author macky
 */
public class EjercicioPunto {
    
    public static void main(String[] args){
        
        // Inicia las instancias y carga valores a los objetos con el constructor.
        Punto primer = new Punto(5,0); 
        Punto segun = new Punto(10,10);
        Punto tercer = new Punto(-3,7);
        
        // Imprime los valoresde los objetos. 
        System.out.println("Las coordenadas del primer punto son (" + primer.getPuntoX() + "," + primer.getPuntoY() + ")");
        System.out.println("Las coordenadas del segundo punto son (" + segun.getPuntoX() + "," + segun.getPuntoY() + ")");
        System.out.println("Las coordenadas del tercer punto son (" + tercer.getPuntoX() + "," + tercer.getPuntoY() + ")");
        
        // modifica los parametros iniciales.
        primer.setPuntoX(primer.getPuntoX() + 1); 
        primer.setPuntoY(primer.getPuntoY() + 13);
        segun.setPuntoX(segun.getPuntoX() - 6); 
        segun.setPuntoY(segun.getPuntoY() * 3);
        tercer.setPuntoX(tercer.getPuntoX() / 2); 
        tercer.setPuntoY(tercer.getPuntoY() - 1);
       
        // Separación de objetos.
        System.out.println();
        
        // Imprime valores modificados de los objetos.
        System.out.println("Las coordenadas modificadas del primer punto son (" + primer.getPuntoX() + "," + primer.getPuntoY() + ")");
        System.out.println("Las coordenadas modificadas del segundo punto son (" + segun.getPuntoX() + "," + segun.getPuntoY() + ")");
        System.out.println("Las coordenadas modificadas del tercer punto son (" + tercer.getPuntoX() + "," + tercer.getPuntoY() + ")");
        
        // Separación de objetos.
        System.out.println();
        
        // Prueba el método desplazamiento.
        primer.desplaza(3, -2); segun.setPuntoXY(-5, 2); tercer.desplaza(0, 4);

        // Prueba del método  puntoImpresión.
        primer.imprime(); segun.imprime(); tercer.imprime();
        
        // Prueba el método distancia.
        System.out.println("Distancia entre el punto uno y el punto tres = " + primer.distancia(tercer.getPuntoX(), tercer.getPuntoY()));
        
        // Prueba del metodo estático para crear puntos.
        Punto p1 = Punto.crearPuntoAleatorio();
        Punto p2 = Punto.crearPuntoAleatorio();
        Punto p3 = Punto.crearPuntoAleatorio();        
        
        // Imprime datos de los objetos creados aleatoriamnete.
        System.out.println();System.out.println();
        p1.imprime();p2.imprime();p3.imprime();
        
    }
    
}
