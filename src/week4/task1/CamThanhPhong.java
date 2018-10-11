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
public class CamThanhPhong extends Cam {
    
    @Override
    public void nhanXet(){
        System.out.println("Gia ca\nQua to\nVi ngot, ngon\nMua thu hoach dai\nDac san cua Viet Nam");
    }

    
    @Override
    public void muaThuHoach() {
        System.out.println("Dau thang 10 den cuoi thang 11");
    }
    //Constructor
    CamThanhPhong(){
        this.ngon("ngot", "thom", "mong nuoc");
        this.setColor("Vang tuoi");
        tongSanPham=0;
        sanLuongNhapKhau=0;
        sanLuongXuatKhau=0;
        giaBan=0;
        String s[]={"Hoa Binh"};
        this.setNoiTrong(s);
    }
}
