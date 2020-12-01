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
    private Date NgayNhapHang;
    private double TheTich;
    private double GiaTien;
    private String Mota;
    private int SoLuong;
    
    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, Date NgayNhapHang, double TheTich, double GiaTien, String Mota, int SoLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.NgayNhapHang = NgayNhapHang;
        this.TheTich = TheTich;
        this.GiaTien = GiaTien;
        this.Mota = Mota;
        this.SoLuong = SoLuong;
    }
    
    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getMota() {
        return Mota;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setNgayNhapHang(Date NgayNhapHang) {
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

    public Date getNgayNhapHang() {
        return NgayNhapHang;
    }

    public double getTheTich() {
        return TheTich;
    }

    public double getGiaTien() {
        return GiaTien;
    }
    
}
