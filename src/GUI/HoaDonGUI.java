/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author SteelWeapon
 */
import BUS.GiamGiaBUS;
import BUS.HoaDonBUS;
import BUS.SanPhamBUS;
import BUS.ctHoaDonBUS;
import DTO.HoaDonDTO;
import DTO.SanPhamDTO;
import DTO.CtHoaDonDTO;
import DTO.GiamGiaDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class HoaDonGUI extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonGUI
     */
    private DefaultTableModel dshd;
    private DefaultTableModel dstk;
    private SanPhamBUS spb = new SanPhamBUS();
    private ctHoaDonBUS chdb = new ctHoaDonBUS();
    private HoaDonBUS hdb = new HoaDonBUS();
    private GiamGiaBUS ggb = new GiamGiaBUS();
    private int cr;
    private int cr_tk;
    private int cr_hd;
    public HoaDonGUI() {
        initComponents();
        TaoBangSPHoaDon();
        getMaHD();
     //   HienThiNgay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tfTimKiem = new javax.swing.JTextField();
        btTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSPTK = new javax.swing.JTable();
        tfSoLuong = new javax.swing.JTextField();
        btThemHD = new javax.swing.JButton();
        btGiamHD = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btTaoMoiHoaDon = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSPHD = new javax.swing.JTable();
        btThanhToan = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfGiamGia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTienHang = new javax.swing.JTextField();
        tfTongCong = new javax.swing.JTextField();
        tfKhachHang = new javax.swing.JTextField();
        tfMHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMaGiamGia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfNgayLap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Tìm kiếm theo tên: ");

        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTimKiemMouseClicked(evt);
            }
        });

        tblSPTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Đơn Giá", "Số lượng còn"
            }
        ));
        tblSPTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSPTK);

        btThemHD.setText("Thêm");
        btThemHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThemHDMouseClicked(evt);
            }
        });

        btGiamHD.setText("Giảm");
        btGiamHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGiamHDMouseClicked(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoaMouseClicked(evt);
            }
        });

        btTaoMoiHoaDon.setText("Tạo mới hóa đơn");

        tblSPHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng", "Đơn giá"
            }
        ));
        tblSPHD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblSPHDFocusGained(evt);
            }
        });
        tblSPHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSPHD);

        btThanhToan.setText("Thanh Toán");
        btThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThanhToanMouseClicked(evt);
            }
        });

        jLabel13.setText("Giảm giá");

        jLabel14.setText("Tổng cộng");

        jLabel12.setText("Tiền hàng");

        jLabel3.setText("Hóa Đơn:");

        jLabel1.setText("Mã Giảm Giá");

        jLabel11.setText("Ngày lập");

        jLabel10.setText("Khách hàng:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfTongCong, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGiamGia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTienHang, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(btThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMHD, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel8)
                            .addGap(30, 30, 30)
                            .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btTimKiem))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btTaoMoiHoaDon)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btGiamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(544, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(tfNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTienHang))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfGiamGia))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfTongCong))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTimKiem))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btThemHD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btGiamHD)
                            .addGap(18, 18, 18)
                            .addComponent(btXoa)
                            .addGap(18, 18, 18)
                            .addComponent(btTaoMoiHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThanhToanMouseClicked
        try {
            HoaDonDTO hdd = new HoaDonDTO();
            hdd.setMaHD(tfMHD.getText());
            hdd.setMaNV("NV01");
            if(!tfKhachHang.getText().isEmpty()){
                hdd.setMaKhachHang(tfKhachHang.getText());
            }
            hdd.setNgayNhap(tfNgayLap.getText());
            hdd.setTongTien(Integer.parseInt(tfTongCong.getText()));
            hdb.Insert(hdd);
            JOptionPane.showMessageDialog(null,"Thêm dữ liệu vào bảng hóa đơn thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            ArrayList<CtHoaDonDTO> arc = new ArrayList<CtHoaDonDTO>();
            for (int i = 0; i < tblSPHD.getRowCount(); i++) {
                int sl=Integer.parseInt(tblSPHD.getValueAt(i,2).toString());
                int dg=Integer.parseInt(tblSPHD.getValueAt(i,3).toString());
                int ThanhTien= sl*dg;
                CtHoaDonDTO hd = new CtHoaDonDTO();
                hd.setMaHD(tfMHD.getText());
                hd.setMaSanPham(tblSPHD.getValueAt(i,0).toString());
                hd.setSoLuong(sl);
                hd.setDonGia(dg);
                if(!tfMaGiamGia.getText().isEmpty()){
                    hd.setMaGiamGia(Integer.parseInt(tfMaGiamGia.getText()));
                }
                hd.setThanhTien(ThanhTien);
                arc.add(hd);
            }
            chdb.Inserts(arc);
            JOptionPane.showMessageDialog(null,"Thanh toán thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btThanhToanMouseClicked

    private void tblSPHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPHDMouseClicked
        int n = tblSPHD.getSelectedRow();
        cr_hd = n;
    }//GEN-LAST:event_tblSPHDMouseClicked

    private void tblSPHDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblSPHDFocusGained
        //int n = tblSPHD.getSelectedRow();
        //cr_hd = n;
    }//GEN-LAST:event_tblSPHDFocusGained

    private void btXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoaMouseClicked
        Vector row = new Vector();
        row.add(tblSPHD.getValueAt(cr_hd,0));
        row.add(tblSPHD.getValueAt(cr_hd,1));
        int SoLuongHDCo = 0;
        int SoLuongTKCo = 0;
        int SoLuongCo= Integer.parseInt(tblSPHD.getValueAt(cr_hd,2).toString()); // lấy số lượng của bảng tblhd ở dòng cần xóa
        int dem =0;
        int n = tblSPTK.getRowCount();
        for (int i = 0; i < n; i++) {
            dem++; // dam bao duyet het gia tri cua tblsptk
            if(tblSPHD.getValueAt(cr_hd,0)== tblSPTK.getValueAt(i, 0)){ // ban tbltimkiem tồn tại sp giống tblhoadon
                SoLuongHDCo=Integer.parseInt(tblSPHD.getValueAt(cr_hd,2).toString());
                SoLuongTKCo=Integer.parseInt(tblSPTK.getValueAt(i,3).toString()); // Lấy giá trị(SL có) của tblsptk gán vào SoLuongTKCo
                SoLuongTKCo+=SoLuongHDCo; // sau đó cộng thêm cho số lượng giảm
                tblSPTK.setValueAt(SoLuongTKCo,i,3); // giá trị sau khi giảm
                break; // khi tìm dc rồi thì ngắt vòng lặp tránh để dem ==n chạy sai
            }
            else{
                if(dem==n){
                    row.add(tblSPHD.getValueAt(cr_hd,3));
                    String id = tblSPHD.getValueAt(cr_hd,0).toString();
                    SanPhamDTO sp = new SanPhamDTO();
                    sp=TimKiemSPTheoID(id);
                    int SoLuongHDF =sp.getSoLuongCo()+ SoLuongCo;
                    row.add(SoLuongHDF);
                    dstk.addRow(row);
                    tblSPTK.setModel(dstk);
                }
            }
        }
        dshd.removeRow(cr_hd);
        tblSPHD.setModel(dshd);
        if(tblSPHD.getRowCount()==0){ // code rắc rối. Bởi vì btn thêm phải khởi tạo 1 dòng đầu tiên cho bảng tblsphd thì code mới hoạt động
            // nên khi xóa đến sản phẩm cuối cùng thì phải add lại một dòng rỗng mới
            TaoBangSPHoaDon();// câu lệnh tạo dòng mới
        }
        for (int i = 0; i < tblSPTK.getRowCount(); i++) {
            SanPhamDTO spd = new SanPhamDTO();
            spd.setMaSP(tblSPTK.getValueAt(i,0).toString());
            spd.setTenSP(tblSPTK.getValueAt(i,1).toString());
            spd.setDonGia(Integer.parseInt(tblSPTK.getValueAt(i,2).toString()));
            spd.setSoLuongCo(Integer.parseInt(tblSPTK.getValueAt(i,3).toString()));
            try {
                spb.Update(spd);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        HienTongGiaTien();
        try {
            HienGiamGia();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        HienTongThanhTien();
    }//GEN-LAST:event_btXoaMouseClicked

    private void btGiamHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGiamHDMouseClicked
        Vector row = new Vector();
        row.add(tblSPHD.getValueAt(cr_hd,0));
        row.add(tblSPHD.getValueAt(cr_hd,1));
        int SoLuongGiam = 0; // SoLuong mà tfsoluong có
        int SoLuongCo=0; // So luong tblsphoadon có
        int SoLuongTKCo=0; // So luong tblsptk có
        int dem=0;
        if(tfSoLuong.getText().isEmpty()){ // nếu tf số lượng rỗng
            SoLuongGiam=1; // mỗi lần bấm nut giảm thì sẽ giảm 1 dvi
            SoLuongCo=Integer.parseInt(tblSPHD.getValueAt(cr_hd,2).toString()); // nhan gia tri so luong cua tblhd
        }
        else{
            SoLuongGiam=Integer.parseInt(tfSoLuong.getText());
            SoLuongCo=Integer.parseInt(tblSPHD.getValueAt(cr_hd,2).toString());
        }
        if(SoLuongGiam > SoLuongCo){
            JOptionPane.showMessageDialog(null,"Đã giảm hết sản phẩm");
        }
        else{
            SoLuongCo-=SoLuongGiam;
            tblSPHD.setValueAt(SoLuongCo,cr_hd,2); // trừ số lượng của bản hoá đơn

            int n = tblSPTK.getRowCount();
            for (int i = 0; i < n; i++) {
                dem++; // dam bao duyet het gia tri cua tblsptk
                if(tblSPHD.getValueAt(cr_hd,0)== tblSPTK.getValueAt(i, 0)){ // ban tbltimkiem tồn tại sp giống tblhoadon
                    SoLuongTKCo=Integer.parseInt(tblSPTK.getValueAt(i,3).toString()); // Lấy giá trị(SL có) của tblsptk gán vào SoLuongTKCo
                    SoLuongTKCo+=SoLuongGiam; // sau đó cộng thêm cho số lượng giảm
                    tblSPTK.setValueAt(SoLuongTKCo,i,3); // giá trị sau khi giảm
                    if(SoLuongCo==0){
                        dshd.removeRow(cr_hd); // Khi sản phẩm chỉ còn 0 thì xóa đi sản phẩm trong bảng tblsphd
                    }
                    tblSPHD.setModel(dshd);
                    break;
                }
                else{
                    if(dem==n){
                        row.add(tblSPHD.getValueAt(cr_hd,3));
                        String id = tblSPHD.getValueAt(cr_hd,0).toString();
                        SanPhamDTO sp = new SanPhamDTO();
                        sp=TimKiemSPTheoID(id);
                        SoLuongCo = sp.getSoLuongCo()+ SoLuongGiam;
                        row.add(SoLuongCo);
                        dstk.addRow(row);
                        tblSPTK.setModel(dstk);
                    }
                }
            }
        }
        if(tblSPHD.getRowCount()==0){ // code rắc rối. Bởi vì btn thêm phải khởi tạo 1 dòng đầu tiên cho bảng tblsphd thì code mới hoạt động
            // nên khi xóa đến sản phẩm cuối cùng thì phải add lại một dòng rỗng mới
            TaoBangSPHoaDon();// câu lệnh tạo dòng mới
        }
        for (int i = 0; i < tblSPTK.getRowCount(); i++) {
            SanPhamDTO spd = new SanPhamDTO();
            spd.setMaSP(tblSPTK.getValueAt(i,0).toString());
            spd.setTenSP(tblSPTK.getValueAt(i,1).toString());
            spd.setDonGia(Integer.parseInt(tblSPTK.getValueAt(i,2).toString()));
            spd.setSoLuongCo(Integer.parseInt(tblSPTK.getValueAt(i,3).toString()));
            try {
                spb.Update(spd);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        HienTongGiaTien();
        try {
            HienGiamGia();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        HienTongThanhTien();
    }//GEN-LAST:event_btGiamHDMouseClicked

    private void btThemHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemHDMouseClicked
        Vector row = new Vector();
        row.add(tblSPTK.getValueAt(cr_tk,0));
        row.add(tblSPTK.getValueAt(cr_tk,1));
        int slThem=0;
        int slCo=0;
        int dem=0;
        if(tfSoLuong.getText().isEmpty()){ //so sánh chuỗi có rỗng hay k
            slThem=1;
            slCo =Integer.parseInt(tblSPTK.getValueAt(cr_tk,3).toString());
        }else{
            slThem =Integer.parseInt(tfSoLuong.getText());
            slCo =Integer.parseInt(tblSPTK.getValueAt(cr_tk,3).toString());
        }
        if( slThem > slCo ){
            JOptionPane.showMessageDialog(null,"Không đủ sản phẩm để thêm vào hóa đơn");

        }
        else{
            slCo-=slThem;
            tblSPTK.setValueAt(slCo, cr_tk,3); // set lại giá trị đã trừ ra
            int n= tblSPHD.getRowCount();
            for (int i = 0; i <n ; i++) {
                dem++; // đảm bảo duyệt hết giá trị của bản hóa đơn
                if(tblSPTK.getValueAt(cr_tk,0)==tblSPHD.getValueAt(i,0)){

                    int slCoHD = Integer.parseInt(tblSPHD.getValueAt(i,2).toString());
                    slThem+=slCoHD;
                    tblSPHD.setValueAt(slThem,i,2);
                    break;
                }
                else{
                    if(i==0 && tblSPHD.getValueAt(i,0)==null){
                        dshd.removeRow(i);
                        tblSPHD.setModel(dshd);
                    }
                    if(dem==n){
                        row.add(slThem); // set giá trị thêm vào
                        row.add(tblSPTK.getValueAt(cr_tk,2));
                        dshd.addRow(row);
                        tblSPHD.setModel(dshd);
                    }

                }

            }
        }
        SanPhamDTO spd = new SanPhamDTO();
        spd.setMaSP(tblSPTK.getValueAt(cr_tk,0).toString());
        spd.setTenSP(tblSPTK.getValueAt(cr_tk,1).toString());
        spd.setDonGia(Integer.parseInt(tblSPTK.getValueAt(cr_tk,2).toString()));
        spd.setSoLuongCo(Integer.parseInt(tblSPTK.getValueAt(cr_tk,3).toString()));
        try {
            spb.Update(spd);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        HienTongGiaTien();
        try {
            HienGiamGia();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        HienTongThanhTien();
    }//GEN-LAST:event_btThemHDMouseClicked

    private void tblSPTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPTKMouseClicked
        int n = tblSPTK.getSelectedRow(); // lấy số dòng hiện tại của table sptk
        cr_tk = n;
    }//GEN-LAST:event_tblSPTKMouseClicked

    private void btTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTimKiemMouseClicked
        TaoBangTimKiem();
        ArrayList<SanPhamDTO> ar = null;
        // SanPhamBUS spb = new SanPhamBUS();

        try {
            ar = spb.getSanPham("tensp like "+"'%"+tfTimKiem.getText()+"%'" );
            
            SanPhamDTO spd = new SanPhamDTO();
            for (int i = 0; i < ar.size(); i++) {
                Vector row = new Vector();
                spd = ar.get(i);
                row.add(spd.getMaSP());
                row.add(spd.getTenSP());
                // row.add(spd.getDonViTinh());
                row.add(spd.getDonGia());
                row.add(spd.getSoLuongCo());
                dstk.addRow(row);
            }

            //ds = model;
            tblSPTK.setModel(dstk);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btTimKiemMouseClicked
    private void TaoBangTimKiem(){
        Vector header = new Vector();
        header.add("Mã Sản Phẩm");
        header.add("Tên Sản Phẩm");
        //header.add("Đơn vị tính");
        header.add("Đơn giá");
        header.add("Số lượng có");
        DefaultTableModel model = new DefaultTableModel(header,0);
        dstk=model;
        tblSPTK.setModel(dstk);
    }
     private void TaoBangSPHoaDon(){
        Vector header = new Vector();
        header.add("Mã Sản Phẩm");
        header.add("Tên Sản Phẩm");
        header.add("Số lượng");
        header.add("Đơn giá");
        //header.add("Mã giảm giá");
        DefaultTableModel model = new DefaultTableModel(header,1);
        dshd=model;
        tblSPHD.setModel(model);
      
    }
     private void HienTongGiaTien(){
        int Tong=0;
        for (int i = 0; i < tblSPHD.getRowCount(); i++) {
            if(tblSPHD.getValueAt(i,3)!= null && tblSPHD.getValueAt(i,2)!=null){
               int TongGiaTri=Integer.parseInt(tblSPHD.getValueAt(i,3).toString());
               int TongSoLuong=Integer.parseInt(tblSPHD.getValueAt(i,2).toString());
               Tong+=TongGiaTri*TongSoLuong; 
            }  
        }
        Object t = Tong;
        tfTienHang.setText(t.toString());
    }
    private void HienTongThanhTien(){
        double Tong =0;
        double SoTienGiam=0;
        int TienThanhToan =Integer.parseInt(tfTienHang.getText());
        int GiamGia=1;
        if(!tfGiamGia.getText().isEmpty()){
            GiamGia = Integer.parseInt(tfGiamGia.getText());
        }
        Tong= Double.parseDouble(tfTienHang.getText());
        SoTienGiam=(TienThanhToan*GiamGia)/100;
        Tong= Tong-SoTienGiam;
        Object t = Tong;
        tfTongCong.setText(t.toString());
    }
    void HienGiamGia() throws Exception{
        int Tong=0;
            if(!tfMaGiamGia.getText().isEmpty()){
                int MaGiamGia = Integer.parseInt(tfMaGiamGia.getText());
                ArrayList<GiamGiaDTO> ar = new ArrayList<GiamGiaDTO>();
                ar=ggb.getGiamGia("magiamgia="+"'"+MaGiamGia+"'");
                for (int i = 0; i < ar.size(); i++) {
                    GiamGiaDTO gg = new GiamGiaDTO();
                    gg = ar.get(i);
                    Tong+=gg.getMucGiam();
                }
                
            }
            if(Tong!=0){
                Object t = Tong;
                tfGiamGia.setText(t.toString());
            }
        
    }
    void HienThiNgay(){
        Date date = new Date();
        String str = String.format("%tf",date);
        tfNgayLap.setText(str);
        
    }
           
    private SanPhamDTO TimKiemSPTheoID(String TableID){
        SanPhamDTO spd = new SanPhamDTO();
        ArrayList<SanPhamDTO> ar = null;
        try {
            ar = spb.getSanPham("masp = "+"'"+TableID+"'" );
            for (int i = 0; i < ar.size(); i++) {
                spd = ar.get(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return spd;
    }
    
    private void getMaHD(){ // Khởi tạo mã hóa đơn
        
        Calendar cal = Calendar.getInstance();
        String prefixMHD = "HD" + cal.get(Calendar.YEAR) + "" + String.format("%1$02d", cal.get(Calendar.MONTH));
        
        try {
            String MaHDMoiNhat = hdb.MaHDMoiNhat(prefixMHD);
            if(MaHDMoiNhat == null)
                MaHDMoiNhat = prefixMHD + "001";
            else
            {
                int MHD;
                MHD = Integer.parseInt(MaHDMoiNhat.replace(prefixMHD,  ""));
                MaHDMoiNhat = prefixMHD + String.format("%1$03d", ++MHD);
            }
            tfMHD.setText(MaHDMoiNhat);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGiamHD;
    private javax.swing.JButton btTaoMoiHoaDon;
    private javax.swing.JButton btThanhToan;
    private javax.swing.JButton btThemHD;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblSPHD;
    private javax.swing.JTable tblSPTK;
    private javax.swing.JTextField tfGiamGia;
    private javax.swing.JTextField tfKhachHang;
    private javax.swing.JTextField tfMHD;
    private javax.swing.JTextField tfMaGiamGia;
    private javax.swing.JTextField tfNgayLap;
    private javax.swing.JTextField tfSoLuong;
    private javax.swing.JTextField tfTienHang;
    private javax.swing.JTextField tfTimKiem;
    private javax.swing.JTextField tfTongCong;
    // End of variables declaration//GEN-END:variables
}
