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
public class Circle extends Shape {
    final double PI=3.14;
    private double radius=1.0;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        
        this.radius=radius;
        
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    @Override
    public String toString(){
        return "Circle";
    }
}
