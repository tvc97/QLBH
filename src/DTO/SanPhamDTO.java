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
public class SanPhamDTO {

    /**
     * @return the MaSP
     */
    public int getMaSP() {
        return MaSP;
    }

    /**
     * @param MaSP the MaSP to set
     */
    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    /**
     * @return the TenSP
     */
    public String getTenSP() {
        return TenSP;
    }

    /**
     * @param TenSP the TenSP to set
     */
    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
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
     * @return the SoLuongCo
     */
    public int getSoLuongCo() {
        return SoLuongCo;
    }

    /**
     * @param SoLuongCo the SoLuongCo to set
     */
    public void setSoLuongCo(int SoLuongCo) {
        this.SoLuongCo = SoLuongCo;
    }
    private int MaSP;
    private String TenSP;
    private String DonViTinh;
    private int DonGia;
    private int SoLuongCo;

}   