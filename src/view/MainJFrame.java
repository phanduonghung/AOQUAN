/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Helper.DialogHelper;
import Helper.ShareHelper;
import gui.MainFrame;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;


/**
 *
 * @author DELL
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        new ChaoJDialog(this, true).setVisible(true);
        initComponents();
     init();
        day();
     setLocationRelativeTo(null);
    }

    void init(){
         new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date now = new Date();
                SimpleDateFormat formats = new SimpleDateFormat();
                formats.applyPattern("hh:mm:s aa");
                lbltime.setText(formats.format(now));
            }   
                }).start();
          this.openLogin();
        this.mnudangnhap.setEnabled(false);
                 } 
    public void day() {
    Thread clock = new Thread() {
        public void run() {
            try {
                while (true) {
                    Calendar cal = new GregorianCalendar();                   
                    String thu;
                    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
                    if (dayOfWeek == 1) {
                        thu = "Chủ nhật";
                    } else {
                        thu = "Thứ" + Integer.toString(dayOfWeek);
                    }
                    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    lblthu.setText(thu + " ngày " + dayOfMonth + " tháng " + (month + 1) + " năm " + year);
                    lblthu.setText("thứ" + dayOfWeek + " ngày " + dayOfMonth + " tháng " + (month + 1) + " năm " + year);
                    sleep(100);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    clock.start();
}
 void openLogin(){
 new loginJDialog(this, true).setVisible(true);
 }
 void openWelcome(){
 new ChaoJDialog(this, true).setVisible(true);
 }
  void logoff(){
     ShareHelper.logoff();
 this.openLogin();
 }
 void exit(){
 if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){
 System.exit(0);
 }
 }
 void openNhanVien(){
 if(ShareHelper.authenticated()){
 new NhanvienJFrame().setVisible(true);
 }
 else{
 DialogHelper.alert(this, "Vui lòng đăng nhập!");
 }
 }
 void openKhoaHoc(){
 if(ShareHelper.authenticated()){
 new SanphamJFrame().setVisible(true);
 }
 else{
 DialogHelper.alert(this, "Vui lòng đăng nhập!");
 }
 }
 void openChuyenDe(){
 if(ShareHelper.authenticated()){
 new KhachhangJFrame().setVisible(true);
 }
 else{
 DialogHelper.alert(this, "Vui lòng đăng nhập!");
 }
 }
// void openAbout(){
// new GioiThieuJDialog(this, true).setVisible(true);
// }
// void openWebsite(){
// try {
//     Desktop.getDesktop().browse(new File("help/index.html").toURI());
// }
// catch (IOException ex) {
// DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
// }
// }
                 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btndangxuat = new javax.swing.JButton();
        btnquanli = new javax.swing.JButton();
        btndoanhthu = new javax.swing.JButton();
        btnketthuc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        lblthu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnudangnhap = new javax.swing.JMenuItem();
        mnudangxuat = new javax.swing.JMenuItem();
        mnuketthuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuquanlinv = new javax.swing.JMenuItem();
        mnuquanlikh = new javax.swing.JMenuItem();
        mnuquanlisp = new javax.swing.JMenuItem();
        mnuquanlidoanhthu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        btndangxuat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Closed door.png"))); // NOI18N
        btndangxuat.setText("Đăng xuất");
        btndangxuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btndangxuat);

        btnquanli.setBackground(new java.awt.Color(153, 153, 255));
        btnquanli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnquanli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Conference.png"))); // NOI18N
        btnquanli.setText("Quản lý nhân viên");
        btnquanli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnquanli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquanliActionPerformed(evt);
            }
        });
        jToolBar1.add(btnquanli);

        btndoanhthu.setBackground(new java.awt.Color(153, 153, 255));
        btndoanhthu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btndoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dollar.png"))); // NOI18N
        btndoanhthu.setText("Doanh thu");
        btndoanhthu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoanhthuActionPerformed(evt);
            }
        });
        jToolBar1.add(btndoanhthu);

        btnketthuc.setBackground(new java.awt.Color(153, 153, 255));
        btnketthuc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Anchor.png"))); // NOI18N
        btnketthuc.setText("Kết thúc");
        btnketthuc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnketthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnketthuc);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton6.setText("KẾT THÚC");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setText("TỔNG KÊ");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setText("SẢN PHẨM");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("HÓA ĐƠN");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("KHÁCH HÀNG");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("NHÂN VIÊN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/topmen.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbltime.setBackground(new java.awt.Color(204, 255, 204));
        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(0, 102, 51));
        lbltime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Alarm.png"))); // NOI18N
        lbltime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblthu.setBackground(new java.awt.Color(204, 255, 204));
        lblthu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblthu.setForeground(new java.awt.Color(51, 51, 255));
        lblthu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblthu, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblthu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltime))
                .addGap(71, 71, 71))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));

        jMenu1.setText("Hệ Thống");

        mnudangnhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnudangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Happy.png"))); // NOI18N
        mnudangnhap.setText("Đăng nhập");
        jMenu1.add(mnudangnhap);

        mnudangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnudangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        mnudangxuat.setText("Đăng xuất");
        mnudangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnudangxuat);

        mnuketthuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnuketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        mnuketthuc.setText("Kết thúc chương trình");
        jMenu1.add(mnuketthuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnuquanlinv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boy.png"))); // NOI18N
        mnuquanlinv.setText("Quản lý nhân viên");
        mnuquanlinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuquanlinvActionPerformed(evt);
            }
        });
        jMenu2.add(mnuquanlinv);

        mnuquanlikh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clien list.png"))); // NOI18N
        mnuquanlikh.setText("Quản lý khách hàng");
        mnuquanlikh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuquanlikhActionPerformed(evt);
            }
        });
        jMenu2.add(mnuquanlikh);

        mnuquanlisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gift.png"))); // NOI18N
        mnuquanlisp.setText("Quản Lý sản phẩm");
        mnuquanlisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuquanlispActionPerformed(evt);
            }
        });
        jMenu2.add(mnuquanlisp);

        mnuquanlidoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dollar.png"))); // NOI18N
        mnuquanlidoanhthu.setText("Quản lý doanh thu");
        jMenu2.add(mnuquanlidoanhthu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuquanlikhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuquanlikhActionPerformed
       new KhachhangJFrame().setVisible(true);
    }//GEN-LAST:event_mnuquanlikhActionPerformed

    private void btnketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnketthucActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btnketthucActionPerformed

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
        this.openLogin();
    }//GEN-LAST:event_btndangxuatActionPerformed

    private void mnuquanlinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuquanlinvActionPerformed
        // TODO add your handling code here:
        new NhanvienJFrame().setVisible(true);
    }//GEN-LAST:event_mnuquanlinvActionPerformed

    private void mnuquanlispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuquanlispActionPerformed
        // TODO add your handling code here:
        new SanphamJFrame().setVisible(true);
    }//GEN-LAST:event_mnuquanlispActionPerformed

    private void btnquanliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquanliActionPerformed
        // TODO add your handling code here:
         new NhanvienJFrame().setVisible(true);
    }//GEN-LAST:event_btnquanliActionPerformed

    private void mnudangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudangxuatActionPerformed
        // TODO add your handling code here:
        this.openLogin();
    }//GEN-LAST:event_mnudangxuatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         new MainFrame().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new NhanvienJFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new KhachhangJFrame().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new SanphamJFrame().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         new ThongkeJFrame().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btndoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoanhthuActionPerformed
        // TODO add your handling code here:
          new ThongkeJFrame().setVisible(true);
    }//GEN-LAST:event_btndoanhthuActionPerformed
         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btndoanhthu;
    private javax.swing.JButton btnketthuc;
    private javax.swing.JButton btnquanli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblthu;
    private javax.swing.JLabel lbltime;
    private javax.swing.JMenuItem mnudangnhap;
    private javax.swing.JMenuItem mnudangxuat;
    private javax.swing.JMenuItem mnuketthuc;
    private javax.swing.JMenuItem mnuquanlidoanhthu;
    private javax.swing.JMenuItem mnuquanlikh;
    private javax.swing.JMenuItem mnuquanlinv;
    private javax.swing.JMenuItem mnuquanlisp;
    // End of variables declaration//GEN-END:variables
}
