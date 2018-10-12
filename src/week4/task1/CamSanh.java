/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author CCNE
 */
public class CamSanh extends Cam {
    public CamSanh(){
        this.setName("Cam Sanh");
        this.setColor("Xanh");
    }
    @Override
    public void nhanXet(){
        System.out.println("Cam pho bien nhat Viet Nam");
    }
    
}
