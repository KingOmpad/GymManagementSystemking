/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagementsystemking;

import admin.*;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import trainor.*;

/**
 *
 * @author SCC
 */
public class theloginForm extends javax.swing.JFrame {

    /**
     * Creates new form theloginForm
     */
    public theloginForm() {
        initComponents();
        
    }
    
    public static boolean loginAcc(String username, String password){
    dbConnector connect = new dbConnector();
    
    try{
        String sql="SELECT * FROM table_user WHERE u_username = '"+username+"'AND u_password = '"+password+"' AND u_status='Active'";
        ResultSet rs = connect.getData(sql);
        return rs.next();
   }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Database Connection failed");
        System.out.println(""+ex);
    return false;
    }
    }
    public static String getRole(String username, String password){
        dbConnector connect = new dbConnector();
        try{
            String sql = "SELECT u_account FROM table_user WHERE u_username = '"+username+"'AND u_password = '"+password+"'";
            ResultSet rs= connect.getData(sql);
            if(rs.next()){
                return rs.getString("u_account");
            }else{
                return null;
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();
        user_input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 180, 79, 32);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 220, 79, 30);

        pass_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_inputActionPerformed(evt);
            }
        });
        jPanel1.add(pass_input);
        pass_input.setBounds(400, 220, 120, 30);

        user_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_inputActionPerformed(evt);
            }
        });
        jPanel1.add(user_input);
        user_input.setBounds(400, 180, 120, 32);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 260, 51, 23);

        jButton2.setText("Log-in");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(450, 260, 70, 23);

        jLabel1.setText("Dont have account? Sign up");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 300, 160, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gymbackground.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 610, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pass_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_inputActionPerformed

    private void user_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_inputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"good bye");
        System. exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        
       if(loginAcc(user_input.getText(),pass_input.getText())){
            String userType = getRole(user_input.getText(),pass_input.getText()); // Assuming getRole returns the role of the user

            if (userType.equals("Admin")) {
                JOptionPane.showMessageDialog(null,"Admin Login Success!");
                adminDashboard adb = new adminDashboard();
                adb.setVisible(true);
                this.dispose();
            } else if (userType.equals("Trainor")) {
                JOptionPane.showMessageDialog(null,"User Login Success!");
                trainorDashboard tdb = new trainorDashboard();
                tdb.setVisible(true);
                this.dispose();
            
            }else {
                JOptionPane.showMessageDialog(null,"Unknown Role! Cannot login."); 
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null,"Login Failed!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       registrationForm rf = new registrationForm();
       rf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(theloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(theloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(theloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new theloginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JTextField user_input;
    // End of variables declaration//GEN-END:variables
}
