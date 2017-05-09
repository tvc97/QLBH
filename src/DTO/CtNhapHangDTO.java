/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author zTNz
 */
public class CtNhapHangDTO {
    private String MaPNH;
    private String MaSanPham;
    private int SoLuong;
    private int DonGia;
    private int ThanhTien;

    /**
     * @return the MaPNH
     */
    public String getMaPNH() {
        return MaPNH;
    }

    /**
     * @param MaPNH the MaPNH to set
     */
    public void setMaPNH(String MaPNH) {
        this.MaPNH = MaPNH;
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
}
