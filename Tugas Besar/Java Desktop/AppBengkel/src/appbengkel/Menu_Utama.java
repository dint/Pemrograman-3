
package appbengkel;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class Menu_Utama extends javax.swing.JFrame {
    Koneksi objKoneksi;
    public Menu_Utama() {
        initComponents();
        objKoneksi = new Koneksi();
        setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        Username = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(51, 50, 230));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jDesktopPane2.setBackground(new java.awt.Color(51, 102, 255));

        Username.setFont(new java.awt.Font("Euphemia", 1, 12)); // NOI18N
        Username.setText("Username");

        user.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N

        Password.setFont(new java.awt.Font("Euphemia", 1, 12)); // NOI18N
        Password.setText("Password");

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Euphemia", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menu Login");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/attach201408288944952038313.png"))); // NOI18N

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username)
                    .addComponent(Password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addComponent(pass))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(Login)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(29, 29, 29))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Login, jButton1});

        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Login)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:\
        login();
    }//GEN-LAST:event_LoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           login();
        }
    }//GEN-LAST:event_passKeyPressed
    private void login (){
        if(user.getText().trim().equals("")||pass.getText().trim().equals("") )
            {
                JOptionPane.showMessageDialog(null,"Kolom User ID atau Password Masih Kosong","Peringatan",JOptionPane.WARNING_MESSAGE);
                user.requestFocus();
            }
        else
        {
        try {            
            Connection con = objKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM admin WHERE username = '"+user.getText()+"' and password = '"+pass.getText()+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Anda Login");
                    TransaksiBengkel objTransaksiBengkel = new TransaksiBengkel(this,rootPaneCheckingEnabled);
                    objTransaksiBengkel.show();
                    this.hide();
                }
                else{
                    JOptionPane.showMessageDialog(null,"username and password salah");
                    bersih();
                    user.requestFocus();     
                }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }   
  }
    private void bersih(){
        user.setText("");
        pass.setText("");
    }
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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
