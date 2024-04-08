/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagementsystemking;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC
 */
public class registrationForm extends javax.swing.JFrame {

    /**
     * Creates new form registrationForm
     */
    public registrationForm() {
        initComponents();
    }
    public static String em, usname;
    public boolean duplicateCheck(){
    
    dbConnector dbc = new dbConnector();
    
    try{
    String sql="SELECT * FROM table_user WHERE u_username = '"+user.getText()+"' OR u_email = '"+email.getText()+"'";
        ResultSet rs = dbc.getData(sql);     
        
        if(rs.next()){
            em=rs.getString("u_email");
            if(em.equals(email.getText())){
            JOptionPane.showMessageDialog(null, "Email is already used");
            email.setText("");
            }
            usname=rs.getString("u_username");
            if(usname.equals(user.getText())){
            JOptionPane.showMessageDialog(null, "User is already Used");
            user.setText("");
            }
            return true;
        }else{
            return false;
        }
    }catch(SQLException ex){
    return false;
    }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        accType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setText("Last name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 130, 80, 20);

        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });
        jPanel1.add(lName);
        lName.setBounds(120, 150, 120, 20);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(120, 190, 120, 20);

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        jPanel1.add(fName);
        fName.setBounds(120, 110, 120, 20);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(120, 230, 120, 20);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(120, 270, 120, 20);

        accType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Trainor" }));
        accType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accTypeActionPerformed(evt);
            }
        });
        jPanel1.add(accType);
        accType.setBounds(120, 300, 120, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 170, 80, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setText("First name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 90, 80, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel9.setText("Account type:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 300, 80, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("SIGN-UP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 30, 80, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel10.setText("Username:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 210, 80, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Password:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(120, 250, 80, 20);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 340, 90, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loginIcon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 110, 100, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void accTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(fName.getText().isEmpty()||fName.getText().isEmpty()||lName.getText().isEmpty()
        ||email.getText().isEmpty()||user.getText().isEmpty()||pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "AlL fields are required");
        }else if(pass.getText().length()<8) {
            JOptionPane.showMessageDialog(null, "Password needs 8-16 letters or numbers");
            pass.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate exists!");
        
        }else {
        
            dbConnector dbc = new dbConnector();
        
                    if(dbc.insertData("INSERT INTO table_user (u_fname, u_lname, u_email, u_username, u_password, u_account, u_status) VALUES ('"+fName.getText()+"', '"+lName.getText()+"', '"+email.getText()+"', '"+user.getText()+"', '"+pass.getText()+"', '"+accType.getSelectedItem()+"', 'Pending')")){                                        
                        JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Connection Error!");
                    }
            theloginForm tlf = new theloginForm();        
            tlf.setVisible(true);
            this.dispose();

                } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accType;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
