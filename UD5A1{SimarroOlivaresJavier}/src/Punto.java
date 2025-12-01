/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class Punto {
    
    private int x;
    private int y;
    
    public Punto(int x, int y){
        this.x =x;
        this.y = y;
        
    }
    
    public void setPuntoX (int x){
        this.x = x;
    }
            
    public void setPuntoY (int y){
        this.y = y;
    }
    
    public int getPuntoX (){
        return x;
    }
    
    public int getPuntoY (){
        return y;
    }
    
}
