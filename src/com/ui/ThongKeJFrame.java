/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.DAO.HoaDonDAO;
import com.DAO.KhachHangDAO;
import com.DAO.NhanVienDAO;
import com.DAO.SanPhamDAO;
import com.helper.DialogHelper;
import com.model.KhachHang;
import com.model.NhanVien;
import com.model.SanPham;
import com.helper.ShareHelper;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class ThongKeJFrame extends javax.swing.JFrame {

    SanPhamDAO spdao = new SanPhamDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    NhanVienDAO nvdao = new NhanVienDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    String key;
    public ThongKeJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadcboDVT();
        loadSP();
        loadHD();
        loadcboTenSP();
        loadcboMANV();
        loadcboMAKH();
        soluongSP();
        soluongNV();
        soluongKH();
        soluongHD();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    void loadcboDVT(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDVT.getModel();
        model.removeElement(model);
        try{
            List<String> listcbo = spdao.TKcboDVT();
            for(String sp:listcbo){
                model.addElement(sp);
            }
        }catch(Exception e){
            
        }
    }
    void TKloadSPDVT() {
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   spdao.TKloadSPDVT(key);
            for (Object[] row : list) {
                
           
            model.addRow(row);
            }
        }
        catch (Exception e) {
            
        }
    }
    void loadSP() {
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = spdao.select();
            for (SanPham tl : list) {
                Object[] row = {
                tl.getMaSP(),
                tl.getTenSP(),
                tl.getHinh(),
                tl.getdVT(),
                tl.getNuocSX(),
                tl.getGia(),
                tl.getGhiChu()
            };
            model.addRow(row);
            }
        }
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void loadHD() {
        DefaultTableModel model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   hddao.TKloadHD();
            for (Object[] row : list) {
            model.addRow(row);
            }
        }
        catch (Exception e) {
        }
    }
    void loadcboTenSP(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSP.getModel();
        model.removeElement(model);
        try{
            List<SanPham> listcbo = spdao.select();
            for(SanPham sp:listcbo){
                model.addElement(sp);
            }
        }catch(Exception e){
            
        }
    }
    void TKloadHDTenSP() {
        DefaultTableModel model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   hddao.TKloadHDTenSP(key);
            for (Object[] row : list) {
                
           
            model.addRow(row);
            }
        }
        catch (Exception e) {
            
        }
    }
    void loadcboMANV(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbonv.getModel();
        model.removeElement(model);
        try{
            List<NhanVien> listcbo = nvdao.select();
            for(NhanVien sp:listcbo){
                model.addElement(sp);
            }
        }catch(Exception e){
            
        }
    }
    void TKloadHDMANV() {
        DefaultTableModel model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   hddao.TKloadHDMANV(key);
            for (Object[] row : list) {
                
           
            model.addRow(row);
            }
        }
        catch (Exception e) {
            
        }
    }
    void loadcboMAKH(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKH.getModel();
        model.removeElement(model);
        try{
            List<KhachHang> listcbo = khdao.select();
            for(KhachHang sp:listcbo){
                model.addElement(sp);
            }
        }catch(Exception e){
            
        }
    }
    void TKloadHDMAKH() {
        DefaultTableModel model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   hddao.TKloadHDMAKH(key);
            for (Object[] row : list) {
                
           
            model.addRow(row);
            }
        }
        catch (Exception e) {
            
        }
    }
    void loadHDGiamDan() {
        DefaultTableModel model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   hddao.TKloadHDGiamDan();
            for (Object[] row : list) {
            model.addRow(row);
            }
        }
        catch (Exception e) {
        }
    }
    void loadHDTangDan() {
        DefaultTableModel model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list =   hddao.TKloadHDTangDan();
            for (Object[] row : list) {
            model.addRow(row);
            }
        }
        catch (Exception e) {
        }
    }
    void soluongSP(){
        int soluongSP = spdao.SoLuongSP();
        lblSLSP.setText("Tổng số lượng sản phẩm: " + soluongSP);
    }
    void soluongNV(){
        int soluongNV = nvdao.SoLuongNV();
        lblSLNV.setText("Tổng số lượng nhân viên: " + soluongNV);
    }
    void soluongKH(){
        int soluongKH = khdao.SoLuongKH();
        lblSLKH.setText("Tổng số lượng khách hàng: " + soluongKH);
    }
    void soluongHD(){
        int soluongHD = hddao.SoLuongHD();
        lblSLHD.setText("Tổng số lượng hóa đơn: " + soluongHD);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cboDVT = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSP = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbonv = new javax.swing.JComboBox<>();
        cboKH = new javax.swing.JComboBox<>();
        cboSx = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblSLSP = new javax.swing.JLabel();
        lblSLNV = new javax.swing.JLabel();
        lblSLKH = new javax.swing.JLabel();
        lblSLHD = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Thống Kê");
        setMinimumSize(new java.awt.Dimension(1300, 619));
        setPreferredSize(new java.awt.Dimension(1300, 619));
        setSize(new java.awt.Dimension(1300, 619));

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(900, 590));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(900, 590));

        cboDVT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cboDVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDVTActionPerformed(evt);
            }
        });

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Hình", "DVT", "Nước sản xuất", "Giá", "Ghi chú"
            }
        ));
        jScrollPane1.setViewportView(tblSP);

        jLabel1.setText("DVT:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(cboDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SẢN PHẨM", jPanel1);

        jPanel2.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 550));

        jLabel2.setText("Sản Phẩm");

        cboSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cboSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSPActionPerformed(evt);
            }
        });

        jLabel3.setText("Nhân Viên");

        jLabel4.setText("Khách hàng");

        jLabel5.setText("Sắp xếp theo");

        cbonv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cbonv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonvActionPerformed(evt);
            }
        });

        cboKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cboKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKHActionPerformed(evt);
            }
        });

        cboSx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Tổng tiền lớn nhất", "Tổng tiền nhỏ nhất" }));
        cboSx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSxActionPerformed(evt);
            }
        });

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Số hóa đơn", "Mã KH", "Họ tên KH", "Mã NV", "Họ tên NV", "Mã SP", "Tên SP", "Số lượng", "Ngày LHD", "Tổng tiền", "Ghi chú"
            }
        ));
        jScrollPane2.setViewportView(tblHD);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(cbonv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(cboKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addComponent(cboSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cbonv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HÓA ĐƠN", jPanel2);

        lblSLSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSLSP.setText("Tổng số lượng sản phẩm: ");

        lblSLNV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSLNV.setText("Tổng số lượng nhân viên: ");

        lblSLKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSLKH.setText("Tổng số lượng khách hàng: ");

        lblSLHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSLHD.setText("Tổng số lượng hóa đơn: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSLHD)
                    .addComponent(lblSLKH)
                    .addComponent(lblSLNV)
                    .addComponent(lblSLSP))
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblSLSP)
                .addGap(37, 37, 37)
                .addComponent(lblSLNV)
                .addGap(34, 34, 34)
                .addComponent(lblSLKH)
                .addGap(35, 35, 35)
                .addComponent(lblSLHD)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TỔNG HƠP", jPanel3);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("THỐNG KÊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(993, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDVTActionPerformed
        if(cboDVT.getSelectedItem().equals("Tất Cả")){
            loadSP();
        }else{
            key = cboDVT.getSelectedItem().toString();
        TKloadSPDVT();
        }
    }//GEN-LAST:event_cboDVTActionPerformed

    private void cboSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSPActionPerformed
        if(cboSP.getSelectedItem().equals("Tất Cả")){
            loadHD();
        }else{
            cboKH.setSelectedIndex(0);
            cbonv.setSelectedIndex(0);
            key = ((SanPham)cboSP.getSelectedItem()).getMaSP();
            TKloadHDTenSP();
        }
    }//GEN-LAST:event_cboSPActionPerformed

    private void cbonvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonvActionPerformed
        // TODO add your handling code here:
        if(cbonv.getSelectedItem().equals("Tất Cả")){
            loadHD();
        }else{
            cboKH.setSelectedIndex(0);
            cboSP.setSelectedIndex(0);
            key = ((NhanVien)cbonv.getSelectedItem()).getMaNV();
            TKloadHDMANV();
        }
    }//GEN-LAST:event_cbonvActionPerformed

    private void cboKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKHActionPerformed
        // TODO add your handling code here:
        if(cboKH.getSelectedItem().equals("Tất Cả")){
            loadHD();
        }else{
            cboSP.setSelectedIndex(0);
            cbonv.setSelectedIndex(0);
            key = ((KhachHang)cboKH.getSelectedItem()).getMaKH();
            TKloadHDMAKH();
        }
    }//GEN-LAST:event_cboKHActionPerformed

    private void cboSxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSxActionPerformed
        if(cboSx.getSelectedItem().equals("Tất Cả")){
            loadHD();
        }else if(cboSx.getSelectedItem().equals("Tổng tiền lớn nhất")){
            cboSP.setSelectedIndex(0);
            cbonv.setSelectedIndex(0);
            cboKH.setSelectedIndex(0);
            loadHDGiamDan();
        }
        else if(cboSx.getSelectedItem().equals("Tổng tiền nhỏ nhất")){
            cboSP.setSelectedIndex(0);
            cbonv.setSelectedIndex(0); 
            cboKH.setSelectedIndex(0);
            loadHDTangDan();
        }
        
    }//GEN-LAST:event_cboSxActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDVT;
    private javax.swing.JComboBox<String> cboKH;
    private javax.swing.JComboBox<String> cboSP;
    private javax.swing.JComboBox<String> cboSx;
    private javax.swing.JComboBox<String> cbonv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblSLHD;
    private javax.swing.JLabel lblSLKH;
    private javax.swing.JLabel lblSLNV;
    private javax.swing.JLabel lblSLSP;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblSP;
    // End of variables declaration//GEN-END:variables
}
