/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAO.Constructure;
import Modal.Kho;
import Modal.KhoChiTiet;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Home
 */
public class KhoChiTiet_Dao extends Constructure<KhoChiTiet,String>{
private String Insert = "insert into KhoChiTiet (MaKho,MaSanPham,soLuong,GhiChu) values(?,?,?,?)";
    private String Delte = "Delete from KhoChiTiet where (MaSanPham LIKE ?) and (MaKho LIKE ?)";
    private String Update = "update KhoChiTiet set soLuong=?,GhiChu=? where  (MaSanPham LIKE ?) and (MaKho LIKE ?)";
    private String Data = "";
    private String Search = "select * from KhoChiTiet where MaKhoChiTiet=?";

    @Override
    public void Insert(KhoChiTiet enity) {
        ConnectSQL.excuteUpdate(Insert, enity.getMaKho(),enity.getMaSP(),enity.getSoLuong(),enity.getGhiChu());
    }

    @Override
    public void Delete(KhoChiTiet enity) {
        ConnectSQL.excuteUpdate(Delte, enity.getMaSP(),enity.getMaKho());
    }
    
    @Override
    public void Update(KhoChiTiet enity) {
       ConnectSQL.excuteUpdate(Update,enity.getSoLuong(),enity.getGhiChu(),enity.getMaSP(),enity.getMaKho() );
    }

    @Override
    public List<KhoChiTiet> Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhoChiTiet> Search(String enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
//    String selectbyidSP = "select * from hdct_MuaBan where mahd like ?";
    String selectbyidDv = "select * from KhoChiTiet where MaKho like ?";
    
    public List<KhoChiTiet> listKhoCT(String id){
            List<KhoChiTiet> l =select( selectbyidDv,id.trim());
//            add
////            List<KhoChiTiet> l1 =select( selectbyidSP);
//            add 
        return l;
    }
     private List<KhoChiTiet> select(String sql, Object...args){
        List<KhoChiTiet>list = new ArrayList<>();
        try {
            
            ResultSet rs = ConnectSQL.ResultSet(sql, args);
            
            while(rs.next()){
                
                KhoChiTiet kct= new KhoChiTiet();
                kct.setMaKhoChiTiet(rs.getString("MaKhoChiTiet"));
                kct.setMaSP(rs.getString("MaSanPham"));
                kct.setMaKho(rs.getString("MaKho"));               
                kct.setSoLuong(rs.getDouble("soLuong"));
                kct.setGhiChu(rs.getString("GhiChu"));
                list.add(kct);
            }
            
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
