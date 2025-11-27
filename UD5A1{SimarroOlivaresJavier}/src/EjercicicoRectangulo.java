/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *2.3. Crea un programa con una clase llamada Rectangulo que representará un
 *     rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por
 *     lo que la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
 * 
 *              x1: int
 *              x2: int
 *              y1: int
 *              y2: int
 * 
 *     En el main de la clase principal instancia 2 objetos Rectangulo en 
 *     (0,0)(5,5) y (7,9)(2,3). Muestra por pantalla sus coordenadas,
 *     perímetros (suma de lados) y áreas (ancho x alto). Modifica todas las
 *     coordenadas como consideres y vuelve a imprimir coordenadas,
 *     perímetros y áreas.
 * 
 * @author macky
 */
public class EjercicicoRectangulo {

    public static void main(String[] args){
        
        Rectangulo recta1 = new Rectangulo(0,0,5,5); // Instancia y carga parametros en los objetos rectangulo.

        
        Rectangulo recta2 = new Rectangulo(7,9,2,3);

        // Imprime coordenadas, perímetro y area de los objetos creados.
        System.out.printf("Rectangulo 1 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta1.x1,recta1.y1,recta1.x2,recta1.y2,
        Math.abs(recta1.x1-recta1.x2)*2+Math.abs(recta1.y1-recta1.y2)*2,
        Math.abs(recta1.x1-recta1.x2)*Math.abs(recta1.y1-recta1.y2));
        
        System.out.printf("Rectangulo 2 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta2.x1,recta2.y1,recta2.x2,recta2.y2,
        Math.abs(recta2.x1-recta2.x2)*2+Math.abs(recta2.y1-recta2.y2)*2,
        Math.abs(recta2.x1-recta2.x2)*Math.abs(recta2.y1-recta2.y2));
       
        // Modificación de los parametros de los objetos con valores aceptados.
        recta1.x1 = 3; recta1.y1 = 2;
        recta1.x2 =9; recta1.y2 = 6;
        
        recta2.x1 = 3; recta2.y1 = 7;
        recta2.x2 = 5; recta2.y2 =9;
        
        // Imprime coordenadas, perímetro y area de los objetos con los valores modificados.
        System.out.printf("Rectangulo 1 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta1.x1,recta1.y1,recta1.x2,recta1.y2,
        Math.abs(recta1.x1-recta1.x2)*2+Math.abs(recta1.y1-recta1.y2)*2,
        Math.abs(recta1.x1-recta1.x2)*Math.abs(recta1.y1-recta1.y2));
        
        System.out.printf("Rectangulo 2 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta2.x1,recta2.y1,recta2.x2,recta2.y2,
        Math.abs(recta2.x1-recta2.x2)*2+Math.abs(recta2.y1-recta2.y2)*2,
        Math.abs(recta2.x1-recta2.x2)*Math.abs(recta2.y1-recta2.y2));
                
    }
    
}
