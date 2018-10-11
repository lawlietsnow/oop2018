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
public class Main {
    public static void main(String[] args) {
        CamThanhPhong c=new CamThanhPhong();
        Cam cam=new Cam();
        HoaQua h=new HoaQua();
        Tao tao=new Tao();
        h.setTongSanPham(1);
        h.setSanLuongNhapKhau(12345);
        h.setSanLuongXuatKhau(555);
        cam.setTongSanPham(1);
        cam.setSanLuongNhapKhau(12345);
        cam.setSanLuongXuatKhau(555);
        cam.setColor("Vang");
        cam.setGiaBan(2222);
        c.setTongSanPham(1);
        c.setSanLuongNhapKhau(12345);
        c.setSanLuongXuatKhau(555);
        c.setTongSanPham(1);
        c.setSanLuongNhapKhau(12345);
        c.setSanLuongXuatKhau(555);
        c.setColor("Vang");
        c.setGiaBan(2222);
        
    }
}
