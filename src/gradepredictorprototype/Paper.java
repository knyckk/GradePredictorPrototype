/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

import javax.swing.ImageIcon;

/**
 *
 * @author kingt
 */
public class Paper {
    private Question[] questions;
    private int year;
    private int number;
    private int[] boundaries;
    private int PaperID;
    private int subjectID;
    private int maxMark;
    private int score;
    public Paper(int numOfQuestions, int year, int number, int AStar, int A, int B, int C, int D, int E) {
        questions = new Question[numOfQuestions];
        this.year = year;
        this.number = number;
        boundaries = new int[] {AStar, A, B, C , D ,E};
        for(int i = 0; i<numOfQuestions;i++) {
            questions[i] = new Question(0,new ImageIcon(),"topic");
        }
    }
    public Paper(Question[] questions, int ID, int year, int number, int AStar, int A, int B, int C, int D, int E, int subject, int max) {
        this.year = year;
        this.PaperID = ID;
        this.number = number;
        boundaries = new int[] {AStar, A, B, C , D ,E};
        this.questions = questions;
        this.subjectID = subject;
        this.maxMark = max;
    }
    public void addQuestion(int index, Question question) {
        score -= questions[index].getScore();
        maxMark -= questions[index].getMark();
        questions[index] = question;
        score += questions[index].getScore();
        maxMark += questions[index].getMark();
    }
    public Question getQuestion(int index) {
        return questions[index];
    }
    public int numOfQuestions() {
        return questions.length;
    }
    public int[] getBoundaries() {
        return boundaries;
    }
    public int getYear() {
        return year;
    }
    public int getNum() {
        return number;
    }
    public Question[] getQuestions() {
        return questions;
    }
    @Override
    public String toString() {
        return String.valueOf(year) + " Paper " + String.valueOf(number);
    }
    public void setSubject(int subject) {
        this.subjectID = subject;
    }
    public int getSubject() {
        return subjectID;
    }
    public int getID() {
        return  PaperID;
    }
    public int getMax() {
        return maxMark;
    }
    public int getScore() {
        return score;
    }
    public void setQuestionScore(int questionIndex, int score) {
        this.score -= questions[questionIndex].getScore();
        questions[questionIndex].setScore(score);
        this.score += score;
    }
}
