﻿/*use master 
go
 drop database project1_CB*/	
create database project1_CB	
go	
use project1_CB	
go	
create table Nhanvien(	
	MaNV varchar(20) primary key not null,	
	MatKhau varchar(20) not null,	
	TenNV nvarchar(20) not null,
	diachi nvarchar(20) not null,	
	SDT varchar(13) not null,	
	GioiTinh bit not null,	
	luong float,	
	vaitro bit not null,	
	email varchar(50)	
)	
go	
create table khachhang(	
	MaKH varchar(20) primary key not null,	
	MatKhau varchar(20) not null,	
	DiaChi nvarchar(20) not null,	
	SDT varchar(13) not null,	
	GioiTinh bit,	
	email varchar(20),	
	NgaySinh date default CONVERT(date, GETDATE())
)	
go	
create  table sanpham(	
	MaSanPham varchar(20) primary key not null,	
	TenSanPham Nvarchar(20) not null,
	ngayNhapHang date default CONVERT(date, GETDATE()),	
	GiaTien money  not null,	
	Mota nvarchar(50),	
	TheTich float  not null,	
	soLuong int  not null,
	Img image
)	
go	

create table NhaCungCap(	
	MaNCC varchar(20) not null primary key,	
	tenNCC nvarchar(20) not null,	
	MaSanPham varchar(20)  not null,	
	NoiSanXuat nvarchar(50)  not null,	
	diachi nvarchar(50)  not null	
)	
go
create table Kho(
 MaKho varchar(20) primary key not null,
 DiaChi nvarchar(50)  not null,
 SucChua float  not null,
 GhiChu nvarchar(50)  not null,

)	
go
create table KhoChiTiet(
	MaKhoChiTiet int IDENTITY (0,1) primary key  not null,
	MaKho varchar(20) not null,
	MaSanPham varchar(20) not null,
	soLuong int,
	GhiChu nvarchar(50) not null
)
go
create table DichVu(	
	MaDichVu varchar(20) primary key not null,	
	GiaTien money not null,	
	Mota nvarchar(50) not null,	
	tenDichVu nvarchar(20) not null	
)	
go	

create table hoadon(	
maHoaDon varchar(20) not null primary key,	
MaKH varchar(20) not null,	
Ghichu nvarchar(30) not null,
manv varchar(20) not null,
ngayban date default CONVERT(date, GETDATE())	
)	
go
select mahoadon,ngayban from hoadon

select CONVERT(date, GETDATE()) 
insert into hoadon(maHoaDon,MaKH,ghichu,manv,ngayban)
values ('7','kh1','ghichu1','khoa','')



create table HDCT_DichVu(
	maHDCT int IDENTITY (0,1) primary key not null,
	maHoaDon varchar(20) not null,
	maDichVu varchar(20) not null,
	ghichu nvarchar(50) default N'Hoàn Thành đúng hạn'
)
--select * from sanpham
go

create table HDCT_MuaBan(
	maHDCT int IDENTITY (0,1) primary key not null,
	maHoaDon varchar(20) not null,
	maSanPham varchar(20) not null,
	soluong int not null,
	ghichu nvarchar(50) default N'Hoàn Thành đúng hạn'
) 
go
alter table KhoChiTiet
add constraint FK_KCT_K Foreign key(MaKho) references Kho(MaKho) on delete no action on update cascade
go
alter table NhaCungCap
add constraint FK_NCC_SP Foreign key(MaSanPham) references SanPham(MaSanPham)  on delete no action on update cascade
go
alter table HoaDon
add constraint FK_HD_KH Foreign key(MaKH) references KhachHang(MaKH) on delete no action on update cascade
go
alter table HoaDon
add constraint FK_HD_NV Foreign key(MaNv) references NhanVien(MaNV) on delete no action on update cascade
go
alter table HDCT_DichVu
add constraint FK_CTDV_DV Foreign key(MaDichVu) references DichVu(MaDichVu) on delete cascade on update cascade
go
alter table HDCT_DichVu
add constraint FK_CTDV_HD Foreign key(maHoaDon) references HoaDon(maHoaDon) on delete cascade on update cascade
go
alter table HDCT_MuaBan 
add constraint FK_CTMB_SP Foreign key(MaSanPham) references SanPham(MaSanPham) on delete cascade on update cascade
alter table HDCT_MuaBan 
add constraint FK_CTMB_HD Foreign key(maHoaDon) references HoaDon(maHoaDon) on delete cascade on update cascade



