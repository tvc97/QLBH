/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.MYSQLUnit;
import DTO.DangNhapDTO;
import Utils.Sercurity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SteelWeapon
 */
public class DangNhapBUS {
    MYSQLUnit connect;

    public DangNhapBUS() {
        this.connect= DAL.DAL.getDAL();
    }
    public ArrayList<DangNhapDTO> getDangNhap(String Condition, String OrderBy) throws Exception{
        ResultSet result = connect.Select("nhanvien", Condition, OrderBy);
        ArrayList<DangNhapDTO> ar = new ArrayList<DangNhapDTO>();
        while(result.next()){
            DangNhapDTO dn = new DangNhapDTO();
            dn.setTenDangNhap(result.getString("taikhoan"));
            dn.setMatKhau(result.getString("matkhau"));
            ar.add(dn);
        }
        return ar;
    }
    public ArrayList<DangNhapDTO> getDangNhap(String Condition) throws Exception{
         return getDangNhap(Condition, null);
     }
    public ArrayList<DangNhapDTO> getDangNhap() throws Exception{
         return getDangNhap(null);
     }
    public void Insert(DangNhapDTO dn) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("taikhoan",dn.getTenDangNhap());
        hm.put("matkhau",dn.getMatKhau());
        this.connect.Insert("taikhoan", hm);
    }
    public void Inserts(ArrayList<DangNhapDTO> ar) throws Exception{
        for (DangNhapDTO dn : ar) {
            Insert(dn);
        }
    }
    public void Update(DangNhapDTO dn) throws Exception{
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("matkhau",dn.getMatKhau());
        this.connect.Update("taikhoan", hm,"taikhoan="+dn.getTenDangNhap());
    }
    public void Updates(ArrayList<DangNhapDTO> ar) throws Exception{
         for (DangNhapDTO dn : ar) {
            Update(dn);
        }
    }
    public void Delete(DangNhapDTO dn) throws Exception{
        this.connect.Delete("taikhoan", "taikhoan="+dn.getTenDangNhap());
    } 
    public void Deletes(ArrayList<DangNhapDTO> ar) throws Exception{
         for (DangNhapDTO dn : ar) {
            Delete(dn);
        }
    }
}
   
    