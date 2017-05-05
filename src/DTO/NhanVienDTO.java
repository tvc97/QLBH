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
public class NhanVienDTO {

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
     * @return the TenNV
     */
    public String getTenNV() {
        return TenNV;
    }

    /**
     * @param TenNV the TenNV to set
     */
    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    /**
     * @return the TaiKhoan
     */
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    /**
     * @param TaiKhoan the TaiKhoan to set
     */
    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
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

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
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
     * @return the DienThoai
     */
    public long getDienThoai() {
        return DienThoai;
    }

    /**
     * @param DienThoai the DienThoai to set
     */
    public void setDienThoai(long DienThoai) {
        this.DienThoai = DienThoai;
    }

    /**
     * @return the ChucVu
     */
    public String getChucVu() {
        return ChucVu;
    }

    /**
     * @param ChucVu the ChucVu to set
     */
    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    private String MaNV;
    private String TenNV;
    private String TaiKhoan;
    private String MatKhau;
    private String NgaySinh;
    private String DiaChi;
    private long DienThoai;
    private String ChucVu;
}