--1 quanly + nam, 0nhanvien+ nữ

<<<<<<< HEAD
insert into nhanvien(MaNV,MatKhau,TenNV,diachi,SDT,GioiTinh,luong,vaitro,email)
values ('cuong','123',N'cường','HoChiMinh','0374280429',1,5000000,0,'cudenc8888@gmail.com'),
 ('cuongkhoaito','456',N'cường khoai to','VungTau','0391234567',1,5000000,0,'cuong123@gmail.com'),
 ('thiencute','789',N'thiện cute','DaLat','037489223',1,9000000,1,'thiencute@gmail.com'),
 (' teo','323',N'tèo','HoChiMinh','037423652',1,5000000,0,'teo8888@gmail.com'),
 ('vi','466',N'vi','HoChiMinh','0391288997',0,5000000,0,'vi@gmail.com'),
 ('thy','889',N'thy','HoChiMinh','063489223',0,5000000,0,'thy@gmail.com'),
 ('tam','163',N'tâm','HoChiMinh','0823690429',1,5000000,0,'tam8888@gmail.com'),
 ('khoa','460',N'khoa','HoChiMinh','0989123354',1,5000000,0,'khoa@gmail.com'),
 ('hieu','719',N'hiếu','DaLat','063248233',1,5000000,0,'hieu@gmail.com'),
 ('vy','333',N'vy','HoChiMinh','038558229',1,5000000,0,'vy8888@gmail.com')
=======
insert into nhanvien(MaNV,MatKhau,diachi,TenNV,SDT,GioiTinh,luong,vaitro,email)
values ('cuong','123','HoChiMinh',N'cường','0374280429',1,5000000,0,'cudenc8888@gmail.com'),
 ('cuongkhoaito','456','VungTau',N'cường khoai to','0391234567',1,5000000,0,'cuong123@gmail.com'),
 ('thiencute','789','DaLat',N'thiện cute','037489223',1,9000000,1,'thiencute@gmail.com'),
 (' teo','323','HoChiMinh',N'tèo','037423652',1,5000000,0,'teo8888@gmail.com'),
 ('vi','466','HoChiMinh',N'vi','0391288997',0,5000000,0,'vi@gmail.com'),
 ('thy','889','HoChiMinh',N'thy','063489223',0,5000000,0,'thy@gmail.com'),
 ('tam','163','HoChiMinh',N'tâm','0823690429',1,5000000,0,'tam8888@gmail.com'),
 ('khoa','460','HoChiMinh',N'khoa','0989123354',1,5000000,0,'khoa@gmail.com'),
 ('hieu','719','DaLat',N'hiếu','063248233',1,5000000,0,'hieu@gmail.com'),
 ('vy','333','HoChiMinh',N'vy','038558229',1,5000000,0,'vy8888@gmail.com')
>>>>>>> c0e358c7b5835a3e56465b91ff5659c6f32101ad

go

insert into khachhang(MaKH,MatKhau,DiaChi,SDT,GioiTinh,email,NgaySinh)
 values ('kh1','123','BenTre','034586134',1,'tam@gmail.com','9/11/2000'),
        ('kh2','321','VinhLong','039985134',1,'hieu@gmail.com','4/1/2001'),
		('kh3','124','BenTre','0383223034',0,'vi@gmail.com','4/5/2000'),
		('kh4','125','TiengGiang','0325606134',1,'nghia@gmail.com','9/1/2000'),
        ('kh5','322','KienGiang','071343134',1,'tuong@gmail.com','3/10/2001'),
		('kh6','126','CanTho','038865654',1,'duy@gmail.com','2/8/2000'),
		('kh7','127','TraVinh','078954134',0,'vy@gmail.com','1/1/2000'),
        ('kh8','323','HauGiang','063153834',1,'nhan@gmail.com','3/1/2001'),
		('kh9','129','SocTrang','094566354',1,'teo@gmail.com','2/9/2000'),
		('kh10','111','','0399658134',1,'bang@gmail.com','9/1/2000')
