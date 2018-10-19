/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author CCNE
 */

public class Circle extends Shape {
    final static double PI= 3.14;
    float radius;
    int x;
    int y;
    public Circle() {
        x=0;
        y=0;
        radius=0;
    }
    public Circle(int x,int y,float radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public Circle(String color,boolean filled,int x,int y,float radius){
        super(color,filled);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void move(){
        System.out.println("Hinh tron da di chuyen");
    }

    
}
