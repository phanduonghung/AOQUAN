/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author CuongNP
 */
public class ThongBao {
    public static void ThongBao(String noiDung, String tieuDe){
        JOptionPane.showMessageDialog(new JFrame(), noiDung, tieuDe, 
                 JOptionPane.INFORMATION_MESSAGE);
    }
}
