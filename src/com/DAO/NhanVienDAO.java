/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.helper.jdbcHelper;
import com.model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class NhanVienDAO {
    public void insert(NhanVien model){
        String sql = "INSERT INTO NhanVien (MaNV,MatKhau,HoTen) VALUES(?,?,?)";
        jdbcHelper.executeUpdate(sql,
               model.getMaNV(),
               model.getMatKhau(),
               model.getHoTen());
    }
    public void update(NhanVien model){
        String sql="UPDATE NhanVien SET MatKhau=?, HoTen=? WHERE MaNV=?";
        jdbcHelper.executeUpdate(sql,
              model.getMatKhau(),
              model.getHoTen(),
              model.getMaNV()); 
    }
    public void delete(String MaNV){
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        jdbcHelper.executeUpdate(sql, MaNV);
    }
    public List<NhanVien>select(){
        String sql="SELECT * FROM NhanVien"; 
        return select(sql);
    }
    public NhanVien findById(String manv){
        String sql="SELECT * FROM NhanVien WHERE MaNV=?"; 
        List<NhanVien> list = select(sql, manv); 
        return list.size() > 0 ? list.get(0) : null; 
    }
    public int SoLuongNV() {
       int soluong = 0;
       String sql = "select count(MANV) from NHANVIEN";
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
    private List<NhanVien> select(String sql,Object...arg) {
        List<NhanVien> list=new ArrayList<>(); 
        try{
            ResultSet rs=null;
            try{
                rs=jdbcHelper.executeQuery(sql, arg);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
                    list.add(model);
                }
            }finally{
                rs.getStatement().getConnection().close(); 
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return list;
    }
    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
       NhanVien model = new NhanVien();
         model.setMaNV(rs.getString("MaNV"));
         model.setMatKhau(rs.getString("MatKhau"));
         model.setHoTen(rs.getString("HoTen"));
         return model;   
    }
}
