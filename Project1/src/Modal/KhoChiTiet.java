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
public class KhoChiTiet {
    private String MaKhoChiTiet;
    private  String MaKho;
    private String MaSP;
    private double SoLuong;
    private String GhiChu;

    public KhoChiTiet() {
    }

    public void setMaKhoChiTiet(String MaKhoChiTiet) {
        this.MaKhoChiTiet = MaKhoChiTiet;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaKhoChiTiet() {
        return MaKhoChiTiet;
    }

    public String getMaKho() {
        return MaKho;
    }

    public String getMaSP() {
        return MaSP;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public String getGhiChu() {
        return GhiChu;
    }
    
}
