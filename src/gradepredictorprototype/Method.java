/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Method {
    private String name;
    private String description;
    private double performance;
    public Method(String name, String description) {
        this.name = name;
        this.description = description;
        this.performance = (DatabaseManipulation.getFormalPerformance(GradePredictorPrototype.getSubject(), this) + DatabaseManipulation.getInformalPerformance(GradePredictorPrototype.getSubject(), this) + DatabaseManipulation.getGradePerformance(GradePredictorPrototype.getSubject(), this)) / 3; 
    }
    public String getName() {
        return name;
    }
    public double getPerformance() {
        return performance;
    }
    public String getDesc() {
        return description;
    }
}
