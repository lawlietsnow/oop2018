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
public class Layer {
    List<Shape> shape = new ArrayList<>();
    
    public Layer(){
        shape.add(new Circle());
        shape.add(new Rectangle());
        shape.add(new Square());
    }
}
