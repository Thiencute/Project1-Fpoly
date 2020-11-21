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
public class ThongKe {
    private String Name;
    private double value;

    public ThongKe(String Name, double value) {
        this.Name = Name;
        this.value = value;
    }

    public ThongKe() {
    }

    public String getName() {
        return Name;
    }

    public double getValue() {
        return value;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
}
