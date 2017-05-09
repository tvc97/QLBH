/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.CtNhaCungCapBUS;
import BUS.NhaCungCapBUS;
import DTO.CtNhaCungCapDTO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HeoBayMau
 */
public class NhaCungCapGUI extends javax.swing.JFrame {
    private DefaultTableModel ds;
    private DefaultTableModel ds2;
    private NhaCungCapBUS nccb = new NhaCungCapBUS();
    private CtNhaCungCapBUS ctnccb = new CtNhaCungCapBUS();
    private int cr;
    private int cr2;
    /**
     * Creates new form NhaCungCapGUI
     */
    public NhaCungCapGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelMaNhaCungCap = new javax.swing.JLabel();
        LabelTenNhaCungCap = new javax.swing.JLabel();
        LabelDiaChi = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelSoDienThoai = new javax.swing.JLabel();
        LabelMaSanPham = new javax.swing.JLabel();
        txtMaNhaCungCap = new javax.swing.JTextField();
        txtTenNhaCungCap = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtMaSanPham = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableNhaCungCap = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableChiTietNhaCungCap = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnXoaChiTiet = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách nhà cung cấp");

        LabelMaNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMaNhaCungCap.setText("Mã nhà cung cấp");

        LabelTenNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTenNhaCungCap.setText("Tên nhà cung cấp");

        LabelDiaChi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDiaChi.setText("Địa chỉ");

        LabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEmail.setText("Email");

        LabelSoDienThoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSoDienThoai.setText("Số điện thoại");

        LabelMaSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMaSanPham.setText("Mã sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TableNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableNhaCungCap);

        TableChiTietNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableChiTietNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableChiTietNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableChiTietNhaCungCap);

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnXoa.setText("Xoá NCC");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnHienThi.setText("Hiển thị");
        btnHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHienThiMouseClicked(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXoaChiTiet.setText("Xoá chi tiết");
        btnXoaChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaChiTietMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnXoaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXoaChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHienThi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienThiMouseClicked
        Vector header = new Vector();
        header.add("Mã nhà cung cấp");
        header.add("Tên nhà cung cấp");
        header.add("Địa chỉ");
        header.add("Email");
        header.add("Số điện thoại");
        DefaultTableModel table = new DefaultTableModel(header,0);
        ArrayList<NhaCungCapDTO> ar = null;
        try {
            ar = nccb.getNhaCungCap();
            NhaCungCapDTO nccd = new NhaCungCapDTO();
            for(int i=0; i<ar.size(); i++)
            {
                Vector row = new Vector();
                nccd = ar.get(i);
                row.add(nccd.getMaNCC());
                row.add(nccd.getTenNCC());
                row.add(nccd.getDiaChi());
                row.add(nccd.getEmail());
                row.add(nccd.getSdt());
                table.addRow(row);
            }
            ds = table;
            TableNhaCungCap.setModel(table);
        } catch (Exception e) {
        }
        Vector header2 = new Vector();
        header2.add("Mã nhà cung cấp");
        header2.add("Mã sản phẩm");
        DefaultTableModel table2 = new DefaultTableModel(header2, 0);
        ArrayList<CtNhaCungCapDTO> ar2 = null;
        try {
            ar2 = ctnccb.getCtNhaCungCap();
            CtNhaCungCapDTO ctnccd = new CtNhaCungCapDTO();
            for(int i=0; i<ar2.size(); i++)
            {
                Vector row2 = new Vector();
                ctnccd = ar2.get(i);
                row2.add(ctnccd.getMaNCC());
                row2.add(ctnccd.getMaSanPham());
                table2.addRow(row2);
            }
            ds2 = table2;
            TableChiTietNhaCungCap.setModel(table2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnHienThiMouseClicked

    private void TableNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNhaCungCapMouseClicked
        try {                                             
            int n = TableNhaCungCap.getSelectedRow();
            cr = n;
            txtMaNhaCungCap.setText(TableNhaCungCap.getValueAt(n, 0).toString());
            txtTenNhaCungCap.setText(TableNhaCungCap.getValueAt(n, 1).toString());
            txtDiaChi.setText(TableNhaCungCap.getValueAt(n, 2).toString());
            txtEmail.setText(TableNhaCungCap.getValueAt(n, 3).toString());
            txtSoDienThoai.setText(TableNhaCungCap.getValueAt(n, 4).toString());
            
            ArrayList<CtNhaCungCapDTO> nccs = ctnccb.getCtNhaCungCap();
            Vector header2 = new Vector();
            header2.add("Mã nhà cung cấp");
            header2.add("Mã sản phẩm");
            DefaultTableModel table2 = new DefaultTableModel(header2, 0);
            try {
                nccs = ctnccb.getCtNhaCungCap("MaNCC = " + "'" + txtMaNhaCungCap.getText() + "'");
                CtNhaCungCapDTO ctnccd = new CtNhaCungCapDTO();
                for(int i=0; i<nccs.size(); i++)
                {
                    Vector row2 = new Vector();
                    ctnccd = nccs.get(i);
                    row2.add(ctnccd.getMaNCC());
                    row2.add(ctnccd.getMaSanPham());
                    row2.add(ctnccd.getTenSanPham());
                    table2.addRow(row2);
                }
                ds2 = table2;
                TableChiTietNhaCungCap.setModel(table2);
            } catch (Exception e) {
            }
        } catch (Exception ex) {
            Logger.getLogger(NhaCungCapGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TableNhaCungCapMouseClicked

    private void TableChiTietNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableChiTietNhaCungCapMouseClicked
        int n = TableChiTietNhaCungCap.getSelectedRow();
        cr2 = n;
        txtMaSanPham.setText(TableChiTietNhaCungCap.getValueAt(n, 1).toString());
        
    }//GEN-LAST:event_TableChiTietNhaCungCapMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        try {
            NhaCungCapDTO nccd = new NhaCungCapDTO();
            nccd.setMaNCC(txtMaNhaCungCap.getText());
            nccd.setTenNCC(txtTenNhaCungCap.getText());
            nccd.setDiaChi(txtDiaChi.getText());
            nccd.setEmail(txtEmail.getText());
            nccd.setSdt(Long.parseLong(txtSoDienThoai.getText()));
            CtNhaCungCapDTO ctnccd = new CtNhaCungCapDTO();
            ctnccd.setMaNCC(txtMaNhaCungCap.getText());
            ctnccd.setMaSanPham(txtMaSanPham.getText());
            nccb.Insert(nccd);
            ctnccb.Insert(ctnccd);
            Vector row = new Vector();
            row.add(txtMaNhaCungCap.getText());
            row.add(txtTenNhaCungCap.getText());
            row.add(txtDiaChi.getText());
            row.add(txtEmail.getText());
            row.add(txtSoDienThoai.getText());
            ds.addRow(row);
            TableNhaCungCap.setModel(ds);
            Vector row2 = new Vector();
            row2.add(txtMaNhaCungCap.getText());
            row2.add(txtMaSanPham.getText());
            ds2.addRow(row2);
            TableChiTietNhaCungCap.setModel(ds2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        try {
            NhaCungCapDTO nccd = new NhaCungCapDTO();
            nccd.setMaNCC(txtMaNhaCungCap.getText());
            nccd.setTenNCC(txtTenNhaCungCap.getText());
            nccd.setDiaChi(txtDiaChi.getText());
            nccd.setEmail(txtEmail.getText());
            nccd.setSdt(Long.parseLong(txtSoDienThoai.getText()));
            nccb.Delete(nccd);
            ds.removeRow(cr);
            TableNhaCungCap.setModel(ds);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnXoaChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaChiTietMouseClicked
        try {
            CtNhaCungCapDTO ctnccd = new CtNhaCungCapDTO();
            ctnccd.setMaNCC(txtMaNhaCungCap.getText());
            ctnccd.setMaSanPham(txtMaNhaCungCap.getText());
            ctnccb.Delete(ctnccd);
            ds2.removeRow(cr2);
            TableChiTietNhaCungCap.setModel(ds2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaChiTietMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        try {
            NhaCungCapDTO nccd = new NhaCungCapDTO();
            nccd.setMaNCC(txtMaNhaCungCap.getText());
            nccd.setTenNCC(txtTenNhaCungCap.getText());
            nccd.setDiaChi(txtDiaChi.getText());
            nccd.setEmail(txtEmail.getText());
            nccd.setSdt(Long.parseLong(txtSoDienThoai.getText()));
            
            CtNhaCungCapDTO ctnccd = new CtNhaCungCapDTO();
            ctnccd.setMaNCC(txtMaNhaCungCap.getText());
            ctnccd.setMaSanPham(txtMaNhaCungCap.getText());
            
            nccb.Update(nccd);
            ctnccb.Update(ctnccd);
            
            ds.setValueAt(txtMaNhaCungCap.getText(), cr, 0);
            ds.setValueAt(txtTenNhaCungCap.getText(), cr, 1);
            ds.setValueAt(txtDiaChi.getText(), cr, 2);
            ds.setValueAt(txtEmail.getText(), cr, 3);
            ds.setValueAt(txtSoDienThoai.getText(), cr, 4);
            
            ds2.setValueAt(txtMaNhaCungCap.getText(), cr2, 0);
            ds2.setValueAt(txtMaSanPham.getText(), cr2, 1);
            
            
            TableNhaCungCap.setModel(ds);
            TableChiTietNhaCungCap.setModel(ds2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(NhaCungCapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhaCungCapGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDiaChi;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelMaNhaCungCap;
    private javax.swing.JLabel LabelMaSanPham;
    private javax.swing.JLabel LabelSoDienThoai;
    private javax.swing.JLabel LabelTenNhaCungCap;
    private javax.swing.JTable TableChiTietNhaCungCap;
    private javax.swing.JTable TableNhaCungCap;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaChiTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNhaCungCap;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhaCungCap;
    // End of variables declaration//GEN-END:variables
}
