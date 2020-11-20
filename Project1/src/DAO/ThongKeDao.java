/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modal.ThongKe;
import java.util.ArrayList;
import java.util.List;
import DAO.ConnectSQL;
import Modal.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Home
 */
public class ThongKeDao {

    static List<ThongKe> list;
    static ThongKe tk = new ThongKe();
    String SanPham;
    String DichVu;
    String DoanhThu;
//    public static void main(String[] args) throws ParseException {
//        list = SanPham("2020", "8");
//        for (int i=0;i<list.size();i++) {
//            System.out.println(list.get(i).getName());
//        }
//    }
    public static List<ThongKe> SanPham()  {

        list = new ArrayList<>();
        ResultSet rs = null;

        try {
//            //ThongKeToanSanPham
//            if (Thang.isEmpty() &&Nam.isEmpty()){
//                String SanPham = "{sp_ThongKeToanSanPham}";
//                 rs = ConnectSQL.ResultSet(SanPham);
//            } else if (Nam.isEmpty()) {
//                String SanPham = "";
//                rs = ConnectSQL.ResultSet(SanPham);
//            } else if(Thang.isEmpty()){
//                String SanPham = "{SP_ThongKeSanPham (?,?)}";
//                rs = ConnectSQL.ResultSet(SanPham);
//            }else{
//                 String SanPham = "{SP_ThongKeSanPham '',''}";
//                rs = ConnectSQL.ResultSet(" sp_ThongKeSanPhamTheoNgay");
//            }
//           
                rs = ConnectSQL.ResultSet("{call sp_ThongKeToanSanPham}");
            while (rs.next()) {
                tk = Read(rs);
                list.add(tk);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<ThongKe> DichVu() {

        list = new ArrayList<>();
//        if (Thang.isEmpty()) {
//            String DichVu = "";
//        } else if (Nam.isEmpty()) {
//            String DichVu = "";
//        } else {
//            String DichVu = "";
//        }
        ResultSet rs = null;
        try {
            rs = ConnectSQL.ResultSet("{call sp_ThongKeToanDichVu}");
            while (rs.next()) {
                tk = Read(rs);
                list.add(tk);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<ThongKe> DoanhThu() {

        list = new ArrayList<>();
//        if (Thang.isEmpty()) {
//            String DoanhThu = "";
//        } else if (Nam.isEmpty()) {
//            String DoanhThu = "";
//        } else {
//            String DoanhThu = "";
//        }
        ResultSet rs = null;
        try {
            rs = ConnectSQL.ResultSet("{call sp_ThongKeToanDoanhThu}");
            while (rs.next()) {
                tk = Read(rs);
                list.add(tk);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    static private ThongKe Read(ResultSet rs) throws SQLException {
        ThongKe tk = new ThongKe();

        try {
            tk.setName(rs.getString("name"));
            tk.setValue(rs.getDouble("TongTien"));
            return tk;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
