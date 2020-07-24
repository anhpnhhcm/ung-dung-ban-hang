/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.model.HoaDon;
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
public class HoaDonDAONGTest {
    
    public HoaDonDAONGTest() {
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
     * Test of insert method, of class HoaDonDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        HoaDon model = null;
        HoaDonDAO instance = new HoaDonDAO();
        instance.insert(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class HoaDonDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        HoaDon model = null;
        HoaDonDAO instance = new HoaDonDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class HoaDonDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String SOHD = "";
        HoaDonDAO instance = new HoaDonDAO();
        instance.delete(SOHD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class HoaDonDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class HoaDonDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int soHD = 0;
        HoaDonDAO instance = new HoaDonDAO();
        HoaDon expResult = null;
        HoaDon result = instance.findById(soHD);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TKloadHD method, of class HoaDonDAO.
     */
    @Test
    public void testTKloadHD() {
        System.out.println("TKloadHD");
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.TKloadHD();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TKloadHDTenSP method, of class HoaDonDAO.
     */
    @Test
    public void testTKloadHDTenSP() {
        System.out.println("TKloadHDTenSP");
        String MaSP = "";
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.TKloadHDTenSP(MaSP);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TKloadHDMANV method, of class HoaDonDAO.
     */
    @Test
    public void testTKloadHDMANV() {
        System.out.println("TKloadHDMANV");
        String MaNV = "";
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.TKloadHDMANV(MaNV);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TKloadHDMAKH method, of class HoaDonDAO.
     */
    @Test
    public void testTKloadHDMAKH() {
        System.out.println("TKloadHDMAKH");
        String MaNV = "";
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.TKloadHDMAKH(MaNV);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TKloadHDGiamDan method, of class HoaDonDAO.
     */
    @Test
    public void testTKloadHDGiamDan() {
        System.out.println("TKloadHDGiamDan");
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.TKloadHDGiamDan();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TKloadHDTangDan method, of class HoaDonDAO.
     */
    @Test
    public void testTKloadHDTangDan() {
        System.out.println("TKloadHDTangDan");
        HoaDonDAO instance = new HoaDonDAO();
        List expResult = null;
        List result = instance.TKloadHDTangDan();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SoLuongHD method, of class HoaDonDAO.
     */
    @Test
    public void testSoLuongHD() {
        System.out.println("SoLuongHD");
        HoaDonDAO instance = new HoaDonDAO();
        int expResult = 0;
        int result = instance.SoLuongHD();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
