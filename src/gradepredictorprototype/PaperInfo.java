/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class PaperInfo extends javax.swing.JFrame {
    /**
     * Creates new form PaperInfo
     */
    public PaperInfo() {
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
        howManyLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        numberLbl = new javax.swing.JLabel();
        howManyFld = new javax.swing.JTextField();
        yearFld = new javax.swing.JTextField();
        numberFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CLbl = new javax.swing.JLabel();
        AStarLbl = new javax.swing.JLabel();
        ALbl = new javax.swing.JLabel();
        DLbl = new javax.swing.JLabel();
        ELbl = new javax.swing.JLabel();
        BLbl = new javax.swing.JLabel();
        AStarFld = new javax.swing.JTextField();
        AFld = new javax.swing.JTextField();
        BFld = new javax.swing.JTextField();
        CFld = new javax.swing.JTextField();
        EFld = new javax.swing.JTextField();
        DFld = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLbl.setText("Paper");

        howManyLbl.setText("How many questions are in the paper?");

        yearLbl.setText("What year is the paper from?");

        numberLbl.setText("What number is the paper?");

        howManyFld.setText("Number Of Questions");
        howManyFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                howManyFldFocusGained(evt);
            }
        });
        howManyFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howManyFldActionPerformed(evt);
            }
        });
        howManyFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                howManyFldKeyPressed(evt);
            }
        });

        yearFld.setText("Paper Year");
        yearFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearFldFocusGained(evt);
            }
        });

        numberFld.setText("Paper Number");
        numberFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numberFldFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Grade Boundaries");

        CLbl.setText("C");

        AStarLbl.setText("A*");

        ALbl.setText("A");

        DLbl.setText("D");

        ELbl.setText("E");

        BLbl.setText("B");

        AStarFld.setText("Enter Mark");
        AStarFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AStarFldFocusGained(evt);
            }
        });

        AFld.setText("Enter Mark");
        AFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AFldFocusGained(evt);
            }
        });

        BFld.setText("Enter Mark");
        BFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BFldFocusGained(evt);
            }
        });

        CFld.setText("Enter Mark");
        CFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CFldFocusGained(evt);
            }
        });

        EFld.setText("Enter Mark");
        EFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EFldFocusGained(evt);
            }
        });

        DFld.setText("Enter Mark");
        DFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DFldFocusGained(evt);
            }
        });

        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(howManyFld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearFld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterBtn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subjectBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CFld, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BFld, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ALbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AFld, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AStarLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AStarFld, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DFld, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ELbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EFld, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(146, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(howManyLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(howManyLbl))
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(howManyFld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearLbl)
                        .addGap(5, 5, 5)
                        .addComponent(yearFld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberLbl)
                        .addGap(5, 5, 5)
                        .addComponent(numberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AStarLbl)
                            .addComponent(AStarFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ALbl)
                            .addComponent(AFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BLbl)
                            .addComponent(BFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CLbl)
                            .addComponent(CFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DLbl)
                            .addComponent(DFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ELbl)
                            .addComponent(EFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(subjectBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileBtn)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed
        
        new TeacherSubject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        
        new TeacherProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        
        Paper paper = new Paper(Integer.valueOf(howManyFld.getText()), Integer.valueOf(yearFld.getText()), Integer.valueOf(numberFld.getText()), Integer.valueOf(AStarFld.getText()),Integer.valueOf(AFld.getText()),Integer.valueOf(BFld.getText()),Integer.valueOf(CFld.getText()),Integer.valueOf(DFld.getText()),Integer.valueOf(EFld.getText()));
        new CreatePaper(paper).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_enterBtnActionPerformed

    private void howManyFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howManyFldActionPerformed
        
    }//GEN-LAST:event_howManyFldActionPerformed

    private void howManyFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_howManyFldKeyPressed
    }//GEN-LAST:event_howManyFldKeyPressed

    private void howManyFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_howManyFldFocusGained
        
        howManyFld.selectAll();
    }//GEN-LAST:event_howManyFldFocusGained

    private void yearFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFldFocusGained
        
        yearFld.selectAll();
    }//GEN-LAST:event_yearFldFocusGained

    private void numberFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberFldFocusGained
        
        numberFld.selectAll();
    }//GEN-LAST:event_numberFldFocusGained

    private void AStarFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AStarFldFocusGained
        
        AStarFld.selectAll();
    }//GEN-LAST:event_AStarFldFocusGained

    private void AFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AFldFocusGained
        
        AFld.selectAll();
    }//GEN-LAST:event_AFldFocusGained

    private void BFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFldFocusGained
        
        BFld.selectAll();
    }//GEN-LAST:event_BFldFocusGained

    private void CFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CFldFocusGained
        
        CFld.selectAll();
    }//GEN-LAST:event_CFldFocusGained

    private void DFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DFldFocusGained
        
        DFld.selectAll();
    }//GEN-LAST:event_DFldFocusGained

    private void EFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EFldFocusGained
        
        EFld.selectAll();
    }//GEN-LAST:event_EFldFocusGained

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
            java.util.logging.Logger.getLogger(PaperInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaperInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaperInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaperInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaperInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AFld;
    private javax.swing.JLabel ALbl;
    private javax.swing.JTextField AStarFld;
    private javax.swing.JLabel AStarLbl;
    private javax.swing.JTextField BFld;
    private javax.swing.JLabel BLbl;
    private javax.swing.JTextField CFld;
    private javax.swing.JLabel CLbl;
    private javax.swing.JTextField DFld;
    private javax.swing.JLabel DLbl;
    private javax.swing.JTextField EFld;
    private javax.swing.JLabel ELbl;
    private javax.swing.JButton enterBtn;
    private javax.swing.JTextField howManyFld;
    private javax.swing.JLabel howManyLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numberFld;
    private javax.swing.JLabel numberLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField yearFld;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables
}
