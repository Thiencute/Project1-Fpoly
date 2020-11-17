/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author Home
 */
public class PreparedImage {

    public static byte[] ImgToByte(String filePath) {
//     
    if(filePath!=null){
        try {
            byte[] image = null;
            File file = new File(filePath.trim());
            String filename = file.getAbsolutePath();
            File fileImage = new File(filename);
            FileInputStream fit = new FileInputStream(fileImage);
            ByteArrayOutputStream bot = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int num; (num = fit.read(buf)) != -1;) {
                bot.write(buf, 0, num);
            }
            return bot.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
        return null;
    }

    public static void ByteToImg(byte[] Byte, JLabel x) {
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(Byte).getImage().getScaledInstance(x.getWidth(), x.getHeight(), 4));
        x.setIcon(imageIcon);
    }
    
}
