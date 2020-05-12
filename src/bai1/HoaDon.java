/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ngoc
 */
public class HoaDon {
    String maHoaDon, tenKhachHang;
    Date ngayBan;
    
    ArrayList<CTHD> cthd = new ArrayList<>();
    
    protected HoaDon(HoaDonHeader header) {
        this.maHoaDon = header.maHoaDon;
        this.tenKhachHang = header.tenKhachHang;
        this.ngayBan = header.ngayBan;
    }

    
    public void addCTHD(CTHD hd){
        cthd.add(hd);
    }
    
    public String getCTHD(CTHD hd)
    {
        return "ten: " + hd.sanPham+
                "So Luong: " + hd.soLuong + 
                "Gia: " + hd.donGia +
                "Chiet khau: " + hd.chietKhau ;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", tenKhachHang=" + tenKhachHang + ", ngayBan=" + ngayBan + '}';
    }
    
    public static class HoaDonHeader{
        String maHoaDon, tenKhachHang;
        Date ngayBan;

        public HoaDonHeader() {
        }
        
        public HoaDonHeader addMaHoaDon(String maHoaDon){
            this.maHoaDon = maHoaDon;
            return this;
        }
        
        public HoaDonHeader addTenKhachHang(String tenKhachHang){
            this.tenKhachHang = tenKhachHang;
            return this;
        }
        
        public HoaDonHeader addNgayBan(Date ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
            
    public static class CTHD{
        String sanPham;
        int soLuong, donGia, chietKhau;

        public CTHD() {
        }
        
        public CTHD addSanPham(String sanPham){
            this.sanPham = sanPham;
            return this;
        }
        
        public CTHD addSoLuong(int soLuong){
            this.soLuong = soLuong;
            return this;
        }
        
        public CTHD addDonGia(int donGia){
            this.donGia = donGia;
            return this;
        }
        
        public CTHD addChietKhau(int chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }
        

        
        public CTHD getCTHD(){
            return this;
        }
    }
}
