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
    private String Insert = "";
    private String Delte = "";
    private String Update = "";
    private String Data = "";
    private String Search = "";
    private String data = "";
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
            ConnectSQL.preparedStatement(Delte, MaSP);
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
             ConnectSQL.preparedStatement(data);
        } catch (Exception e) {
            new RuntimeException(e);
        } 
    }
    
}
