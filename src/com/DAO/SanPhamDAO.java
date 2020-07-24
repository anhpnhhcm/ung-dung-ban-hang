/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.helper.jdbcHelper;
import com.model.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class SanPhamDAO {
    public void insert(SanPham model){
        String sql ="INSERT INTO SANPHAM VALUES(?,?,?,?,?,?,?)";
        jdbcHelper.executeUpdate(sql,
                model.getMaSP(),
                model.getTenSP(),
                model.getHinh(),
                model.getdVT(),
                model.getNuocSX(),
                model.getGia(),
                model.getGhiChu());
    }
    public void update(SanPham model){
        String sql="UPDATE SANPHAM SET TENSP=?, HINH=?, DVT=?, NUOCSX=?, GIA=?, GHICHU=? WHERE MASP=?";
        jdbcHelper.executeUpdate(sql,
                model.getTenSP(),
                model.getHinh(),
                model.getdVT(),
                model.getNuocSX(),
                model.getGia(),
                model.getGhiChu(),
                model.getMaSP());
    }
    public void delete(String MaSP){
        String sql="DELETE FROM SANPHAM WHERE MASP=?";
        jdbcHelper.executeUpdate(sql, MaSP);
    }
    public List<SanPham> select(){
        String sql="SELECT*FROM SANPHAM";
        return select(sql);
    } 
    public SanPham findById(String MaSP){
        String sql="SELECT*FROM SANPHAM WHERE MASP=?";
        List<SanPham> list = select(sql, MaSP); 
        return list.size()>0?list.get(0):null;
    } 
   public double GetGiaSanPham(String MaSP) {
       double Gia = 0;
       String sql = "select * from SanPham where MaSP=?";
           ResultSet rs = jdbcHelper.executeQuery(sql, MaSP);
           try {
              while(rs.next()){
                Gia = rs.getInt("Gia");
                  
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return Gia;    }
        public ArrayList<String> TKcboDVT(){
            ArrayList<String> cboDVT = new ArrayList<String>();
            ResultSet rs = null;
            try{
                String sql = "select distinct DVT  from SANPHAM";
                rs = jdbcHelper.executeQuery(sql);
                while(rs.next()){
                    cboDVT.add(rs.getString(1));
                }
            }catch(Exception e){
                
            }
        return cboDVT;
            
        }
   public List<Object[]> TKloadSPDVT(String DVT) {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select * from SANPHAM where DVT=?";
           ResultSet rs = jdbcHelper.executeQuery(sql, DVT);
           try {
              while(rs.next()){
                Object[] model = {
                  rs.getString("MASP"),
                  rs.getString("TENSP"),
                  rs.getString("Hinh"),
                  rs.getString("DVT"),
                  rs.getString("NUOCSX"),
                  rs.getString("GIA"),
                  rs.getString("GHICHU"),
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
      public int SoLuongSP() {
       int soluong = 0;
       String sql = "select count(MASP) from SANPHAM";
           ResultSet rs = jdbcHelper.executeQuery(sql);
           try {
              while(rs.next()){
                soluong = rs.getInt(1);
                  
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return soluong;    }
    private List<SanPham> select(String sql,Object...args) {
        List<SanPham> list=new ArrayList<>(); 
        try{
            ResultSet rs=null;
            try{
                rs=jdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    SanPham model=readFromResultSet(rs); 
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

    private SanPham readFromResultSet(ResultSet rs) throws SQLException{
         SanPham model= new SanPham();
         model.setMaSP(rs.getString("MASP"));
         model.setTenSP(rs.getString("TENSP"));  
         model.setHinh(rs.getString("Hinh"));
         model.setdVT(rs.getString("DVT"));
         model.setNuocSX(rs.getString("NUOCSX"));
         model.setGia(rs.getString("GIA")); 
         return model;   
    }
    
}
