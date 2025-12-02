/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author macky
 */
public class Rectangulo {
    
    int x1, x2;
    int y1, y2; 
    
    public Rectangulo(int x1, int y1, int x2, int y2){
    
        if(x1 < x2 && y1 < y2){

            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
            
        }else{System.err.println("ERROR al instanciar Rectangulo..");}
        
    }
    
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

}