/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradepredictorprototype;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.UIManager;

/**
 *
 * @author kingt
 */
public class GradePredictorPrototype {
    private static Teacher teacher = new Teacher("clees@bayhouse.gfmat.org", "1234");
    private static Student student = new Student("1-thope@bayhouse.gfmat.org" , "BH147685!");
    private static Subject subject = new Subject(1, "Mathematics");
    private static double[] averageBoundaries = new double[] {0.74, 0.63, 0.54, 0.47, 0.40, 0.31};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    
                    UIManager.put("nimbusBase", new Color(130,130,130));
                    UIManager.put("nimbusBlueGrey", new Color(130,130,130));
                    UIManager.put("control", new Color(53,53,53)); 
                    UIManager.getDefaults().put("TextField.border", BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    UIManager.getDefaults().put("TextField.foreground", new Color(255,255,255));
                    UIManager.getDefaults().put("Label.foreground", new Color(255,255,255));
                    UIManager.getDefaults().put("TextField.background", new Color(53,53,53));
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }
        new StudentProfile().setVisible(true);
        new SignUp().setVisible(true);
    }
    public static void setTeacher(String email) {
        teacher = DatabaseManipulation.teacherFromEmail(email);
    }
    public static void setStudent(String email) {
        student = DatabaseManipulation.studentFromEmail(email);
    }
    public static void setSubject(int ID, String name) {
        subject = new Subject(ID, name);
    }
    public static Teacher getTeacher() {
        return teacher;
    }
    public static Student getStudent() {
        return student;
    }
    public static Subject getSubject() {
        return subject;
    }
    public static String getCode() {
        String code;
        Random random = new Random();
        code = Character.toString((char) (random.nextInt(26) + 65))
                + random.nextInt(10)
                + Character.toString((char) (random.nextInt(26) + 65))
                + Character.toString((char) (random.nextInt(26) + 97))
                + random.nextInt(10)
                + random.nextInt(10)
                + Character.toString((char) (random.nextInt(26) + 97));
        return code;
    }
    public static int contains(ArrayList<Topic> topics, Topic topic) { //list of topics will not neccesarily be sorted so need to use a linear search
        int toReturn = -1;
        int i = 0;
        boolean found = false;
        while(i<topics.size() && !found) {
            found = topics.get(i).equals(topic);
            if(found) {
                toReturn = i;
            }
            i++;
        }
        return toReturn;
    }
    public static boolean contains(ArrayList<Question> questions, Question question) { //list of topics will not neccesarily be sorted so need to use a linear search
        int i = 0;
        boolean found = false;
        while(i<questions.size() && !found) {
            found = questions.get(i).equals(question);
            i++;
        }
        return found;
    }
    public static void setBoundaries(Subject subject) {
        ArrayList<Paper> papers = DatabaseManipulation.getPapers(subject);
        double Astar = 0;
        double A = 0;
        double B = 0;
        double C = 0;
        double D = 0;
        double E = 0;
        int size = papers.size();
        for(int i = 0;i<papers.size(); i++) {
            int boundaries[] = papers.get(i).getBoundaries();
            int mark = papers.get(i).getMax();
            Astar += (double) boundaries[0] / mark;
            A += (double) boundaries[1] / mark;
            B += (double) boundaries[2] / mark;
            C += (double) boundaries[3] / mark;
            D += (double) boundaries[4] / mark;
            E += (double) boundaries[5] / mark;
        }
        averageBoundaries = new double[] {Astar/size, A/size, B/size, C/size, D/size, E/size};
                
    }
    public static void top3Methods(ArrayList<Method> methods, int low, int high) {
        double pivot = methods.get((low + high)/2).getPerformance();
        Method tmpswap;
        int tmplow = low;
        int tmphigh = high;
        while(tmplow <= tmphigh) {
            while(methods.get(tmplow).getPerformance() < pivot && tmplow < high) {
                tmplow++;
            } while(methods.get(tmphigh).getPerformance() > pivot && tmphigh > low) {
                tmphigh--;
            }
            if(tmplow <= tmphigh) {
                tmpswap = methods.get(tmplow);
                methods.set(tmplow, methods.get(tmphigh));                
                methods.set(tmphigh, tmpswap);
                tmplow++;
                tmphigh--;
            }
        }
        if(low < tmphigh) {
            top3Methods(methods, low, tmphigh);
        }
        if(high > tmplow) {
            top3Methods(methods, tmplow, high);
        }
    }
    public static void top3Topics(ArrayList<Topic> topics, int low, int high) {
        double pivot = topics.get((low + high)/2).getOverall();
        Topic tmpswap;
        int tmplow = low;
        int tmphigh = high;
        while(tmplow <= tmphigh) {
            while(topics.get(tmplow).getOverall() < pivot && tmplow < high) {
                tmplow++;
            } while(topics.get(tmphigh).getOverall() > pivot && tmphigh > low) {
                tmphigh--;
            }
            if(tmplow <= tmphigh) {
                tmpswap = topics.get(tmplow);
                topics.set(tmplow, topics.get(tmphigh));                
                topics.set(tmphigh, tmpswap);
                tmplow++;
                tmphigh--;
            }
        }
        if(low < tmphigh) {
            top3Topics(topics, low, tmphigh);
        }
        if(high > tmplow) {
            top3Topics(topics, tmplow, high);
        }
    }
    
    public static String getTrend() {
        ArrayList<Double[]> coordinates = DatabaseManipulation.getPercentages(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject(), new Date(student.getDate()));
        double sigmaX = 0;
        double sigmaY = 0;
        double sigmaXY = 0;
        double sigmaXSquared = 0;
        for(int i=0;i<coordinates.size() - 1;i++){
            double y1= coordinates.get(i)[0];
            double x1= coordinates.get(i)[1];
            sigmaX += x1;
            sigmaXSquared += x1*x1;
            sigmaY += y1;
            sigmaXY += x1 * y1;
        }
        double constant = (sigmaY * sigmaXSquared - sigmaX * sigmaXY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX * sigmaX);
        double gradient = ((coordinates.size() - 1) * sigmaXY - sigmaX * sigmaY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX*sigmaX);
        double finalX = coordinates.get(coordinates.size() - 1)[0];
        double finalY = (gradient*finalX) + constant;
        DatabaseManipulation.updatePredicted(grade(finalY), student.getEmail() + subject.getID());
        return "Based on Trend: " + String.valueOf(100*finalY).substring(0,4) + "% - " + grade(finalY);
    }
    public static String getAverage() {
        ArrayList<Double[]> coordinates = DatabaseManipulation.getPercentages(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject(), new Date(student.getDate()));
        double total = 0;
        for(int i=0;i<coordinates.size() - 1;i++){
            total+=coordinates.get(i)[0];
        }
        
        return "Based on Average: " + String.valueOf((100*total/(coordinates.size()-1))).substring(0,4) + "% - " + grade(total/(coordinates.size()-1));
    }
    public static String grade(double grade) {
        if(grade >= averageBoundaries[0]) {
           return "A*";
        } else if(grade >= averageBoundaries[1]) {
            return "A";
        } else if(grade >= averageBoundaries[2]) {
            return "B";
        } else if(grade >= averageBoundaries[3]) {
            return "C";
        } else if(grade >= averageBoundaries[4]) {
            return "D";
        } else if(grade >= averageBoundaries[5]) {
            return "E";
        }
        return "fail";
    }
    public static double ungrade(int grade) {
        switch (grade) {
            case 0:
                return averageBoundaries[5];
            case 1:
                return averageBoundaries[4];
            case 2:
                return averageBoundaries[3];
            case 3:
                return averageBoundaries[2];
            case 4:
                return averageBoundaries[1];
            case 5:
                return averageBoundaries[0];
            default:
                return averageBoundaries[5] / 2;
        }
    }
    public static String grade(int grade, int[] boundaries) {
        
        if(grade >= boundaries[0]) {
           return "A*";
        } else if(grade >= boundaries[1]) {
            return "A";
        } else if(grade >= boundaries[2]) {
            return "B";
        } else if(grade >= boundaries[3]) {
            return "C";
        } else if(grade >= boundaries[4]) {
            return "D";
        } else if(grade >= boundaries[5]) {
            return "E";
        }
        return "fail";
    }
    public static int gradeToInt(String grade){
        switch (grade) {
            case "A*":
                return 5;
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            default:
                return 0;
        }
    }
    
}
