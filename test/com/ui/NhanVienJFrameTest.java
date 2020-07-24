/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.model.NhanVien;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class NhanVienJFrameTest {
    
    public NhanVienJFrameTest() {
    }
        @BeforeMethod
        public void beforeMethod() {
        }

	@AfterMethod
	public void afterMethod() {
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
     * Test of init method, of class NhanVienJFrame.
     */
  

    /**
     * Test of isvalid method, of class NhanVienJFrame.
     */
    

    /**
     * Test of load method, of class NhanVienJFrame.
     */
            @Test()
    public void testNV001(){
        System.out.println("NV - 001");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("");
        instance.txtmatkhau.setText("");
        instance.txtmatkhau2.setText("");
        instance.txthoten.setText("");
        instance.isvalid();
        instance.insert();
    }
    @Test()
    public void testNV002(){
        System.out.println("NV - 002");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("anh");
        instance.txtmatkhau.setText("abc");
        instance.txtmatkhau2.setText("abc");
        instance.txthoten.setText("Nguyễn Văn A");
        instance.isvalid();
        instance.insert();
    }
     @Test()
    public void testNV003(){
        System.out.println("NV - 003");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NVA");
        instance.txtmatkhau.setText("1");
        instance.txtmatkhau2.setText("");
        instance.txthoten.setText("Nguyễn Văn A");
        instance.isvalid();
        instance.insert();
    }
    @Test()
    public void testNV004(){
        System.out.println("NV - 004");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NVAA");
        instance.txtmatkhau.setText("123");
        instance.txtmatkhau2.setText("12345");
        instance.txthoten.setText("Nguyễn Văn A");
        instance.isvalid();
        instance.insert();
    }
    @Test
    public void testNV005(){
        System.out.println("NV - 005");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NVAnèaa");
        instance.txtmatkhau.setText("123456");
        instance.txtmatkhau2.setText("123456");
        instance.txthoten.setText("Nguyễn Văn Anh nèaaa");
        instance.isvalid();
        instance.insert();
    }
    @Test
    public void testNV006(){
        System.out.println("NV - 006");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("");
        instance.txtmatkhau.setText("");
        instance.txtmatkhau2.setText("");
        instance.txthoten.setText("");
        instance.isvalid();
        instance.update();
    }
    @Test
    public void testNV007(){
        System.out.println("NV - 007");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NV2");
        instance.txtmatkhau.setText("123456");
        instance.txtmatkhau2.setText("123456");
        instance.txthoten.setText("Nguyễn Văn Đức Anh");
        instance.isvalid();
        instance.update();
    }
    
    @Test
    public void testNV008(){
        System.out.println("NV - 008");
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("anhpnh");
        instance.delete();
    }
    
//    @Test(description = "jTextFieldTestEmpty1")
//	public void jTextFieldTestEmpty1() {
//		System.out.println("jTextFieldTestEmpty1");
//		NhanVienJFrame instance = new NhanVienJFrame();
//		instance.setVisible(true);
//		instance.txtmanv.setText("");
//		instance.txthoten.setText("");
//		instance.txtmatkhau.setText("");
//		instance.txtmatkhau2.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        //	Kiểm tra dữ liệu đầu vào trống mật khẩu
//	@Test(description = "jTextFieldTestEmpty2")
//	public void jTextFieldTestEmpty2() {
//		System.out.println("jTextFieldTestEmpty2");
//		NhanVienJFrame instance = new NhanVienJFrame();
//		instance.setVisible(true);
//		instance.txtmanv.setText("A");
//		instance.txthoten.setText("");
//		instance.txtmatkhau.setText("");
//		instance.txtmatkhau2.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào rỗng",false);
//	}
//        
//        //	Kiểm tra dữ liệu đầu vào trống mật khẩu xác nhận
//	@Test(description = "jTextFieldTestEmpty3")
//	public void jTextFieldTestEmpty3() {
//		System.out.println("jTextFieldTestEmpty3");
//		NhanVienJFrame instance = new NhanVienJFrame();
//		instance.setVisible(true);
//		instance.txtmanv.setText("A");
//		instance.txthoten.setText("");
//		instance.txtmatkhau.setText("123");
//		instance.txtmatkhau2.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào rỗng",false);
//	}
//        //	Kiểm tra dữ liệu đầu vào sai mật khẩu
//	@Test(description = "jTextFieldTestWrongPass")
//	public void jTextFieldTestWrongPass() {
//		System.out.println("jTextFieldTestWrongPass");
//		NhanVienJFrame instance = new NhanVienJFrame();
//		instance.setVisible(true);
//		instance.txtmanv.setText("A");
//		instance.txthoten.setText("Nguyễn Văn A");
//		instance.txtmatkhau.setText("123");
//		instance.txtmatkhau2.setText("123");
//		instance.isvalid();
//		
////		instance.insert();
////		Assert.assertFalse("Password xác nhận không đúng", false);
//	}
//   
//    @Test
//    public void testLoad() {
//        System.out.println("load");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.load();
//    }
//
//    /**
//     * Test of insert method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testInsert() {
//        System.out.println("insert");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.txtmanv.setText("VanTeo123");
//        instance.txthoten.setText("Nguyễn Văn Tèo");
//        instance.txtmatkhau.setText("123456");
//        instance.txtmatkhau2.setText("123456");
//        instance.isvalid();
//        instance.insert();
//;    }
//
//    /**
//     * Test of update method, of class NhanVienJFrame.
//     */
//    @Test(priority=1)
//    public void testUpdate() {
//        System.out.println("update");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.txtmanv.setText("anh");
//        instance.txthoten.setText("Phạm Nguyễn Hoàng Anh");
//        instance.txtmatkhau.setText("123");
//        instance.txtmatkhau2.setText("123");
//        instance.update();
//    }
//
//    /**
//     * Test of delete method, of class NhanVienJFrame.
//     */
//    @Test(priority=2)
//    public void testDelete() {
//        System.out.println("delete");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.txtmanv.setText("VanTeo"); //chỉ cần chọn khóa chính
//        instance.delete();
//    }
//
//    /**
//     * Test of edit method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.edit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of clear method, of class NhanVienJFrame.
//     */
//    @Test(priority=3)
//    public void testClear() {
//        System.out.println("clear");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.clear();
//    }
//
//    /**
//     * Test of setModel method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testSetModel() {
//        System.out.println("setModel");
//        NhanVien model = null;
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.setModel(model);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getModel method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testGetModel() {
//        System.out.println("getModel");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        NhanVien expResult = null;
//        NhanVien result = instance.getModel();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setStatus method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testSetStatus() {
//        System.out.println("setStatus");
//        boolean insertable = false;
//        NhanVienJFrame instance = new NhanVienJFrame();
//        instance.setStatus(insertable);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkloi method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testCheckloi() {
//        System.out.println("checkloi");
//        NhanVienJFrame instance = new NhanVienJFrame();
//        boolean expResult = false;
//        boolean result = instance.checkloi();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class NhanVienJFrame.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        NhanVienJFrame.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
