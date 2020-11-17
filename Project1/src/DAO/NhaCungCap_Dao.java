/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modal.NhaCungCap;
import DAO.Constructure;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Home
 */
public class NhaCungCap_Dao extends Constructure<NhaCungCap,String>{
    private String Insert = "insert into NhaCungCap(MaNCC,tenNCC,MaSanPham,NoiSanXuat,diachi) values  (?,?,?,?,?,)";
    private String Delte = "";
    private String Update = "update NhaCungCap set MaNCC = ?,tenNCC = ?,MaSanPham = ?,NoiSanXuat = ? where MaNCC like ?";
    private String Data = "select * from";
    private String Search = "select * from where MaNCC like ?";
    
    List<NhaCungCap> list = new ArrayList<>();
    NhaCungCap ncc = new NhaCungCap();
    private List<NhaCungCap> select(String sql, Object...args){
        list = new ArrayList<>();
        ResultSet rs = ConnectSQL.ResultSet(sql, args);
        try {
             while (rs.next()) {            
                 ncc = Read(rs);
                 list.add(ncc);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    private NhaCungCap Read(ResultSet rs) throws SQLException{
        ncc = new NhaCungCap();
        ncc.setMaNCC(rs.getString("MaNCC"));
        ncc.setDiaChi(rs.getString("diachi"));
        ncc.setMaSP(rs.getString("MaSanPham"));
        ncc.setNoiSanXuat(rs.getString("NoiSanXuat"));
        ncc.setTenNCC(rs.getString("tenNCC"));
        return ncc;
    }
    
    //NhaCungCap(MaNCC,tenNCC,MaSanPham,NoiSanXuat,diachi)
    @Override
    public void Insert(NhaCungCap enity) {
        ConnectSQL.excuteUpdate(Insert, enity.getMaNCC(), enity.getTenNCC(), enity.getMaSP(), enity.getNoiSanXuat(), enity.getDiaChi());
    }

    @Override
    public void Delete(NhaCungCap enity) {
        ConnectSQL.excuteUpdate(Delte, enity.getMaNCC());
    }

    @Override
    public void Update(NhaCungCap enity) {
        ConnectSQL.excuteUpdate(Update, enity.getTenNCC(), enity.getMaSP(), enity.getNoiSanXuat(), enity.getDiaChi(), enity.getMaNCC());
    }

    @Override
    public List<NhaCungCap> Data() {
         return select(Data);
    }

    @Override
    public List<NhaCungCap> Search(String enity) {
         return select(Data, enity);
    }
 
    
}
