/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modal.DichVu;
import DAO.Constructure;
import java.util.List;
/**
 *
 * @author Home
 */
public class DichVu_Dao extends Constructure<DichVu>{
   
    private String Insert = "insert into DichVu(madichvu,giatien,mota,tendichvu)values (?,?,?,?)";
    private String Delete = "delete from DichVu where MaDichVu like ?";
    private String Update = "update DichVu set tendichvu = ?, giatien=?, mota = ? where madichvu like ? ";
    private String data = "select * from DichVu";
    private String Search = "select * from DichVu where like ?";

    @Override
    public void Insert(DichVu enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(DichVu enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(DichVu enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DichVu> Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DichVu> Search(DichVu enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
