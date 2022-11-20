/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Classroom {
    private String classname;
    private String studentCode;
    private String teacherCode;
    private Subject subject;
    public Classroom(String classname, String studentCode, String teacherCode, Subject subject) {
        this.classname = classname;
        this.studentCode = studentCode;
        this.teacherCode = teacherCode;
        this.subject = subject;
    }
    public boolean studentCodeExists(String code) {
        boolean toReturn = false;
        if(studentCode.equals(code)) {
            toReturn = true;
        }
        return toReturn;
    }
    public boolean teacherCodeExists(String code) {
        boolean toReturn = false;
        if(teacherCode.equals(code)) {
            toReturn = true;
        }
        return toReturn;
    }
    public String getName() {
        return this.classname;
    }
    public Subject getSubject() {
        return this.subject;
    }
    public String getStudentCode() {
        return studentCode;
    }
    public String getTeacherCode() {
        return teacherCode;
    }
}
