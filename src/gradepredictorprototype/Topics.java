/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradepredictorprototype;

import java.util.ArrayList;

/**
 *
 * @author kingt
 */
public class Topics extends javax.swing.JFrame {

    private ArrayList<Topic> topics;

    /**
     * Creates new form Topics
     */
    public Topics() {
        topics = DatabaseManipulation.getTopicsFromSubject(GradePredictorPrototype.getSubject());
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

        titleLbl = new javax.swing.JLabel();
        topicsBox = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        newTopicFld = new javax.swing.JTextField();
        removeLbl = new javax.swing.JLabel();
        removeBox = new javax.swing.JComboBox<>();
        removeBtn = new javax.swing.JButton();
        replaceLbl = new javax.swing.JLabel();
        withLbl = new javax.swing.JLabel();
        replaceBox = new javax.swing.JComboBox<>();
        replaceFld = new javax.swing.JTextField();
        replaceBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLbl.setText("Topics");

        topicsBox.setModel(new javax.swing.DefaultComboBoxModel<>(topics.stream().map(x -> x.getTopic()).toArray(String[]::new)));
        topicsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicsBoxActionPerformed(evt);
            }
        });

        addBtn.setText("Add Topic");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        newTopicFld.setText("New Topic");
        newTopicFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newTopicFldFocusGained(evt);
            }
        });

        removeLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        removeLbl.setText("Remove Topic:");

        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(topics.stream().map(x -> x.getTopic()).toArray(String[]::new)));

        removeBtn.setText("Remove");
        removeBtn.setToolTipText("This will permanently delete the topic as long as it does not appear in any exam questions");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        replaceLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        replaceLbl.setText("Replace:");

        withLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        withLbl.setText("with:");

        replaceBox.setModel(new javax.swing.DefaultComboBoxModel<>(topics.stream().map(x -> x.getTopic()).toArray(String[]::new)));

        replaceFld.setText("Topic");
        replaceFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                replaceFldFocusGained(evt);
            }
        });

        replaceBtn.setText("Replace");
        replaceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceBtnActionPerformed(evt);
            }
        });

        subjectBtn.setText("Return to Subject");
        subjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBtnActionPerformed(evt);
            }
        });

        profileBtn.setText("Return to Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTopicFld, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(replaceLbl)
                    .addComponent(withLbl)
                    .addComponent(replaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replaceBox, 0, 335, Short.MAX_VALUE)
                    .addComponent(replaceFld))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(replaceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(replaceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(withLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(replaceFld, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(replaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topicsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newTopicFld, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (ValidationRoutines.presenceCheck(newTopicFld.getText()) && ValidationRoutines.lengthCheck(0, newTopicFld.getText(), 128)) {//validates new topic
            int maxID = DatabaseManipulation.createTopic(newTopicFld.getText(), GradePredictorPrototype.getSubject());//stores new topic
            String newTopic = newTopicFld.getText();
            topics.add(new Topic(maxID + 1, newTopic));
            topicsBox.addItem(newTopic);//updates combo boxes
            removeBox.addItem(newTopic);
            replaceBox.addItem(newTopic);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed

        new TeacherSubject().setVisible(true); //returns to the subject form
        this.dispose();
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed

        new TeacherProfile().setVisible(true); //returns to profile form
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void topicsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicsBoxActionPerformed

    }//GEN-LAST:event_topicsBoxActionPerformed

    private void newTopicFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newTopicFldFocusGained
        newTopicFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_newTopicFldFocusGained

    private void replaceFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_replaceFldFocusGained
        replaceFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_replaceFldFocusGained

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true); //returns to login form
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0); //closes application
    }//GEN-LAST:event_exitMouseClicked

    private void replaceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceBtnActionPerformed
        if (ValidationRoutines.presenceCheck(replaceFld.getText()) && ValidationRoutines.lengthCheck(0, replaceFld.getText(), 128)) {//validates changed topic
            if (DatabaseManipulation.updateTopic(replaceBox.getSelectedItem().toString(), replaceFld.getText())) {//stores changed topic and checks if change occured
                String newTopic = replaceFld.getText();
                int oldIndex = replaceBox.getSelectedIndex();
                topicsBox.removeItemAt(oldIndex);
                topicsBox.insertItemAt(newTopic, oldIndex);//updates combo boxes locally
                removeBox.removeItemAt(oldIndex);
                removeBox.insertItemAt(newTopic, oldIndex);
                replaceBox.removeItemAt(oldIndex);
                replaceBox.insertItemAt(newTopic, oldIndex);
            }
        }
    }//GEN-LAST:event_replaceBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        if (DatabaseManipulation.deleteTopic(topics.get(removeBox.getSelectedIndex()).getID())) {//deletes the topic
            int oldIndex = removeBox.getSelectedIndex();
            topics.remove(oldIndex);
            topicsBox.removeItemAt(oldIndex);
            replaceBox.removeItemAt(oldIndex); //updates the combo boxes
            removeBox.removeItemAt(oldIndex);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Topics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Topics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Topics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Topics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Topics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField newTopicFld;
    private javax.swing.JButton profileBtn;
    private javax.swing.JComboBox<String> removeBox;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel removeLbl;
    private javax.swing.JComboBox<String> replaceBox;
    private javax.swing.JButton replaceBtn;
    private javax.swing.JTextField replaceFld;
    private javax.swing.JLabel replaceLbl;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JComboBox<String> topicsBox;
    private javax.swing.JLabel withLbl;
    // End of variables declaration//GEN-END:variables
}
