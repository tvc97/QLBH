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
public class NhaCungCapBUS {
    MYSQLUnit connect;
    public NhaCungCapBUS()
    {
        this.connect = DAL.DAL.getDAL();
    }
    public ArrayList<NhaCungCapDTO>getNhaCungCap(String Condition, String OrderBy) throws Exception{
        ResultSet result = connect.Select("nhacungcap", Condition, OrderBy);
        ArrayList<NhaCungCapDTO> NCCs = new ArrayList<NhaCungCapDTO>();
        while(result.next()){
            NhaCungCapDTO ncc = new NhaCungCapDTO();
            ncc.setMaNCC(result.getString("MaNCC"));
            ncc.setTenNCC(result.getString("TenNCC")); // Tên Như con c?c
            ncc.setDiaChi(result.getString("DiaChi"));
            ncc.setEmail(result.getString("Email"));
            ncc.setSdt(result.getLong("SĐT"));
            NCCs.add(ncc);
        }
        return NCCs;
    }

    public ArrayList<NhaCungCapDTO>getNhaCungCap(String Condition) throws Exception
    {
        return getNhaCungCap(Condition,null);
    }
    public ArrayList<NhaCungCapDTO>getNhaCungCap() throws Exception
    {
        return getNhaCungCap(null);
    }
    public NhaCungCapDTO getNhaCungCapByMaNCC(String id) throws Exception
    {
        ArrayList<NhaCungCapDTO> NCCs = this.getNhaCungCap("MaNCC = " + id);
        if(NCCs.size()>0)
        {
            return NCCs.toArray(new NhaCungCapDTO[NCCs.size()])[0];
        }
        return null;
    }
    public void Insert(NhaCungCapDTO ncc) throws Exception{
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("MaNCC", ncc.getMaNCC());
        hm.put("TenNCC",ncc.getTenNCC());
        hm.put("DiaChi",ncc.getDiaChi());
        hm.put("Email",ncc.getEmail());
        hm.put("SĐT",ncc.getSdt());
        this.connect.Insert("nhacungcap", hm);
    }
    public void Inserts(ArrayList<NhaCungCapDTO> NCCs) throws Exception
    {
        for(NhaCungCapDTO ncc:NCCs)
        {
            this.Insert(ncc);
        }
    }
    public void Update(NhaCungCapDTO ncc) throws Exception{
        HashMap<String,Object> hm = new HashMap<String, Object>();
        hm.put("MaNCC", ncc.getMaNCC());
        hm.put("TenNCC",ncc.getTenNCC());
        hm.put("DiaChi",ncc.getDiaChi());
        hm.put("Email",ncc.getEmail());
        hm.put("SĐT",ncc.getSdt());
        this.connect.Update("nhacungcap", hm, "MaNCC="+"'"+ncc.getMaNCC()+"'");
    }
    public void Updates(ArrayList<NhaCungCapDTO> NCCs) throws Exception
    {
        for(NhaCungCapDTO ncc:NCCs)
        {
            this.Update(ncc);
        }
    }
    public void Delete(NhaCungCapDTO ncc) throws Exception
    {
        this.connect.Delete("nhacungcap", "MaNCC = " + "'" + ncc.getMaNCC() + "'");
    }
    public void Deletes(ArrayList<NhaCungCapDTO> NCCs) throws Exception
    {
        for(NhaCungCapDTO ncc:NCCs)
        {
            this.Delete(ncc);
        }
    }
    public String MaNCCMoiNhat(String MaNCC) throws Exception
    {
        ResultSet rs = this.connect.Select("nhacungcap", "MaNCC like '" + MaNCC + "%'");
        
        if(rs.next())
        {
            rs.last();
            return rs.getString(1);
        }
        else
            return null;
    }
}
