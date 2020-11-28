/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Constructure;
import Modal.Kho;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Home
 */
public class Kho_Dao extends Constructure<Kho,String>{
private String Insert = "";
    private String Delte = "";
    private String Update = "";
    private String Data = "select * from Kho";
    private String Search = "select * from Kho where MaKho =?";
   
    private List<Kho> list = new ArrayList<>();

    @Override
    public void Insert(Kho enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(Kho enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Kho enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kho> Data() {
        return select(Data);
    }
    
    static private List<Kho> select(String sql, Object...args){
        List<Kho>list = new ArrayList<>();
        try {
            ResultSet rs = ConnectSQL.ResultSet(sql, args);
            while(rs.next()){
                Kho kho= new Kho();
                kho.setMaKho(rs.getString("MaKho"));
                kho.setDiaChi(rs.getString("DiaChi"));
                kho.setSucChua(rs.getDouble("SucChua"));
                kho.setGhiChu(rs.getString("GhiChu"));
                list.add(kho);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    @Override
    public List<Kho> Search(String enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Kho SelectById(String maKho){
        List<Kho> Kho = select(Search, maKho);
        if (Kho.isEmpty()) {
            return null;
        }
        return Kho.get(0);
    }
}
