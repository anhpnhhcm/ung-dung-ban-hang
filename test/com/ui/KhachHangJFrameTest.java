/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.model.KhachHang;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class KhachHangJFrameTest {
    
    public KhachHangJFrameTest() {
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
     * Test of checkloi method, of class KhachHangJFrame.
     */
//    @Test
//    public void testCheckloi() {
//        System.out.println("checkloi");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        boolean expResult = false;
//        boolean result = instance.checkloi();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class KhachHangJFrame.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        KhachHangJFrame.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of init method, of class KhachHangJFrame.
//     */
//    @Test
//    public void testInit() {
//        System.out.println("init");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.init();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isvalid method, of class KhachHangJFrame.
//     */
//    @Test
//    public void testIsvalid() {
//        System.out.println("isvalid");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        boolean expResult = false;
//        boolean result = instance.isvalid();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    @Test(description = "jTextFieldTestEmpty1")
//	public void jTextFieldTestEmpty1() {
//		System.out.println("jTextFieldTestEmpty1");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("");
//		instance.txtHoten.setText("");
//		instance.txtDiachi.setText("");
//		instance.txtSodt.setText("");
//                instance.txtNgaysinh.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty2")
//	public void jTextFieldTestEmpty2() {
//		System.out.println("jTextFieldTestEmpty2");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("KH07");
//		instance.txtHoten.setText("");
//                instance.txtDiachi.setText("");
//		instance.txtSodt.setText("");
//                instance.txtNgaysinh.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty2")
//	public void jTextFieldTestEmpty2() {
//		System.out.println("jTextFieldTestEmpty2");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("KH10");
//		instance.txtHoten.setText("");
//		instance.txtDiachi.setText("");
//		instance.txtSodt.setText("");
//                instance.txtNgaysinh.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty1")
//	public void jTextFieldTestEmpty3() {
//		System.out.println("jTextFieldTestEmpty3");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("KH10");
//		instance.txtHoten.setText("Phạm Anh");
//		instance.txtDiachi.setText("");
//		instance.txtSodt.setText("");
//                instance.txtNgaysinh.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty4")
//	public void jTextFieldTestEmpty4() {
//		System.out.println("jTextFieldTestEmpty4");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("KH10");
//		instance.txtHoten.setText("Phạm Anh");
//		instance.txtDiachi.setText("Bình Tân");
//		instance.txtSodt.setText("");
//                instance.txtNgaysinh.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty5")
//	public void jTextFieldTestEmpty5() {
//		System.out.println("jTextFieldTestEmpty5");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("KH10");
//		instance.txtHoten.setText("Phạm Anh");
//		instance.txtDiachi.setText("Bình Tân");
//		instance.txtSodt.setText("091839283");
//                instance.txtNgaysinh.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty6")
//	public void jTextFieldTestEmpty6() {
//		System.out.println("jTextFieldTestEmpty6");
//		KhachHangJFrame instance = new KhachHangJFrame();
//		instance.setVisible(true);
//		instance.txtMakh.setText("KH10");
//		instance.txtHoten.setText("Phạm Anh");
//		instance.txtDiachi.setText("Bình Tân");
//		instance.txtSodt.setText("091839283");
//                instance.txtNgaysinh.setText("2000-04-21");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
    /**
     * Test of load method, of class KhachHangJFrame.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.load();
    }

    /**
     * Test of insert method, of class KhachHangJFrame.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("KH11");
        instance.txtHoten.setText("Phạm ABC");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("098282839");
        instance.txtNgaysinh.setText("20");
        instance.isvalid();
        instance.insert();
    }
//
//    /**
//     * Test of update method, of class KhachHangJFrame.
//     */
//    @Test(priority=1)
//    public void testUpdate() {
//        System.out.println("update");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.txtMakh.setText("KH11");
//        instance.txtHoten.setText("Lê Thị Yến Nhi");
//        instance.txtDiachi.setText("Gò Vấp");
//        instance.txtSodt.setText("0363361152");
//        instance.txtNgaysinh.setText("2000-02-20");
//        instance.isvalid();
//        instance.update();
//    }
//
////    /**
////     * Test of delete method, of class KhachHangJFrame.
////     */
//    @Test(priority=2)
//    public void testDelete() {
//        System.out.println("delete");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.txtMakh.setText("KH09");
//        instance.delete();
//    }
//
//    /**
//     * Test of clear method, of class KhachHangJFrame.
//     */
//    @Test(priority=3)
//    public void testClear() {
//        System.out.println("clear");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.clear();
//    }

    /**
     * Test of edit method, of class KhachHangJFrame.
     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.edit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setModel method, of class KhachHangJFrame.
//     */
//    @Test
//    public void testSetModel() {
//        System.out.println("setModel");
//        KhachHang model = null;
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.setModel(model);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getModel method, of class KhachHangJFrame.
//     */
//    @Test
//    public void testGetModel() {
//        System.out.println("getModel");
//        KhachHangJFrame instance = new KhachHangJFrame();
//        KhachHang expResult = null;
//        KhachHang result = instance.getModel();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setStatus method, of class KhachHangJFrame.
//     */
//    @Test
//    public void testSetStatus() {
//        System.out.println("setStatus");
//        boolean insertable = false;
//        KhachHangJFrame instance = new KhachHangJFrame();
//        instance.setStatus(insertable);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
