/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradepredictorprototype;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.UIManager;

/**
 *
 * @author kingt
 */
public class SignUp extends javax.swing.JFrame {

    private String code = "completely random and unpredictable";
    private int type = 0;

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        radios = new javax.swing.ButtonGroup();
        confirmLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        signUpAsLbl = new javax.swing.JLabel();
        studentRdio = new javax.swing.JRadioButton();
        teacherRdio = new javax.swing.JRadioButton();
        emailFld = new javax.swing.JTextField();
        codeBtn = new javax.swing.JButton();
        codeFld = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        confirmFld = new javax.swing.JPasswordField();
        orLbl = new javax.swing.JLabel();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SignUp");
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        confirmLbl.setText("Confirm Password");
        getContentPane().add(confirmLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 206, 252, 40));

        passwordLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passwordLbl.setText("Password");
        getContentPane().add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 149, 174, 33));

        signUpAsLbl.setBackground(new java.awt.Color(51, 51, 51));
        signUpAsLbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        signUpAsLbl.setForeground(new java.awt.Color(255, 255, 255));
        signUpAsLbl.setText("Sign up as:");
        getContentPane().add(signUpAsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 59, -1, -1));

        studentRdio.setBackground(new java.awt.Color(51, 51, 51));
        radios.add(studentRdio);
        studentRdio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        studentRdio.setForeground(new java.awt.Color(255, 255, 255));
        studentRdio.setText("Student");
        studentRdio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRdioActionPerformed(evt);
            }
        });
        getContentPane().add(studentRdio, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 55, -1, -1));

        teacherRdio.setBackground(new java.awt.Color(51, 51, 51));
        radios.add(teacherRdio);
        teacherRdio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        teacherRdio.setForeground(new java.awt.Color(255, 255, 255));
        teacherRdio.setText("Teacher");
        teacherRdio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRdioActionPerformed(evt);
            }
        });
        getContentPane().add(teacherRdio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 55, -1, -1));

        emailFld.setBackground(new java.awt.Color(51, 51, 51));
        emailFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailFld.setForeground(new java.awt.Color(255, 255, 255));
        emailFld.setText("Email");
        emailFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        emailFld.setCaretColor(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(emailFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 78, 335, 55));

        codeBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        codeBtn.setText("Send verification code");
        codeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(codeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 261, 165, 55));

        codeFld.setBackground(new java.awt.Color(51, 51, 51));
        codeFld.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        codeFld.setForeground(new java.awt.Color(255, 255, 255));
        codeFld.setText("Verification Code");
        codeFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codeFldFocusGained(evt);
            }
        });
        codeFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeFldActionPerformed(evt);
            }
        });
        codeFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeFldKeyPressed(evt);
            }
        });
        getContentPane().add(codeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 335, 55));

        enterBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 165, 55));

        passwordFld.setBackground(new java.awt.Color(53, 53, 53));
        passwordFld.setForeground(new java.awt.Color(255, 255, 255));
        passwordFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFldFocusLost(evt);
            }
        });
        getContentPane().add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 140, 335, 55));

        confirmFld.setBackground(new java.awt.Color(53, 53, 53));
        confirmFld.setForeground(new java.awt.Color(255, 255, 255));
        confirmFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        confirmFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmFldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmFldFocusLost(evt);
            }
        });
        getContentPane().add(confirmFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 200, 335, 55));

        orLbl.setText("or you can login");
        getContentPane().add(orLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, 20));

        login.setForeground(new java.awt.Color(153, 153, 153));
        login.setText("here");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentRdioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRdioActionPerformed

        type = 2;
    }//GEN-LAST:event_studentRdioActionPerformed

    private void teacherRdioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRdioActionPerformed

        type = 1;
    }//GEN-LAST:event_teacherRdioActionPerformed

    private void codeFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFldActionPerformed

    }//GEN-LAST:event_codeFldActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        if (ValidationRoutines.lengthCheck(0, passwordFld.getText(), 64)) {
            if (((passwordFld.getText().equals(confirmFld.getText())) && codeFld.getText().equals(code)) && type == 2) {
                DatabaseManipulation.signUp(emailFld.getText(), passwordFld.getText(), 1);
                GradePredictorPrototype.setStudent(new User(emailFld.getText(), passwordFld.getText(), 1));
                GradePredictorPrototype.setType(1);
                new AboutYou().setVisible(true);
                this.dispose();
            } else if (((passwordFld.getText().equals(confirmFld.getText())) && codeFld.getText().equals(code)) && type == 1) {
                DatabaseManipulation.signUp(emailFld.getText(), passwordFld.getText(), 0);
                GradePredictorPrototype.setTeacher(new User(emailFld.getText(), passwordFld.getText(), 0));
                GradePredictorPrototype.setType(0);
                new AboutYou().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void codeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeBtnActionPerformed

        String from = "GradePredictorNEA@gmail.com";
        String host = "smtp.gmail.com";
        String password = "ahsv fdgi aqou uwll";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.password", password);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.debug", "true");
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);

            }
        });
        this.code = GradePredictorPrototype.getCode();
        if (type == 1) {
            if (ValidationRoutines.teacherEmail(emailFld.getText())) {
                try {
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(from));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailFld.getText()));
                    message.setSubject("Verification code");
                    message.setText("Hi, \nYour verification code is: " + code);
                    Transport transport = session.getTransport("smtp");
                    transport.connect(host, from, password);
                    transport.sendMessage(message, message.getAllRecipients());
                    transport.close();
                } catch (MessagingException mex) {
                    mex.printStackTrace();
                }
            }
        } else if (type == 2) {
            if (ValidationRoutines.studentEmail(emailFld.getText())) {
                try {
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(from));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailFld.getText()));
                    message.setSubject("Verification code");
                    message.setText("Hi, \nYour verification code is: " + code);
                    Transport transport = session.getTransport("smtp");
                    transport.connect(host, from, password);
                    transport.sendMessage(message, message.getAllRecipients());
                    transport.close();
                } catch (MessagingException mex) {
                    mex.printStackTrace();
                }
            }

        }

    }//GEN-LAST:event_codeBtnActionPerformed

    private void emailFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFldFocusGained

        emailFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_emailFldFocusGained

    private void emailFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFldActionPerformed

    }//GEN-LAST:event_emailFldActionPerformed

    private void passwordFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusGained

        passwordLbl.hide();//hide password text if it is there
        passwordFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_passwordFldFocusGained

    private void confirmFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFldFocusGained

        confirmLbl.hide();//hide confirm password text if it is there
        confirmFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_confirmFldFocusGained

    private void passwordFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusLost

        if (passwordFld.getPassword().length == 0) {
            passwordLbl.show();
        }
    }//GEN-LAST:event_passwordFldFocusLost

    private void confirmFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFldFocusLost

        if (confirmFld.getPassword().length == 0) {
            confirmLbl.show();
        }
    }//GEN-LAST:event_confirmFldFocusLost

    private void codeFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codeFldFocusGained

        codeFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_codeFldFocusGained

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void codeFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (ValidationRoutines.lengthCheck(0, passwordFld.getText(), 64)
                    && ((type == 1 && ValidationRoutines.teacherEmail(emailFld.getText())) || (type == 2 && ValidationRoutines.studentEmail(emailFld.getText())))
                    && ValidationRoutines.lengthCheck(0,emailFld.getText(),64)) {
                if (((passwordFld.getText().equals(confirmFld.getText())) && codeFld.getText().equals(code)) && type == 2) {
                    DatabaseManipulation.signUp(emailFld.getText(), passwordFld.getText(), 1);
                    GradePredictorPrototype.setStudent(new User(emailFld.getText(), passwordFld.getText(), 1));
                    GradePredictorPrototype.setType(1);
                } else if (((passwordFld.getText().equals(confirmFld.getText())) && codeFld.getText().equals(code)) && type == 1) {
                    DatabaseManipulation.signUp(emailFld.getText(), passwordFld.getText(), 0);
                    GradePredictorPrototype.setTeacher(new User(emailFld.getText(), passwordFld.getText(), 0));
                    GradePredictorPrototype.setType(0);
                }
                new AboutYou().setVisible(true);
                this.dispose();

            }
        }
    }//GEN-LAST:event_codeFldKeyPressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton codeBtn;
    private javax.swing.JTextField codeFld;
    private javax.swing.JPasswordField confirmFld;
    private javax.swing.JLabel confirmLbl;
    private javax.swing.JTextField emailFld;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel login;
    private javax.swing.JLabel orLbl;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.ButtonGroup radios;
    private javax.swing.JLabel signUpAsLbl;
    private javax.swing.JRadioButton studentRdio;
    private javax.swing.JRadioButton teacherRdio;
    // End of variables declaration//GEN-END:variables
}
