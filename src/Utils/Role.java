/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author py
 */
public class Role {
    private static boolean HOADON_THEM, HOADON_XOA, HOADON_XEM;
    private static boolean NHANVIEN_THEM, NHANVIEN_XOA, NHANVIEN_XEM;
    private static Role _role;
    
    public static Role getInstance(){
        if(null == _role)
            _role = new Role();
        return _role;
    }
    
    public void Admin() {
        setNHANVIEN_THEM(true);
        setNHANVIEN_XOA(true);
        setNHANVIEN_XEM(true);
        
        setHOADON_THEM(true);
        setHOADON_XOA(true);
        setHOADON_XEM(true);
    }
    
    public void NhanVien() {
        setNHANVIEN_THEM(false);
        setNHANVIEN_XOA(false);
        setNHANVIEN_XEM(false);
        
        setHOADON_THEM(true);
        setHOADON_XOA(false);
        setHOADON_XEM(true);
    }

    public boolean isNHANVIEN_THEM() {
        return NHANVIEN_THEM;
    }

    private void setNHANVIEN_THEM(boolean NHANVIEN_THEM) {
        this.NHANVIEN_THEM = NHANVIEN_THEM;
    }

    public boolean isNHANVIEN_XOA() {
        return NHANVIEN_XOA;
    }

    private void setNHANVIEN_XOA(boolean NHANVIEN_XOA) {
        this.NHANVIEN_XOA = NHANVIEN_XOA;
    }

    public boolean isNHANVIEN_XEM() {
        return NHANVIEN_XEM;
    }

    private void setNHANVIEN_XEM(boolean NHANVIEN_XEM) {
        this.NHANVIEN_XEM = NHANVIEN_XEM;
    }

    public boolean isHOADON_THEM() {
        return HOADON_THEM;
    }

    private void setHOADON_THEM(boolean HOADON_THEM) {
        this.HOADON_THEM = HOADON_THEM;
    }

    public boolean isHOADON_XOA() {
        return HOADON_XOA;
    }

    private void setHOADON_XOA(boolean HOADON_XOA) {
        this.HOADON_XOA = HOADON_XOA;
    }

    public boolean isHOADON_XEM() {
        return HOADON_XEM;
    }

    private void setHOADON_XEM(boolean HOADON_XEM) {
        this.HOADON_XEM = HOADON_XEM;
    }
    
    
}
