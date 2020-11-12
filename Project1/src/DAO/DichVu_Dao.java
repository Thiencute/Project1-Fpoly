/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
 import DAO.ConnectSQL;
/**
 *
 * @author Home
 */
public class DichVu_Dao {
   
    private String Insert = "insert into DichVu(madichvu,giatien,mota,tendichvu)values (?,?,?,?)";
    private String Delete = "delete from DichVu where MaDichVu like ?";
    private String Update = "update DichVu set tendichvu = ?, giatien=?, mota = ? where madichvu like ? ";
    private String data = "select * from DichVu";
    private String Search = "select * from DichVu where like ?";

    public void Insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public void Data() {
      try {
             ConnectSQL.preparedStatement(data);
        } catch (Exception e) {
            new RuntimeException(e);
        } 
    }
    
}
