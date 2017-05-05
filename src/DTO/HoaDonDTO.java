/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author SteelWeapon
 */
public class HoaDonDTO {

    /**
     * @return the MaKhachHang
     */
    public String getMaKhachHang() {
        return MaKhachHang;
    }

    /**
     * @param MaKhachHang the MaKhachHang to set
     */
    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    /**
     * @return the MaKhachHang
     */
    

    /**
     * @return the MaSP
     */
    public String getMaHD() {
        return MaHD;
    }

    /**
     * @param MaSP the MaSP to set
     */
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }
    
    /**
     * @return the MaNV
     */
    public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the NgayNhap
     */
    public String getNgayNhap() {
        return NgayNhap;
    }

    /**
     * @param NgayNhap the NgayNhap to set
     */
    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    /**
     * @return the TongTien
     */
    public int getTongTien() {
        return TongTien;
    }

    /**
     * @param TongTien the TongTien to set
     */
    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    private String MaHD;
    private String MaKhachHang;
    private String MaNV;
    private String NgayNhap;
    private int TongTien;
    
}
