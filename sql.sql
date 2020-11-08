create database project1	
go	
use project1	
go	
create table Nhanvien(	
	MaNV varchar(20) primary key not null,	
	MatKhau varchar(20) not null,	
	diachi nvarchar(20) not null,	
	SDT char(13) not null,	
	luong int,	
	vaitro bit not null,	
	email varchar(20)	
)	
go	
create table khachhang(	
	MaKH varchar(20) primary key not null,	
	MatKhau varchar(20) not null,	
	DiaChi nvarchar(20) not null,	
	SDT char(13) not null,	
	GioiTinh bit,	
	email varchar(20),	
	NgaySinh date	
)	
go	
create  table sanpham(	
	MaSP varchar(20) primary key not null,	
	ngayNhapHang date default Getdate(),	
	GiaTien money  not null,	
	Mota nvarchar(50),	
	tenSanpham nvarchar(20)  not null,	
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
Tongtien double,	

)	


