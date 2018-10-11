/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author thota
 */
public class Cam extends HoaQua {
    String color;
    String noiTrong[] = new String[]{"Hoa Binh", "Ha Giang", "Ha Tinh"};
    float giaBan;
    //String noiTrong[]={"Hoa Binh", "Ha Giang", "Ha Tinh"};

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    public void muaThuHoach(){
        System.out.println("Cuoi Thang 10, dau thang 11");
    }

    public String[] getNoiTrong() {
        return noiTrong;
    }

    public void setNoiTrong(String[] noiTrong) {
        this.noiTrong = noiTrong;
    }
    
    @Override
    public void nhanXet(){
        System.out.println("Chua nhieu vitamin C\nCo loi cho suc khoe");
    }
}
