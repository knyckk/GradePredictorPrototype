/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepredictorprototype;

/**
 *
 * @author 1-thope
 */
public class Classes extends javax.swing.JFrame {

    /**
     * Creates new form Classes
     */
    public Classes() {
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
        createClassBtn = new javax.swing.JButton();
        createClassFld = new javax.swing.JTextField();
        joinClassBtn = new javax.swing.JButton();
        joinFld = new javax.swing.JTextField();
        leaveLbl = new javax.swing.JLabel();
        leaveBox = new javax.swing.JComboBox<>();
        removeLbl = new javax.swing.JLabel();
        removeBox = new javax.swing.JComboBox<>();
        currentBox = new javax.swing.JComboBox<>();
        viewBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        leaveBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLbl.setText("Classes");

        createClassBtn.setText("Add Class:");
        createClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassBtnActionPerformed(evt);
            }
        });

        createClassFld.setText("Class name");

        joinClassBtn.setText("Join class");
        joinClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinClassBtnActionPerformed(evt);
            }
        });

        joinFld.setText("Teacher code");

        leaveLbl.setText("Leave Class:");

        leaveBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        leaveBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveBoxActionPerformed(evt);
            }
        });

        removeLbl.setText("Remove Class:");

        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));

        currentBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));

        viewBtn.setText("View Class");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
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

        leaveBtn.setText("Leave");
        leaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeLbl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(removeBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 124, Short.MAX_VALUE)
                                .addComponent(leaveBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(leaveBtn)
                            .addComponent(removeBtn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentBox, 0, 151, Short.MAX_VALUE)
                                    .addComponent(viewBtn))
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(leaveLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createClassBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createClassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(joinClassBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(joinFld, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createClassBtn)
                    .addComponent(createClassFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joinClassBtn)
                    .addComponent(joinFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(leaveLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leaveBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leaveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(currentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subjectBtn)
                        .addGap(17, 17, 17)
                        .addComponent(profileBtn)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeBtn)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassBtnActionPerformed
        // TODO add your handling code here:
        DatabaseManipulation.createClass(createClassFld.getText(), GradePredictorPrototype.getTeacher());
        String[] classes = DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new);
        leaveBox.setModel(new javax.swing.DefaultComboBoxModel<>(classes));
        currentBox.setModel(new javax.swing.DefaultComboBoxModel<>(classes));
        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(classes));
    }//GEN-LAST:event_createClassBtnActionPerformed

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed
        // TODO add your handling code here:
        new TeacherSubject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
        new TeacherProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void leaveBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveBoxActionPerformed

    private void joinClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinClassBtnActionPerformed
        // TODO add your handling code here:
        DatabaseManipulation.joinClass(joinFld.getText(), GradePredictorPrototype.getTeacher());
        leaveBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        currentBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
    }//GEN-LAST:event_joinClassBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        DatabaseManipulation.deleteClass(removeBox.getSelectedItem().toString());
        leaveBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        currentBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
    }//GEN-LAST:event_removeBtnActionPerformed

    private void leaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveBtnActionPerformed
        // TODO add your handling code here:
        DatabaseManipulation.leaveClass(leaveBox.getSelectedItem().toString(), GradePredictorPrototype.getTeacher());
        leaveBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        currentBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));
        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getClasses(GradePredictorPrototype.getTeacher()).stream().filter(x -> x.getSubject().equals(GradePredictorPrototype.getSubject())).map(x -> x.getName()).toArray(String[]::new)));     
    }//GEN-LAST:event_leaveBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        new ClassForm(currentBox.getSelectedItem().toString()).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createClassBtn;
    private javax.swing.JTextField createClassFld;
    private javax.swing.JComboBox<String> currentBox;
    private javax.swing.JButton joinClassBtn;
    private javax.swing.JTextField joinFld;
    private javax.swing.JComboBox<String> leaveBox;
    private javax.swing.JButton leaveBtn;
    private javax.swing.JLabel leaveLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JComboBox<String> removeBox;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel removeLbl;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
