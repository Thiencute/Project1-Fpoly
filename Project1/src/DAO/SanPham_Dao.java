/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.*;
import Modal.SanPham;

/**
 *
 * @author Home
 */
public class SanPham_Dao {
    private String Insert = "insert into SanPham(MaSanPham,ngayNhapHang,GiaTien,Mota,TheTich,soLuong)values ('?,?,?,?,?,?)";
    private String Delete = "delete from SanPham where MaSanPham like ?";
    private String Update = " update SanPham set ngayNhapHang = ?,GiaTien = ?,Mota = ?, TheTich = ?, soLuong = ? where MaSanPham like ?";
    private String Data = "select * from SanPham";
    private String Search = "select * from SanPham where MaSanPham like ?";
    private List<SanPham> list = new ArrayList<>();
    
    
    public void Insert(String MaSP, String TenSP, Date NgayNhap, double TheTich, double GiaTien) {
        try {
             ConnectSQL.preparedStatement(Insert, MaSP,TenSP,NgayNhap,TheTich,GiaTien);
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

    public void Delete(String MaSP) {
        try {
            ConnectSQL.preparedStatement(Delete, MaSP);
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

    public void Update(String MaSP, String TenSP, Date NgayNhap, double TheTich, double GiaTien) {
         try {
             ConnectSQL.preparedStatement(Update, MaSP,TenSP,NgayNhap,TheTich,GiaTien);
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

    public void Data() {
      try {
             ConnectSQL.preparedStatement(Data);
        } catch (Exception e) {
            new RuntimeException(e);
        } 
    }
    
}
