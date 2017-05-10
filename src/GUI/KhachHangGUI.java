/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.KhachHangBUS;
import DTO.KhachHangDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SocBayMau
 */
public class KhachHangGUI extends javax.swing.JFrame {
    private DefaultTableModel ds;
    private KhachHangBUS khb =new KhachHangBUS();
    private int cr;
    
    
    /**
     * Creates new form KhachHangGUI
     */
    public KhachHangGUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableKhachHang = new javax.swing.JTable();
        LabelMaKH = new javax.swing.JLabel();
        LabelTenKH = new javax.swing.JLabel();
        LabelDiaChi = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelSDT = new javax.swing.JLabel();
        btnThemKH = new javax.swing.JButton();
        LabelTongHoaDon = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtTongHoaDon = new javax.swing.JTextField();
        btnSuaKH = new javax.swing.JButton();
        btnXoaKH = new javax.swing.JButton();
        btnHienThiKH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách Khách Hàng");
        jLabel1.setToolTipText("");

        TableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Email", "Số điện thoại", "Tổng hoá đơn"
            }
        ));
        TableKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableKhachHang);

        LabelMaKH.setText("Mã khách hàng");

        LabelTenKH.setText("Tên khách hàng");

        LabelDiaChi.setText("Địa chỉ");

        LabelEmail.setText("Email");

        LabelSDT.setText("Số điện thoại");

        btnThemKH.setText("Thêm");
        btnThemKH.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnThemKHAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemKHMouseClicked(evt);
            }
        });
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        LabelTongHoaDon.setText("Tổng hoá đơn");

        btnSuaKH.setText("Sửa");
        btnSuaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaKHMouseClicked(evt);
            }
        });

        btnXoaKH.setText("Xoá");
        btnXoaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaKHMouseClicked(evt);
            }
        });

        btnHienThiKH.setText("Hiển thị");
        btnHienThiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHienThiKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(LabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSDT)
                                    .addComponent(txtTongHoaDon)
                                    .addComponent(txtMaKH)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHienThiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(LabelTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHienThiKH)
                        .addComponent(btnThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void btnThemKHAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnThemKHAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemKHAncestorAdded

    private void btnThemKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemKHMouseClicked
        // TODO add your handling code here:
        try{
             KhachHangDTO khd= new KhachHangDTO();
            int TongHoaDon=0;
            khd.setMaKH(txtMaKH.getText());
            khd.setTenKH(txtTenKH.getText());
            khd.setDiaChi(txtDiaChi.getText());
            khd.setEmail(txtEmail.getText());
            khd.setSĐT(Long.parseLong(txtSDT.getText()));
            khd.setTongHoaDon(Integer.parseInt(txtTongHoaDon.getText()));
            khb.InSert(khd);
        Vector row = new Vector();
            row.add(txtMaKH.getText());
            row.add(txtTenKH.getText());
            row.add(txtDiaChi.getText());
            row.add(txtEmail.getText());
            row.add(txtSDT.getText());
            row.add(txtTongHoaDon.getText());
            //row.add(txtMatKhau.getText());
            ds.addRow(row);
            TableKhachHang.setModel(ds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemKHMouseClicked

    private void btnSuaKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaKHMouseClicked
        // TODO add your handling code here:
        try {
            KhachHangDTO khd = new KhachHangDTO();
            khd.setMaKH(txtMaKH.getText());
            khd.setTenKH(txtTenKH.getText());
            khd.setDiaChi(txtDiaChi.getText());
            khd.setEmail(txtEmail.getText());
            khd.setSĐT(Long.parseLong(txtSDT.getText()));
            khd.setTongHoaDon(Integer.parseInt(txtTongHoaDon.getText()));
            khb.Update(khd);
            ds.setValueAt(txtMaKH.getText(), cr, 0);
            ds.setValueAt(txtTenKH.getText(), cr, 1);
            ds.setValueAt(txtDiaChi.getText(), cr, 2);
            ds.setValueAt(txtEmail.getText(), cr, 3);
            ds.setValueAt(txtSDT.getText(), cr, 4);
            ds.setValueAt(txtTongHoaDon.getText(), cr, 5);
            TableKhachHang.setModel(ds);
        } catch (Exception e) {
        }
    
    }//GEN-LAST:event_btnSuaKHMouseClicked

    private void btnXoaKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaKHMouseClicked
        // TODO add your handling code here:
        try {
            KhachHangDTO khd = new KhachHangDTO();
            khd.setMaKH(txtMaKH.getText());
            khd.setTenKH(txtTenKH.getText());
            khd.setDiaChi(txtDiaChi.getText());
            khd.setEmail(txtEmail.getText());
            khd.setSĐT(Long.parseLong(txtSDT.getText()));
            khd.setTongHoaDon(Integer.parseInt(txtTongHoaDon.getText()));
            khb.Delete(khd);
            ds.removeRow(cr);
            TableKhachHang.setModel(ds);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaKHMouseClicked

    private void btnHienThiKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienThiKHMouseClicked
        // TODO add your handling code here:
        Vector header = new Vector();
        header.add("Mã khách hàng");
        header.add("Tên khách hàng");
        header.add("Địa chỉ");
        header.add("Email");
        header.add("Số điện thoại");
        header.add("Tổng hoá đơn");
        DefaultTableModel table=new DefaultTableModel(header, 0);
        ArrayList<KhachHangDTO> ar= null;
      try{
            ar=khb.getKhachHang();
            KhachHangDTO khd=new KhachHangDTO();
            for(int i=0;i<ar.size();i++)
            {
                Vector row=new Vector();
                khd= ar.get(i);
                row.add(khd.getMaKH());
                row.add(khd.getTenKH());
                row.add(khd.getDiaChi());
                row.add(khd.getEmail());
                row.add(khd.getSĐT());
                row.add(khd.getTongHoaDon());
                     table.addRow(row);
           }
           ds = table;
           TableKhachHang.setModel(table);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnHienThiKHMouseClicked

    private void TableKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKhachHangMouseClicked
        // TODO add your handling code here:
        int n = TableKhachHang.getSelectedRow();
        cr = n;
        txtMaKH.setText(TableKhachHang.getValueAt(n, 0).toString());
        txtTenKH.setText(TableKhachHang.getValueAt(n, 1).toString());
        txtDiaChi.setText(TableKhachHang.getValueAt(n, 2).toString());
        //txtMatKhau.setText(TableNhanVien.getValueAt(n, 8).toString());
        txtEmail.setText(TableKhachHang.getValueAt(n, 3).toString());
        txtSDT.setText(TableKhachHang.getValueAt(n, 4).toString());
        txtTongHoaDon.setText(TableKhachHang.getValueAt(n, 5).toString());
    }//GEN-LAST:event_TableKhachHangMouseClicked


    
            
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
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangGUI().setVisible(true);
            
                }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDiaChi;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelMaKH;
    private javax.swing.JLabel LabelSDT;
    private javax.swing.JLabel LabelTenKH;
    private javax.swing.JLabel LabelTongHoaDon;
    private javax.swing.JTable TableKhachHang;
    private javax.swing.JButton btnHienThiKH;
    private javax.swing.JButton btnSuaKH;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnXoaKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTongHoaDon;
    // End of variables declaration//GEN-END:variables
}
