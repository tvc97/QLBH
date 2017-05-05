/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.SanPhamDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SteelWeapon
 */
public  class SanPhamBUS {
    MYSQLUnit connect;
    public SanPhamBUS(){
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<SanPhamDTO>getSanPham(String Condition, String OrderBy) throws Exception{
        ResultSet result = connect.Select("sanpham", Condition, OrderBy);
        ArrayList<SanPhamDTO> NSP = new ArrayList<SanPhamDTO>();
        while(result.next()){
            SanPhamDTO sp = new SanPhamDTO();
            sp.setMaSP(result.getString("masp"));
            sp.setTenSP(result.getString("TenSP"));
         //   sp.setDonViTinh(result.getString("DonViTinh"));
            sp.setDonGia(result.getInt("DonGia"));
            sp.setSoLuongCo(result.getInt("SoLuongCo"));
            NSP.add(sp);
        }
       
        return NSP;
    }
    public ArrayList<SanPhamDTO>getSanPham(String Condition) throws Exception{
        return getSanPham(Condition, null);
    }
    public ArrayList<SanPhamDTO>getSanPham() throws Exception{
        return getSanPham(null);
    }
    public SanPhamDTO getSPByID(int id) throws Exception{
        ArrayList<SanPhamDTO> SP = this.getSanPham("MaSP= " + id);
        if(SP.size()>0){
            return SP.toArray(new SanPhamDTO[SP.size()])[0];
        }
        return null;
    }
    public void Insert(SanPhamDTO sp) throws Exception{
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaSP", sp.getMaSP());
        hm.put("TenSP",sp.getTenSP());
       // hm.put("DonViTinh",sp.getDonViTinh());
        hm.put("DonGia",sp.getDonGia());
        hm.put("SoLuongCo",sp.getSoLuongCo());
        this.connect.Insert("sanpham", hm);
    }
    public void Inserts(ArrayList<SanPhamDTO> NSP) throws Exception{
        for(SanPhamDTO sp:NSP ){
            this.Insert(sp);
        }
    }
    public void Update(SanPhamDTO sp) throws Exception{
        HashMap<String,Object> hm = new HashMap<String, Object>();
        hm.put("TenSP", sp.getTenSP());
       // hm.put("DonViTinh",sp.getDonViTinh());
        hm.put("DonGia",sp.getDonGia());
        hm.put("SoLuongCo",sp.getSoLuongCo());
        this.connect.Update("sanpham", hm, "MaSP="+sp.getMaSP());
    }
    public void Updates(ArrayList<SanPhamDTO> NSP) throws Exception{
        for(SanPhamDTO sp:NSP ){
            this.Update(sp);
        }
    }
    public void Delete(SanPhamDTO sp) throws Exception{
        this.connect.Delete("sanpham","MaSP="+sp.getMaSP());
    }
     public void Deletes(ArrayList<SanPhamDTO> NSP) throws Exception{
        for(SanPhamDTO sp:NSP ){
            this.Delete(sp);
        }
    }
    public String MaSPMoiNhat(String MaSP) throws Exception
    {
        ResultSet rs = this.connect.Select("sanpham", "masp like '" + MaSP + "%'");
        
        if(rs.next())
        {
            rs.last();
            return rs.getString(1);
        }
        else
            return null;
    }
}
