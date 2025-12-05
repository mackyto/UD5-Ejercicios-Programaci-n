/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * 4.3. Añade a la clase Rectángulo métodos públicos con las siguientes 
 *      funcionalidades: 
 *      
 *          • Método para imprimir la información del rectángulo por pantalla. 
 *          • Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(…)
 *          • Métodos getPerimetro y getArea que calculen y devuelvan el perímetro y área del objeto.
 * 
 *      Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento
 * 
 * 
 * @author macky
 */
public class Rectangulo {
    
    // Datos de la clase
    private int x1, y1;
    private int x2, y2; 
    
    // Constructor.
    public Rectangulo(int x1, int y1, int x2, int y2){
    
        if(x1 < x2 && y1 < y2){

            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
            
        }else{System.err.println("ERROR al instanciar Rectangulo..");}
        
    }
    
    // Setters cambiar Datos
    public void setRectanguloX1 (int x1 ){
        
        if ( x1 > this.x2){
            System.err.println("ERROR COORDENADA X1 FUERA DE RANGO..");
        }else{this.x1 = x1;}    
        
    }
    
    public void setRectanguloY1 (int y1 ){
        
        if ( y1 > this.y2){
            System.err.println("ERROR COORDENADA Y1 FUERA DE RANGO..");
        }else{this.y1 = y1;}

    }

    public void setRectanguloX2 (int x2 ){
        
        if ( x2 < this.x1){
            System.err.println("ERROR COORDENADA X2 FUERA DE RANGO..");
        }else{this.x2 = x2;}    
        
    }
    
    public void setRectanguloY2 (int y2 ){
        
        if ( y2 < this.y1){
            System.err.println("ERROR COORDENADA Y2 FUERA DE RANGO..");
        }else{this.y2 = y2;}

    }

    
    // Getters Sacar Datos
    public int getRectanguloX1 (){        
        return x1;
    }
    
    public int getRectanguloY1 (){
        return y1;
    }

    public int getRectanguloX2 (){        
        return x2;
    }
    
    public int getRectanguloY2 (){
        return y2;
    }

    // Impresión de Datos.
    public void impresionDatos(){
        System.out.printf("Rectangulo p1(%d,%d) p2(%d,%d)\n\n", x1, y1, x2, y2); 
    }
    
    public void setX1Y1(int x, int y){
        this.x1 = x; this.y1 = y;
    }
    
    public void setX2Y2(int x, int y){
        this.x2 = x; this.y2 = y;
    }
        
    public void setAll(int x1, int y1, int x2, int y2){
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
    }
    
    public int area (){
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
    
    public int perimetro (){
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2)) * 2;
    }
    
}