/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.model.HoaDon;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class HoaDonJFrameTest {
    
    public HoaDonJFrameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of checkloi method, of class HoaDonJFrame.
     */
//    @Test
//    public void testCheckloi() {
//        System.out.println("checkloi");
//        HoaDonJFrame instance = new HoaDonJFrame();
//        boolean expResult = false;
//        boolean result = instance.checkloi();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class HoaDonJFrame.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        HoaDonJFrame.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of init method, of class HoaDonJFrame.
//     */
//    @Test
//    public void testInit() {
//        System.out.println("init");
//        HoaDonJFrame instance = new HoaDonJFrame();
//        instance.init();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isvalid method, of class HoaDonJFrame.
//     */
//    @Test
//    public void testIsvalid() {
//        System.out.println("isvalid");
//        HoaDonJFrame instance = new HoaDonJFrame();
//        boolean expResult = false;
//        boolean result = instance.isvalid();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of load method, of class HoaDonJFrame.
//     */
    @Test
    public void testLoad() {
        System.out.println("load");
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.load();
    }

    /**
     * Test of insert method, of class HoaDonJFrame.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("11");
        instance.txtMakh.setText("KH11");
        instance.txtManv.setText("anh");
        instance.txtMasp.setText("BC01");
        instance.txtSL.setText("10");
        instance.txtNGLHD.setText("2020-10-10");
        instance.txtTongtien.setText("35000.0");
        instance.txtGhichu.setText("chốt đơn");
        instance.insert();

    }

    /**
     * Test of update method, of class HoaDonJFrame.
     */
    @Test(priority=1)
    public void testUpdate() {
        System.out.println("update");
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("11");
        instance.txtMakh.setText("KH11");
        instance.txtManv.setText("anh");
        instance.txtMasp.setText("BC01");
        instance.txtSL.setText("10");
        instance.txtNGLHD.setText("2020-02-20");
        instance.txtTongtien.setText("35000.0");
        instance.txtGhichu.setText("Chốt");
        instance.update();
    }

    /**
     * Test of delete method, of class HoaDonJFrame.
     */
    @Test(priority=2)
    public void testDelete() {
        System.out.println("delete");
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("17");
        instance.delete();
    }

    /**
     * Test of clear method, of class HoaDonJFrame.
     */
    @Test(priority=3)
    public void testClear() {
        System.out.println("clear");
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.clear();
    }

    /**
     * Test of edit method, of class HoaDonJFrame.
     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        HoaDonJFrame instance = new HoaDonJFrame();
//        instance.edit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setModel method, of class HoaDonJFrame.
//     */
//    @Test
//    public void testSetModel() {
//        System.out.println("setModel");
//        HoaDon model = null;
//        HoaDonJFrame instance = new HoaDonJFrame();
//        instance.setModel(model);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getModel method, of class HoaDonJFrame.
//     */
//    @Test
//    public void testGetModel() {
//        System.out.println("getModel");
//        HoaDonJFrame instance = new HoaDonJFrame();
//        HoaDon expResult = null;
//        HoaDon result = instance.getModel();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setStatus method, of class HoaDonJFrame.
//     */
//    @Test
//    public void testSetStatus() {
//        System.out.println("setStatus");
//        boolean insertable = false;
//        HoaDonJFrame instance = new HoaDonJFrame();
//        instance.setStatus(insertable);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
