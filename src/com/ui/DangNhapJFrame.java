/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.DAO.NhanVienDAO;
import com.helper.DialogHelper;
import com.helper.ShareHelper;
import com.model.NhanVien;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class DangNhapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapJFrame
     */
    public DangNhapJFrame() {
        initComponents();
        setLocationRelativeTo(null);
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
        lblDangNhap = new javax.swing.JLabel();
        lblTenDN = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDangNhap.setForeground(new java.awt.Color(0, 152, 51));
        lblDangNhap.setText("ĐĂNG NHẬP");

        lblTenDN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTenDN.setText("Tên đăng nhập");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnDangNhap.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Kết thúc");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/security.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenDN)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDangNhap)
                            .addGap(160, 160, 160))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)))
                    .addComponent(lblMatKhau)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnDangNhap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit))
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblDangNhap)
                .addGap(3, 3, 3)
                .addComponent(lblTenDN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnDangNhap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if(this.isvalid()){
            this.login();
            
        }
        //this.login();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.exit();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDN;
    public javax.swing.JTextField txtMaNV;
    public javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
NhanVienDAO dao = new NhanVienDAO();
    void init(){
        setLocationRelativeTo(null);
    }
    
    public boolean isvalid(){
        if((txtMaNV.getText()+txtMatKhau.getText()).length()==0){
            DialogHelper.alert(this, "Không được bỏ trống username và password!");
            return false;
        }
        if(txtMaNV.getText().length() == 0){
            DialogHelper.alert(this, "Không được bỏ trống username!");
            return false;
        }
        if(txtMatKhau.getText().length() == 0){
            DialogHelper.alert(this, "Không được bỏ trống Password!");
            return false;
        }
        return true;
    }
    
//    public boolean checkloi(){
//       try{
//          if(this.txtMaNV.getText().equals("")){
//            jLabel1.setText("Chưa nhập tên đăng nhập!");        
//              txtMaNV.requestFocus();
//              return false;
//          }else{
//              jLabel1.setText(null);
//              
//          }
//          if(this.txtMatKhau.getText().equals("")){
//            lblMatKhau.setText("Chưa nhập mật khẩu!");
////            lblNV.setText(null);
//              txtMatKhau.requestFocus();
//              return false;
//          }else{
//              lblMatKhau.setText(null);
//          }         
//   }catch(Exception e){
//                e.printStackTrace();
//                return false;  
//   }
//       return true;
//}
    
    public boolean login() {
        String manv = txtMaNV.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        try {
            NhanVien nhanVien = dao.findById(manv);
            if(nhanVien != null){
                String matKhau2 = nhanVien.getMatKhau();
                if(matKhau.equals(matKhau2)){
                    ShareHelper.USER = nhanVien;
                    DialogHelper.alert(this, "Đăng nhập thành công!");
                    this.dispose();
                    MainJFrame m = new MainJFrame();
                    m.setVisible(true);
                    return true;
                }
                else{
                    DialogHelper.alert(this, "Sai password!");
                    txtMatKhau.setText("");
                }
            }
            else{
                DialogHelper.alert(this, "Sai username!");
                txtMaNV.setText("");
                txtMatKhau.setText("");
            }
        }
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        return false;
    }
    void exit(){
        if(DialogHelper.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không?")){
        System.exit(0);
        }
    }
}

