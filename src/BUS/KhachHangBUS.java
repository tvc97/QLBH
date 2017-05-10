/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.KhachHangDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SocBayMau
 */
public class KhachHangBUS {
    MYSQLUnit connect ;
    public KhachHangBUS()
    {
        this.connect= DAL.DAL.getDAL();
    }
public ArrayList<KhachHangDTO>getKhachHang(String Condition, String Orderby) throws Exception
{
    ResultSet result=connect.Select("khachhang", Condition, Orderby);
    ArrayList<KhachHangDTO> KHs=new ArrayList<KhachHangDTO>();
    while(result.next())
    {
        KhachHangDTO kh=new KhachHangDTO();
        kh.setMaKH(result.getString("MaKH"));
        kh.setTenKH(result.getString("TenKH"));
        kh.setDiaChi(result.getString("DiaChi"));
        kh.setEmail(result.getString("Email"));
        kh.setSĐT(result.getLong("SĐT"));
        kh.setTongHoaDon(result.getInt("TongHoaDon"));
        KHs.add(kh);
    }
    return KHs;
}
    public ArrayList<KhachHangDTO>getKhachHang(String Condition) throws Exception
    {
        return getKhachHang(Condition,null);
    }
    public ArrayList<KhachHangDTO>getKhachHang() throws Exception
    {
        return getKhachHang(null);
    }
    public KhachHangDTO getKhachHangByMaKH(int id) throws Exception
    {
        ArrayList<KhachHangDTO> KHs= this.getKhachHang("MaKH="+id);
        if(KHs.size()>0)
                {
                   return KHs.toArray(new KhachHangDTO[KHs.size()])[0];
                }
        return null;
    }
    public void InSert(KhachHangDTO kh) throws Exception
    {
        HashMap<String,Object> hm= new HashMap<String,Object>();
            hm.put("MaKH",kh.getMaKH());
            hm.put("TenKH",kh.getTenKH());
            hm.put("DiaChi", kh.getDiaChi());
            hm.put("Email",kh.getEmail());
            hm.put("SĐT", kh.getSĐT());
            hm.put("TongHoaDon",kh.getTongHoaDon());
            this.connect.Insert("khachhang", hm);
    }
    public void InSert(ArrayList<KhachHangDTO> KHs) throws Exception
    {
        for (KhachHangDTO kh:KHs)
        {
            this.InSert(kh);
        }
    }
    public void Update(KhachHangDTO kh) throws Exception
    {
        HashMap<String,Object> hm=new HashMap<String,Object>();
            hm.put("MaKH", kh.getMaKH());
            hm.put("TenKH", kh.getTenKH());
            hm.put("DiaChi", kh.getDiaChi());
            hm.put("Email",kh.getEmail());
            hm.put("SĐT",kh.getSĐT());
            hm.put("TongHoaDon", kh.getTongHoaDon());
            this.connect.Update("khachhang", hm, "MaKH="+"'"+kh.getMaKH()+"'");
    }
    public void Update(ArrayList<KhachHangDTO> KHs) throws Exception
    {
        for (KhachHangDTO kh:KHs)
        {
            this.Update(kh);
        }
    }
    public void Delete (KhachHangDTO kh) throws Exception
    {
        this.connect.Delete("khachhang", "MaKH="+"'"+kh.getMaKH()+"'");
    }
    public void Delete(ArrayList<KhachHangDTO> KHs) throws Exception
    {
        for(KhachHangDTO kh:KHs)
        {
            this.Delete(kh);
        }
    }
}
