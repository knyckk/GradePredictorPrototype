/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictor;

import javax.swing.ImageIcon;

/**
 *
 * @author kingt
 */
public class Question {
    private int maxMark = 0;
    private ImageIcon question;//declares variables
    private Topic topic;
    private int score = 0;
    private int QuestionID;
    public Question(int max, ImageIcon question, String topic) {//constructor for creating a new question
        this.topic = DatabaseManipulation.topicFromTopic(topic,GradePredictor.getSubject());
        maxMark = max;//initialise variables
        this.question = question;
    }
    public Question(int ID,int max, ImageIcon question, Topic topic) {//constructor for loading an existing question as a teacher
        this.topic = topic;
        this.QuestionID = ID;
        maxMark = max;//initialise variables 
        this.question = question;
    }
    public Question(int ID, int max, int score, ImageIcon question, Topic topic) {//constructor for loading a question with a  score e.g. a students question
        this.topic = topic;
        this.QuestionID = ID;
        this.score = score;//initialise variables
        maxMark = max;
        this.question = question;
    }
    public int getMark() {
        return maxMark;//returns question max mark
    }
    public ImageIcon getQuestion() {
        return question;//returns question
    }
    public Topic getTopic() {
        return topic;//returns topic question is part of 
    }
    public void setScore(int mark) {
        score = mark;//sets question score
    }
    public int getScore() {
        return score;//gets question score
    }
    public int getID() {
        return QuestionID;//gets questionID
    }
    public boolean equals(Question question) {
        return this.QuestionID == question.getID();//compares 2 questions for equality
    }
    public boolean isNull() {
        return this.question == null;
    }
} 
