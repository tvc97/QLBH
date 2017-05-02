/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.HoaDonDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SteelWeapon
 */
public class HoaDonBUS {
    MYSQLUnit connect;
    public HoaDonBUS(){
        this.connect= DAL.DAL.getDAL();
    }
    public ArrayList<HoaDonDTO> getHoaDon(String Condition,String Orderby) throws Exception{
        ResultSet result = connect.Select("HoaDon",Condition,Orderby);
        ArrayList<HoaDonDTO> ar = new ArrayList<HoaDonDTO>();
        while(result.next()){
            HoaDonDTO hd = new HoaDonDTO();
            hd.setMaHD(result.getInt("mahd"));
            hd.setMaKhachHang(result.getInt("makhachhang"));
            hd.setMaNV(result.getInt("manv"));
            hd.setNgayNhap(result.getString("ngaynhap"));
            hd.setTongTien(result.getInt("tongtien"));
            ar.add(hd);
        }
        return ar;
    } 
    public ArrayList<HoaDonDTO> getHoaDon(String Condition) throws Exception{
         return getHoaDon(Condition,null);
    }
    public ArrayList<HoaDonDTO> getHoaDon() throws Exception{
         return getHoaDon(null);
    }
    public void Insert(HoaDonDTO hd) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("mahd", hd.getMaHD());
        hm.put("makhachhang", hd.getMaKhachHang()); 
        hm.put("manv", hd.getMaNV());
        hm.put("ngaynhap", hd.getNgayNhap());
        hm.put("tongtien", hd.getTongTien());
        if(hd.getMaKhachHang()==0){
            this.connect.InsertNull("hoadon",hm);
        }
        else{
           this.connect.Insert("hoadon",hm); 
        }
        
    }
    public void Inserts(ArrayList<HoaDonDTO> ar) throws Exception{
        for(HoaDonDTO hd :ar){
           this.Insert(hd);
        }
    }
    public void Update(HoaDonDTO hd) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("makhachhang", hd.getMaKhachHang());
        hm.put("manv", hd.getMaNV());
        hm.put("ngaynhap", hd.getNgayNhap());
        hm.put("tongtien", hd.getTongTien());
        this.connect.Update("hoadon",hm,"mahd="+hd.getMaHD());
    }
    public void Updates(ArrayList<HoaDonDTO> ar) throws Exception{
        for(HoaDonDTO hd: ar){
            this.Update(hd);
        }
    }
    public void Delete(HoaDonDTO hd) throws Exception{
        this.connect.Delete("hoadon","mahd="+hd.getMaHD());
    }
    public void Deletes(ArrayList<HoaDonDTO> ar) throws Exception{
        for(HoaDonDTO hd: ar){
            this.Delete(hd);
        }
    }
}
