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
public class Shape {
    private String  color;
    private boolean filled;

    public Shape() {
        color = "";
        filled=false;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Shape";
    }

}
