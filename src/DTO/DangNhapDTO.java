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
public class DangNhapDTO {

    /**
     * @return the TenDangNhap
     */
    public String getTenDangNhap() {
        return TenDangNhap;
    }

    /**
     * @param TenDangNhap the TenDangNhap to set
     */
    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    /**
     * @return the MatKhau
     */
    public String getMatKhau() {
        return MatKhau;
    }

    /**
     * @param MatKhau the MatKhau to set
     */
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    private String TenDangNhap;
    private String MatKhau;
}
