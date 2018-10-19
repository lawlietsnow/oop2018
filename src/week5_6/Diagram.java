/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CCNE
 */
public class Diagram  {
    List<Layer> listLayer=new ArrayList<>();
    Layer layer=new Layer();
    Layer layer1=new Layer();
    
    public Diagram(){
        listLayer.add(layer);
        listLayer.add(layer1);
    }
    
    public static void main(String[] args) {
        Circle c=new Circle();
        c.move();
        Layer layer=new Layer();
        
    }
}
