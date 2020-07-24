/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.model.NhanVien;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class NhanVienDAONGTest {
    NhanVien nv;
    public NhanVienDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class NhanVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        nv=new NhanVien();
        nv.setHoTen("Hoàng Anh");
        nv.setMaNV("anh");
        nv.setMatKhau("123");
    }

    /**
     * Test of update method, of class NhanVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        nv=new NhanVien();
        nv.setHoTen("Hoàng Anh");
        nv.setMaNV("anh");
        nv.setMatKhau("123456");
        //assertTrue();
        System.out.println("Update thanh cong");
    }

    /**
     * Test of delete method, of class NhanVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNV = "";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(MaNV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class NhanVienDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        NhanVienDAO instance = new NhanVienDAO();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class NhanVienDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String manv = "";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.findById(manv);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SoLuongNV method, of class NhanVienDAO.
     */
    @Test
    public void testSoLuongNV() {
        System.out.println("SoLuongNV");
        NhanVienDAO instance = new NhanVienDAO();
        int expResult = 0;
        int result = instance.SoLuongNV();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
