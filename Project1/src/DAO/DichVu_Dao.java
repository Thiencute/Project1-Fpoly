/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modal.DichVu;
import DAO.Constructure;
import Modal.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Home
 */
public class DichVu_Dao extends Constructure<DichVu,String>{
   
    private String Insert = "insert into DichVu(madichvu,giatien,mota,tendichvu)values (?,?,?,?)";
    private String Delete = "delete from DichVu where MaDichVu like ?";
    private String Update = "update DichVu set tendichvu = ?, giatien=?, mota = ? where madichvu like ? ";
    private String Data = "select * from DichVu";

    
    List<DichVu> list;
    DichVu dv;
    @Override
    public void Insert(DichVu enity) {
        ConnectSQL.excuteUpdate(Insert, enity.getMaDV(), enity.getGiaTien(), enity.getMoTa(), enity.getTenDV());
    }

    @Override
    public void Delete(DichVu enity) {
        ConnectSQL.excuteUpdate(Delete, enity.getMaDV());
    }

    @Override
    public void Update(DichVu enity) {
       ConnectSQL.excuteUpdate(Update, enity.getGiaTien(), enity.getMoTa(), enity.getTenDV(), enity.getMaDV());
    }

    @Override
    public List<DichVu> Data() {
         return select(Data);
    }

    @Override
    public List<DichVu> Search(String id) {
        String search  = "select * from DichVu where madichvu like ? ";
        return select(search,"%"+id+"%");
    }
    
    private List<DichVu> select(String sql, Object... args){
        List<DichVu> list = new ArrayList<>();
        
        ResultSet rs = ConnectSQL.ResultSet(sql,args);
        try {
            while (rs.next()) {            
                dv = Read(rs);
                list.add(dv);
        }
             return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
       
    }
    private DichVu Read(ResultSet rs){
        try {
             return new DichVu(rs.getString("madichvu"), rs.getString("tendichvu"), rs.getDouble("giaTien"), rs.getString("MoTa"));
    
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
}
}
