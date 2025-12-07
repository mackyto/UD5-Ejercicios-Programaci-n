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
        recta1.getRectanguloX1(),recta1.getRectanguloY1(),recta1.getRectanguloX2(),recta1.getRectanguloY2(),
        recta1.perimetro(),recta1.area());
        
        System.out.printf("Rectangulo 2 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta2.getRectanguloX1(),recta2.getRectanguloY1(),recta2.getRectanguloX2(),recta2.getRectanguloY2(),
        recta2.perimetro(), recta2.area());
       
        // Modificación de los parametros de los objetos con valores aceptados.
        recta1.setAll(1,4,5,8);
        
        recta2.setX1Y1(3,7);
        recta2.setX2Y2(5,9);
        
        // Imprime coordenadas, perímetro y area de los objetos con los valores modificados.
        System.out.printf("Rectangulo 1 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta1.getRectanguloX1(),recta1.getRectanguloY1(),recta1.getRectanguloX2(),recta1.getRectanguloY2(),
        recta1.perimetro(),recta1.area());
        
        System.out.printf("Rectangulo 2 coordenadas (%d,%d),(%d,%d); Perímetro %dcm, Area %dcm2\n\n",
        recta2.getRectanguloX1(),recta2.getRectanguloY1(),recta2.getRectanguloX2(),recta2.getRectanguloY2(),
        recta2.perimetro(),recta2.area());
                
    }

}
