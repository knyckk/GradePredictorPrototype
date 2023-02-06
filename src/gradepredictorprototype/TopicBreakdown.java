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
public class TopicBreakdown extends javax.swing.JFrame {

    private ArrayList<Question> questions;
    private ArrayList<Topic> topics;
    private ArrayList<Question> uniqueQuestions; //declares variables
    private int questionIndex;
    private int questionIndex1;

    /**
     * Creates new form TopicBreakdown
     */
    public TopicBreakdown() {
        questions = DatabaseManipulation.studentQuestions(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject());
        questionIndex = 0;
        questionIndex1 = 0; //initialises variables
        topics = new ArrayList<>();
        uniqueQuestions = new ArrayList<>();
        for (int i = 0; i < questions.size(); i++) {
            if ((GradePredictorPrototype.contains(topics, questions.get(i).getTopic()) == -1)) {
                topics.add(questions.get(i).getTopic());
            } //gets all unique topics and questions 
            if (!(GradePredictorPrototype.contains(uniqueQuestions, questions.get(i)))) {
                uniqueQuestions.add(questions.get(i));
            }
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

        topicsBox = new javax.swing.JComboBox<>();
        titleLbl = new javax.swing.JLabel();
        testedLbl = new javax.swing.JLabel();
        marksLbl = new javax.swing.JLabel();
        meanMarksLbl = new javax.swing.JLabel();
        overallLbl = new javax.swing.JLabel();
        meanLbl = new javax.swing.JLabel();
        gradeLbl = new javax.swing.JLabel();
        leftBtn = new javax.swing.JButton();
        questionLbl = new javax.swing.JLabel();
        rightBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        leftBtn1 = new javax.swing.JButton();
        rightBtn1 = new javax.swing.JButton();
        topicsBox1 = new javax.swing.JComboBox<>();
        testedLbl1 = new javax.swing.JLabel();
        marksLbl1 = new javax.swing.JLabel();
        meanMarksLbl1 = new javax.swing.JLabel();
        overallLbl1 = new javax.swing.JLabel();
        meanLbl1 = new javax.swing.JLabel();
        gradeLbl1 = new javax.swing.JLabel();
        questionLbl1 = new javax.swing.JLabel();
        classBtn = new javax.swing.JButton();
        classBtn.setVisible(GradePredictorPrototype.getViewing());
        menuBar = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        topicsBox.setModel(new javax.swing.DefaultComboBoxModel<>(topics.stream().map(x -> x.getTopic()).toArray(String[]::new)));
        topicsBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                topicsBoxItemStateChanged(evt);
            }
        });
        topicsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicsBoxActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLbl.setText("Topic Overview");

        setLabels();

        leftBtn.setText("<");
        leftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtnActionPerformed(evt);
            }
        });

        rightBtn.setText(">");
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        profileBtn.setText("Return to Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        subjectBtn.setText("Return to Subject");
        subjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBtnActionPerformed(evt);
            }
        });

        leftBtn1.setText("<");
        leftBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtn1ActionPerformed(evt);
            }
        });

        rightBtn1.setText(">");
        rightBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtn1ActionPerformed(evt);
            }
        });

        topicsBox1.setModel(new javax.swing.DefaultComboBoxModel<>(topics.stream().map(x -> x.getTopic()).toArray(String[]::new)));
        topicsBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                topicsBox1ItemStateChanged(evt);
            }
        });
        topicsBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicsBox1ActionPerformed(evt);
            }
        });

        setLabels1();

        classBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        classBtn.setText("Return to Class");
        classBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classBtnActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(titleLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(topicsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(marksLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(testedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(meanMarksLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(overallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(meanLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gradeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(questionLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(testedLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(marksLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(meanMarksLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(overallLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(meanLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gradeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(topicsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 116, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(leftBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addComponent(classBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(topicsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(testedLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(marksLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meanMarksLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(overallLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meanLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gradeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topicsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marksLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meanMarksLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(overallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meanLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(gradeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(questionLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leftBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(leftBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topicsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topicsBoxActionPerformed

    private void leftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtnActionPerformed
        // TODO add your handling code here:
        int prior = questionIndex;//sets initial question index
        if (questionIndex > 0) {//does not allow index to be negative 
            questionIndex--;//decrements index
            while(!(uniqueQuestions.get(questionIndex).getTopic().equals(topics.get(topicsBox.getSelectedIndex()))) && questionIndex > 0) {
                questionIndex--;//only shows question for the selected topic
            }
            if(uniqueQuestions.get(questionIndex).getTopic().equals(topics.get(topicsBox.getSelectedIndex()))) {
                questionLbl.setIcon(uniqueQuestions.get(questionIndex).getQuestion());//updates image if changed
            } else{
                questionIndex = prior;//resets index if not earlier questions existed
            }
        }
    }//GEN-LAST:event_leftBtnActionPerformed

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed
        int prior = questionIndex;//sets initial question index
        if (questionIndex < uniqueQuestions.size() - 1) {//does not let index be larger than the number of questions
            questionIndex++;//increments index
            while(!(uniqueQuestions.get(questionIndex).getTopic().equals(topics.get(topicsBox.getSelectedIndex()))) && questionIndex < uniqueQuestions.size() - 1) {
                questionIndex++;//only shows questions for selected topic
            }
            if(uniqueQuestions.get(questionIndex).getTopic().equals(topics.get(topicsBox.getSelectedIndex()))) {
                questionLbl.setIcon(uniqueQuestions.get(questionIndex).getQuestion());//updates image if changed
            } else {
                questionIndex = prior;//resets index if no later questions existed
            }
            
        }
    }//GEN-LAST:event_rightBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        new StudentProfile().setVisible(true); //returns to profile form
        this.dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed
        new StudentSubject().setVisible(true); //returns to the subject form
        this.dispose();
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void topicsBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_topicsBoxItemStateChanged
        setLabels();//sets labels for the left topic
    }//GEN-LAST:event_topicsBoxItemStateChanged

    private void leftBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtn1ActionPerformed
        int prior = questionIndex1;//performs the same as leftBtnActionPerformed except on duplicate components allowing for comparision between topics
        if (questionIndex1 > 0) {
            questionIndex1--;
            while(!(uniqueQuestions.get(questionIndex1).getTopic().equals(topics.get(topicsBox1.getSelectedIndex()))) && questionIndex1 > 0) {
                questionIndex1--;
            }
            if(uniqueQuestions.get(questionIndex1).getTopic().equals(topics.get(topicsBox1.getSelectedIndex()))) {
                questionLbl1.setIcon(uniqueQuestions.get(questionIndex1).getQuestion());
            } else{
                questionIndex1 = prior;
            }
        }
    }//GEN-LAST:event_leftBtn1ActionPerformed

    private void rightBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtn1ActionPerformed
        int prior = questionIndex1; //performs the same as rightBtnActionPerformed except on duplicate components allowing for comparision between topics
        if (questionIndex1 < uniqueQuestions.size() - 1) {
            questionIndex1++;
            while(!(uniqueQuestions.get(questionIndex1).getTopic().equals(topics.get(topicsBox1.getSelectedIndex()))) && questionIndex1 < uniqueQuestions.size() - 1) {
                questionIndex1++;
            }
            if(uniqueQuestions.get(questionIndex1).getTopic().equals(topics.get(topicsBox1.getSelectedIndex()))) {
                questionLbl1.setIcon(uniqueQuestions.get(questionIndex1).getQuestion());
            } else {
                questionIndex1 = prior;
            }
            
        }
    }//GEN-LAST:event_rightBtn1ActionPerformed

    private void topicsBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_topicsBox1ItemStateChanged
        setLabels1();//sets labels for the right topic
    }//GEN-LAST:event_topicsBox1ItemStateChanged

    private void topicsBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicsBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topicsBox1ActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true); //returns to login form
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0); //closes application
    }//GEN-LAST:event_exitMouseClicked

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        if (GradePredictorPrototype.getViewing()) { //if a teacher is viewing the student
            new Classes().setVisible(true); //allows them to return to classes
            this.dispose();
        }
    }//GEN-LAST:event_classBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TopicBreakdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopicBreakdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopicBreakdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopicBreakdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopicBreakdown().setVisible(true);
            }
        });
    }

    public void setLabels() {
        int count = 0;
        int score = 0;
        int marks = 0;
        double percentage = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getTopic().equals(topics.get(topicsBox.getSelectedIndex()))) {
                count++;
                marks += questions.get(i).getMark();
                score += questions.get(i).getScore();
                percentage += (double) questions.get(i).getScore() / questions.get(i).getMark();
            }
        }
        testedLbl.setText("Times tested: " + count);
        marksLbl.setText("Marks tested: " + marks);
        meanMarksLbl.setText("Mean marks per question: " + (marks / count));
        overallLbl.setText("Overall percentage: " + (int) (100 * ((double) score / marks)) + "%");
        meanLbl.setText("Mean percentage: " + (int) (100 * percentage / count) + "%");
        gradeLbl.setText("Topic Grade: " + GradePredictorPrototype.grade(percentage / count));
        questionIndex = 0;
        while(!(uniqueQuestions.get(questionIndex).getTopic().equals(topics.get(topicsBox.getSelectedIndex()))) && questionIndex < uniqueQuestions.size() - 1) {
            questionIndex++;
        }
        if(!(uniqueQuestions.get(questionIndex).getTopic().equals(topics.get(topicsBox.getSelectedIndex())))) {
            questionLbl.setText("Question not found");
        } else {
            questionLbl.setIcon(uniqueQuestions.get(questionIndex).getQuestion());
        }
    }
    public void setLabels1() {
        int count = 0;
        int score = 0;
        int marks = 0;
        double percentage = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getTopic().equals(topics.get(topicsBox1.getSelectedIndex()))) {
                count++;
                marks += questions.get(i).getMark();
                score += questions.get(i).getScore();
                percentage += (double) questions.get(i).getScore() / questions.get(i).getMark();
            }
        }
        testedLbl1.setText("Times tested: " + count);
        marksLbl1.setText("Marks tested: " + marks);
        meanMarksLbl1.setText("Mean marks per question: " + (marks / count));
        overallLbl1.setText("Overall percentage: " + (int) (100 * ((double) score / marks)) + "%");
        meanLbl1.setText("Mean percentage: " + (int) (100 * percentage / count) + "%");
        gradeLbl1.setText("Topic Grade: " + GradePredictorPrototype.grade(percentage / count));
        questionIndex1 = 0;
        while(!(uniqueQuestions.get(questionIndex1).getTopic().equals(topics.get(topicsBox1.getSelectedIndex()))) && questionIndex1 < uniqueQuestions.size() - 1) {
            questionIndex1++;
        }
        if(!(uniqueQuestions.get(questionIndex1).getTopic().equals(topics.get(topicsBox1.getSelectedIndex())))) {
            questionLbl1.setText("Question not found");
        } else {
            questionLbl1.setIcon(uniqueQuestions.get(questionIndex1).getQuestion());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classBtn;
    private javax.swing.JMenu exit;
    private javax.swing.JLabel gradeLbl;
    private javax.swing.JLabel gradeLbl1;
    private javax.swing.JButton leftBtn;
    private javax.swing.JButton leftBtn1;
    private javax.swing.JMenu logout;
    private javax.swing.JLabel marksLbl;
    private javax.swing.JLabel marksLbl1;
    private javax.swing.JLabel meanLbl;
    private javax.swing.JLabel meanLbl1;
    private javax.swing.JLabel meanMarksLbl;
    private javax.swing.JLabel meanMarksLbl1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel overallLbl;
    private javax.swing.JLabel overallLbl1;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JLabel questionLbl1;
    private javax.swing.JButton rightBtn;
    private javax.swing.JButton rightBtn1;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JLabel testedLbl;
    private javax.swing.JLabel testedLbl1;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JComboBox<String> topicsBox;
    private javax.swing.JComboBox<String> topicsBox1;
    // End of variables declaration//GEN-END:variables
}
