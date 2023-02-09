/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradepredictorprototype;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;//library imports
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author kingt
 */
public class GradePredictorPrototype {

    private static User teacher;
    private static Student student;
    private static Subject subject;
    private static double[] averageBoundaries;//declares variables
    private static int type;
    private static boolean viewing = false;//not viewing by default

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    UIManager.put("control", new Color(53, 53, 53));
                    UIManager.put("nimbusLightBackground", new Color(70, 70, 70));
                    UIManager.put("info", new Color(70, 70, 70));
                    UIManager.put("nimbusAlertYellow", new Color(0, 255, 255));
                    UIManager.put("nimbusBase", new Color(40, 40, 40));
                    UIManager.put("nimbusDisabledText", new Color(255, 0, 255));
                    UIManager.put("nimbusFocus", new Color(210, 210, 210));
                    UIManager.put("nimbusGreen", new Color(0, 255, 0));//sets look and feel of application
                    UIManager.put("nimbusInfoBlue", new Color(110, 110, 110));
                    UIManager.put("nimbusOrange", new Color(81, 83, 255));
                    UIManager.put("nimbusRed", new Color(255, 100, 255));
                    UIManager.put("nimbusSelectedText", new Color(200, 200, 200));
                    UIManager.put("nimbusSelectionBackground", new Color(110, 110, 110));
                    UIManager.put("Button.background", new Color(110, 110, 110));
                    UIManager.put("font", new Font("Arial", Font.PLAIN, 12));
                    UIManager.put("text", new Color(255, 255, 255));
                    UIManager.getDefaults().put("TextField.border", BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    UIManager.getDefaults().put("TextField.foreground", new Color(255, 255, 255));
                    UIManager.getDefaults().put("TextField.background", new Color(53, 53, 53));

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Error: " + ex);
        }
        new Login().setVisible(true);//opens login form

    }

    public static void setTeacher(String email) {
        teacher = DatabaseManipulation.teacherFromEmail(email);//sets teacher from a teacher's email
    }

    public static void setTeacher(User user) {//sets teacher from a user instance
        teacher = new User(user.getEmail(), user.getPassword(),0, user.getUsername(), user.getName(), user.getIcon());
    }

    public static void setStudent(User user) {//sets student from a user instance
        student = new Student(user.getEmail(), user.getPassword(), user.getUsername(), user.getName(), user.getIcon());
    }

    public static void setStudentIcon(int newIcon) {
        student.setIcon(newIcon);//sets a students Icon
    }

    public static void setTeacherIcon(int newIcon) {
        teacher.setIcon(newIcon);//sets a teacher's Icon
    }

    public static void setStudent(String email) {
        student = DatabaseManipulation.studentFromEmail(email);//sets student from a student's email
    }

    public static void setSubject(int ID, String name) {
        subject = new Subject(ID, name);//sets subject from Id and name
    }

    public static User getTeacher() {
        return teacher;//returns the teacher
    }

    public static void setViewing(boolean view) {
        viewing = view;//sets viewing true or false
    }

    public static void setNames(String username, String name, int type) {//sets a name and username for a user
        if (type == 0) {
            teacher.setNames(username, name);//sets teacher names
        } else if (type == 1) {
            student.setNames(username, name);//sets student names
        }
    }

    public static User getUser() {//gets the current user
        User toReturn = new User("", "", 1);
        if (type == 0) {
            toReturn = teacher;//returns teacher if teacher is current user
        } else if (type == 1) {
            toReturn = student;///returns student if student is current user
        }
        return toReturn;
    }

    public static void setType(int input) {
        type = input;//sets what current user type is
    }

    public static Student getStudent() {
        return student;//gets current student
    }

    public static Subject getSubject() {
        return subject;//gets current subject
    }

    public static boolean getViewing() {
        return viewing;//gets if a teacher is viewing a student's forms
    }

    public static String getCode() {//a method to get a random code
        String code;//code returned will be in form l0lU00U
        Random random = new Random();//creates a random number generator
        code = Character.toString((char) (random.nextInt(26) + 65))//creates a random lower case letter
                + random.nextInt(10)//creates a random digit
                + Character.toString((char) (random.nextInt(26) + 65))//creates a random lower case letter
                + Character.toString((char) (random.nextInt(26) + 97))//creates a random upper case letter
                + random.nextInt(10)//creates a random digit
                + random.nextInt(10)//creates a random digit
                + Character.toString((char) (random.nextInt(26) + 97));//creates a random upper case letter
        return code;//returns code
    }

    public static int contains(ArrayList<Topic> topics, Topic topic) { //list of topics will not neccesarily be sorted so need to use a linear search
        int toReturn = -1;//returns index of topic that is looked for
        int i = 0;
        boolean found = false;//sets to false by default, assumes topic is not in list
        while (i < topics.size() && !found) {//iterates over list until topic is found or end of list reached
            found = topics.get(i).equals(topic);//if topic is found
            if (found) {
                toReturn = i;//stores index topic was found at
            }
            i++;
        }
        return toReturn;//returns index if found or -1 if not found
    }

    public static boolean contains(ArrayList<Question> questions, Question question) { //list of questions will not neccesarily be sorted so need to use a linear search
        int i = 0;
        boolean found = false;//assumes list does not contain question by default
        while (i < questions.size() && !found) {//iterates over list until question found or end of list reached
            found = questions.get(i).equals(question);//stores if question is found
            i++;
        }
        return found;//outputs if topic is found
    }

    public static void setBoundaries(Subject subject) {//sets average grade boundaries for a subject
        ArrayList<Paper> papers = DatabaseManipulation.getPapers(subject);//gets all papers for the subject
        double Astar = 0;
        double A = 0;
        double B = 0;//declare and initialise variables
        double C = 0;
        double D = 0;
        double E = 0;
        int size = papers.size();
        for (int i = 0; i < papers.size(); i++) {//iterates over every paper
            int boundaries[] = papers.get(i).getBoundaries();
            int mark = papers.get(i).getMax();
            Astar += (double) boundaries[0] / mark;
            A += (double) boundaries[1] / mark;
            B += (double) boundaries[2] / mark;//totals grade boundaries as percentages
            C += (double) boundaries[3] / mark;
            D += (double) boundaries[4] / mark;
            E += (double) boundaries[5] / mark;
        }
        averageBoundaries = new double[]{Astar / size, A / size, B / size, C / size, D / size, E / size};//sets average grade boundaries

    }

    public static void top3Methods(ArrayList<Method> methods, int low, int high) {//recursive quick sort to sort revision methods
        double pivot = methods.get((low + high) / 2).getPerformance();//sets pivot to be middle revision method performance
        Method tmpswap;
        int tmplow = low;//declare and initialise variables
        int tmphigh = high;
        while (tmplow <= tmphigh) {//until the low index has become greater than the high index
            while (methods.get(tmplow).getPerformance() < pivot && tmplow < high) {//finds a method before the pivot that has performance greater than the pivot
                tmplow++;
            }
            while (methods.get(tmphigh).getPerformance() > pivot && tmphigh > low) {//finds a method after the pivot that should be before the pivot
                tmphigh--;
            }
            if (tmplow <= tmphigh) {
                tmpswap = methods.get(tmplow);
                methods.set(tmplow, methods.get(tmphigh));
                methods.set(tmphigh, tmpswap);
                tmplow++;
                tmphigh--;
            }
        }
        if (low < tmphigh) {
            top3Methods(methods, low, tmphigh);
        }
        if (high > tmplow) {
            top3Methods(methods, tmplow, high);
        }
    }

    public static void top3Topics(ArrayList<Topic> topics, int low, int high) {
        double pivot = topics.get((low + high) / 2).getOverall();
        Topic tmpswap;
        int tmplow = low;
        int tmphigh = high;
        while (tmplow <= tmphigh) {
            while (topics.get(tmplow).getOverall() < pivot && tmplow < high) {
                tmplow++;
            }
            while (topics.get(tmphigh).getOverall() > pivot && tmphigh > low) {
                tmphigh--;
            }
            if (tmplow <= tmphigh) {
                tmpswap = topics.get(tmplow);
                topics.set(tmplow, topics.get(tmphigh));
                topics.set(tmphigh, tmpswap);
                tmplow++;
                tmphigh--;
            }
        }
        if (low < tmphigh) {
            top3Topics(topics, low, tmphigh);
        }
        if (high > tmplow) {
            top3Topics(topics, tmplow, high);
        }
    }

    public static String getTrend() {
        ArrayList<Double[]> coordinates = DatabaseManipulation.getPercentages(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject(), new Date(student.getDate()));
        double sigmaX = 0;
        double sigmaY = 0;
        double sigmaXY = 0;
        double sigmaXSquared = 0;
        for (int i = 0; i < coordinates.size() - 1; i++) {
            double y1 = coordinates.get(i)[0];
            double x1 = coordinates.get(i)[1];
            sigmaX += x1;
            sigmaXSquared += x1 * x1;
            sigmaY += y1;
            sigmaXY += x1 * y1;
        }
        double constant = (sigmaY * sigmaXSquared - sigmaX * sigmaXY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX * sigmaX);
        double gradient = ((coordinates.size() - 1) * sigmaXY - sigmaX * sigmaY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX * sigmaX);
        double finalX = coordinates.get(coordinates.size() - 1)[0];
        double finalY = (gradient * finalX) + constant;
        DatabaseManipulation.updatePredicted(grade(finalY), student.getEmail() + subject.getID());
        return "Based on Trend: " + String.valueOf(100 * finalY).substring(0, 4) + "% - " + grade(finalY);
    }

    public static String getAverage() {
        ArrayList<Double[]> coordinates = DatabaseManipulation.getPercentages(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject(), new Date(student.getDate()));
        double total = 0;
        for (int i = 0; i < coordinates.size() - 1; i++) {
            total += coordinates.get(i)[0];
        }

        return "Based on Average: " + String.valueOf((100 * total / (coordinates.size() - 1))).substring(0, 4) + "% - " + grade(total / (coordinates.size() - 1));
    }

    public static String grade(double grade) {
        if (grade >= averageBoundaries[0]) {
            return "A*";
        } else if (grade >= averageBoundaries[1]) {
            return "A";
        } else if (grade >= averageBoundaries[2]) {
            return "B";
        } else if (grade >= averageBoundaries[3]) {
            return "C";
        } else if (grade >= averageBoundaries[4]) {
            return "D";
        } else if (grade >= averageBoundaries[5]) {
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
            case -1:
                return averageBoundaries[5] / 1;
            case -2:
                return averageBoundaries[5] / 2;
            case -3:
                return averageBoundaries[5] / 3;
            case -4:
                return averageBoundaries[5] / 4;
            case -5:
                return averageBoundaries[5] / 5;
            default:
                return averageBoundaries[5] / 6;
        }
    }

    public static String grade(int grade, int[] boundaries) {

        if (grade >= boundaries[0]) {
            return "A*";
        } else if (grade >= boundaries[1]) {
            return "A";
        } else if (grade >= boundaries[2]) {
            return "B";
        } else if (grade >= boundaries[3]) {
            return "C";
        } else if (grade >= boundaries[4]) {
            return "D";
        } else if (grade >= boundaries[5]) {
            return "E";
        }
        return "fail";
    }

    public static int gradeToInt(String grade) {
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

    public static ImageIcon getImageFromClipboard() {
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = cb.getContents(null);
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.imageFlavor)) {
            try {
                return new ImageIcon((Image) transferable.getTransferData(DataFlavor.imageFlavor));
            } catch (UnsupportedFlavorException | IOException e) {
                System.out.println("Error: " + e);
            }

        }
        return null;
    }

    public static ByteArrayInputStream imageToBinary(ImageIcon img) {
        try {
            BufferedImage sourceImage = new BufferedImage(
                    img.getIconWidth(),
                    img.getIconHeight(),
                    BufferedImage.TYPE_INT_RGB);
            Graphics g = sourceImage.createGraphics();
            img.paintIcon(null, g, 0, 0);
            g.dispose();

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(sourceImage, "jpg", outputStream);
            ByteArrayInputStream toReturn = new ByteArrayInputStream(outputStream.toByteArray());
            return toReturn;
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
}
