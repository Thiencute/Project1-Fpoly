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
public class GioHang {
    
    private String Ma;
    private String Ten;
    private int SoLuong;
    private double Gia;

    public GioHang(String Ma, String Ten, int SoLuong, double Gia) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public GioHang() {
    }

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getGia() {
        return Gia;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }
    
    
}
