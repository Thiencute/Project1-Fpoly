/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.*;
import java.sql.*;
import Dao.Constructure;
import DAO.Date;
import Modal.SanPham;
import DAO.Date;
/**
 *
 * @author Home
 */
public class SanPham_Dao extends Constructure<SanPham> {

    private String Insert = "insert into SanPham(MaSanPham,ngayNhapHang,GiaTien,Mota,TheTich,soLuong)values ('?,?,?,?,?,?)";
    private String Delete = "delete from SanPham where MaSanPham like ?";
    private String Update = " update SanPham set ngayNhapHang = ?,GiaTien = ?,Mota = ?, TheTich = ?, soLuong = ? where MaSanPham like ?";
    private String Data = "select * from SanPham";
    private String Search = "select * from SanPham where MaSanPham like ?";
    private List<SanPham> list = new ArrayList<>();
    private SanPham sp = new SanPham();

    private List<SanPham> select(String sql, Object... args) {
        
        return list;
    }

    private SanPham Read(String sql, Object... args) {
        sp = new SanPham();
        ResultSet rs = ConnectSQL.ResultSet(sql, args);
        try {
            while (rs.next()) {
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setTheTich(rs.getDouble("TheTich"));
                sp.setGiaTien(rs.getDouble("GiaTien"));
                sp.setNgayNhapHang(Date.DateForm(rs.getDate("ngayNhapHang")));
            }
        } catch (Exception e) {
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
            }
        }
        return sp;
    }

    @Override
    public void Insert(SanPham enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(SanPham enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(SanPham enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPham> Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPham> Search(SanPham enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
