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
            Class.forName("con.microsoft.sqlserver.jdbc.SQLSeverDriver");
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

    private static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException {
        Connection con = DriverManager.getConnection(url, User, pass);
        PreparedStatement pre = null;
        try {
            pre = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pre.setObject(i + 1, args[i]);
            }
        } catch (Exception e) {

        }
        return pre;
    }

    public static void excuteUpdate(String sql, Object... args) {
        try {
            PreparedStatement pre = preparedStatement(sql, args);
            try {
                pre.executeUpdate();
            } catch (Exception e) {
                new RuntimeException(e);
            } finally {
                pre.getConnection().close();
            }
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

    public static ResultSet ResultSet(String sql, Object... args) {
        try {
            PreparedStatement pre = preparedStatement(sql, args);
            return pre.executeQuery();
        } catch (Exception e) {
            new RuntimeException(e);
            return null;
        }
    }

}
