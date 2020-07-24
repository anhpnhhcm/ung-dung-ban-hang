/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.helper.jdbcHelper;
import com.model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class KhachHangDAO {
    public void insert(KhachHang model){
        String sql ="INSERT INTO KHACHHANG VALUES(?,?,?,?,?)";
        jdbcHelper.executeUpdate(sql,
                model.getMaKH(),
                model.getHoTen(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getNgaySinh());
    }
    public void update(KhachHang model){
        String sql="UPDATE KHACHHANG SET HOTEN=?, DIACHI=?, SODT=?, NGAYSINH=? WHERE MAKH=?";
        jdbcHelper.executeUpdate(sql,
                model.getHoTen(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getNgaySinh(),
                model.getMaKH());
    }
    public void delete(String MaKH){
        String sql="DELETE FROM KHACHHANG WHERE MAKH=?";
        jdbcHelper.executeUpdate(sql, MaKH);
    }
    public List<KhachHang> select(){
        String sql="SELECT * FROM KHACHHANG";
        return select(sql);
    } 
    public KhachHang findById(String MaKH){
        String sql="SELECT * FROM KHACHHANG WHERE MAKH=?";
        List<KhachHang> list = select(sql, MaKH); 
        return list.size()>0?list.get(0):null;
    }
    public int SoLuongKH() {
       int soluong = 0;
       String sql = "select count(MAKH) from KHACHHANG";
           ResultSet rs = jdbcHelper.executeQuery(sql);
           try {
              while(rs.next()){
                soluong = rs.getInt(1);
                  
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return soluong;
    }
    private List<KhachHang> select(String sql,Object...args) {
        List<KhachHang> list=new ArrayList<>(); 
        try{
            ResultSet rs=null;
            try{
                rs=jdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    KhachHang model=readFromResultSet(rs); 
                    list.add(model);
                }
            }finally{
                rs.getStatement().getConnection().close();
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
    }
        return list;
}

    private KhachHang readFromResultSet(ResultSet rs) throws SQLException{
         KhachHang model= new KhachHang();
         model.setMaKH(rs.getString("MAKH"));
         model.setHoTen(rs.getString("HOTEN"));  
         model.setDiaChi(rs.getString("DIACHI"));
         model.setSoDienThoai(rs.getString("SODT"));
         model.setNgaySinh(rs.getString("NGAYSINH")); 
         return model;   
    }
}
