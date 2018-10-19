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
public class Square extends Rectangle {
    int side;
    public Square(){
        side=0;
    }
    public Square(int side){
        super.setWidht(side);
        super.setHeigth(side);
        this.side=side;
    }
    public Square(String color,boolean filled,int x1,int y1,int x2,int y2,int side){
        super(color,filled,x1,y1,x2,y2);
        this.side=side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void move(){
        System.out.println("Hinh vuong da di chuyen");
    }
}
