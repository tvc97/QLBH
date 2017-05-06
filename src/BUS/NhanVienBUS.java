/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.NhanVienDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author HeoBayMau
 */
public class NhanVienBUS {
    MYSQLUnit connect;
    public NhanVienBUS()
    {
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<NhanVienDTO>getNhanVien(String Condition, String OrderBy) throws Exception{
        ResultSet result = connect.Select("nhanvien", Condition, OrderBy);
        ArrayList<NhanVienDTO> NVs = new ArrayList<NhanVienDTO>();
        while(result.next()){
            NhanVienDTO nv = new NhanVienDTO();
            nv.setMaNV(result.getString("MaNV"));
            nv.setTenNV(result.getString("TenNV"));
            nv.setTaiKhoan(result.getString("TaiKhoan"));
            nv.setNgaySinh(result.getString("NgaySinh"));
            nv.setDiaChi(result.getString("DiaChi"));
            nv.setDienThoai(result.getLong("DienThoai"));
            nv.setChucVu(result.getString("ChucVu"));
            nv.setRole(result.getString("Role"));
            NVs.add(nv);
        }
       
        return NVs;
    }
    public ArrayList<NhanVienDTO>getNhanVien(String Condition) throws Exception{
        return getNhanVien(Condition, null);
    }
    public ArrayList<NhanVienDTO>getNhanVien() throws Exception{
        return getNhanVien(null);
    }
    public NhanVienDTO getNhanVienByMaNV(int id) throws Exception{
        ArrayList<NhanVienDTO> NVs = this.getNhanVien("MaNV= " + id);
        if(NVs.size()>0){
            return NVs.toArray(new NhanVienDTO[NVs.size()])[0];
        }
        return null;
    }
    public void Insert(NhanVienDTO nv) throws Exception{
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaNV", nv.getMaNV());
        hm.put("TenNV",nv.getTenNV());
        hm.put("TaiKhoan",nv.getTaiKhoan());
        hm.put("MatKhau",nv.getMatKhau());
        hm.put("NgaySinh",nv.getNgaySinh());
        hm.put("DiaChi",nv.getDiaChi());
        hm.put("DienThoai",nv.getDienThoai());
        hm.put("ChucVu",nv.getChucVu());
        hm.put("Role", nv.getRole());
        this.connect.Insert("nhanvien", hm);
    }
    public void Inserts(ArrayList<NhanVienDTO> NVs) throws Exception{
        for(NhanVienDTO nv:NVs ){
            this.Insert(nv);
        }
    }
    public void Update(NhanVienDTO nv) throws Exception{
        HashMap<String,Object> hm = new HashMap<String, Object>();
        hm.put("MaNV", nv.getMaNV());
        hm.put("TenNV",nv.getTenNV());
        hm.put("TaiKhoan",nv.getTaiKhoan());
        hm.put("MatKhau",nv.getMatKhau());
        hm.put("NgaySinh",nv.getNgaySinh());
        hm.put("DiaChi",nv.getDiaChi());
        hm.put("DienThoai",nv.getDienThoai());
        hm.put("ChucVu",nv.getChucVu());
        hm.put("Role", nv.getRole());
        this.connect.Update("nhanvien", hm, "MaNV="+"'"+nv.getMaNV()+"'");
    }
    public void Updates(ArrayList<NhanVienDTO> NVs) throws Exception{
        for(NhanVienDTO nv:NVs ){
            this.Update(nv);
        }
    }
    public void Delete(NhanVienDTO nv) throws Exception{
        this.connect.Delete("nhanvien","MaNV="+"'"+nv.getMaNV()+"'");
    }
     public void Deletes(ArrayList<NhanVienDTO> NVs) throws Exception{
        for(NhanVienDTO nv:NVs ){
            this.Delete(nv);
        }
    }
}
