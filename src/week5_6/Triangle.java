/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape{
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    public Triangle(){
        x1=0;
        x2=0;
        x3=0;
        y1=0;
        y2=0;
        y3=0;
    }
    public Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }
    public Triangle(String color,boolean filled,int x1,int y1,int x2,int y2,int x3,int y3){
        super(color,filled);
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }
    public void setPoint1(int x1,int y1){
        this.x1=x1;
        this.y1=y1;
    }
    public void setPoint2(int x2,int y2){
        this.y2=y2;
        this.x2=x2;
    }
    public void setPoint3(int x3,int y3){
        this.x3=x3;
        this.x3=x3;
    }
    public void move(){
        System.out.println("Hinh tam giac da di chuyen");
    }
}
