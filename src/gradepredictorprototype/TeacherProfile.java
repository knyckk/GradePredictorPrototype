/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class TeacherProfile extends javax.swing.JFrame {
    /**
     * Creates new form TeacherProfile
     */
    public TeacherProfile() {
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
        createLbl = new javax.swing.JLabel();
        enterBtn = new javax.swing.JButton();
        iconLbl = new javax.swing.JLabel();
        iconBox = new javax.swing.JComboBox<>();
        usernameLbl = new javax.swing.JLabel();
        changeBtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        subjectLbl = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getSubjects().stream().map(x -> x.getName()).toArray(String[]::new)));
        addBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoxActionPerformed(evt);
            }
        });

        createLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createLbl.setForeground(new java.awt.Color(153, 153, 153));
        createLbl.setText("here");
        createLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createLblMouseClicked(evt);
            }
        });

        enterBtn.setText("Enter Subject");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        iconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile"+(GradePredictorPrototype.getTeacher().getIcon()+1)+".jpeg")));

        iconBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Icon 1", "Icon 2", "Icon 3", "Icon 4", "Icon 5", "Icon 6", "Icon 7" }));
        iconBox.setSelectedIndex(GradePredictorPrototype.getTeacher().getIcon());
        iconBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                iconBoxItemStateChanged(evt);
            }
        });

        usernameLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameLbl.setText("Username: " + GradePredictorPrototype.getTeacher().getUsername());

        changeBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        changeBtn.setText("change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLbl.setText("Name: " + GradePredictorPrototype.getTeacher().getName());

        subjectLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectLbl.setText("Or you can create a new subject");

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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subjectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLblMouseClicked
        new CreateSubject().setVisible(true);//enters create subject form
        this.dispose();
    }//GEN-LAST:event_createLblMouseClicked

    private void addBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBoxActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        GradePredictorPrototype.setSubject(addBox.getSelectedIndex() + 1, addBox.getSelectedItem().toString());//enters subject selected
        GradePredictorPrototype.setBoundaries(GradePredictorPrototype.getSubject());
        new TeacherSubject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_enterBtnActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true); //returns to login form
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0); //closes application
    }//GEN-LAST:event_exitMouseClicked

    private void iconBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_iconBoxItemStateChanged
        iconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile"+(iconBox.getSelectedIndex() + 1)+".jpeg")));
        GradePredictorPrototype.setTeacherIcon(iconBox.getSelectedIndex());//updates icon image when changed
        DatabaseManipulation.updateUserIcon(iconBox.getSelectedIndex(), GradePredictorPrototype.getTeacher().getEmail());

    }//GEN-LAST:event_iconBoxItemStateChanged

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        new AboutYou().setVisible(true);//goes into about you form
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
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addBox;
    private javax.swing.JButton changeBtn;
    private javax.swing.JLabel createLbl;
    private javax.swing.JButton enterBtn;
    private javax.swing.JMenu exit;
    private javax.swing.JComboBox<String> iconBox;
    private javax.swing.JLabel iconLbl;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
