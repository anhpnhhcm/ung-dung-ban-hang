/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Date;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class HoaDon {
    private int soHD;
    private String ngLHD;
    private String maKH;
    private String maNV;
    private String maSP;
    private int soLuong;
    private String triGia;
    private String ghiChu;

    @Override
    public String toString() {
        return this.maSP; //To change body of generated methods, choose Tools | Templates.
    }

    public int getSoHD() {
        return soHD;
    }

    public void setSoHD(int soHD) {
        this.soHD = soHD;
    }

    public String getNgLHD() {
        return ngLHD;
    }

    public void setNgLHD(String ngLHD) {
        this.ngLHD = ngLHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTriGia() {
        return triGia;
    }

    public void setTriGia(String triGia) {
        this.triGia = triGia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
    
}