go
--


<<<<<<< HEAD

insert into hoadon(maHoaDon,MaKH,ghichu,manv,tongtien)
values ('hd1','kh1','ghichu1','khoa',1234),
       ('hd2','kh2','ghichu2','khoa',1230),
	   ('hd3','kh3','ghichu3','khoa',1266),
	   ('hd4','kh4','ghichu4','khoa',1277),
       ('hd5','kh5','ghichu5','khoa',1233),
	   ('hd6','kh6','ghichu6','khoa',1230),
	   ('hd7','kh7','ghichu7','khoa',1244),
       ('hd8','kh8','ghichu8','khoa',1211),
	   ('hd9','kh9','ghichu9','khoa',1000),
	   ('hd10','kh10','ghichu10','khoa',1230)

=======
insert into hoadon(maHoaDon,MaKH,ghichu,manv,ngayban)
values ('hd1','kh1','ghichu1','khoa',''),
       ('hd2','kh2','ghichu2','khoa',''),
	   ('hd3','kh3','ghichu3','khoa',''),
	   ('hd4','kh4','ghichu4','khoa',''),
       ('hd5','kh5','ghichu5','khoa',''),
	   ('hd6','kh6','ghichu6','khoa',''),
	   ('hd7','kh7','ghichu7','khoa',''),
       ('hd8','kh8','ghichu8','khoa',''),
	   ('hd9','kh9','ghichu9','khoa',''),
	   ('hd10','kh10','ghichu10','khoa','')
>>>>>>> 873a4370f5ddac960f3e2d7010708b5f07ad81d3
go
--select * from hoadon

insert into dichvu(madichvu,giatien,mota,tendichvu) 
values ('dv1',50000,'rua xe nha',N'Rửa xe'),
('dv2',40000,'thay phu tung cho xe',N'Thay Phụ Tùng'),
('dv3',50000,'tu van mua xe',N'Tư Vấn'),
 ('dv4',50000,'bao tri',N'Bảo Trì'),
('dv5',40000,'cham soc khach hang',N'Chăm Sóc Khách Hàng'),
('dv6',50000,'huong dan su dung',N'Hướng Dẫn')

go
--


 --1 nam, 0 nữ



insert into sanpham(MaSanPham,TenSanPham,ngayNhapHang,GiaTien,Mota,TheTich,soLuong)
 values ('vx1',N'vỏ xe','9/1/2020',50000,N'màu đen',1.5,10),
        ('rx1',N'ruột xe','9/1/2020',80000,N'nhiều loại',0.5,10),
		('kx1',N'kính xe','9/1/2020',10000,N'nhiều loại',1,10),
		('bx1',N'bánh xe','9/1/2020',50000,N'nhiều loại',1.5,10),
        ('ax1',N'dàn áo xe','9/1/2020',800000,N'nhiều loại',0.5,10),
		('nx1',N'nhớt xe','9/1/2020',10000,N'nhiều loại',1,10),
		('ox1',N'ốc xe','9/1/2020',50000,N'nhiều loại',1.5,10),
        ('dx1',N'đèn xe','9/1/2020',8000,N'nhiều loại',0.5,10),
		('yx1',N'yên xe','9/1/2020',10000,N'nhiều loại',1,10),
		('tx1',N'tay thắng xe','9/1/2020',50000,N'nhiều loại',1.5,10)

go

insert into NhaCungCap(MaNCC,tenNCC,MaSanPham,NoiSanXuat,diachi)
values  ('001','honda','tx1','NhaMay1',N'Đồng Nai'),
        ('002','honda','tx1','NhaMay2',N'Vũng Tàu'),
        ('003','honda','dx1','NhaMay3',N'Hồ Chí Minh'),
		('004','honda','dx1','NhaMay4',N'Đồng Nai'),
        ('005','honda','dx1','NhaMay5',N'Vũng Tàu'),
        ('006','honda','dx1','NhaMay6',N'Hồ Chí Minh'),
		('007','honda','ox1','NhaMay7',N'Đồng Nai'),
        ('008','honda','ox1','NhaMay8',N'Vũng Tàu'),
        ('009','honda','ox1','NhaMay9',N'Hồ Chí Minh'),
        ('0010','honda','ox1','NhaMay10',N'Hồ Chí Minh')
