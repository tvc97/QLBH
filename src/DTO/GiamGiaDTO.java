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
public class GiamGiaDTO {

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
     * @return the MucGiam
     */
    public int getMucGiam() {
        return MucGiam;
    }

    /**
     * @param MucGiam the MucGiam to set
     */
    public void setMucGiam(int MucGiam) {
        this.MucGiam = MucGiam;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    /**
     * @return the HanDung
     */
    public String getHanDung() {
        return HanDung;
    }

    /**
     * @param HanDung the HanDung to set
     */
    public void setHanDung(String HanDung) {
        this.HanDung = HanDung;
    }
    private String MaGiamGia;
    private int MucGiam;
    private String GhiChu;
    private String HanDung;
            
}
