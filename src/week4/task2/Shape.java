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
public class Shape {
    private String color="red";
    private boolean filled=false;
    public Shape(){
        color="0";
        filled = false;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
        
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
}
