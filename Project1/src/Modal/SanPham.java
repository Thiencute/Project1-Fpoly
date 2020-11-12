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
public class SanPham {
    private String MaSP;
    private String TenSP;
    private String NgayNhapHang;
    private double TheTich;
    private double GiaTien;

    public SanPham() {
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setNgayNhapHang(String NgayNhapHang) {
        this.NgayNhapHang = NgayNhapHang;
    }

    public void setTheTich(double TheTich) {
        this.TheTich = TheTich;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public String getNgayNhapHang() {
        return NgayNhapHang;
    }

    public double getTheTich() {
        return TheTich;
    }

    public double getGiaTien() {
        return GiaTien;
    }
    
}
