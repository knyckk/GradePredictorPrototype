/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictor;

/**
 *
 * @author kingt
 */
public class Classroom {
    private String classname;
    private String studentCode;
    private String teacherCode; // declare variables
    private Subject subject;
    public Classroom(String classname, String studentCode, String teacherCode, Subject subject) {
        this.classname = classname;
        this.studentCode = studentCode; // initialise variables
        this.teacherCode = teacherCode;
        this.subject = subject;
    }
    public boolean studentCodeExists(String code) {//method to check student code is equal to inputed code
        boolean toReturn = false;//sets default output to false
        if(studentCode.equals(code)) {
            toReturn = true;//returns  true if  they match
        }
        return toReturn;
    }
    public boolean teacherCodeExists(String code) {//the same method as studentCodeExists except for teacher codes
        boolean toReturn = false;
        if(teacherCode.equals(code)) {
            toReturn = true;
        }
        return toReturn;
    }
    public String getName() {
        return this.classname;//returns class name
    }
    public Subject getSubject() {
        return this.subject;//returns subject class is a part of
    }
    public String getStudentCode() {
        return studentCode;//returns student code
    }
    public String getTeacherCode() {
        return teacherCode;//returns teacher code
    }
}
