/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 *
 * @author Phạm Nguyễn Hoàng Anh
 */
public class DangNhapJFrameTest {
    
    public DangNhapJFrameTest() {
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

    /**
     * Test of main method, of class DangNhapJFrame.
     */
    

    /**
     * Test of init method, of class DangNhapJFrame.
     */
    

    /**
     * Test of isvalid method, of class DangNhapJFrame.
     */
    

    /**
     * Test of login method, of class DangNhapJFrame.
     */
//      @Test(description = "jTextFieldTestEmpty1")
//	public void jTextFieldTestEmpty1() {
//		System.out.println("jTextFieldTestEmpty1");
//		DangNhapJFrame instance = new DangNhapJFrame();
//		instance.setVisible(true);
//		instance.txtMaNV.setText("");
//		instance.txtMatKhau.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
//        @Test(description = "jTextFieldTestEmpty2")
//	public void jTextFieldTestEmpty2() {
//		System.out.println("jTextFieldTestEmpty2");
//		DangNhapJFrame instance = new DangNhapJFrame();
//		instance.setVisible(true);
//		instance.txtMaNV.setText("anh");
//		instance.txtMatKhau.setText("");
//		instance.isvalid();
//
////		Assert.assertFalse("Dữ liệu đầu vào trỗng",false);
//	}
        @Test()
    public void testLG001(){
        System.out.println("LG - 001");
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("");
        instance.txtMatKhau.setText("");
        instance.login();
    }
    @Test()
    public void testLG002(){
        System.out.println("LG - 002");
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("");
        instance.txtMatKhau.setText("123");
        instance.login();
    }
    @Test()
    public void testLG003(){
        System.out.println("LG - 003");
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anh");
        instance.txtMatKhau.setText("");
        instance.login();
    }
    @Test()
    public void testLG004(){
        System.out.println("LG - 004");
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anhnh");
        instance.txtMatKhau.setText("123");
        instance.login();
    }
    @Test()
    public void testLG005(){
        System.out.println("LG - 005");
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anh");
        instance.txtMatKhau.setText("12345");
        instance.login();
    }
    @Test()
    public void testLG006(){
        System.out.println("LG - 006");
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anh");
        instance.txtMatKhau.setText("123");
        instance.login();
    }
    

    
//    @Test(priority=1)
//    public void testLogin() {
//        System.out.println("login");
//        DangNhapJFrame instance = new DangNhapJFrame();
//        instance.setVisible(true);
//        instance.txtMaNV.setText("anh");
//        instance.txtMatKhau.setText("123");
//        instance.isvalid();
//        instance.login();
//    }
    

    /**
     * Test of exit method, of class DangNhapJFrame.
     */

    
}
