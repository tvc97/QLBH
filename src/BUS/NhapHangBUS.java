/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.NhapHangDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author zTNz
 */
public class NhapHangBUS {
    MYSQLUnit connect;
    public NhapHangBUS()
    {
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<NhapHangDTO>getNhapHang(String Condition, String OrderBy) throws Exception
    {
        ResultSet result = connect.Select("phieunhaphang",Condition,OrderBy);
        ArrayList<NhapHangDTO> NHs = new ArrayList<NhapHangDTO>();
        while(result.next())
        {
            NhapHangDTO nh = new NhapHangDTO();
            nh.setMaPNH(result.getString("MaPNH"));
            nh.setMaNCC(result.getString("MaNCC"));
            nh.setMaNV(result.getString("MaNV"));
            nh.setNgayLap(result.getString("NgayLap"));
            nh.setTongTien(result.getInt("TongTien"));
            NHs.add(nh);
        }
        return NHs;
    }
    public ArrayList<NhapHangDTO>getNhapHang(String Condition) throws Exception
    {
        return getNhapHang(Condition, null);
    }
    public ArrayList<NhapHangDTO>getNhapHang() throws Exception
    {
        return getNhapHang(null);
    }
    public NhapHangDTO getNhapHangByID(String id) throws Exception
    {
        ArrayList<NhapHangDTO> NH = this.getNhapHang("MaPNH = " + id);
        if(NH.size()>0)
        {
            return NH.toArray(new NhapHangDTO[NH.size()])[0];
        }
        return null;
    }
    public void Insert(NhapHangDTO nh) throws Exception
    {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaPNH", nh.getMaPNH());
        hm.put("MaNCC",nh.getMaNCC());
        hm.put("MaNV", nh.getMaNV());
        hm.put("NgayLap",nh.getNgayLap());
        hm.put("TongTien", nh.getTongTien());
        this.connect.Insert("phieunhaphang", hm);
    }
    public void Inserts(ArrayList<NhapHangDTO> NHs) throws Exception
    {
        for(NhapHangDTO nh:NHs)
        {
            this.Insert(nh);
        }
    }
    public void Update(NhapHangDTO nh) throws Exception
    {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaPNH", nh.getMaPNH());
        hm.put("MaNCC", nh.getMaNCC());
        hm.put("MaNV", nh.getMaNV());
        hm.put("NgayLap", nh.getNgayLap());
        this.connect.Update("phieunhaphang", hm, "MaPNH = " + "'" +  nh.getMaPNH() + "'");
    }
    public void Updates(ArrayList<NhapHangDTO> NHs) throws Exception
    {
        for(NhapHangDTO nh:NHs)
        {
            this.Update(nh);
        }
    }
    public void Delete(NhapHangDTO nh) throws Exception
    {
        this.connect.Delete("phieunhaphang", "MaPNH = " + "'" + nh.getMaPNH() + "'");
    }
    public void Deletes(ArrayList<NhapHangDTO> NHs) throws Exception
    {
        for(NhapHangDTO nh:NHs)
        {
            this.Delete(nh);
        }
    }
    public String MaPNHMoiNhat(String MaPNH) throws Exception
    {
        ResultSet rs = this.connect.Select("phieunhaphang","MaPNH like " + MaPNH + "%");
        if(rs.next())
        {
            rs.last();
            return rs.getString(1);
        }
        else
            return null;
    }
}
