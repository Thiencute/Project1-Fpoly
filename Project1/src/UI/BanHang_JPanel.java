/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import DAO.SanPham_Dao;
import DAO.DichVu_Dao;
import Modal.DichVu;
import Modal.GioHang;
import Modal.SanPham;
import java.util.ArrayList;
import jdk.jshell.spi.SPIResolutionException;

/**
 *
 * @author admin
 */
public class BanHang_JPanel extends javax.swing.JPanel {

    /** Creates new form BanHang_JPanel */
    public BanHang_JPanel() {
        initComponents();
        init();
    }

    SanPham_Dao sp_dao = new SanPham_Dao();
    DichVu_Dao dv_dao = new DichVu_Dao();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        content = new javax.swing.JPanel();
        SanPham = new javax.swing.JTabbedPane();
        dsDichVu = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_SP = new javax.swing.JTable();
        txt_SearchSP = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        dsSanPham = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_DV = new javax.swing.JTable();
        txt_searchDV = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_GH = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        SanPham.setBackground(new java.awt.Color(204, 204, 255));
        SanPham.setOpaque(true);

        table_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_SPMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_SP);
        if (table_SP.getColumnModel().getColumnCount() > 0) {
            table_SP.getColumnModel().getColumn(0).setResizable(false);
            table_SP.getColumnModel().getColumn(1).setResizable(false);
            table_SP.getColumnModel().getColumn(2).setResizable(false);
            table_SP.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dsDichVuLayout = new javax.swing.GroupLayout(dsDichVu);
        dsDichVu.setLayout(dsDichVuLayout);
        dsDichVuLayout.setHorizontalGroup(
            dsDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dsDichVuLayout.createSequentialGroup()
                .addComponent(txt_SearchSP)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        dsDichVuLayout.setVerticalGroup(
            dsDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dsDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dsDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SanPham.addTab("Danh sách sản phẩm", dsDichVu);

        table_DV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Dịch Vụ", "Tên Tên Dịch Vụ", "Đơn Giá", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_DV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DVMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_DV);
        if (table_DV.getColumnModel().getColumnCount() > 0) {
            table_DV.getColumnModel().getColumn(0).setResizable(false);
            table_DV.getColumnModel().getColumn(1).setResizable(false);
            table_DV.getColumnModel().getColumn(2).setResizable(false);
            table_DV.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dsSanPhamLayout = new javax.swing.GroupLayout(dsSanPham);
        dsSanPham.setLayout(dsSanPhamLayout);
        dsSanPhamLayout.setHorizontalGroup(
            dsSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dsSanPhamLayout.createSequentialGroup()
                .addComponent(txt_searchDV)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        dsSanPhamLayout.setVerticalGroup(
            dsSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dsSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dsSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SanPham.addTab("Danh sách dịch vụ", dsSanPham);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        table_GH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_GH.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                table_GHPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(table_GH);
        if (table_GH.getColumnModel().getColumnCount() > 0) {
            table_GH.getColumnModel().getColumn(0).setResizable(false);
            table_GH.getColumnModel().getColumn(1).setResizable(false);
            table_GH.getColumnModel().getColumn(2).setResizable(false);
            table_GH.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Mã sản phẩm");

        jLabel3.setText("Tên sản phẩm");

        jLabel4.setText("Số lượng");

        jLabel6.setText("Thành tiền");

        txtTongTien.setEditable(false);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 0, 0));
        jButton8.setText("THANH TOÁN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setText("Clear Form");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new ThanhToan_JDialog(new UI_JFrame(), true).setVisible(true);;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        searchSP();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        searchDV();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void table_SPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_SPMouseClicked
        if(evt.getClickCount() == 2){
            AddSP();
             TongTien();
        }
    }//GEN-LAST:event_table_SPMouseClicked

    private void table_DVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DVMouseClicked
        if(evt.getClickCount() == 2){
            AddDV();
        }
    }//GEN-LAST:event_table_DVMouseClicked

    private void table_GHPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_table_GHPropertyChange
       TongTien();
    }//GEN-LAST:event_table_GHPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane SanPham;
    private javax.swing.JPanel content;
    private javax.swing.JPanel dsDichVu;
    private javax.swing.JPanel dsSanPham;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable table_DV;
    private javax.swing.JTable table_GH;
    private javax.swing.JTable table_SP;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txt_SearchSP;
    private javax.swing.JTextField txt_searchDV;
    // End of variables declaration//GEN-END:variables
    
    List<SanPham> list_sp;
    List<DichVu> list_dv;
    List<SanPham> GH_list_sp;
    List<DichVu> GH_list_dv;
    SanPham_Dao dao_sp = new SanPham_Dao();
    DichVu_Dao dao_dv = new DichVu_Dao();
    
    private void init() {
        DataGH();
        DataSP();
    }
    void DataSP(){
        list_sp = sp_dao.Data();
        modelSP(list_sp);
        System.out.println(list_sp.size());
    }
    void modelSP(List<SanPham> list){
        DefaultTableModel model = (DefaultTableModel) table_SP.getModel();
        model.setRowCount(0);
        
        for (SanPham sp : list) {
            model.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getGiaTien()});
        }
    }
    void DataGH(){
        list_dv = dv_dao.Data();
         modelDV(list_dv);
    }
    void modelDV(List<DichVu> list){
        
        DefaultTableModel model = (DefaultTableModel) table_DV.getModel();
        model.setRowCount(0);
        
        for (DichVu dv : list) {
            model.addRow(new Object[]{dv.getMaDV(), dv.getTenDV(), dv.getGiaTien(), dv.getMoTa()});
        }
    }
    void searchSP(){
        String search = txt_SearchSP.getText();
        list_sp = dao_sp.Search(search);
        modelSP(list_sp);
    }
    void searchDV(){
        String search = txt_searchDV.getText();
        list_dv = dao_dv.Search(search);
        modelSP(list_sp);
    }
    
    // Tương Tác Giỏ Hàng
    List<GioHang> list_GH = new ArrayList<>();
    
    
    void AddCart(){
        DefaultTableModel model = (DefaultTableModel) table_GH.getModel();
        model.setRowCount(0);
        for (GioHang gh : list_GH) {
            model.addRow(new Object[]{gh.getMa(), gh.getTen(), gh.getSoLuong(), gh.getGia()});
        }
        
//        model.addRow(new Object[]{Ma, Ten, SoLuong, DonGia});
    }
    void AddList_GH(String Ma, String Ten, int  SoLuong, double DonGia){
        list_GH.add(new GioHang(Ma, Ten, SoLuong, DonGia));
        
        AddCart();
    }
    void AddSP(){
        int row = table_SP.getSelectedRow();
        
        String Ma = String.valueOf(table_SP.getValueAt(row, 0));
        String Ten = String.valueOf(table_SP.getValueAt(row, 1));
        int SoLuong = Integer.valueOf(String.valueOf(table_SP.getValueAt(row, 2)));
        System.out.println(SoLuong);
        Double DonGia = Double.valueOf(String.valueOf(table_SP.getValueAt(row, 3)));
        System.out.println(DonGia);
        AddList_GH(Ma, Ten, SoLuong, DonGia);
        
//        AddCart(Ma, Ten, SoLuong, DonGia);
    }
    void AddDV(){
        int row = table_DV.getSelectedRow();
        String Ma = String.valueOf(table_DV.getValueAt(row, 0));
        String Ten = String.valueOf(table_DV.getValueAt(row, 1));
        int SoLuong = Integer.valueOf("1");
        double DonGia = Double.valueOf(String.valueOf(table_DV.getValueAt(row, 2)));
        AddList_GH(Ma, Ten, SoLuong, DonGia);
        AddCart();
        
//        AddCart(Ma, Ten, SoLuong, DonGia);
    }
    void TongTien(){
        double TongTien = 0;
        for(int i = 0; i < table_GH.getRowCount();i++){
            float tien = Float.valueOf(String.valueOf(table_GH.getValueAt(i, 3)));
            TongTien += tien;
        }
        txtTongTien.setText(String.valueOf(TongTien));
    }
    
}
