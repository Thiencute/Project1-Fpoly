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
	NgaySinh date	
)	
go	
create  table sanpham(	
	MaSanPham varchar(20) primary key not null,	
	TenSanPham Nvarchar(20) not null,
	ngayNhapHang date default Getdate(),	
	GiaTien money  not null,	
	Mota nvarchar(50),	
	TheTich float  not null,	
	soLuong int  not null	
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
Ghichu nvarchar(30) not null	
)	
go

create table HDCT_DichVu(
	maHDCT int IDENTITY (0,1) primary key not null,
	maHoaDon varchar(20) not null,
	maDichVu varchar(20) not null,
	NgayBatDau datetime default Getdate(),
	NgayKetThuc datetime,
	ghichu nvarchar(50) default N'Hoàn Thành đúng hạn'
)
go

create table HDCT_MuaBan(
	maHDCT int IDENTITY (0,1) primary key not null,
	maHoaDon varchar(20) not null,
	maSanPham varchar(20) not null,
	NgayBatDau datetime default Getdate(),
	NgayKetThuc datetime,
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


-- them du lieu
--1 true quanly, 0 false nhanvien'
insert into nhanvien(MaNV,MatKhau,diachi,SDT,luong,vaitro,email,tenNV,GioiTinh)
values ('cuong','123','HoChiMinh','0374280429',5000000,0,'cudenc8888@gmail.com',N'Nguyễn Văn Cường',1),
 ('cuongkhoaito','456','VungTau','0391234567',5000000,0,'cuong123@gmail.com',N'Lê Văn Cường',1),
 ('thiencute','789','DaLat','037489223',9000000,1,'thiencute@gmail.com',N'Trần Xuân Thiện',1),
 ('LyCute','789','DaLat','037489223',9000000,1,'Lycute@gmail.com',N'Đỗ Thảo Ly',0)
-- them du lieu
 insert into khachhang(MaKH,MatKhau,DiaChi,SDT,GioiTinh,email,NgaySinh)
 values ('kh1','123','BenTre','034586134',1,'tam@gmail.com','9/11/2000'),
        ('kh2','321','VinhLong','039985134',1,'hieu@gmail.com','4/1/2001'),
		('kh3','123','BenTre','0383223034',0,'vi@gmail.com','4/5/2000')
insert into hoadon(maHoaDon,MaKH,ghichu)
values ('hd1','kh1','ghichu1'),
       ('hd2','kh2','ghichu2'),
	   ('hd3','kh3','ghichu3')
--
go
insert into dichvu(madichvu,giatien,mota,tendichvu) 
values ('dv1',50000,'rua xe nha',N'Rửa xe'),
('dv2',40000,'thay phu tung cho xe',N'Thay Phụ Tùng'),
('dv3',50000,'tu van mua xe',N'Tư Vấn')
--
go



 --
 --1 (true)nam, 0 (False)nữ
 go
 insert into NhanVien
go
select * from sanpham
insert into sanpham(MaSanPham,ngayNhapHang,GiaTien,Mota,TheTich,soLuong,TenSanPham)
 values ('a001','9/1/2020',5000000,'vo xe',1,10,N'Vỏ Xe'),
        ('a002','9/1/2020',800000,'ruot xe',1,10,N'Ruột Xe'),
		('a003','9/1/2020',1000000,'kinh xe',1,10,N'Kính Xe')
go

insert into NhaCungCap(MaNCC,tenNCC,MaSanPham,NoiSanXuat,diachi)
values  ('001','honda','001','NhaMay1','Đồng Nai'),
        ('002','honda','002','NhaMay2','Vũng Tàu'),
        ('003','honda','003','NhaMay3','Hồ Chí Minh')
--
insert into Kho(MaKho,SucChua,DiaChi,GhiChu)
values ('Kho1','50','Ho Chi Minh',N'chứa vỏ xe'),
       ('Kho2','50','Ho Chi Minh',N'chứa ruột xe'),
	   ('Kho3','50','Ho Chi Minh',N'chứa kính xe')
go
--
insert into KhoChiTiet(MaKho,MaSanPham,soLuong,GhiChu)
values ('Kho1','001',10,'ghichu1'),
       ('Kho2','002',10,'ghichu2'),
	   ('Kho3','003',10,'ghichu3')
--
/*
insert into HDCT_MuaBan(maHDCT,maHoaDon,maSanPham,NgayBatDau,NgayKetThuc,ghichu)
go
insert into HDCT_DichVu(maHoaDon,maDichVu,NgayBatDau,NgayKetThuc,ghichu)
go*/