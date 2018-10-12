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
public class HoaQua {
    int tongSanPham;
    float sanLuongNhapKhau;
    float sanLuongXuatKhau;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    public void setSanLuongNhapKhau(float sanLuongNhapKhau) {
        this.sanLuongNhapKhau = sanLuongNhapKhau;
    }

    public void setSanLuongXuatKhau(float sanLuongXuatKhau) {
        this.sanLuongXuatKhau = sanLuongXuatKhau;
    }

    public float getSanLuongXuatKhau() {
        return sanLuongXuatKhau;
    }

    public float getSanLuongNhapKhau() {
        return sanLuongNhapKhau;
    }

    public int getTongSanPham() {
        return tongSanPham;
    }

    public void setTongSanPham(int tongSanPham) {
        this.tongSanPham = tongSanPham;
    }
    public void nhanXet(){
        System.out.println("Hoa qua co loi cho suc khoe");
    }
    public boolean ngon(String ngot,String thom,String mongNuoc){
        return(ngot.equals("ngot")&&thom.equals("thom")&&mongNuoc.equals("mong nuoc"));
    }
}
