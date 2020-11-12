/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modal.Kho;
import java.util.*;

/**
 *
 * @author Home
 */
public class Kho_Dao {
private String Insert = "";
    private String Delte = "";
    private String Update = "";
    private String Data = "";
    private String Search = "";
    private String data = "";
    private List<Kho> list = new ArrayList<>();
    
    public void Insert(String MaKho, String Diachi, String SucChua, String Ghichu) {
        try {
            ConnectSQL.preparedStatement(Insert, MaKho,Diachi,SucChua,Ghichu);
            
        } catch (Exception e) {
        }finally{
            
    }
    }

    public void Delete(String MaKho){
        try {
            ConnectSQL.preparedStatement(Insert, MaKho);
        } catch (Exception e) {
        }
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
