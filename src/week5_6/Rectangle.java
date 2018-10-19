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
public class Rectangle extends Shape{
    int x1;
    int y1;
    int x2;
    int y2;
    int widht;
    int heigth;
    public Rectangle(){
        x1=0;
        y1=0;
        x2=0;
        y2=0;
    }
    public Rectangle(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public Rectangle(String color,boolean filled,int x1,int y1,int x2,int y2){
        super(color,filled);
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidht() {
        return widht;
    }

    public int getHeigth() {
        return heigth;
    }
    public void move(){
        System.out.println("Hinh chu nhat da di chuyen");
    }
}
