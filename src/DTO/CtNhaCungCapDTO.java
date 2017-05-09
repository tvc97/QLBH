/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HeoBayMau
 */
public class CtNhaCungCapDTO {
    private String MaNCC;
    private String MaSanPham;
    private String TenSanPham;

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    /**
     * @return the MaNCC
     */
    public String getMaNCC() {
        return MaNCC;
    }

    /**
     * @param MaNCC the MaNCC to set
     */
    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
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
}
