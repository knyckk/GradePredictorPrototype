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
public class Paper {
    private Question[] questions;
    private int year;
    private int number;
    private int[] boundaries;//declare variables
    private int paperID;
    private int subjectID;
    private int maxMark;
    private int score;
    public Paper(int numOfQuestions, int year, int number, int AStar, int A, int B, int C, int D, int E) {//constructor for creating a new paper
        questions = new Question[numOfQuestions];
        this.year = year;
        this.number = number;//initialises variables
        boundaries = new int[] {AStar, A, B, C , D ,E};
        for(int i = 0; i<numOfQuestions;i++) {
            questions[i] = new Question(0,null,"topic");
        }
    }
    public Paper(Question[] questions, int ID, int year, int number, int AStar, int A, int B, int C, int D, int E, int subject, int max) {//constructor for creating an existing paper
        this.year = year;
        this.paperID = ID;
        this.number = number;
        boundaries = new int[] {AStar, A, B, C , D ,E};//initialise variables
        this.questions = questions;
        this.subjectID = subject;
        this.maxMark = max;
    }
    public void addQuestion(int index, Question question) {//method to add or change a question at an index
        score -= questions[index].getScore();//removes score for original question at index
        maxMark -= questions[index].getMark();//reduces paper mark
        questions[index] = question;//changes question
        score += questions[index].getScore();//sets new score and mark
        maxMark += questions[index].getMark();
    }
    public Question getQuestion(int index) {
        return questions[index];//returns question at index
    }
    public int numOfQuestions() {
        return questions.length;//returns number of questions in the paper
    }
    public int[] getBoundaries() {
        return boundaries;//returns paper boundaries
    }
    public int getYear() {
        return year; //returns paper year
    }
    public int getNum() {
        return number; //returns paper number
    }
    public Question[] getQuestions() {
        return questions; //returns questions
    }
    @Override
    public String toString() {
        return String.valueOf(year) + " Paper " + String.valueOf(number); //returns a string in form yyyy paper x
    }
    public void setSubject(int subject) {
        this.subjectID = subject;//sets subject paper is for as subjectID
    }
    public int getSubject() {
        return subjectID; //returns subjectID
    }
    public int getID() {
        return  paperID; //returns paper id
    }
    public int getMax() {
        return maxMark; //returns max possible marks in paper
    }
    public int getScore() {
        return score; //returns score achieved by student in paper
    }
    public void setQuestionScore(int questionIndex, int score) {
        this.score -= questions[questionIndex].getScore();//reduces score with old question score
        questions[questionIndex].setScore(score); //sets question new score
        this.score += score;//increases score with new question score
    }
}
