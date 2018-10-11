/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author thota
 */
public class Square extends Rectangle{
    private double side;
    public Square(){
        side =1.0;
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
        this.side=side;
        this.setFilled(filled);
        this.setColor(color);
       
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    
    @Override
    public void setLength(double length) {
        super.setLength(length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width); //To change body of generated methods, choose Tools | Templates.
    }
    
}
