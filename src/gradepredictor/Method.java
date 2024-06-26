/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictor;

/**
 *
 * @author kingt
 */
public class Method {
    private String name;
    private String description;//declares variables
    private double performance;
    public Method(String name, String description) {
        this.name = name;//initialises variables
        this.description = description;
        this.performance = (DatabaseManipulation.getFormalPerformance(GradePredictor.getSubject(), this) + DatabaseManipulation.getInformalPerformance(GradePredictor.getSubject(), this) + DatabaseManipulation.getGradePerformance(GradePredictor.getSubject(), this)) / 3; //performance is the average of the 3 types of performances 
    }
    public String getName() {
        return name;//returns method name
    }
    public double getPerformance() {
        return performance;//returns performance
    }
    public String getDesc() {
        return description;//returns description
    }
}