go
--
insert into Kho(MaKho,SucChua,DiaChi,GhiChu)
values ('Kho1','50','Ho Chi Minh',N'chứa vỏ xe'),
       ('Kho2','50','Ho Chi Minh',N'chứa ruột xe'),
	   ('Kho3','50','Ho Chi Minh',N'chứa kính xe'),
	   ('Kho4','50','Ho Chi Minh',N'chứa bánh xe'),
       ('Kho5','50','Ho Chi Minh',N'chứa dàn áo xe'),
	   ('Kho6','50','Ho Chi Minh',N'chứa nhớt xe'),
	   ('Kho7','50','Ho Chi Minh',N'chứa ốc xe'),
       ('Kho8','50','Ho Chi Minh',N'chứa đèn xe'),
	   ('Kho9','50','Ho Chi Minh',N'chứa yên xe'),
	   ('Kho10','50','Ho Chi Minh',N'chứa tay thắng xe')
go
--
insert into KhoChiTiet(MaKho,MaSanPham,soLuong,GhiChu)
values ('Kho1','001',10,'ghichu1'),
       ('Kho2','002',10,'ghichu2'),
	   ('Kho3','003',10,'ghichu3'),
	   ('Kho4','004',10,'ghichu4'),
       ('Kho5','005',10,'ghichu5'),
	   ('Kho6','006',10,'ghichu6'),
	   ('Kho7','007',10,'ghichu7'),
       ('Kho8','008',10,'ghichu8'),
	   ('Kho9','009',10,'ghichu9'),
	   ('Kho10','0010',10,'ghichu10')
go

--

insert into HDCT_MuaBan(maHoaDon,maSanPham,soluong,ghichu)
values('hd5','tx1',5,'aaa'),
('hd5','tx1',6,'aaa'),
('hd1','tx1',2,'aaa'),
('hd2','tx1',1,'aaa'),
('hd4','tx1',10,'aaa')
go

insert into HDCT_DichVu(maHoaDon,maDichVu,ghichu)
values('hd1','dv1','aaa'),
('hd2','dv2','aaa'),
('hd1','dv3','aaa'),
('hd4','dv4','aaa'),
('hd5','dv5','aaa'),
('hd1','dv1','aaa'),
('hd2','dv2','aaa'),
('hd1','dv3','aaa'),
('hd4','dv4','aaa'),
('hd5','dv5','aaa')
go
-- proc-
--masp, ten sp, soluongdaban, tongtien
create proc sp_ThongKeSanPham(@ngay date)
as
begin
	----declare @masp varchar(20), @TenSP varchar()
	if(@ngay is not null)
		begin
			select hoadon.ngayban,
					sanpham.MaSanPham, sanpham.TenSanPham,
					sum(HDCT_MuaBan.soLuong)as'SoLuongDaBan',
					sum(HDCT_MuaBan.soLuong * sanpham.GiaTien)as 'TongTien' 
					from sanpham  inner join HDCT_MuaBan on sanpham.MaSanPham = HDCT_MuaBan.maSanPham inner join hoadon on hoadon.maHoaDon = HDCT_MuaBan.maHoaDon
					group by sanpham.MaSanPham,sanpham.TenSanPham,hoadon.ngayban
					--select * from hoadon
			 having hoadon.ngayban like ('2020')
		 end
	 else
		 begin
			select hoadon.ngayban,
					sanpham.MaSanPham, sanpham.TenSanPham,
					sum(HDCT_MuaBan.soLuong)as'SoLuongDaBan',
					sum(HDCT_MuaBan.soLuong * sanpham.GiaTien)as 'TongTien' 
					from sanpham  inner join HDCT_MuaBan on sanpham.MaSanPham = HDCT_MuaBan.maSanPham inner join hoadon on hoadon.maHoaDon = HDCT_MuaBan.maHoaDon
					group by sanpham.MaSanPham,sanpham.TenSanPham,hoadon.ngayban
			 end
end

--exec sp_ThongKeSanPham '2020'

