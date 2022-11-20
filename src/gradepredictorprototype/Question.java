/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Question {
    private int maxMark = 0;
    private String question;
    private Topic topic;
    private int score = 0;
    private int QuestionID;
    public Question(int max, String question, String topic) {
        this.topic = DatabaseManipulation.topicFromTopic(topic);
        maxMark = max;
        this.question = question;
    }
    public Question(int ID,int max, String question, Topic topic) {
        this.topic = topic;
        this.QuestionID = ID;
        maxMark = max;
        this.question = question;
    }
    public Question(int ID, int max, int score, String question, Topic topic) {
        this.topic = topic;
        this.QuestionID = ID;
        this.score = score;
        maxMark = max;
        this.question = question;
    }
    public int getMark() {
        return maxMark;
    }
    public String getQuestion() {
        return question;
    }
    public Topic getTopic() {
        return topic;
    }
    public void setScore(int mark) {
        score = mark;
    }
    public int getScore() {
        return score;
    }
    public int getID() {
        return QuestionID;
    }
    public boolean equals(Question question) {
        return this.QuestionID == question.getID();
    }
} 
