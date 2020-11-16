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
public class NhanVien {
    private String MaNV;
    private String MatKhau;
    private String TenNV;
    private boolean Vaitro;
    private String SDT;
    private String Address;
    private Double Luong;
    private boolean GioiTinh;
    private String email;
    
    public NhanVien() {
    }

    public NhanVien(String MaNV, String MatKhau) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVaitro() {
        return Vaitro;
    }

    public String getEmail() {
        return email;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void setVaitro(boolean Vaitro) {
        this.Vaitro = Vaitro;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setLuong(Double Luong) {
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public String getAddress() {
        return Address;
    }

    public Double getLuong() {
        return Luong;
    }
    
    
}
