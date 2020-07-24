/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
public class AllTest {
        Workbook workbook;
        Map<String, Object[]> TestNGResults;
        Sheet sheet;
    public AllTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws IOException{
        workbook = WorkbookFactory.create(new File("./PS09852_KiemThuNangCao.xlsx"));
        sheet = workbook.getSheetAt(1);
        TestNGResults = new LinkedHashMap<String, Object[]> ();
    }

    @AfterClass
    public void tearDownClass() throws IOException {
        Set<String> keyset = TestNGResults.keySet();
		for (String key : keyset) {
			Object[] objArr = TestNGResults.get(key);
                        int rownum = Integer.parseInt(key);
			int cellnum = 4;
			for (Object obj : objArr) {
				Cell cell = (Cell) sheet.getRow(rownum).createCell(cellnum);
				cell.setCellValue((String) obj);
                                Font font = workbook.createFont();
                                font.setFontHeightInPoints((short)15);		    
                                font.setFontName("Times New Roman");
                                font.setBold(true);
                                CellStyle style = workbook.createCellStyle();
                                style.setVerticalAlignment(VerticalAlignment.CENTER);
                                style.setAlignment(HorizontalAlignment.CENTER);
                                style.setFont(font);
                                cell.setCellStyle(style);
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(new File("modifier-employee.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("Successfully saved TestNG result to Excel File!!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
	}

    }
    @Test(priority=1)
    public void testLG001(){
        System.out.println("LG - 001");
        boolean kt ;
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("");
        instance.txtMatKhau.setText("");
        if(instance.login()== false){
            kt = true;
            TestNGResults.put("01", new Object[] {"Pass"});
        }else{
            kt = false;
            TestNGResults.put("01", new Object[] {"Fail"});
        }
    }
    @Test(priority=2)
    public void testLG002(){
        System.out.println("LG - 002");
        boolean kt ;
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("");
        instance.txtMatKhau.setText("123");
        if(instance.login()== false){
            kt = true;
            TestNGResults.put("02", new Object[] {"Pass"});
        }else{
            kt = false;
            TestNGResults.put("02", new Object[] {"Fail"});
        }
    }
    @Test(priority=3)
    public void testLG003(){
        System.out.println("LG - 003");
        boolean kt ;
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anh");
        instance.txtMatKhau.setText("");
        if(instance.login()== false){
            kt = true;
            TestNGResults.put("03", new Object[] {"Pass"});
        }else{
            kt = false;
            TestNGResults.put("03", new Object[] {"Fail"});
        }
    }
    @Test(priority=4)
    public void testLG004(){
        System.out.println("LG - 004");
        boolean kt ;
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anhnh");
        instance.txtMatKhau.setText("123");
        if(instance.login()== false){
            kt = true;
            TestNGResults.put("04", new Object[] {"Pass"});
        }else{
            kt = false;
            TestNGResults.put("04", new Object[] {"Fail"});
        }
    }
    @Test(priority=5)
    public void testLG005(){
        System.out.println("LG - 005");
        boolean kt ;
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anh");
        instance.txtMatKhau.setText("12345");
        if(instance.login()== false){
            kt = true;
            TestNGResults.put("05", new Object[] {"Pass"});
        }else{
            kt = false;
            TestNGResults.put("05", new Object[] {"Fail"});
        }
    }
    @Test(priority=6)
    public void testLG006(){
        System.out.println("LG - 006");
        boolean kt ;
        DangNhapJFrame instance = new DangNhapJFrame();
        instance.txtMaNV.setText("anh");
        instance.txtMatKhau.setText("123");
        if(instance.login()== true){
            kt = true;
            TestNGResults.put("06", new Object[] {"Pass"});
        }else{
            kt = false;
            TestNGResults.put("06", new Object[] {"Fail"});
        }
    }
    
    @Test(priority=7)
    public void testNV001(){
        System.out.println("NV - 001");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("");
        instance.txtmatkhau.setText("");
        instance.txtmatkhau2.setText("");
        instance.txthoten.setText("");
        instance.isvalid();
//        if(instance.insert() == true ){
//            kt = true;
//            TestNGResults.put("07", new Object[] {"Pass"});           
//        }else{
//            kt = false;
//            TestNGResults.put("07", new Object[] {"Fail"}); 
//        }
//        assertFalse(kt);
    }
    @Test(priority=8)
    public void testNV002(){
        System.out.println("NV - 002");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("anh");
        instance.txtmatkhau.setText("abc");
        instance.txtmatkhau2.setText("abc");
        instance.txthoten.setText("Nguyễn Văn A");
        instance.isvalid();
        if(instance.insert() == false ){
            kt = true;
            TestNGResults.put("08", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("08", new Object[] {"Fail"});
        }
    }
     @Test(priority=9)
    public void testNV003(){
        System.out.println("NV - 003");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NVA");
        instance.txtmatkhau.setText("12");
        instance.txtmatkhau2.setText("");
        instance.txthoten.setText("Nguyễn Văn A");
        instance.isvalid();
        if(instance.insert() == false ){
            kt = true;
            TestNGResults.put("09", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("09", new Object[] {"Fail"});
        }
    }
    @Test(priority=10)
    public void testNV004(){
        System.out.println("NV - 004");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NVAA");
        instance.txtmatkhau.setText("123");
        instance.txtmatkhau2.setText("1234");
        instance.txthoten.setText("Nguyễn Văn A");
        instance.isvalid();
        if(instance.insert() == false ){
            kt = true;
            TestNGResults.put("10", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("10", new Object[] {"Fail"});
        }
    }
    @Test(priority=11)
    public void testNV005(){
        System.out.println("NV - 005");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NVAnè");
        instance.txtmatkhau.setText("123456");
        instance.txtmatkhau2.setText("123456");
        instance.txthoten.setText("Nguyễn Văn Anh nè");
        instance.isvalid();
        if(instance.insert() == true ){
            kt = true;
            TestNGResults.put("11", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("11", new Object[] {"Fail"});
        }
    }
    @Test(priority=12)
    public void testNV006(){
        System.out.println("NV - 006");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("");
        instance.txtmatkhau.setText("");
        instance.txtmatkhau2.setText("");
        instance.txthoten.setText("");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("12", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("12", new Object[] {"Fail"});
        }
        assertFalse(kt);
    }
    @Test(priority=13)
    public void testNV007(){
        System.out.println("NV - 007");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("NV2");
        instance.txtmatkhau.setText("123456");
        instance.txtmatkhau2.setText("123456");
        instance.txthoten.setText("Nguyễn Văn Đức anh");
        instance.isvalid();
        if(instance.update() == true ){
            kt = true;
            TestNGResults.put("13", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("13", new Object[] {"Fail"});
        }
    }
    
    @Test(priority=14)
    public void testNV008(){
        System.out.println("NV - 008");
        boolean kt ;
        NhanVienJFrame instance = new NhanVienJFrame();
        instance.txtmanv.setText("apnh");
        if(instance.delete() == true ){
            kt = true;
            TestNGResults.put("14", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("14", new Object[] {"Fail"});
        }
    }
    @Test(priority=15)
    public void testKH001(){
        System.out.println("KH - 001");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("");
        instance.txtHoten.setText("");
        instance.txtDiachi.setText("");
        instance.txtSodt.setText("");
        instance.txtNgaysinh.setText("");
        instance.isvalid();
//        if(instance.insert()== false ){
//            kt = true;
//            TestNGResults.put("15", new Object[] {"Pass"});
//            
//        }else{
//            kt = false;
//            TestNGResults.put("15", new Object[] {"Fail"});
//        }
//        assertFalse(kt);
    }
    @Test(priority=16)
    public void testKH002(){
        System.out.println("KH - 002");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("11");
        instance.txtHoten.setText("Phạm A");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("2000-02-02");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("16", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("16", new Object[] {"Fail"});
        }
    }
    @Test(priority=17)
    public void testKH003(){
        System.out.println("KH - 003");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("11");
        instance.txtHoten.setText("Phạm A");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("10");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("17", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("17", new Object[] {"Fail"});
        }
    }
    @Test(priority=18)
    public void testKH004(){
        System.out.println("KH - 004");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("KH05");
        instance.txtHoten.setText("Phạm A");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("2000-02-02");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("18", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("18", new Object[] {"Fail"});
        }
    }
    @Test(priority=19)
    public void testKH005(){
        System.out.println("KH - 005");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("KH16");
        instance.txtHoten.setText("Phạm A");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("2000-02-02");
        instance.isvalid();
        if(instance.insert()== true ){
            kt = true;
            TestNGResults.put("19", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("19", new Object[] {"Fail"});
        }
    }
    @Test(priority=20)
    public void testKH006(){
        System.out.println("KH - 006");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("");
        instance.txtHoten.setText("");
        instance.txtDiachi.setText("");
        instance.txtSodt.setText("");
        instance.txtNgaysinh.setText("");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("20", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("20", new Object[] {"Fail"});
        }
        assertFalse(kt);
    }
    @Test(priority=21)
    public void testKH007(){
        System.out.println("KH - 007");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
         instance.txtMakh.setText("15");
        instance.txtHoten.setText("Phạm A");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("2000-02-02");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("21", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("21", new Object[] {"Fail"});
        }
        assertFalse(kt);
    }
    @Test(priority=22)
    public void testKH008(){
        System.out.println("KH - 008");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("KH08");
        instance.txtHoten.setText("Phạm A");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("10");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("22", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("22", new Object[] {"Fail"});
        }
    }
    @Test(priority=23)
    public void testKH009(){
        System.out.println("KH - 009");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("KH08");
        instance.txtHoten.setText("Phạm Nguyễn Anh em");
        instance.txtDiachi.setText("Quận 12");
        instance.txtSodt.setText("09849391");
        instance.txtNgaysinh.setText("2000-02-02");
        instance.isvalid();
        if(instance.update()== true ){
            kt = true;
            TestNGResults.put("23", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("23", new Object[] {"Fail"});
        }
    }
    @Test(priority=24)
    public void testKH010(){
        System.out.println("KH - 010");
        boolean kt ;
        KhachHangJFrame instance = new KhachHangJFrame();
        instance.txtMakh.setText("kh11");
        if(instance.delete()== true ){
            kt = true;
            TestNGResults.put("24", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("24", new Object[] {"Fail"});
        }

    }
    @Test(priority=25)
    public void testSP001(){
        System.out.println("SP - 001");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("");
        instance.txtTensp.setText("");
        instance.lblHinh.setText("");
        instance.txtDvt.setText("");
        instance.txtNsx.setText("");
        instance.txtGia.setText("");
        instance.txtMota.setText("");
        instance.isvalid();
//        if(instance.insert()== false ){
//            kt = true;
//            TestNGResults.put("25", new Object[] {"Pass"});
//            
//        }else{
//            kt = false;
//            TestNGResults.put("25", new Object[] {"Fail"});
//        }
    }
    @Test(priority=26)
    public void testSP002(){
        System.out.println("SP - 002");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BB01");
        instance.txtTensp.setText("Bút Bi");
        instance.lblHinh.setText("hinh14.jpg");
        instance.txtDvt.setText("Cây");
        instance.txtNsx.setText("Việt Nam");
        instance.txtGia.setText("6000");
        instance.txtMota.setText("Siêu bền");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("26", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("26", new Object[] {"Fail"});
        }
    }
    @Test(priority=27)
    public void testSP003(){
        System.out.println("SP - 003");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("8");
        instance.txtTensp.setText("Bút bi");
        instance.lblHinh.setText("hinh14.jpg");
        instance.txtDvt.setText("Cây");
        instance.txtNsx.setText("Việt Nam");
        instance.txtGia.setText("6000");
        instance.txtMota.setText("Siêu bền");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("27", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("27", new Object[] {"Fail"});
        }
    }
    @Test(priority=28)
    public void testSP004(){
        System.out.println("SP - 004");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BBT01");
        instance.txtTensp.setText("Bút bi tím");
        instance.lblHinh.setText("hinh14.jpg");
        instance.txtDvt.setText("Cây");
        instance.txtNsx.setText("Việt Nam");
        instance.txtGia.setText("6000");
        instance.txtMota.setText("Siêu bền");
        instance.isvalid();
        if(instance.insert()== true ){
            kt = true;
            TestNGResults.put("28", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("28", new Object[] {"Fail"});
        }
    }
    @Test(priority=29)
    public void testSP005(){
        System.out.println("SP - 005");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("");
        instance.txtTensp.setText("");
        instance.lblHinh.setText("");
        instance.txtDvt.setText("");
        instance.txtNsx.setText("");
        instance.txtGia.setText("");
        instance.txtMota.setText("");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("29", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("29", new Object[] {"Fail"});
        }
    }
    @Test(priority=30)
    public void testSP006(){
        System.out.println("SP - 006");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BB01");
        instance.txtTensp.setText("Bút Bi");
        instance.lblHinh.setText("hinh14.jpg");
        instance.txtDvt.setText("Cây");
        instance.txtNsx.setText("ThaiLand");
        instance.txtGia.setText("10000");
        instance.txtMota.setText("Siêu bền");
        instance.isvalid();
        if(instance.update()== true ){
            kt = true;
            TestNGResults.put("30", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("30", new Object[] {"Fail"});
        }
    }
    @Test(priority=31)
    public void testSP007(){
        System.out.println("SP - 007");
        boolean kt ;
        SanPhamJFrame instance = new SanPhamJFrame();
        instance.txtMasp.setText("BL02");
        if(instance.delete()== true ){
            kt = true;
            TestNGResults.put("31", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("31", new Object[] {"Fail"});
        }
    }
    @Test(priority=32)
    public void testHD001(){
        System.out.println("HD - 001");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("");
        instance.txtMakh.setText("");
        instance.txtManv.setText("");
        instance.txtMasp.setText("");
        instance.txtSL.setText("");
        instance.txtNGLHD.setText("");
        instance.txtTongtien.setText("");
        instance.txtGhichu.setText("");
        instance.isvalid();
//        if(instance.insert()== false ){
//            kt = true;
//            TestNGResults.put("32", new Object[] {"Pass"});
//            
//        }else{
//            kt = false;
//            TestNGResults.put("32", new Object[] {"Fail"});
//        }
    }
    @Test(priority=33)
    public void testHD002(){
        System.out.println("HD - 002");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("1");
        instance.txtMakh.setText("KH05");
        instance.txtManv.setText("nv1");
        instance.txtMasp.setText("BB01");
        instance.txtSL.setText("3");
        instance.txtNGLHD.setText("2020-10-10");
        instance.txtTongtien.setText("15000");
        instance.txtGhichu.setText("abc");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("33", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("33", new Object[] {"Fail"});
        }
    }
    @Test(priority=34)
    public void testHD003(){
        System.out.println("HD - 003");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("15");
        instance.txtMakh.setText("KH05");
        instance.txtManv.setText("nv1");
        instance.txtMasp.setText("BB01");
        instance.txtSL.setText("3");
        instance.txtNGLHD.setText("20");
        instance.txtTongtien.setText("15000");
        instance.txtGhichu.setText("abc");
        instance.isvalid();
        if(instance.insert()== false ){
            kt = true;
            TestNGResults.put("34", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("34", new Object[] {"Fail"});
        }
    }
    @Test(priority=35)
    public void testHD004(){
        System.out.println("HD - 004");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("15");
        instance.txtMakh.setText("KH05");
        instance.txtManv.setText("nv1");
        instance.txtMasp.setText("BB01");
        instance.txtSL.setText("3");
        instance.txtNGLHD.setText("2020-10-10");
        instance.txtTongtien.setText("15000");
        instance.txtGhichu.setText("abc");
        instance.isvalid();
        if(instance.insert()== true ){
            kt = true;
            TestNGResults.put("35", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("35", new Object[] {"Fail"});
        }
    }
    @Test(priority=36)
    public void testHD005(){
        System.out.println("HD - 005");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("");
        instance.txtMakh.setText("");
        instance.txtManv.setText("");
        instance.txtMasp.setText("");
        instance.txtSL.setText("");
        instance.txtNGLHD.setText("");
        instance.txtTongtien.setText("");
        instance.txtGhichu.setText("");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("36", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("36", new Object[] {"Fail"});
        }
    }
    @Test(priority=37)
    public void testHD006(){
        System.out.println("HD - 006");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("15");
        instance.txtMakh.setText("KH05");
        instance.txtManv.setText("nv1");
        instance.txtMasp.setText("BB01");
        instance.txtSL.setText("3");
        instance.txtNGLHD.setText("20");
        instance.txtTongtien.setText("15000");
        instance.txtGhichu.setText("abc");
        instance.isvalid();
        if(instance.update()== false ){
            kt = true;
            TestNGResults.put("37", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("37", new Object[] {"Fail"});
        }
    }
    @Test(priority=38)
    public void testHD007(){
        System.out.println("HD - 007");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("15");
        instance.txtMakh.setText("KH05");
        instance.txtManv.setText("nv2");
        instance.txtMasp.setText("BB01");
        instance.txtSL.setText("3");
        instance.txtNGLHD.setText("2020-12-12");
        instance.txtTongtien.setText("15000");
        instance.txtGhichu.setText("abc");
        instance.isvalid();
        if(instance.update()== true ){
            kt = true;
            TestNGResults.put("38", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("38", new Object[] {"Fail"});
        }
    }
    @Test(priority=39)
    public void testHD008(){
        System.out.println("HD - 008");
        boolean kt ;
        HoaDonJFrame instance = new HoaDonJFrame();
        instance.txtSoHD.setText("7");
        if(instance.delete()== true ){
            kt = true;
            TestNGResults.put("39", new Object[] {"Pass"});
            
        }else{
            kt = false;
            TestNGResults.put("39", new Object[] {"Fail"});
        }
    }
    

//    @BeforeMethod
//    public void setUpMethod() throws Exception {
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//    }
}
