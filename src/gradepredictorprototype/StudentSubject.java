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
public class StudentSubject extends javax.swing.JFrame {
    private ArrayList<Method> methods;
    private ArrayList<Question> questions;
    private ArrayList<Topic> topics;
    /**
     * Creates new form StudentSubject
     */
    public StudentSubject() {
        methods = DatabaseManipulation.getMethods();
        if(!methods.isEmpty()) {
            GradePredictorPrototype.top3Methods(methods, 0, methods.size() - 1);
        }
        questions = DatabaseManipulation.studentQuestions(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject());
        topics = new ArrayList<>();
        for (int i = 0; i < questions.size(); i++) {
            int index = GradePredictorPrototype.contains(topics, questions.get(i).getTopic());
            if ((index == -1)) {
                topics.add(questions.get(i).getTopic());
                topics.get(topics.size() - 1).addOverall(questions.get(i).getScore());                
                topics.get(topics.size() - 1).incrementCount();
            } else {
                topics.get(index).addOverall(questions.get(i).getScore());                
                topics.get(index).incrementCount();
            }
        }
        if(!topics.isEmpty()) {
            GradePredictorPrototype.top3Topics(topics, 0, topics.size() -1);
        }       
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
        predictedLbl = new javax.swing.JLabel();
        targetLbl = new javax.swing.JLabel();
        assessmentLbl = new javax.swing.JLabel();
        methodLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        finalBtn = new javax.swing.JButton();
        trendsBtn = new javax.swing.JButton();
        topicsBtn = new javax.swing.JButton();
        paperBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        joinFld = new javax.swing.JTextField();
        profileBtn = new javax.swing.JButton();
        targetBox = new javax.swing.JComboBox<>();
        methodsBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        method1 = new javax.swing.JLabel();
        method2 = new javax.swing.JLabel();
        method3 = new javax.swing.JLabel();
        topic1 = new javax.swing.JLabel();
        topic2 = new javax.swing.JLabel();
        topic3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        titleLbl.setText(GradePredictorPrototype.getSubject().getName());
        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        predictedLbl.setText("Predicted Grade: " + DatabaseManipulation.getPredicted(GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID()));

        targetLbl.setText("Target Grade:");

        assessmentLbl.setText("Last assessment grade: " + DatabaseManipulation.getMostRecent(GradePredictorPrototype.getSubject(), GradePredictorPrototype.getStudent()));

        methodLbl.setText("Revision Method:");

        yearLbl.setText("Exam year:");

        finalBtn.setText("Set achieved Grade");
        finalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalBtnActionPerformed(evt);
            }
        });

        trendsBtn.setText("View Assessment Trends");
        trendsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trendsBtnActionPerformed(evt);
            }
        });

        topicsBtn.setText("View Topic Breakdown");
        topicsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicsBtnActionPerformed(evt);
            }
        });

        paperBtn.setText("Add Assessment");
        paperBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperBtnActionPerformed(evt);
            }
        });

        classBtn.setText("Join Class:");
        classBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classBtnActionPerformed(evt);
            }
        });

        joinFld.setText("Code");
        joinFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joinFldFocusGained(evt);
            }
        });

        profileBtn.setText("Return to Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        targetBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A*", "A", "B", "C", "D", "E" }));
        targetBox.setSelectedItem(DatabaseManipulation.getTarget(GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID()));
        targetBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                targetBoxItemStateChanged(evt);
            }
        });

        methodsBox.setModel(new javax.swing.DefaultComboBoxModel<>(DatabaseManipulation.getMethods().stream().map(x -> x.getName()).toArray(String[]::new)));
        methodsBox.setSelectedItem(DatabaseManipulation.getMethod(GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID()));
        methodsBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                methodsBoxItemStateChanged(evt);
            }
        });

        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021" }));
        yearBox.setSelectedItem(DatabaseManipulation.getExamDate(GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID()).substring(0,4));
        GradePredictorPrototype.getStudent().setYear(yearBox.getSelectedItem().toString());
        yearBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearBoxItemStateChanged(evt);
            }
        });
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        if(methods.size() > 0) {
            method1.setText("Top Method: " + methods.get(0).getName());

        }

        if(methods.size() > 1) {
            method2.setText("2nd Method: " + methods.get(1).getName());
        }

        if(methods.size() > 2) {
            method3.setText("3rd Method: " + methods.get(2).getName());
        }

        if(topics.size() > 0) {
            topic1.setText("Worst topic: " + topics.get(topics.size() - 1).getTopic());
        }

        if(topics.size() > 1) {
            topic2.setText("2nd Worst topic: " + topics.get(topics.size() - 2).getTopic());
        }

        if(topics.size() > 2) {
            topic3.setText("Third Worst topic: " + topics.get(topics.size() - 3).getTopic());
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topic3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topic2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(method1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(yearLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(methodLbl)
                                .addGap(4, 4, 4)
                                .addComponent(methodsBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(targetLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(targetBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(predictedLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assessmentLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(method3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(method2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topic1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(trendsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topicsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paperBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(classBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(joinFld, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(trendsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topicsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paperBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(joinFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(225, 225, 225)
                        .addComponent(profileBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(predictedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(targetLbl)
                            .addComponent(targetBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assessmentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(methodLbl)
                            .addComponent(methodsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearLbl)
                            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(method1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(method2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(method3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topic1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(topic2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topic3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(finalBtn)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
        new StudentProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void targetBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_targetBoxItemStateChanged
        // TODO add your handling code here:
        DatabaseManipulation.updateTarget(targetBox.getSelectedItem().toString(), GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID());
    }//GEN-LAST:event_targetBoxItemStateChanged

    private void methodsBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_methodsBoxItemStateChanged
        // TODO add your handling code here:
        DatabaseManipulation.updateStudentMethod(methodsBox.getSelectedItem().toString(), GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID());
       
    }//GEN-LAST:event_methodsBoxItemStateChanged

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        // TODO add your handling code here:
        DatabaseManipulation.joinClass(joinFld.getText(), GradePredictorPrototype.getStudent());
    }//GEN-LAST:event_classBtnActionPerformed

    private void paperBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperBtnActionPerformed
        // TODO add your handling code here:
        new AddAssessment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paperBtnActionPerformed

    private void topicsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicsBtnActionPerformed
        // TODO add your handling code here:
        new TopicBreakdown().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_topicsBtnActionPerformed

    private void trendsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trendsBtnActionPerformed
        // TODO add your handling code here:
        new Trends().setVisible(true);
        GradePredictorPrototype.setBoundaries(GradePredictorPrototype.getSubject());
        this.dispose();
    }//GEN-LAST:event_trendsBtnActionPerformed

    private void yearBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearBoxItemStateChanged
        // TODO add your handling code here:
        DatabaseManipulation.updateExamDate(yearBox.getSelectedItem().toString(), GradePredictorPrototype.getStudent().getEmail() + GradePredictorPrototype.getSubject().getID());
        GradePredictorPrototype.getStudent().setYear(yearBox.getSelectedItem().toString());
    }//GEN-LAST:event_yearBoxItemStateChanged

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearBoxActionPerformed

    private void finalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalBtnActionPerformed
        // TODO add your handling code here:
        new FinalGrade().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_finalBtnActionPerformed

    private void joinFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joinFldFocusGained
        joinFld.selectAll();
    }//GEN-LAST:event_joinFldFocusGained

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
            java.util.logging.Logger.getLogger(StudentSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSubject().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assessmentLbl;
    private javax.swing.JButton classBtn;
    private javax.swing.JButton finalBtn;
    private javax.swing.JTextField joinFld;
    private javax.swing.JLabel method1;
    private javax.swing.JLabel method2;
    private javax.swing.JLabel method3;
    private javax.swing.JLabel methodLbl;
    private javax.swing.JComboBox<String> methodsBox;
    private javax.swing.JButton paperBtn;
    private javax.swing.JLabel predictedLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JComboBox<String> targetBox;
    private javax.swing.JLabel targetLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel topic1;
    private javax.swing.JLabel topic2;
    private javax.swing.JLabel topic3;
    private javax.swing.JButton topicsBtn;
    private javax.swing.JButton trendsBtn;
    private javax.swing.JComboBox<String> yearBox;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables
}
