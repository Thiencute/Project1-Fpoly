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
    static private String Update = " update SanPham set ngayNhapHang = ?,GiaTien = ?,Mota = ?, TheTich = ?, soLuong = ?, TenSP = ? where MaSanPham like ?";
    static private String Data = "select * from SanPham";
    static private String Search = "select * from SanPham where MaSanPham like %?%";
    static private List<SanPham> list = new ArrayList<>();

    static private List<SanPham> select(String sql, Object... args) {
        list = new ArrayList<>();
        SanPham sp = new SanPham();
        try {
            ResultSet rs = null;
            int a = 0;
            try {
                rs = ConnectSQL.ResultSet(sql, args);
                while (rs.next()) {
                    sp = Read(rs);
                    list.add(sp);
                    a++;
                }
                System.out.println("a:" +a);
                return list;
//   SanPham a = new SanPham("aaa", "a", DAO.Date.StringtoDate("2020-2-2"), 10, 10, "hayvl", 10);
//                SanPham s = new SanPham("aaa", "a", DAO.Date., 10, 10, "hayvl", 10);
//                list.add(s);
//    return list;
            } catch (Exception e) {
                    System.out.println("Select loi");
                throw new RuntimeException(e);
                
            }
        } catch (Exception e) {
            System.out.println("Select loi");
            throw new RuntimeException(e);
            
        }
    }
    
    public static void main(String[] args) {
        List<SanPham> l = select(Data);
        System.out.println(l.size());
    }
    static private SanPham Read(ResultSet rs)throws SQLException{
        SanPham sp = new SanPham();
        try {
                sp.setMaSP(rs.getString("MaSanPham"));
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setNgayNhapHang(Date.DateForm(rs.getDate("ngayNhapHang")));
                sp.setGiaTien(rs.getDouble("GiaTien"));            
                sp.setMota(rs.getString("Mota"));
                sp.setSoLuong(rs.getInt("soLuong"));
                sp.setTheTich(rs.getDouble("TheTich"));
           
//                sp.setMaSP(rs.getString(1));
//                sp.setTenSP(rs.getString(2));
//                sp.setTheTich(rs.getDouble(6));
//                sp.setGiaTien(rs.getDouble(4));
//                sp.setNgayNhapHang(Date.DateForm(rs.getDate(3)));
//                sp.setMota(rs.getString(5));
//                sp.setSoLuong(rs.getInt(7));
            return sp;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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
        ConnectSQL.excuteUpdate(Insert, enity.getNgayNhapHang(), enity.getGiaTien(), enity.getMota(), enity.getTheTich(), enity.getSoLuong(), enity.getTenSP(), enity.getMaSP());
    }

    @Override
    public List<SanPham> Data() {
        
        return select(Data);
//return null;
    }

    public List<SanPham> Search(String enity) {//"%"+enity+"%"
        String search = "select * from SanPham where MaSanPham like ?";
        return select(search,"%"+enity+"%");
//        return select(Search, enity.getMaSP());
        
    }
    public SanPham SelectById(String MaNV) {

        List<SanPham> list = select(Search, MaNV);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

//    
    }
   
    

