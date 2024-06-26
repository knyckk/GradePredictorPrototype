/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepredictor;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author 1-thope
 */
public class RevisionMethod extends javax.swing.JFrame {

    /**
     * Creates new form RevisionMethod
     */
    public RevisionMethod() {        
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
        methodsBox = new javax.swing.JComboBox<>();
        newNameLbl = new javax.swing.JLabel();
        removeBox = new javax.swing.JComboBox<>();
        toLbl = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        replaceBox = new javax.swing.JComboBox<>();
        removeLbl = new javax.swing.JLabel();
        createMethodBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        renameBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1200, 600));

        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLbl.setText("Revision Methods");

        methodsBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getMethods().stream().map(x -> x.getName()).toArray(String[]::new)));
        methodsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodsBoxActionPerformed(evt);
            }
        });

        newNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newNameLbl.setText("Change name of:");

        removeBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getMethods().stream().map(x -> x.getName()).toArray(String[]::new)));

        toLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toLbl.setText("to:");

        nameFld.setText("Method");
        nameFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFldFocusGained(evt);
            }
        });

        replaceBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getMethods().stream().map(x -> x.getName()).toArray(String[]::new)));

        removeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removeLbl.setText("Remove revision method:");

        createMethodBtn.setText("Add method");
        createMethodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMethodBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
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

        renameBtn.setText("rename");
        renameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameBtnActionPerformed(evt);
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
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(renameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(methodsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createMethodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toLbl)
                            .addComponent(replaceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newNameLbl))))
                .addContainerGap(487, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(methodsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameLbl))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createMethodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replaceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(toLbl)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeLbl)
                        .addGap(6, 6, 6)
                        .addComponent(removeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(nameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(renameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMethodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMethodBtnActionPerformed
        new CreateMethod().setVisible(true); //enters create method form
        this.dispose();
    }//GEN-LAST:event_createMethodBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        if (removeBox.getSelectedItem() != null) {
            DatabaseManipulation.deleteMethod(removeBox.getSelectedItem().toString());//deletes the method
            int index = removeBox.getSelectedIndex(); //gets index of deleted method
            methodsBox.removeItemAt(index);
            removeBox.removeItemAt(index); //updates combo boxes locally
            replaceBox.removeItemAt(index);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed
        new TeacherSubject().setVisible(true); //returns to the subject form
        this.dispose();
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed

        new TeacherProfile().setVisible(true); //returns to profile form
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void renameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameBtnActionPerformed
        if (replaceBox.getSelectedItem() != null) {
            if (ValidationRoutines.lengthCheck(0, nameFld.getText(), 32)) { //validates inputs
                DatabaseManipulation.updateMethod(replaceBox.getSelectedItem().toString(), nameFld.getText()); //updates the method
                String newMethod = nameFld.getText(); //stores method locally 
                int index = replaceBox.getSelectedIndex();
                methodsBox.removeItemAt(index);
                methodsBox.insertItemAt(newMethod, index);
                methodsBox.setSelectedIndex(0);
                removeBox.removeItemAt(index);
                removeBox.insertItemAt(newMethod, index);//update combo Boxes
                removeBox.setSelectedIndex(0);
                replaceBox.removeItemAt(index);
                replaceBox.insertItemAt(newMethod, index);
                replaceBox.setSelectedIndex(index);
            }

    }//GEN-LAST:event_renameBtnActionPerformed
    }
    private void nameFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFldFocusGained

        nameFld.selectAll();//automatically selects all text when clicked
    }//GEN-LAST:event_nameFldFocusGained

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true); //returns to login form
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0); //closes application
    }//GEN-LAST:event_exitMouseClicked

    private void methodsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_methodsBoxActionPerformed

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
                    UIManager.put("nimbusBase", new Color(53, 53, 53));
                    UIManager.put("nimbusBlueGrey", new Color(53, 53, 53));
                    UIManager.put("control", new Color(53, 53, 53));
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RevisionMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevisionMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevisionMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevisionMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevisionMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createMethodBtn;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JComboBox<String> methodsBox;
    private javax.swing.JTextField nameFld;
    private javax.swing.JLabel newNameLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JComboBox<String> removeBox;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel removeLbl;
    private javax.swing.JButton renameBtn;
    private javax.swing.JComboBox<String> replaceBox;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}
