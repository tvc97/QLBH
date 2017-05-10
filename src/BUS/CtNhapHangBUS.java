/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.CtHoaDonDTO;
import DTO.CtNhapHangDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author zTNz
 */
public class CtNhapHangBUS {
    MYSQLUnit connect;
    public CtNhapHangBUS()
    {
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<CtNhapHangDTO>getCtNhapHang(String Condition, String OrderBy) throws Exception
    {
        ResultSet result = connect.Select("ctphieunhaphang",Condition,OrderBy);
        ArrayList<CtNhapHangDTO> NH = new ArrayList<CtNhapHangDTO>();
        while(result.next())
        {
            CtNhapHangDTO ctnh = new CtNhapHangDTO();
            ctnh.setMaPNH(result.getString("MaPNH"));
            ctnh.setMaSanPham(result.getString("MaSanPham"));
            ctnh.setSoLuong(result.getInt("SoLuong"));
            ctnh.setDonGia(result.getInt("DonGia"));
            ctnh.setThanhTien(result.getInt("ThanhTien"));
            NH.add(ctnh);
        }
        return NH;
    }
    public ArrayList<CtNhapHangDTO>getCtNhapHang(String Condition) throws Exception
    {
        return getCtNhapHang(Condition,null);
    }
    public ArrayList<CtNhapHangDTO>getCtNhapHang() throws Exception
    {
        return getCtNhapHang(null);
    }
    public void Insert(CtNhapHangDTO ctnh) throws Exception
    {
        HashMap<String, Object> hm = new HashMap<String,Object>();
        hm.put("MaPNH", ctnh.getMaPNH());
        hm.put("MaSanPham", ctnh.getMaSanPham());
        hm.put("SoLuong", ctnh.getSoLuong());
        hm.put("DonGia", ctnh.getDonGia());
        hm.put("ThanhTien", ctnh.getThanhTien());
        this.connect.Insert("ctphieunhaphang", hm);
    }
    public void Inserts(ArrayList<CtNhapHangDTO> ctnh) throws Exception
    {
        for(CtNhapHangDTO nh:ctnh)
            this.Insert(nh);
    }
    public void Update(CtNhapHangDTO ctnh) throws Exception
    {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaPNH", ctnh.getMaPNH());
        hm.put("MaSanPham", ctnh.getMaSanPham());
        hm.put("SoLuong", ctnh.getSoLuong());
        hm.put("DonGia", ctnh.getDonGia());
        hm.put("ThanhTien", ctnh.getThanhTien());
        this.connect.Update("ctphieunhaphang", hm, "MaPNH = " + "'" + ctnh.getMaPNH()+ "' AND MaSanPham = "
                            + "'" + ctnh.getMaSanPham() + "'");
    }
    public void Updates(ArrayList<CtNhapHangDTO> ctnh) throws Exception{
        for(CtNhapHangDTO nh:ctnh ){
            this.Update(nh);
        }
    }
    public void Delete(CtNhapHangDTO ctnh) throws Exception
    {
        this.connect.Delete("ctphieunhaphang", "MaPNH = " + "'" + ctnh.getMaPNH() + "' AND MaSanPham = "
                            + "'" + ctnh.getMaSanPham() + "'");
    }
    public void Deletes(ArrayList<CtNhapHangDTO> ctnh) throws Exception{
        for(CtNhapHangDTO nh:ctnh ){
            this.Delete(nh);
        }
    }
    public String MaNHMoiNhat(String MaNH) throws Exception
    {
        ResultSet rs = this.connect.Select("ctphieunhaphang", "MaPNH like '" + MaNH + "%'");
        
        if(rs.next())
        {
            rs.last();
            return rs.getString(1);
        }
        else
            return null;
    }
}
