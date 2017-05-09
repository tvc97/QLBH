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
public class NhaCungCapDTO {
    private String MaNCC;
    private String TenNCC;
    private String DiaChi;
    private String Email;
    private long sdt;

    /**
     * @return the MaNCC
     */
    public String getMaNCC() {
        return MaNCC;
    }

    /**s
     * @param MaNCC the MaNCC to set
     */
    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    /**
     * @return the TenNCC
     */
    public String getTenNCC() {
        return TenNCC;
    }

    /**
     * @param TenNCC the TenNCC to set
     */
    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
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
     * @return the sdt
     */
    public long getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(long sdt) {
        this.sdt = sdt;
    }
}
