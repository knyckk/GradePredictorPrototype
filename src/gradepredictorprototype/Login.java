/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradepredictorprototype;

import java.awt.event.KeyEvent;

/**
 *
 * @author kingt
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordLbl = new javax.swing.JLabel();
        passwordFld = new javax.swing.JPasswordField();
        emailFld = new javax.swing.JTextField();
        loginLbl = new javax.swing.JLabel();
        enterBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();
        errorLbl.hide();
        orLbl = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passwordLbl.setText("Password");
        getContentPane().add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 250, 153, 45));

        passwordFld.setBackground(new java.awt.Color(53, 53, 53));
        passwordFld.setForeground(new java.awt.Color(255, 255, 255));
        passwordFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordFld.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                passwordFldCaretUpdate(evt);
            }
        });
        passwordFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFldFocusLost(evt);
            }
        });
        passwordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFldActionPerformed(evt);
            }
        });
        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFldKeyPressed(evt);
            }
        });
        getContentPane().add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 246, 335, 55));

        emailFld.setBackground(new java.awt.Color(51, 51, 51));
        emailFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailFld.setForeground(new java.awt.Color(255, 255, 255));
        emailFld.setText("Email");
        emailFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        emailFld.setCaretColor(new java.awt.Color(255, 255, 255));
        emailFld.setPreferredSize(new java.awt.Dimension(335, 55));
        emailFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFldFocusGained(evt);
            }
        });
        emailFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFldActionPerformed(evt);
            }
        });
        getContentPane().add(emailFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 185, -1, -1));

        loginLbl.setText("Log in:");
        getContentPane().add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 164, -1, -1));

        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 307, 165, 55));

        errorLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl.setText("Email not found");
        getContentPane().add(errorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 164, 962, -1));

        orLbl.setText("or you can sign up");
        getContentPane().add(orLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 370, -1, 20));

        signUp.setForeground(new java.awt.Color(153, 153, 153));
        signUp.setText("here");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        getContentPane().add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusGained

        passwordLbl.hide();
        passwordFld.selectAll();
    }//GEN-LAST:event_passwordFldFocusGained

    private void passwordFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusLost

        if (passwordFld.getPassword().length == 0) {
            passwordLbl.show();
        }
    }//GEN-LAST:event_passwordFldFocusLost

    private void emailFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFldFocusGained

        emailFld.selectAll();
    }//GEN-LAST:event_emailFldFocusGained

    private void emailFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFldActionPerformed

    }//GEN-LAST:event_emailFldActionPerformed

    private void passwordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFldActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        // TODO add your handling code here:

        User user = DatabaseManipulation.userFromEmail(emailFld.getText());
        if (user.getEmail().equals("")) {
            errorLbl.setText("Email not found");
            errorLbl.setVisible(true);
        } else {
            errorLbl.setVisible(false);

            if (passwordFld.getText().equals(user.getPassword()) && ValidationRoutines.presenceCheck(passwordFld.getText())) {

                if (user.getType() == 0) {
                    GradePredictorPrototype.setTeacher(user);
                    GradePredictorPrototype.setType(0);
                    new TeacherProfile().setVisible(true);
                    this.dispose();
                } else if (user.getType() == 1) {
                    GradePredictorPrototype.setStudent(user);
                    GradePredictorPrototype.setType(1);
                    new StudentProfile().setVisible(true);
                    this.dispose();
                }
            } else {
                errorLbl.setText("Password not found");
                errorLbl.setVisible(true);
            }
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void passwordFldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_passwordFldCaretUpdate

    }//GEN-LAST:event_passwordFldCaretUpdate

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpMouseClicked

    private void passwordFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
           User user = DatabaseManipulation.userFromEmail(emailFld.getText());
        if (user.getEmail().equals("")) {
            errorLbl.setText("Email not found");
            errorLbl.setVisible(true);
        } else {
            errorLbl.setVisible(false);

            if (passwordFld.getText().equals(user.getPassword()) && ValidationRoutines.presenceCheck(passwordFld.getText())) {

                if (user.getType() == 0) {
                    GradePredictorPrototype.setTeacher(user);
                    GradePredictorPrototype.setType(0);
                    new TeacherProfile().setVisible(true);
                    this.dispose();
                } else if (user.getType() == 1) {
                    GradePredictorPrototype.setStudent(user);
                    GradePredictorPrototype.setType(1);
                    new StudentProfile().setVisible(true);
                    this.dispose();
                }
            } else {
                errorLbl.setText("Password not found");
                errorLbl.setVisible(true);
            }
        }
       }
    }//GEN-LAST:event_passwordFldKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailFld;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel orLbl;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel signUp;
    // End of variables declaration//GEN-END:variables
}
