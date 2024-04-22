package Golden_horizon_resort_app;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Login_frame extends javax.swing.JFrame {

 
    public Login_frame() {
        initComponents();
        addPlaceholderStyle(txtuser);
        addPlaceholderStyle(pwduser);
        
    }
    
    
    public void addPlaceholderStyle(JTextField textField){
        Font font =textField.getFont();
        font =font.deriveFont(Font.PLAIN);
        textField.setFont(font);
    }
    public void removePlaceholderStyle(JTextField textField){
        Font font =textField.getFont();
        font =font.deriveFont(Font.PLAIN);
        textField.setFont(font);
  
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        pwduser = new javax.swing.JPasswordField();
        submit_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(null);
        setSize(new java.awt.Dimension(1089, 640));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gabarito", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Log In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 180, 72));

        txtuser.setFont(new java.awt.Font("Gabarito", 0, 20)); // NOI18N
        txtuser.setForeground(new java.awt.Color(131, 129, 129));
        txtuser.setText("Enter Your Name");
        txtuser.setBorder(null);
        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtuserFocusLost(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 440, 60));

        pwduser.setFont(new java.awt.Font("Gabarito", 0, 20)); // NOI18N
        pwduser.setForeground(new java.awt.Color(131, 129, 129));
        pwduser.setText("Enter Your Password");
        pwduser.setEchoChar('\u0000');
        pwduser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwduserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwduserFocusLost(evt);
            }
        });
        pwduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwduserActionPerformed(evt);
            }
        });
        getContentPane().add(pwduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 440, 60));

        submit_btn.setBackground(new java.awt.Color(191, 167, 93));
        submit_btn.setFont(new java.awt.Font("Gabarito", 0, 25)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(245, 245, 245));
        submit_btn.setText("Submit");
        submit_btn.setBorder(null);
        submit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submit_btn.setFocusable(false);
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        submit_btn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                submit_btnPropertyChange(evt);
            }
        });
        getContentPane().add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 148, 50));

        jLabel3.setBackground(new java.awt.Color(239, 171, 171));
        jLabel3.setFont(new java.awt.Font("Helvetica Light", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 171, 171));
        jLabel3.setText("Password Incorrect !");
        jLabel3.setRequestFocusEnabled(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 190, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background_resized (1).png"))); // NOI18N
        jLabel2.setName("background"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1089, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwduserActionPerformed

    private void txtuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusGained
            if(txtuser.getText().equals("Enter Your Name")){
                txtuser.setText(null);
                txtuser.requestFocus();
                removePlaceholderStyle(txtuser);
                
                
            }
    }//GEN-LAST:event_txtuserFocusGained

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusLost
             if(txtuser.getText().length()==0){
                 addPlaceholderStyle(txtuser);
                 txtuser.setText("Enter Your Name");
                 
             }
      
    }//GEN-LAST:event_txtuserFocusLost

    private void pwduserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwduserFocusGained
                if(pwduser.getText().equals("Enter Your Password")){
                    pwduser.setText(null);
                    pwduser.requestFocus();
                    pwduser.setEchoChar('*');
                    removePlaceholderStyle(pwduser);
                }
    }//GEN-LAST:event_pwduserFocusGained

    private void pwduserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwduserFocusLost
            if(pwduser.getText().length()==0){
                 addPlaceholderStyle(pwduser);
                 pwduser.setText("Enter Your Password");
                 pwduser.setEchoChar('\u0000');
             }
    }//GEN-LAST:event_pwduserFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submit_btnActionPerformed

    private void submit_btnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_submit_btnPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_submit_btnPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pwduser;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
