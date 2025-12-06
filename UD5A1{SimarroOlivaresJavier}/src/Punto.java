/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 4.1. Añade a la clase Punto los siguientes métodos públicos:
 *
 *        • public void imprime(). Imprime por pantalla las coordenadas.
 *          Ejemplo: “(7,-5)”
 *
 *        • public void setXY(int x, int y). Modifica ambas coordenadas.
 *          Es como un setter doble.
 *
 *        • public void desplaza(int dx, int dy). Desplaza el punto la cantidad 
 *          (dx,dy) indicada. Ejemplo: Si el punto (1,1) se desplaza (2,5)
 *          entonces estará en (3,6).
 *        
 *        • public int distancia(Punto p). Calcula y devuelve la distancia entre
 *          el propio objeto (this) y otro objeto (Punto p) que se pasa como
 *          parámetro: distancia entre dos coordenadas
 * 
 *      Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento
 * 
 * 5.1. Crea un método estático en Punto que se llame crearPuntoAleatorio y que
 *      devuelva un objeto de tipo Punto con unas coordenadas generadas al azar
 *      entre -100 y 100. Para generar un número aleatorio, puedes utilizar la
 *      clase Random, o bien el método estático random() de la clase Math.
 *      Puedes encontrar ejemplos en https://www.baeldung.com/java-generating-random-numbers-in-
 *      range. Crea varios puntos aleatorios en el main y muéstralos por pantalla.
 * 
 * @author macky
 */
public class Punto {
    
    private int x;
    private int y;
    
    // constructor con todos los párametros.
    public Punto(int x, int y){
        this.x =x;
        this.y = y;
    }
    
    // Setters punto X e Y.
    public void setPuntoX (int x){
        this.x = x;
    }
            
    public void setPuntoY (int y){
        this.y = y;
    }
    
    
    // Getters Puntos X e Y.
    public int getPuntoX (){
        return x;
    }
    
    public int getPuntoY (){
        return y;
    }
    
    // Imprime Cooordenadas del punto.
    public void imprime (){
        System.out.println("Las coordenasdas del punto son (" + x + "," + y + ")");
    }
    
    // Setter XY.
    public void setPuntoXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Modificador de desplazamiento.
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    // Obtien la distancia entre dos puntos.
    public double distancia(int x, int y){
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    // Metodo estático para crear puntos aleatorios.
    public static Punto crearPuntoAleatorio() {
        int x = (int)(Math.random() * 202 - 101);
        int y = (int)(Math.random() * 202 - 101);
        return new Punto(x, y);
    }
    
    
}
