/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.CtNhaCungCapDTO;
import DTO.NhaCungCapDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author HeoBayMau
 */
public class CtNhaCungCapBUS {
    MYSQLUnit connect;
    public CtNhaCungCapBUS()
    {
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<CtNhaCungCapDTO>getCtNhaCungCap(String Condition, String OrderBy) throws Exception{
        ResultSet result = connect.RawQuery("SELECT ctnhacungcap.*, sanpham.TenSP as TenSP FROM ctnhacungcap INNER JOIN sanpham ON sanpham.MaSP = ctnhacungcap.MaSanPham", Condition, OrderBy);
        ArrayList<CtNhaCungCapDTO> NCCs = new ArrayList<CtNhaCungCapDTO>();
        while(result.next()){
            CtNhaCungCapDTO ncc = new CtNhaCungCapDTO();
            ncc.setMaNCC(result.getString("MaNCC"));
            ncc.setMaSanPham(result.getString("MaSanPham"));
            ncc.setTenSanPham(result.getString("TenSP"));
            
            NCCs.add(ncc);
        }
        return NCCs;
    }
    public ArrayList<CtNhaCungCapDTO>getCtNhaCungCap(String Condition) throws Exception
    {
        return getCtNhaCungCap(Condition,null);
    }
    public ArrayList<CtNhaCungCapDTO>getCtNhaCungCap() throws Exception
    {
        return getCtNhaCungCap(null);
    }
    public NhaCungCapDTO getCtNhaCungCapByMaNCC(String id) throws Exception
    {
        ArrayList<CtNhaCungCapDTO> NCCs = this.getCtNhaCungCap("MaNCC = " + id);
        if(NCCs.size()>0)
        {
            return NCCs.toArray(new NhaCungCapDTO[NCCs.size()])[0];
        }
        return null;
    }
    public void Insert(CtNhaCungCapDTO ncc) throws Exception{
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaNCC", ncc.getMaNCC());
        hm.put("MaSanPham",ncc.getMaSanPham());
        this.connect.Insert("ctnhacungcap", hm);
    }
    public void Inserts(ArrayList<CtNhaCungCapDTO> NCCs) throws Exception
    {
        for(CtNhaCungCapDTO ncc:NCCs)
        {
            this.Insert(ncc);
        }
    }
    public void Update(CtNhaCungCapDTO ncc) throws Exception{
        HashMap<String,Object> hm = new HashMap<String, Object>();
        hm.put("MaNCC", ncc.getMaNCC());
        hm.put("MaSanPham",ncc.getMaSanPham());
        this.connect.Update("ctnhacungcap", hm, "MaNCC="+"'"+ncc.getMaNCC()+"'");
    }
    public void Updates(ArrayList<CtNhaCungCapDTO> NCCs) throws Exception
    {
        for(CtNhaCungCapDTO ncc:NCCs)
        {
            this.Update(ncc);
        }
    }
    public void Delete(CtNhaCungCapDTO ncc) throws Exception
    {
        this.connect.Delete("ctnhacungcap", "MaNCC = " + "'" + ncc.getMaNCC() + "'");
    }
    public void Deletes(ArrayList<CtNhaCungCapDTO> NCCs) throws Exception
    {
        for(CtNhaCungCapDTO ncc:NCCs)
        {
            this.Delete(ncc);
        }
    }
    public String CtMaNCCMoiNhat(String MaNCC) throws Exception
    {
        ResultSet rs = this.connect.Select("ctnhacungcap", "MaNCC like '" + MaNCC + "%'");
        
        if(rs.next())
        {
            rs.last();
            return rs.getString(1);
        }
        else
            return null;
    }
}
