create database project1_CB	
go	
use project1_CB	
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
	MaSanPham varchar(20) primary key not null,	
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
Tongtien float not null	
)	
go

create table HDCT_DichVu(
	maHDCT int IDENTITY (0,1) primary key not null,
	maHoaDon varchar(20) not null,
	maDichVu varchar(20) not null,
	NgayBatDau date default Getdate(),
	NgayKetThuc date,
	ghichu nvarchar(50) default N'Hoàn Thành đúng hạn'
)
go

create table HDCT_MuaBan(
	maHDCT int IDENTITY (0,1) primary key not null,
	maHoaDon varchar(20) not null,
	maSanPham varchar(20) not null,
	NgayBatDau date default Getdate(),
	NgayKetThuc date,
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
insert into dichvu(madichvu,giatien,mota,tendichvu) 
values ('dv1',50000,'rua xe nha',N'Rửa xe'),
('dv2',40000,'thay phu tung cho xe',N'Thay Phụ Tùng')
--hi