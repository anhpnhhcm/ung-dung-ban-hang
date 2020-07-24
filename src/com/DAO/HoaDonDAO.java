/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.helper.jdbcHelper;
import com.model.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class HoaDonDAO {
    public void insert(HoaDon model){
        String sql ="INSERT INTO HOADON VALUES(?,?,?,?,?,?,?,?)";
        jdbcHelper.executeUpdate(sql,
                model.getSoHD(),
                model.getMaKH(),
                model.getMaNV(),
                model.getMaSP(),
                model.getSoLuong(),
                model.getNgLHD(),
                model.getTriGia(),
                model.getGhiChu());
    }
    public void update(HoaDon model){
        String sql="UPDATE HOADON SET NGLHD=?, MAKH=?, MANV=?, MASP=?, SL=?, TRIGIA=?, GHICHU=? WHERE SOHD=?";
        jdbcHelper.executeUpdate(sql,
                model.getNgLHD(),
                model.getMaKH(),
                model.getMaNV(),
                model.getMaSP(),
                model.getSoLuong(),
                model.getTriGia(),
                model.getGhiChu(),
                model.getSoHD());
    }
    public void delete(String SOHD){
        String sql="DELETE FROM HOADON WHERE SOHD=?";
        jdbcHelper.executeUpdate(sql, SOHD);
    }
    public List<HoaDon> select(){
        String sql="SELECT*FROM HOADON";
        return select(sql);
    } 
    public HoaDon findById(int soHD){
        String sql="SELECT * FROM HOADON WHERE SoHD=?";
        List<HoaDon> list = select(sql, soHD); 
        return list.size()>0?list.get(0):null;
    }
    public List<Object[]> TKloadHD() {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select hd.SoHD, hd.MaKH, kh.HOTEN, hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU" +
" from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH" +
" join NHANVIEN nv on hd.MANV = nv.MANV" +
" join SANPHAM sp on hd.MASP = sp.MASP";
           ResultSet rs =null;
           try {
              rs  = jdbcHelper.executeQuery(sql);
              while(rs.next()){
                Object[] model = {
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    
                  
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
    public List<Object[]> TKloadHDTenSP(String MaSP) {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select hd.SoHD, hd.MaKH, kh.HOTEN, hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU" +
" from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH" +
" join NHANVIEN nv on hd.MANV = nv.MANV" +
" join SANPHAM sp on hd.MASP = sp.MASP where hd.MASP = ?" ;
           ResultSet rs = jdbcHelper.executeQuery(sql, MaSP);
           try {
              
              while(rs.next()){
                Object[] model = {
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    
                  
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
    public List<Object[]> TKloadHDMANV(String MaNV) {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select hd.SoHD, hd.MaKH, kh.HOTEN, hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU" +
" from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH" +
" join NHANVIEN nv on hd.MANV = nv.MANV" +
" join SANPHAM sp on hd.MASP = sp.MASP where hd.MANV = ?" ;
           ResultSet rs = jdbcHelper.executeQuery(sql, MaNV);
           try {
              
              while(rs.next()){
                Object[] model = {
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    
                  
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
    public List<Object[]> TKloadHDMAKH(String MaNV) {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select hd.SoHD, hd.MaKH, kh.HOTEN, hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU" +
" from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH" +
" join NHANVIEN nv on hd.MANV = nv.MANV" +
" join SANPHAM sp on hd.MASP = sp.MASP where hd.MAKH = ?" ;
           ResultSet rs = jdbcHelper.executeQuery(sql, MaNV);
           try {
              
              while(rs.next()){
                Object[] model = {
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    
                  
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
    public List<Object[]> TKloadHDGiamDan() {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select hd.SoHD, hd.MaKH, kh.HOTEN, hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU" +
" from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH" +
" join NHANVIEN nv on hd.MANV = nv.MANV" +
" join SANPHAM sp on hd.MASP = sp.MASP "
               + " order by hd.TRIGIA desc";
           ResultSet rs =null;
           try {
              rs  = jdbcHelper.executeQuery(sql);
              while(rs.next()){
                Object[] model = {
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    
                  
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
    
    public List<Object[]> TKloadHDTangDan() {
       List<Object[]> list = new ArrayList<>();
   
       String sql = "select hd.SoHD, hd.MaKH, kh.HOTEN, hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU" +
" from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH" +
" join NHANVIEN nv on hd.MANV = nv.MANV" +
" join SANPHAM sp on hd.MASP = sp.MASP "
               + " order by hd.TRIGIA asc";
           ResultSet rs =null;
           try {
              rs  = jdbcHelper.executeQuery(sql);
              while(rs.next()){
                Object[] model = {
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    
                  
                };
               list.add(model);
            }
           }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
   }
    public int SoLuongHD() {
       int soluong = 0;
       String sql = "select count(SoHD) from HOADON";
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
    private List<HoaDon> select(String sql,Object...args) {
        List<HoaDon> list=new ArrayList<>(); 
        try{
            ResultSet rs=null;
            try{
                rs=jdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    HoaDon model=readFromResultSet(rs); 
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

    private HoaDon readFromResultSet(ResultSet rs) throws SQLException{
         HoaDon model= new HoaDon();
         model.setSoHD(rs.getInt("SOHD"));
         model.setNgLHD(rs.getString("NGLHD"));  
         model.setMaKH(rs.getString("MAKH"));
         model.setMaNV(rs.getString("MANV"));
         model.setMaSP(rs.getString("MASP")); 
         model.setSoLuong(rs.getInt("SL")); 
         model.setTriGia(rs.getString("TRIGIA")); 
         model.setGhiChu(rs.getString("GHICHU")); 
         return model;   
    }
}

