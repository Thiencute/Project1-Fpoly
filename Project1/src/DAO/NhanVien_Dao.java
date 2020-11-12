/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author admin
 */
public class NhanVien_Dao {
private String Insert = "";
    private String Delte = "";
    private String Update = "";
    private String Data = "";
    private String Search = "";
    private String data = "";
    
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
