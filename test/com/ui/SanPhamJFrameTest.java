/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.model.SanPham;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class SanPhamJFrameTest {
    
    public SanPhamJFrameTest() {
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
     * Test of checkloi method, of class SanPhamJFrame.
     */
//    @Test
//    public void testCheckloi() {
//        System.out.println("checkloi");
//        SanPhamJFrame instance = new SanPhamJFrame();
//        boolean expResult = false;
//        boolean result = instance.checkloi();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        SanPhamJFrame.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of init method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testInit() {
//        System.out.println("init");
//        SanPhamJFrame instance = new SanPhamJFrame();
//        instance.init();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isvalid method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testIsvalid() {
//        System.out.println("isvalid");
//        SanPhamJFrame instance = new SanPhamJFrame();
//        boolean expResult = false;
//        boolean result = instance.isvalid();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of load method, of class SanPhamJFrame.
//     */
    @Test
    public void testLoad() {
        System.out.println("load");
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.load();
    }

    /**
     * Test of insert method, of class SanPhamJFrame.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BB07");
        instance.txtTensp.setText("Bút bi");
        instance.txtDvt.setText("Cây");
        instance.txtNsx.setText("Việt Nam");
        instance.txtGia.setText("5000");
        instance.txtMota.setText("");
        instance.lblHinh.setText("hinh4.jpg");
        instance.insert();
    }

    /**
     * Test of update method, of class SanPhamJFrame.
     */
    @Test(priority=1)
    public void testUpdate() {
        System.out.println("update");
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BB07");
        instance.txtTensp.setText("Bút chì");
        instance.txtDvt.setText("Cây");
        instance.txtNsx.setText("Việt Nam");
        instance.txtGia.setText("5000");
        instance.txtMota.setText("");
        instance.lblHinh.setText("hinh4.jpg");
        instance.update();
    }

    /**
     * Test of delete method, of class SanPhamJFrame.
     */
    @Test(priority=2)
    public void testDelete() {
        System.out.println("delete");
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BB05");
        instance.delete();
    }

    /**
     * Test of clear method, of class SanPhamJFrame.
     */
    @Test(priority=3)
    public void testClear() {
        System.out.println("clear");
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.clear();
    }

    /**
     * Test of edit method, of class SanPhamJFrame.
     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        SanPhamJFrame instance = new SanPhamJFrame();
//        instance.edit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setModel method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testSetModel() {
//        System.out.println("setModel");
//        SanPham model = null;
//        SanPhamJFrame instance = new SanPhamJFrame();
//        instance.setModel(model);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getModel method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testGetModel() {
//        System.out.println("getModel");
//        SanPhamJFrame instance = new SanPhamJFrame();
//        SanPham expResult = null;
//        SanPham result = instance.getModel();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setStatus method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testSetStatus() {
//        System.out.println("setStatus");
//        boolean insertable = false;
//        SanPhamJFrame instance = new SanPhamJFrame();
//        instance.setStatus(insertable);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectImage method, of class SanPhamJFrame.
//     */
//    @Test
//    public void testSelectImage() {
//        System.out.println("selectImage");
//        SanPhamJFrame instance = new SanPhamJFrame();
//        instance.selectImage();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
