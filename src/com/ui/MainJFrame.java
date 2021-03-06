/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.helper.DialogHelper;
import com.helper.ShareHelper;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Pham Nguyen Hoang Anh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
         initComponents();
        init();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

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
        lblHeQuanLyDaoTao = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangxuat = new javax.swing.JButton();
        btnKetthuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnNhanVien = new javax.swing.JButton();
        btnKhachhang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnHoadon = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnHoadon1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatkhau = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        NhanVien = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        mniSanPham = new javax.swing.JMenuItem();
        mniHoaDon = new javax.swing.JMenuItem();
        mniHoaDon1 = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDanSuDung = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieuSanPham = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ HỆ THỐNG");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("HỆ THỐNG QUẢN LÝ");

        lblHeQuanLyDaoTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Info.png"))); // NOI18N
        lblHeQuanLyDaoTao.setText("Hệ thống quản lý");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("00:00:00 AM");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/01.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Exit.png"))); // NOI18N
        btnDangxuat.setText("Đăng Xuất");
        btnDangxuat.setFocusable(false);
        btnDangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangxuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangxuat);

        btnKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Stop.png"))); // NOI18N
        btnKetthuc.setText("Kết Thúc");
        btnKetthuc.setFocusable(false);
        btnKetthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetthuc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKetthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetthuc);

        jSeparator1.setToolTipText("");
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar1.add(jSeparator1);

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/nhanvien.png"))); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhanVien);

        btnKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/khachHang.png"))); // NOI18N
        btnKhachhang.setText("Khách Hàng");
        btnKhachhang.setFocusable(false);
        btnKhachhang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachhang.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKhachhang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachhangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhachhang);

        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/sanpham.png"))); // NOI18N
        btnSanPham.setText("Sản Phẩm");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSanPham);

        btnHoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/hoadon.png"))); // NOI18N
        btnHoadon.setText("Hóa Đơn");
        btnHoadon.setFocusable(false);
        btnHoadon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoadon.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoadonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHoadon);
        jToolBar1.add(jSeparator3);

        btnHoadon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Bar chart.png"))); // NOI18N
        btnHoadon1.setText("Thống Kê");
        btnHoadon1.setFocusable(false);
        btnHoadon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoadon1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHoadon1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoadon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoadon1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHoadon1);

        mnuHeThong.setText("Hệ thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Exit.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator4);

        mniDoiMatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Refresh.png"))); // NOI18N
        mniDoiMatkhau.setText("Đổi mật khẩu");
        mnuHeThong.add(mniDoiMatkhau);
        mnuHeThong.add(jSeparator5);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/nhanvien.png"))); // NOI18N
        NhanVien.setText("Nhân viên");
        NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(NhanVien);

        mniKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/khachHang.png"))); // NOI18N
        mniKhachHang.setText("Khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhachHang);

        mniSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/sanpham.png"))); // NOI18N
        mniSanPham.setText("Sản phẩm");
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniSanPham);

        mniHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/hoadon.png"))); // NOI18N
        mniHoaDon.setText("Hóa đơn");
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHoaDon);

        mniHoaDon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/Bar chart.png"))); // NOI18N
        mniHoaDon1.setText("Thống kê");
        mniHoaDon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDon1ActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHoaDon1);

        jMenuBar1.add(mnuQuanLy);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDanSuDung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDanSuDung.setText("Hướng dẫn sử dụng");
        mnuTroGiup.add(mniHuongDanSuDung);
        mnuTroGiup.add(jSeparator8);

        mniGioiThieuSanPham.setText("Giới thiệu sản phẩm");
        mnuTroGiup.add(mniGioiThieuSanPham);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeQuanLyDaoTao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDongHo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeQuanLyDaoTao)
                    .addComponent(lblDongHo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        // TODO add your handling code here:
        openLogin();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_NhanVienActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        // TODO add your handling code here:
        openKhachHang();
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed
        // TODO add your handling code here:
        openSanPham();
    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonActionPerformed
        // TODO add your handling code here:
        openHoaDon();
    }//GEN-LAST:event_mniHoaDonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void btnKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetthucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnKetthucActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachhangActionPerformed
        // TODO add your handling code here:
        openKhachHang();
    }//GEN-LAST:event_btnKhachhangActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        openSanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnHoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoadonActionPerformed
        // TODO add your handling code here:
        openHoaDon();
    }//GEN-LAST:event_btnHoadonActionPerformed

    private void btnHoadon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoadon1ActionPerformed
        // TODO add your handling code here:
        openThongKe();
    }//GEN-LAST:event_btnHoadon1ActionPerformed

    private void mniHoaDon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDon1ActionPerformed
        // TODO add your handling code here:
        openThongKe();
    }//GEN-LAST:event_mniHoaDon1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem NhanVien;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnHoadon;
    private javax.swing.JButton btnHoadon1;
    private javax.swing.JButton btnKetthuc;
    private javax.swing.JButton btnKhachhang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHeQuanLyDaoTao;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatkhau;
    private javax.swing.JMenuItem mniGioiThieuSanPham;
    private javax.swing.JMenuItem mniHoaDon;
    private javax.swing.JMenuItem mniHoaDon1;
    private javax.swing.JMenuItem mniHuongDanSuDung;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables
void init() {
        setSize(1000, 700);
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);

        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");         
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
//        this.openWelcome();
//        this.openLogin();
    }
    
    void openLogin(){
        new DangNhapJFrame().setVisible(true);
    }
    
    void openWelcome(){
        new ChaoJDialog(this, true).setVisible(true);
    }

    //Đăng xuất
    void logoff(){
        ShareHelper.logoff();
        this.openLogin();
    }
    
    //Thoát
    void exit(){
        if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){
            System.exit(0);
        }
    }
    
    //Mở Quản lý Nhân Viên
    void openHoaDon(){
        if(ShareHelper.authenticated()){
            new HoaDonJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    //Mở San Phẩm
    void openSanPham(){
        if(ShareHelper.authenticated()){
            new SanPhamJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openThongKe(){
        if(ShareHelper.authenticated()){
            new ThongKeJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    //Mở Chuyên đề
    void openKhachHang(){
        if(ShareHelper.authenticated()){
            new KhachHangJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openNhanVien(){
        if(ShareHelper.authenticated()){
            new NhanVienJFrame().setVisible(true);
        }
        else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    //Mở giới thiệu
    //Mở hướng dẫn
    void openWebsite(){
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        }
        catch (IOException ex) {
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }
}
