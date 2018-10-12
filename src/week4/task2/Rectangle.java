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
public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){
        width =1.0;
        length=1.0;
    }
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;
       
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "Rectangle";
    }
}
