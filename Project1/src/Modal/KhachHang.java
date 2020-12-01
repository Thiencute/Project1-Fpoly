/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.util.Date;

/**
 *
 * @author Home
 */
public class KhachHang {
    private String MaKH;
    private String TenKh;
    private String SDT;
    private boolean GioiTinh;
    private String Email;
    private String DiaChi;
    private String NgaySinh;

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getTenKh() {
        return TenKh;
    }

    public String getSDT() {
        return SDT;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }
    
}
