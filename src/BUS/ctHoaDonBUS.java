/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.CtHoaDonDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SteelWeapon
 */
public class ctHoaDonBUS {
    MYSQLUnit connect;
    public ctHoaDonBUS(){
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<CtHoaDonDTO> getCtHoaDon(String Condition,String Orderby) throws Exception{
        ResultSet result = connect.Select("ctHoaDon",Condition,Orderby);
        ArrayList<CtHoaDonDTO> ar = new ArrayList<CtHoaDonDTO>();
        while(result.next()){
            CtHoaDonDTO hd = new CtHoaDonDTO();
            hd.setMaHD(result.getString("mahd"));
            hd.setMaSanPham(result.getString("masanpham"));
            hd.setMaGiamGia(result.getString("magiamgia"));
            hd.setSoLuong(result.getInt("soluong"));
            hd.setDonGia(result.getInt("dongia"));
            hd.setThanhTien(result.getInt("thanhtien"));
            ar.add(hd);
        }
        return ar;
    } 
    public ArrayList<CtHoaDonDTO> getCtHoaDon(String Condition) throws Exception{
         return getCtHoaDon(Condition,null);
    }
    public ArrayList<CtHoaDonDTO> getCtHoaDon() throws Exception{
         return getCtHoaDon(null);
    }
    public void Insert(CtHoaDonDTO hd) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("mahd", hd.getMaHD());
        hm.put("masanpham", hd.getMaSanPham());
        hm.put("magiamgia", hd.getMaGiamGia());
        hm.put("soluong", hd.getSoLuong());
        hm.put("dongia", hd.getDonGia());
        hm.put("thanhtien", hd.getThanhTien());
        if(hd.getMaGiamGia().equals("")){
          this.connect.InsertNull("cthoadon",hm);  
        }
        else{
           this.connect.Insert("cthoadon",hm);
        }
        
    }
    public void Inserts(ArrayList<CtHoaDonDTO> ar) throws Exception{
        for(CtHoaDonDTO hd :ar){
           this.Insert(hd);
        }
    }
    
    public void Update(CtHoaDonDTO hd) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("masanpham", hd.getMaSanPham());
        hm.put("magiamgia", hd.getMaGiamGia());
        hm.put("soluong", hd.getSoLuong());
        hm.put("dongia", hd.getDonGia());
        hm.put("thanhtien", hd.getThanhTien());
        this.connect.Update("cthoadon",hm,"mahd="+hd.getMaHD());
    }
    public void Updates(ArrayList<CtHoaDonDTO> ar) throws Exception{
        for(CtHoaDonDTO hd: ar){
            this.Update(hd);
        }
    }
    public void Delete(CtHoaDonDTO hd) throws Exception{
        this.connect.Delete("cthoadon","mahd="+hd.getMaHD());
    }
    public void Deletes(ArrayList<CtHoaDonDTO> ar) throws Exception{
        for(CtHoaDonDTO hd: ar){
            this.Delete(hd);
        }
    }
}
