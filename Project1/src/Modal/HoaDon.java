/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author Home
 */
public class HoaDon {
    private String MaHD;
    private String MaKH;
    private double TongTien;
    private String manv;

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getManv() {
        return manv;
    }

    public HoaDon() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }
    
     
}
