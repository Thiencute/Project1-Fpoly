/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Home
 */
public class ConnectSQL {

    private static String User = "Project1";
    private static String pass = "abc";
    private static String url = "jdbc:sqlserver://localhost;database=Project1_CB";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   
     
     public static PreparedStatement prepareStatement(String sql, Object...args) throws SQLException{
         Connection connection = DriverManager.getConnection(url,User,pass);
         PreparedStatement pstmt = null;
         if(sql.trim().startsWith("{")){
             pstmt = connection.prepareCall(sql);
         }
         else{
             pstmt = connection.prepareStatement(sql);
         }
         for(int i=0;i<args.length;i++){
             pstmt.setObject(i+1, args[i]);
         }
         return pstmt;
     }
    public static void excuteUpdate(String sql, Object...args) {
        try{
             PreparedStatement stmt = prepareStatement(sql, args);
             try {
                    stmt.executeUpdate();
             }
             finally{
                     stmt.getConnection().close();
             }
        }
        catch (SQLException e) {
                    throw new RuntimeException(e);
                    }
    }
    public static ResultSet ResultSet(String sql, Object...args) throws ExceptionInInitializerError{
            try {
                 PreparedStatement stmt = prepareStatement(sql, args);
                 
                 return stmt.executeQuery();
                 
                }
                catch (SQLException e) {
                     throw new RuntimeException(e);
                                        }
 }
   
}
