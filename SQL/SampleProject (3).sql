use master
go
drop database DA1_QuanLyBanHang
go
CREATE DATABASE DA1_QuanLyBanHang
go
use DA1_QuanLyBanHang
go

-- KHACHANG
CREATE TABLE KHACHHANG(
	MAKH	varchar(20) primary key,	
	HOTEN	nvarchar(40),
	DIACHI	nvarchar(50),
	SODT	nvarchar(20),
	NGAYSINH	date,	
)
go
---------------------------------------------
-- NHANVIEN
CREATE TABLE NHANVIEN(
	MANV	varchar(20) primary key,	
	MatKhau nvarchar(50),
	HOTEN	nvarchar(40)
)
go
---------------------------------------------
-- SANPHAM
CREATE TABLE SANPHAM(
	MASP	varchar(20) primary key,
	TENSP	nvarchar(40),
	Hinh   nvarchar(150),
	DVT nvarchar(50),
	NUOCSX	nvarchar(40),
	GIA	money,	
	GHICHU NVARCHAR(MAX)
)
go
---------------------------------------------
-- HOADON
CREATE TABLE HOADON(
	SoHD	varchar(20) primary key,
	MAKH 	varchar(20),
	MANV 	varchar(20),
	MASP	varchar(20),
	SL	int,
	NGLHD 	date,	
	TRIGIA	money,
	GHICHU nvarchar(200),	
) 
go
alter table HOADON add CONSTRAINT FK_HD_MAKH FOREIGN KEY (MAKH) REFERENCES KHACHHANG (MAKH)
alter table HOADON add CONSTRAINT FK_HD_MANV FOREIGN KEY (MANV) REFERENCES NHANVIEN (MANV)
alter table HOADON add CONSTRAINT FK_HD_MASP FOREIGN KEY (MASP) REFERENCES SANPHAM (MASP)

Insert into NHANVIEN values ('NV1', N'123456', N'Phạm Nguyễn Hoàng Anh')
Insert into NHANVIEN values ('NV2', N'123456', N'Nguyễn Đức Tràng')

Insert into KHACHHANG values (N'KH01', N'Nguyễn Kỳ Uyên', N'Bình Dương', N'0249382004','10/25/2000')
Insert into KHACHHANG values (N'KH02', N'Đào Duy Tùng', N'Phú Nhuận', N'0482735342','11/02/2000')
Insert into KHACHHANG values (N'KH03', N'Nguyễn Đức Duy', N'Thủ Đức', N'0291874932','07/11/2000')
Insert into KHACHHANG values (N'KH04', N'Trần Như Đa Lộc', N'Quận 12', N'058343231','01/29/2000')
Insert into KHACHHANG values (N'KH05', N'Đinh Chí Cường', N'Gò Vấp', N'075948302','09/18/2000')
Insert into KHACHHANG values (N'KH06', N'Võ Văn Thanh Quang', N'Bình Tân', N'024928442','05/25/2000')
Insert into KHACHHANG values (N'KH07', N'Nguyễn Đình Châu', N'Quận 9', N'014593903','03/17/2000')
Insert into KHACHHANG values (N'KH08', N'Cao Lê Hoàng Hiếu', N'Quận 7', N'095847362','06/16/2000')

Insert into SANPHAM values ('BC01', N'Bút Chì Gỗ', '1.JPG',N'Cây', N'Singapore', 3500,N'')
Insert into SANPHAM values ('BC02', N'Bút Chì Nhựa', null,N'Cây', N'Việt Nam', 3500,N'')
Insert into SANPHAM values ('BB01', N'Bút Bi Xanh', null, N'Cây',N'Trung Quốc', 5000,N'')
Insert into SANPHAM values ('BB02', N'Bút Bi Đen', null, N'Hộp',N'Thái Lan', 50000,N'')
Insert into SANPHAM values ('TV01', N'Tập 96 trang', null, N'Chục',N'Việt Nam', 23000,N'')
Insert into SANPHAM values ('TV02', N'Tập 200 trang', null, N'Quyển',N'Việt Nam', 15000,N'')
Insert into SANPHAM values ('ST01', N'Sổ tay 500 trang', null,N'Quyển', N'Trung Quốc', 40000,N'')
Insert into SANPHAM values ('ST02', N'Sổ tay loại 1', null,N'Quyển', N'Việt Nam', 15000,N'')
Insert into SANPHAM values ('ST03', N'Sổ tay loại 2', null,N'Quyển', N'Việt Nam', 25000,N'')
Insert into SANPHAM values ('PVB01', N'Phấn Viết Bảng', null,N'Hộp', N'Thái Lan', 18000,N'')
Insert into SANPHAM values ('PVB02', N'Phấn Viết Bảng Xịn', null,N'Hộp', N'Thái Lan', 32000,N'')
Insert into SANPHAM values ('BT01', N'Bảng Trắng ', null,N'Cái', N'Trung Quốc', 50000,N'')
Insert into SANPHAM values ('BL01', N'Bút Long Xanh', null,N'Cây', N'Việt Nam', 89000,N'')
Insert into SANPHAM values ('BL02', N'Bút Long Đen', null,N'Hộp', N'Singapore', 79000,N'')  

Insert into HOADON values (01, 'KH01', 'NV1', 'BB01', 2, '12/10/2019', 10000, N'')
Insert into HOADON values (02, 'KH02', 'NV2', 'BB02', 1, '12/09/2017', 100000, N'')
Insert into HOADON values (03, 'KH03', 'NV2', 'ST01', 3, '12/08/2019', 120000, N'')
Insert into HOADON values (04, 'KH04', 'NV1', 'ST02', 1, '12/08/2019', 15000, N'Hủy')
Insert into HOADON values (05, 'KH05', 'NV2', 'TV02', 2, '12/07/2019', 15000, N'')
Insert into HOADON values (06, 'KH06', 'NV1', 'BC01', 1, '12/06/2019', 3500, N'')
Insert into HOADON values (07, 'KH07', 'NV1', 'BC02', 1, '12/06/2019', 3500, N'')
Insert into HOADON values (08, 'KH08', 'NV2', 'PVB01', 2, '12/05/2019', 18000, N'Hủy')
Insert into HOADON values (09, 'KH07', 'NV2', 'BB02', 3, '2/2/2019', 15000, N'Hủy')
select * from NHANVIEN
select * from HOADON
select * from KHACHHANG
select * from SANPHAM
select * from SANPHAM where DVT = 'Hộp'
select distinct DVT  from SANPHAM

select hd.SoHD, hd.MaKH, kh.HOTEN N'Họ Tên KH', hd.MANV, nv.HOTEN, hd.MASP, sp.TENSP, hd.SL, hd.NGLHD, hd.TRIGIA, hd.GHICHU
from HOADON hd join KHACHHANG kh on hd.MAKH = kh.MAKH
	join NHANVIEN nv on hd.MANV = nv.MANV
	join SANPHAM sp on hd.MASP = sp.MASP
	order by hd.TRIGIA asc

	select count(MASP) from SANPHAM
	select count(MANV) from NHANVIEN
	select count(MAKH) from KHACHHANG
	select count(SoHD) from HOADON

