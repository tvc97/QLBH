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
public class CtHoaDonDTO {

    /**
     * @return the MaHD
     */
    public String getMaHD() {
        return MaHD;
    }

    /**
     * @param MaHD the MaHD to set
     */
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    /**
     * @return the MaSanPham
     */
    public String getMaSanPham() {
        return MaSanPham;
    }

    /**
     * @param MaSanPham the MaSanPham to set
     */
    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    /**
     * @return the MaGiamGia
     */
    public String getMaGiamGia() {
        return MaGiamGia;
    }

    /**
     * @param MaGiamGia the MaGiamGia to set
     */
    public void setMaGiamGia(String MaGiamGia) {
        this.MaGiamGia = MaGiamGia;
    }

    /**
     * @return the SoLuong
     */
    public int getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the DonGia
     */
    public int getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the ThanhTien
     */
    public int getThanhTien() {
        return ThanhTien;
    }

    /**
     * @param ThanhTien the ThanhTien to set
     */
    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    private String MaHD;
    private String MaSanPham;
    private String MaGiamGia;
    private int SoLuong;
    private int DonGia;
    private int ThanhTien;
    
}
