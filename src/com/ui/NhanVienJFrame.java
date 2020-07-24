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
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pham Nguyen Hoang Anh
 */
public class NhanVienJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienJFrame
     */
    public NhanVienJFrame() {
        initComponents();
        init();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        
    }
    int index = 0; // vị trí của nhân viên đang hiển thị trên form
    NhanVienDAO dao = new NhanVienDAO();
    //Hàm init
    void init(){
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }
    //Bắt lỗi
    public boolean isvalid(){
        if((txtmanv.getText() + txthoten.getText() + txtmatkhau.getText() + txtmatkhau2.getText()).isEmpty()  ) {
            DialogHelper.alert(this, "Vui lòng điền các trường còn thiếu!");
            return false;
        }
        if(txtmanv.getText().length() == 0){
            DialogHelper.alert(this, "Không được bỏ trống Username!");
            return false;
        }
        //Không xoá chính mình
        if(txtmatkhau.getText().length() < 3){
            DialogHelper.alert(this, "Password ít nhất có 3 ký tự!");
            return false;
        }
        if(txtmatkhau.getText().length() == 0){
            DialogHelper.alert(this, "Không được bỏ trống Password!");
            return false;
        }
        if(txtmatkhau2.equals(txtmatkhau)){
            DialogHelper.alert(this, "Xác nhận Password! không chính xác");
            return false;
        }
        if(txtmatkhau2.getText().length() == 0){
            DialogHelper.alert(this, "Nhập lại Password để xác nhận!");
            return false;
        }
        //Chỉ chứa alphabet và ký tự trắng
        return true;
    }
    
    //Load dữ liệu
    void load() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.select();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getMatKhau(),
                    nv.getHoTen()
                };
            model.addRow(row);
            }
        }
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    //Thêm DL
    public boolean insert(){
        NhanVien model = getModel();
        String confirm = new String(txtmatkhau2.getText());
        if(confirm.equals(model.getMatKhau())){
            try {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
                return true;
            }
            catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        }
        else{
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        }
        return false;
    }
 
    //Cập nhật DL
    public boolean update(){
        NhanVien model = getModel();
        String confirm = new String(txtmatkhau2.getText());
        if(!confirm.equals(model.getMatKhau())){
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        }
        else{
            try {
                dao.update(model);
                this.load();
                DialogHelper.alert(this, "Cập nhật thành công!");
                return true;
            }
            catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
        return false;
    }
    //Xoá DL
    public boolean delete(){
        if(DialogHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")){
        String manv = txtmanv.getText();
            try {
            dao.delete(manv);
            this.load();
            this.clear();
            DialogHelper.alert(this, "Xóa thành công!");
            return true;
            }
            catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại!");
            }
        }
        return false;
    }
    //Chỉnh sửa
    void edit() {
        try {
            String manv = (String) tblGridView.getValueAt(this.index, 0);
            NhanVien model = dao.findById(manv);
            if(model != null){
                this.setModel(model);
                this.setStatus(false);        
            }
        }
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    //làm mới
    void clear(){
        this.setModel(new NhanVien());
        this.setStatus(true);
    }
    
    void setModel(NhanVien model){
        txtmanv.setText(model.getMaNV());
        txthoten.setText(model.getHoTen());
        txtmatkhau.setText(model.getMatKhau());
        txtmatkhau2.setText(model.getMatKhau());
        lblNV.setText(null);
        lblPass.setText(null);
        lblPass2.setText(null);
        lblHT.setText(null);
    }

    NhanVien getModel(){
        NhanVien model = new NhanVien();
        model.setMaNV(txtmanv.getText());
        model.setHoTen(txthoten.getText());
        model.setMatKhau(new String(txtmatkhau.getPassword()));
        return model;
    }
    
    void setStatus(boolean insertable){
        btnthem.setEnabled(insertable);
        btnsua.setEnabled(!insertable);
        btnxoa.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tblGridView.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnLast.setEnabled(!insertable && last);
        btnLast1.setEnabled(!insertable && last);
    }
    public boolean checkloi(){
       try{
          if(this.txtmanv.getText().equals("")){
            lblNV.setText("Chưa nhập Mã Nhân Viên!");            
              txtmanv.requestFocus();
              return false;
          }else{
              lblNV.setText(null);             
          }
          if(this.txtmatkhau.getText().equals("")){
            lblPass.setText("Chưa nhập Mật Khẩu!");
//            lblNV.setText(null);
              txtmatkhau.requestFocus();
              return false;
          }else{
              lblPass.setText(null);
          }
          if(this.txtmatkhau2.getText().equals("")){
            lblPass2.setText("Chưa nhập Lại Mật Khẩu!");
              txtmatkhau2.requestFocus();
              return false;
          }else{
              lblPass2.setText(null);
          }
          if(this.txthoten.getText().equals("")){
            lblHT.setText("Chưa nhập Họ Tên!");
              txthoten.requestFocus();
              return false;
          }else{
              lblHT.setText(null);
          }
   }catch(Exception e){
                e.printStackTrace();
                return false;  
   }
       return true;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmatkhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnLast1 = new javax.swing.JButton();
        txtmatkhau2 = new javax.swing.JPasswordField();
        lblNV = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblPass2 = new javax.swing.JLabel();
        lblHT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(84, 490));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(624, 490));

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 490));

        jLabel2.setText("Mã nhân viên");

        txtmanv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmanvKeyReleased(evt);
            }
        });

        jLabel3.setText("Mật khẩu");

        txtmatkhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatkhauKeyReleased(evt);
            }
        });

        jLabel4.setText("Xác nhận mật khẩu");

        jLabel5.setText("Họ tên nhân viên");

        txthoten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthotenKeyReleased(evt);
            }
        });

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jButton4.setText("Mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnLast1.setText(">|");
        btnLast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast1ActionPerformed(evt);
            }
        });

        txtmatkhau2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatkhau2KeyReleased(evt);
            }
        });

        lblNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNV.setForeground(new java.awt.Color(255, 0, 0));

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 0, 0));

        lblPass2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPass2.setForeground(new java.awt.Color(255, 0, 0));

        lblHT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblHT.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtmatkhau)
                    .addComponent(txthoten)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(67, 67, 67)
                        .addComponent(btnFirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrev)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnLast1))
                    .addComponent(txtmatkhau2)
                    .addComponent(lblNV)
                    .addComponent(lblPass)
                    .addComponent(lblPass2)
                    .addComponent(lblHT)
                    .addComponent(txtmanv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNV)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPass)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmatkhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPass2)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHT)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(jButton4)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnLast)
                    .addComponent(btnLast1))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CẬP NHẬT", jPanel1);

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Mật khẩu", "Họ và tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            this.index = tblGridView.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
            jTabbedPane1.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        if(this.checkloi()){
           if(this.isvalid()){
               this.insert();
//           }
           }
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        if(this.checkloi()){
           if(this.isvalid()){
               this.update();
           }
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
                this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();  
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnLast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast1ActionPerformed
        // TODO add your handling code here:
        this.index = tblGridView.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLast1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);   
    }//GEN-LAST:event_formWindowOpened

    private void txtmanvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmanvKeyReleased
      if(!txtmanv.getText().equals("")){
           lblNV.setText(null);
      }
    }//GEN-LAST:event_txtmanvKeyReleased

    private void txtmatkhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatkhauKeyReleased
        // TODO add your handling code here:
        if(!txtmatkhau.getText().equals("")){
           lblPass.setText(null);
      }
    }//GEN-LAST:event_txtmatkhauKeyReleased

    private void txtmatkhau2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatkhau2KeyReleased
        // TODO add your handling code here:
        if(!txtmatkhau2.getText().equals("")){
           lblPass2.setText(null);
      }
    }//GEN-LAST:event_txtmatkhau2KeyReleased

    private void txthotenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthotenKeyReleased
        // TODO add your handling code here:
        if(!txthoten.getText().equals("")){
           lblHT.setText(null);
      }
    }//GEN-LAST:event_txthotenKeyReleased

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
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLast1;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHT;
    private javax.swing.JLabel lblNV;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JTable tblGridView;
    public javax.swing.JTextField txthoten;
    public javax.swing.JTextField txtmanv;
    public javax.swing.JPasswordField txtmatkhau;
    public javax.swing.JPasswordField txtmatkhau2;
    // End of variables declaration//GEN-END:variables
}
