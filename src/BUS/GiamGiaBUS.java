/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.GiamGiaDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SteelWeapon
 */
public class GiamGiaBUS {
    MYSQLUnit connect;
    public  GiamGiaBUS(){
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<GiamGiaDTO> getGiamGia(String Condition,String Orderby) throws Exception{
        ResultSet result = connect.Select("giamgia",Condition,Orderby);
        ArrayList<GiamGiaDTO> ar = new ArrayList<GiamGiaDTO>();
        while(result.next()){
            GiamGiaDTO gg = new GiamGiaDTO();
            gg.setMaGiamGia(result.getString("MaGiamGia"));
            gg.setMucGiam(result.getInt("MucGiam"));
            gg.setGhiChu(result.getString("GhiChu"));
            gg.setHanDung(result.getString("HanDung"));
            ar.add(gg);
        }
        return ar;
    } 
    public ArrayList<GiamGiaDTO> getGiamGia(String Condition) throws Exception{
         return getGiamGia(Condition,null);
    }
    public ArrayList<GiamGiaDTO> getGiamGia() throws Exception{
         return getGiamGia(null);
    }
    public void Insert(GiamGiaDTO gg) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("MaGiamGia", gg.getMaGiamGia());
        hm.put("MucGiam", gg.getMucGiam()); 
        hm.put("GhiChu", gg.getGhiChu());
        hm.put("HanDung", gg.getHanDung());
        if(gg.getMucGiam()==0){
            this.connect.InsertNull("GiamGia",hm);
        }
        else{
           this.connect.Insert("GiamGia",hm); 
        }
        
    }
    public void Inserts(ArrayList<GiamGiaDTO> ar) throws Exception{
        for(GiamGiaDTO gg :ar){
           this.Insert(gg);
        }
    }
    public void Update(GiamGiaDTO gg) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("MaGiamGia", gg.getMaGiamGia());
        hm.put("MucGiam", gg.getMucGiam());
        hm.put("GhiChu", gg.getGhiChu());
        hm.put("HanDung", gg.getHanDung());
        this.connect.Update("giamgia",hm,"MaGiamGia="+gg.getMaGiamGia());
    }
    public void Updates(ArrayList<GiamGiaDTO> ar) throws Exception{
        for(GiamGiaDTO gg: ar){
            this.Update(gg);
        }
    }
    public void Delete(GiamGiaDTO gg) throws Exception{
        this.connect.Delete("giamgia","MaGiamGia="+gg.getMaGiamGia());
    }
    public void Deletes(ArrayList<GiamGiaDTO> ar) throws Exception{
        for(GiamGiaDTO gg: ar){
            this.Delete(gg);
        }
    }
    public String MaGGMoiNhat(String MaGG) throws Exception
    {
        ResultSet rs = this.connect.Select("giamgia", "MaGiamGia like '" + MaGG + "%'");
        
        if(rs.next())
        {
            rs.last();
            return rs.getString(1);
        }
        else
            return null;
    }
}
