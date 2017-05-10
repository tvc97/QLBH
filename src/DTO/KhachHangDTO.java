/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author SocBayMau
 */
public class KhachHangDTO {
    private String MaKH;
    private String TenKH;
    private String DiaChi;
    private String Email;
    private long SĐT;
    private int TongHoaDon;

    /**
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }

    /**
     * @param MaKH the MaKH to set
     */
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    /**
     * @return the TenKH
     */
    public String getTenKH() {
        return TenKH;
    }

    /**
     * @param TenKH the TenKH to set
     */
    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the SDT
     */
    public long getSĐT() {
        return SĐT;
    }

    /**
     * @param SDT the SDT to set
     */
    public void setSĐT(long SĐT) {
        this.SĐT = SĐT;
    }

    /**
     * @return the TongHoaDon
     */
    public int getTongHoaDon() {
        return TongHoaDon;
    }

    /**
     * @param TongHoaDon the TongHoaDon to set
     */
    public void setTongHoaDon(int TongHoaDon) {
        this.TongHoaDon = TongHoaDon;
    }
    
}
