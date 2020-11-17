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

        SanPham sp = new SanPham();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectSQL.ResultSet(sql, args);
                while (rs.next()) {
                    sp = Read(rs);
                    list.add(sp);
                }
                return list;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static private SanPham Read(ResultSet rs) {
        SanPham sp = new SanPham();
        try {
            sp.setMaSP(rs.getString("MaSanPham"));
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setTheTich(rs.getDouble("TheTich"));
                sp.setGiaTien(rs.getDouble("GiaTien"));
                sp.setNgayNhapHang(Date.DateForm(rs.getDate("ngayNhapHang")));
                sp.setMota(rs.getString("Mota"));
                sp.setSoLuong(rs.getInt("soLuong"));
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
    }

    @Override
    public List<SanPham> Search(String enity) {//"%"+enity+"%"
        String search = "select * from SanPham where MaSanPham like ?";
        return select(search,"%"+enity+"%");
        
    }

    
    }
   
    

