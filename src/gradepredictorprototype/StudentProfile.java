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
public class StudentProfile extends javax.swing.JFrame {

    /**
     * Creates new form StudentProfile
     */
    public StudentProfile() {
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

        addBox = new javax.swing.JComboBox<>();
        enterBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        classBtn.setVisible(GradePredictorPrototype.getViewing());
        iconLbl = new javax.swing.JLabel();
        iconBox = new javax.swing.JComboBox<>();
        nameLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        changeBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBox.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        addBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getSubjects().stream().map(x -> x.getName()).toArray(String[]::new)));
        addBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoxActionPerformed(evt);
            }
        });

        enterBtn.setText("Enter Subject");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        enterBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterBtnKeyPressed(evt);
            }
        });

        classBtn.setText("Return to Class");
        classBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classBtnActionPerformed(evt);
            }
        });

        iconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile"+(GradePredictorPrototype.getStudent().getIcon()+1)+".jpeg")));

        iconBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Icon 1", "Icon 2", "Icon 3", "Icon 4", "Icon 5", "Icon 6", "Icon 7" }));
        iconBox.setSelectedIndex(GradePredictorPrototype.getStudent().getIcon());
        iconBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                iconBoxItemStateChanged(evt);
            }
        });
        iconBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconBoxActionPerformed(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLbl.setText("Name: " + GradePredictorPrototype.getStudent().getName());

        usernameLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameLbl.setText("Username: " + GradePredictorPrototype.getStudent().getUsername());

        changeBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        changeBtn.setText("change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        logout.setText("Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        menuBar.add(logout);

        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        menuBar.add(exit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconBox, 0, 223, Short.MAX_VALUE)
                            .addComponent(iconLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(classBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(classBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(addBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        // TODO add your handling code here:
        GradePredictorPrototype.setSubject(addBox.getSelectedIndex() + 1, addBox.getSelectedItem().toString());
        GradePredictorPrototype.setBoundaries(GradePredictorPrototype.getSubject());
        DatabaseManipulation.createStudentSub(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject());
        new StudentSubject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_enterBtnActionPerformed

    private void addBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBoxActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void enterBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            GradePredictorPrototype.setSubject(addBox.getSelectedIndex() + 1, addBox.getSelectedItem().toString());
            GradePredictorPrototype.setBoundaries(GradePredictorPrototype.getSubject());
            DatabaseManipulation.createStudentSub(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject());
            new StudentSubject().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_enterBtnKeyPressed
    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        if (GradePredictorPrototype.getViewing()) {
            new Classes().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_classBtnActionPerformed

    private void iconBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_iconBoxItemStateChanged
        // TODO add your handling code here:
        iconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile" + (iconBox.getSelectedIndex() + 1) + ".jpeg")));
        GradePredictorPrototype.setStudentIcon(iconBox.getSelectedIndex());
        DatabaseManipulation.updateUserIcon(iconBox.getSelectedIndex(), GradePredictorPrototype.getStudent().getEmail());

    }//GEN-LAST:event_iconBoxItemStateChanged

    private void iconBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iconBoxActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        new AboutYou().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addBox;
    private javax.swing.JButton changeBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.JMenu exit;
    private javax.swing.JComboBox<String> iconBox;
    private javax.swing.JLabel iconLbl;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
