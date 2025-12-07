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
    private static final int MIN = 0, MAX = 100;
    private static boolean error = false;
    
    // Constructor.
    public Rectangulo(int x1, int y1, int x2, int y2){
    
        if(x1 < x2 && y1 < y2){

            if (MIN <= x1 && MAX >= x1){this.x1 = x1;}else{error = true;} 
            if (MIN <= y1 && MAX >= y1){this.y1 = y1;}else{error = true;} 
            if (MIN <= x2 && MAX >= x2){this.x2 = x2;}else{error = true;} 
            if (MIN <= y2 && MAX >= y2){this.y2 = y2;}else{error = true;} 
            
        }else{error = true;} 
        
        if (error){System.err.println("ERROR al instanciar Rectangulo..");}
        error = false;
        
    }
    
    // Setters cambiar Datos
    public void setRectanguloX1 (int x1 ){
        
        if ( x1 < this.x2 && x1 >= MIN && x1<= MAX{
            this.x1 = x1;
         }else{
            System.err.println("ERROR COORDENADA X1 FUERA DE RANGO..");
        }    
        
    }
    
    public void setRectanguloY1 (int y1 ){
        
        if ( y1 < this.y2 && y1>= MIN && y1 <= MAX){
            this.y1 = y1;
         }else{
            System.err.println("ERROR COORDENADA Y1 FUERA DE RANGO..");
        } 

    }

    public void setRectanguloX2 (int x2 ){
        
        if ( x2 < this.x2 && x2 >= MIN && x2<= MAX{
            this.x2 = x2;
         }else{
            System.err.println("ERROR COORDENADA X2 FUERA DE RANGO..");
        }    
        
    }
    
    public void setRectanguloY2 (int y2 ){
        
        if ( y2 < this.y1 && y2 >= min && y2<= max{
            this.y2 = y2;
         }else{
            System.err.println("ERROR COORDENADA Y2 FUERA DE RANGO..");
        } 

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
    
    // Setters multicoordenadas.
    public void setX1Y1(int x, int y){
    
        if(x1 < this.x2 && y1 < this.y2){

            if (MIN <= x1 && MAX >= x1){this.x1 = x1;}else{error = true;} 
            if (MIN <= y1 && MAX >= y1){this.y1 = y1;}else{error = true;} 
            
        }else{error = true;} 
        
        if (error){System.err.println("ERROR al instanciar Rectangulo..");}
        
        error = false;
        
    }
    
    public void setX2Y2(int x, int y){
    
        if(this.x1 < x2 && this.y1 < y2){

            if (MIN <= x2 && MAX >= x2){this.x2 = x2;}else{error = true;} 
            if (MIN <= y2 && MAX >= y2){this.y2 = y2;}else{error = true;} 
            
        }else{error = true;} 
        
        if (error){System.err.println("ERROR al instanciar Rectangulo..");}
        
        error = false;
        
    }
        
    public void setAll(int x1, int y1, int x2, int y2){
    
        if(x1 < x2 && y1 < y2){

            if (MIN <= x1 && MAX >= x1){this.x1 = x1;}else{error = true;} 
            if (MIN <= y1 && MAX >= y1){this.y1 = y1;}else{error = true;} 
            if (MIN <= x2 && MAX >= x2){this.x2 = x2;}else{error = true;} 
            if (MIN <= y2 && MAX >= y2){this.y2 = y2;}else{error = true;} 
            
        }else{error = true;} 
        
        if (error){System.err.println("ERROR DE RANGO DE COORDENADAS");}
        
        error = false;        
        
    }
    
    // Cálculo de Área (suma de lados).
    public int area (){
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
    
    // Cálculo de Perimetro (base x altura).
    public int perimetro (){
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2)) * 2;
    }
   
    public static void hacerRectangulo (){
        
        this.x1 = (int)(Math.random()*100);
        
        
    }
    
}