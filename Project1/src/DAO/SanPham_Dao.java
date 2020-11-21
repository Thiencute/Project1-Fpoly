/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.*;
import java.sql.*;
import DAO.Constructure;
import DAO.Date;
import Modal.SanPham;
import DAO.Date;
//import Modal.NhanVien;

/**
 *
 * @author Home
 */
public class SanPham_Dao extends Constructure<SanPham, String> {
    // select + insert Chay tot
    static private String Insert = "insert into SanPham(MaSanPham,ngayNhapHang,GiaTien,Mota,TheTich,soLuong,TenSanPham)values (?,?,?,?,?,?,?)";
    static private String Delete = "delete from SanPham where MaSanPham like ?";
    static private String Update = " update SanPham set ngayNhapHang = ?,GiaTien = ?,Mota = ?, TheTich = ?, soLuong = ?,TenSanPham = ? where MaSanPham = ?";
    static private String Data = "select * from SanPham";
    static private String Search = "select * from SanPham where MaSanPham  =?";
    static private List<SanPham> list = new ArrayList<>();

    static private List<SanPham> select(String sql, Object... args) {
        list = new ArrayList<>();
             
       
            try {
               ResultSet rs = ConnectSQL.ResultSet(sql, args);
                while (rs.next()) {
                    SanPham sp = new SanPham();
                    sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setNgayNhapHang(rs.getString(3));
                sp.setGiaTien(rs.getDouble(4));            
                sp.setMota(rs.getString(5));
                sp.setSoLuong(rs.getInt(6));
                sp.setTheTich(rs.getDouble(7));
                    list.add(sp);
               
                }
                rs.getStatement().getConnection().close();
                return list;

            } catch (Exception e) {
                    System.out.println("Select sanpham fail");
                throw new RuntimeException(e);
                
            }
            
        }
    
    
//    public static void main(String[] args) {
//        List<SanPham> l = select(Data);
//        System.out.println(l.size());
//    }
//    static private SanPham Read(ResultSet rs)throws SQLException{
//        SanPham sp = new SanPham();
//        try {
//                sp.setMaSP(rs.getString("MaSanPham"));
//                sp.setTenSP(rs.getString("TenSanPham"));
//                sp.setNgayNhapHang(rs.getString("ngayNhapHang"));
//                sp.setGiaTien(rs.getDouble("GiaTien"));            
//                sp.setMota(rs.getString("Mota"));
//                sp.setSoLuong(rs.getInt("soLuong"));
//                sp.setTheTich(rs.getDouble("TheTich"));
//           
//                sp.setMaSP(rs.getString(1));
//                sp.setTenSP(rs.getString(2));
//                sp.setTheTich(rs.getDouble(6));
//                sp.setGiaTien(rs.getDouble(4));
//                sp.setNgayNhapHang(Date.DateForm(rs.getDate(3)));
//                sp.setMota(rs.getString(5));
//                sp.setSoLuong(rs.getInt(7));
//            return sp;
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    //SanPham(MaSanPham,ngayNhapHang,GiaTien,Mota,TheTich,soLuong,TenSP)
    @Override
    public void Insert(SanPham enity) {
        ConnectSQL.excuteUpdate(Insert, enity.getMaSP(), enity.getNgayNhapHang(), enity.getGiaTien(), enity.getMota(), enity.getTheTich(), enity.getSoLuong(), enity.getTenSP());
    }

    @Override
    public void Delete(SanPham enity) {
        ConnectSQL.excuteUpdate(Delete, enity.getMaSP());
    }

    @Override
    public void Update(SanPham enity) {
        ConnectSQL.excuteUpdate(Update, enity.getNgayNhapHang(), enity.getGiaTien(), enity.getMota(), enity.getTheTich(), enity.getSoLuong(),enity.getTenSP(),  enity.getMaSP());
    }

    @Override
    public List<SanPham> Data() {
        
        return select(Data);
//return null;
    }

    public List<SanPham> Search(String enity) {//"%"+enity+"%"
//        String search = "select * from SanPham where MaSanPham like ?";
//        return select(search,"%"+enity+"%");
//        return select(Search, enity.getMaSP());
        return select(Search, enity);
    }
    public SanPham SelectById(String MaSP) {

        List<SanPham> list = select(Search, MaSP);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

//    
    }
   
    

