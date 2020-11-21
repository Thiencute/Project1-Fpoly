/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;
import java.util.Date;
import javax.swing.ImageIcon;
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
    private String Mota;
    private int SoLuong;
    
    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String NgayNhapHang, double TheTich, double GiaTien, String Mota, int SoLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.NgayNhapHang = NgayNhapHang;
        this.TheTich = TheTich;
        this.GiaTien = GiaTien;
        this.Mota = Mota;
        this.SoLuong = SoLuong;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNgayNhapHang() {
        return NgayNhapHang;
    }

    public void setNgayNhapHang(String NgayNhapHang) {
        this.NgayNhapHang = NgayNhapHang;
    }

    public double getTheTich() {
        return TheTich;
    }

    public void setTheTich(double TheTich) {
        this.TheTich = TheTich;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

  
}
