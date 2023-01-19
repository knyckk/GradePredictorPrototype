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
public class ClassForm extends javax.swing.JFrame {

    private Classroom classroom;
    private ArrayList<User> students;

    /**
     * Creates new form ClassFrom
     */
    public ClassForm(String name) {
        classroom = DatabaseManipulation.classFromName(name);
        students = DatabaseManipulation.getClassStudents(name);
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
        studentCodeLbl = new javax.swing.JLabel();
        teacherCodeLbl = new javax.swing.JLabel();
        nameBtn = new javax.swing.JButton();
        nameFld = new javax.swing.JTextField();
        studentsBox = new javax.swing.JComboBox<>();
        studentBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setText(classroom.getName());
        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        studentCodeLbl.setText("Student Code: " + classroom.getStudentCode());
        studentCodeLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        teacherCodeLbl.setText("Teacher Code: " + classroom.getTeacherCode());
        teacherCodeLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameBtn.setText("Change name:");
        nameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBtnActionPerformed(evt);
            }
        });

        nameFld.setText("New Name");
        nameFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFldFocusGained(evt);
            }
        });

        studentsBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentsBox.setModel(new javax.swing.DefaultComboBoxModel<>(students.stream().map(x -> x.getName()).toArray(String[]::new)));
        studentsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsBoxActionPerformed(evt);
            }
        });

        studentBtn.setText("View Student");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        subjectBtn.setText("Return to Subject");
        subjectBtn.setActionCommand("<html>Return to <br\\>Subject<\\html>");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                .addComponent(studentsBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 335, Short.MAX_VALUE)
                                .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(studentCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 855, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBtnActionPerformed
        if (ValidationRoutines.presenceCheck(nameFld.getText())
                && ValidationRoutines.lengthCheck(0,nameFld.getText(),32)) {
            boolean changed = DatabaseManipulation.updateClass(classroom.getName(), nameFld.getText());
            if (changed) {
                titleLbl.setText(nameFld.getText());
            }
        }
    }//GEN-LAST:event_nameBtnActionPerformed

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed

        new TeacherSubject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed

        new TeacherProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void nameFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFldFocusGained
        nameFld.selectAll();
    }//GEN-LAST:event_nameFldFocusGained

    private void studentsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsBoxActionPerformed

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        GradePredictorPrototype.setViewing(true);
        GradePredictorPrototype.setStudent(students.get(studentsBox.getSelectedIndex()));
        new StudentProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentBtnActionPerformed
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(ClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassForm("CS1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu exit;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton nameBtn;
    private javax.swing.JTextField nameFld;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton studentBtn;
    private javax.swing.JLabel studentCodeLbl;
    private javax.swing.JComboBox<String> studentsBox;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JLabel teacherCodeLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
