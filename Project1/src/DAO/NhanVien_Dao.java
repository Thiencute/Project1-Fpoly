/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Dao.Constructure;
import Modal.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 *//*private String MaNV;
    private String MatKhau;
    private String TenNV;
String SDT;
private Double Luong;
    private boolean Vaitro;
   private String email;
    private String Address;
    
    private boolean GioiTinh;
    
    */
public class NhanVien_Dao extends Constructure<NhanVien>{
    private String Insert = "insert into nhanvien(MaNV,MatKhau,TenNV,SDT,luong,vaitro,email,DiaChi,GioiTinh)values (?,?,?,?,?,?,?,?,?)";
    private String Delete = "delete from nhanvien where MaNV like ?";
    private String Update = "update NhanVien set MatKhau = ?,TenNV = ?, diachi = ?, SDT = ?, luong = ?, vaitro = ?, email = ?, GioiTinh = ? where MaNV like ?";
    private String Data = "select * from nhanvien";
    private String Search = "select * from nhanvien where MaNV like ?";
    
    NhanVien nv = new NhanVien();
    List<NhanVien> list = new ArrayList<>();
    
   private List<NhanVien> select(String sql,Object...args) {
       list = new ArrayList<>();
       ResultSet rs = ConnectSQL.ResultSet(sql, args);
       try {
            while(rs.next()){
           nv = Read(rs);
           list.add(nv);
       }
       } catch (Exception e) {
       }finally{
           try {
               rs.close();
           } catch (Exception e) {
           }
       }
       
       return list;
   };
   private NhanVien Read(ResultSet rs) throws SQLException{
      nv = new NhanVien();
      nv.setMaNV(rs.getString("MaNV"));
      nv.setMatKhau(rs.getString("MatKhau"));
      nv.setTenNV(rs.getString("TenNV"));
      nv.setGioiTinh((rs.getInt("GioiTinh")==1)); //Nam = 1 ,Nữ =0
      nv.setAddress(rs.getString("DiaChi"));
      nv.setLuong(rs.getDouble("luong"));
      nv.setSDT(rs.getString("SDT"));
      nv.setVaitro(rs.getInt("VaiTro")==1?true:false); // 1 là quản lý 2 là nhân viên
      return nv; 
   }
    //insert into nhanvien(MaNV,MatKhau,TenNV,SDT,luong,vaitro,email,DiaChi)
    @Override
    public void Insert(NhanVien enity) {
        ConnectSQL.excuteUpdate(Insert, enity.getMaNV(),enity.getMatKhau(),enity.getTenNV(),enity.getAddress(),enity.getSDT(),enity.getLuong(),enity.isVaitro()?1:0,enity.getEmail(), enity.isGioiTinh()?1:2);
    }

    @Override
    public void Delete(NhanVien enity) {
        ConnectSQL.excuteUpdate(Delete, enity.getMaNV());
    }
    //update NhanVien set MatKhau = ?,TenNV = ?, diachi = ?, SDT = ?, luong = ?, vaitro = ?, email = ?, GioiTinh = ? where MaNV like ?";
    @Override
    public void Update(NhanVien enity) {
        ConnectSQL.excuteUpdate(Update, enity.getMatKhau(), enity.getTenNV(), enity.getAddress(), enity.getSDT(), enity.getLuong(), enity.isVaitro()?1:0,enity.getEmail(), enity.isGioiTinh()?1:2,enity.getMaNV());
    }

    @Override
    public List<NhanVien> Search(NhanVien enity) {
        return  select(Search, enity.getMaNV());
    }

    @Override
    public List<NhanVien> Data() {
        return select(Data);
    }
}