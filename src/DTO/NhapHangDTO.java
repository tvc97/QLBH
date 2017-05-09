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
public class NhapHangDTO {
    private String MaPNH;
    private String MaNCC;
    private String MaNV;
    private String NgayLap;
    private int TongTien;

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
     * @return the NgayLap
     */
    public String getNgayLap() {
        return NgayLap;
    }

    /**
     * @param NgayLap the NgayLap to set
     */
    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
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
}
