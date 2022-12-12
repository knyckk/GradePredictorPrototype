/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradepredictorprototype;

import java.awt.Color;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.UIManager;

/**
 *
 * @author kingt
 */
public class SignUp extends javax.swing.JFrame {

    private String code;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SignUp");
        setBackground(new java.awt.Color(51, 51, 51));

        confirmLbl.setText("Confirm Password");

        passwordLbl.setText("Password");

        signUpAsLbl.setBackground(new java.awt.Color(51, 51, 51));
        signUpAsLbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        signUpAsLbl.setForeground(new java.awt.Color(255, 255, 255));
        signUpAsLbl.setText("Sign up as:");

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

        emailFld.setBackground(new java.awt.Color(51, 51, 51));
        emailFld.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
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

        codeBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        codeBtn.setText("Send verification code");
        codeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeBtnActionPerformed(evt);
            }
        });

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

        enterBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(signUpAsLbl)
                        .addGap(8, 8, 8)
                        .addComponent(studentRdio)
                        .addGap(4, 4, 4)
                        .addComponent(teacherRdio))
                    .addComponent(emailFld, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(passwordLbl))
                    .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(confirmLbl))
                    .addComponent(confirmFld, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(codeBtn))
                    .addComponent(codeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(enterBtn)))
                .addGap(276, 276, 276))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(signUpAsLbl))
                    .addComponent(studentRdio)
                    .addComponent(teacherRdio))
                .addGap(2, 2, 2)
                .addComponent(emailFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(passwordLbl))
                    .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(confirmLbl))
                    .addComponent(confirmFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(codeBtn)
                .addGap(5, 5, 5)
                .addComponent(codeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(enterBtn)
                .addGap(84, 84, 84))
        );

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
        
        if (((passwordFld.getText().equals(confirmFld.getText())) && codeFld.getText().equals(code)) && type == 2) {
            DatabaseManipulation.signUp(emailFld.getText(), passwordFld.getText(), 1);
            GradePredictorPrototype.setStudent(emailFld.getText());
            new StudentProfile().setVisible(true);
            this.dispose();
        } else if (((passwordFld.getText().equals(confirmFld.getText())) && codeFld.getText().equals(code)) && type == 1) {
            DatabaseManipulation.signUp(emailFld.getText(), passwordFld.getText(), 0);
            GradePredictorPrototype.setTeacher(emailFld.getText());
            new TeacherProfile().setVisible(true);
            this.dispose();
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
        
        emailFld.selectAll();
    }//GEN-LAST:event_emailFldFocusGained

    private void emailFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFldActionPerformed
        
    }//GEN-LAST:event_emailFldActionPerformed

    private void passwordFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusGained
        
        passwordLbl.hide();
        passwordFld.selectAll();
    }//GEN-LAST:event_passwordFldFocusGained

    private void confirmFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFldFocusGained
        
        confirmLbl.hide();
        confirmFld.selectAll();
    }//GEN-LAST:event_confirmFldFocusGained

    private void passwordFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusLost
        
        if(passwordFld.getPassword().length == 0) {
            passwordLbl.show();
        }
    }//GEN-LAST:event_passwordFldFocusLost

    private void confirmFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFldFocusLost
        
        if(confirmFld.getPassword().length == 0) {
            confirmLbl.show();
        }
    }//GEN-LAST:event_confirmFldFocusLost

    private void codeFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codeFldFocusGained
        
        codeFld.selectAll();
    }//GEN-LAST:event_codeFldFocusGained

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
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.ButtonGroup radios;
    private javax.swing.JLabel signUpAsLbl;
    private javax.swing.JRadioButton studentRdio;
    private javax.swing.JRadioButton teacherRdio;
    // End of variables declaration//GEN-END:variables
}
