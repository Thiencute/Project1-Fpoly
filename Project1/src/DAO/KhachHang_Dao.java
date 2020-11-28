/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAO.Constructure;
import Modal.KhachHang;
import Modal.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Home
 */
public class KhachHang_Dao extends Constructure<KhachHang,String>{
private String Insert = "insert into khachhang(MaKH,TenKH,DiaChi,SDT,GioiTinh,email,NgaySinh) values (?,?,?,?,?,?,?)";
    private String Delte = "delete from khachhang where MaKH = ?";
    private String Update = "update khachhang set TenKH = ?,DiaChi = ?,SDT = ?,GioiTinh = ?,email = ?,NgaySinh = ? where MaKH =?";
    private String Data = "select * from khachhang";
    private String Search = "select * from khachhang where MaKh = ?";
    private String data = "";

    @Override
    public void Insert(KhachHang enity) {
        ConnectSQL.excuteUpdate(Insert,enity.getMaKH(),enity.getTenKh(),enity.getDiaChi(),enity.getSDT(),enity.isGioiTinh(),enity.getEmail()
        ,enity.getNgaySinh());
    }

    @Override
    public void Delete(KhachHang enity) {
        ConnectSQL.excuteUpdate(Delte, enity.getMaKH());
    }

    @Override
    public void Update(KhachHang enity) {
        ConnectSQL.excuteUpdate(Update, enity.getTenKh(),enity.getDiaChi(),enity.getSDT(),enity.isGioiTinh(),enity.getEmail()
        ,enity.getNgaySinh(), enity.getMaKH());
    }

    @Override
    public List<KhachHang> Data() {
        return select(Data);
    }

    @Override
    public List<KhachHang> Search(String enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public KhachHang SelectById(String MaNV) {

        List<KhachHang> list = select(Search, MaNV);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
     private List<KhachHang> select(String sql, Object ... args ){
        List<KhachHang> list = new ArrayList<>();  
        ResultSet rs = null;
        try {
             rs = ConnectSQL.ResultSet(sql, args);
            while(rs.next()){
            KhachHang kh = new KhachHang();
            kh.setMaKH(rs.getString("MaKH"));
            kh.setTenKh(rs.getString("TenKh"));
            kh.setDiaChi(rs.getString("DiaChi"));
            kh.setSDT(rs.getString("SDT"));
            kh.setGioiTinh(rs.getBoolean("GioiTinh"));
            kh.setEmail(rs.getString("email"));
            kh.setNgaySinh(rs.getString("NgaySinh"));
            list.add(kh);
                
            }
                    
        } catch (Exception e) {
            throw new RuntimeException();
                }finally{
            try {
                 rs.getStatement().getConnection().close(); 
            } catch (Exception e) {
            }
  
        }   
    return list;
    }
   
}
