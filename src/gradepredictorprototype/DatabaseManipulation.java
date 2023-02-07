/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepredictorprototype;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 1-thope
 */
public class DatabaseManipulation {

    private static final String DATABASENAME = "THope_test";
    private static final String DATABASEPASSWORD = "mKdvUEKPxX";
    private static final String URL = "jdbc:mysql://computing.gfmat.org:3306/" + DATABASENAME + "?user=THope&useSSL=true"; // final varible names are all caps    
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    private static final String TYPE = "type";
    private static final String ICON = "Icon";
    private static final String USERS = "Users";
    private static final String SUBJECTNAME = "SubjectName";
    private static final String SUBJECTID = "SubjectID";
    private static final String SUBJECTS = "Subjects";
    private static final String METHODS = "RevisionMethods";
    private static final String METHODNAME = "MethodName";
    private static final String DESCRIPTION = "Description";
    private static final String PAPERS = "Papers";
    private static final String PAPERID = "PaperID";
    private static final String DATE = "Date";
    private static final String PAPERNUM = "PaperNum";
    private static final String BOUNDARIES = "Boundaries";
    private static final String TOPICS = "Topics";
    private static final String TOPICID = "TopicID";
    private static final String TOPIC = "Topic";
    private static final String BOUNDARYID = "BoundariesID";
    private static final String ASTAR = "AStar";
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final String D = "D";
    private static final String E = "E";
    private static final String QUESTIONS = "Questions";
    private static final String QUESTIONID = "QuestionID";
    private static final String QUESTION = "Question";
    private static final String MAXMARK = "MaxMark";
    private static final String STUDENTCODE = "StudCode";
    private static final String TEACHERCODE = "TeacherCode";
    private static final String CLASSES = "Classes";
    private static final String CLASSID = "ClassID";
    private static final String CLASSNAME = "ClassName";
    private static final String CLASSUSERS = "ClassUsers";
    private static final String CLASSUSERID = "ClassUserID";
    private static final String STUDENTSUB = "StudentSub";
    private static final String STUDENTSUBID = "StudentSubID";
    private static final String PREDICTEDGRADE = "PredictedGrade";
    private static final String TARGETGRADE = "TargetGrade";
    private static final String FINALGRADE = "FinalGrade";
    private static final String STUDENTFORMAL = "StudFormalPaper";
    private static final String STUDENTINFORMAL = "StudInformalPaper";
    private static final String STUDENTQUESTION = "StudQuestion";
    private static final String MARK = "Mark";
    private static final String STUDENTFORMALID = "StudPaperID";
    private static final String SCORE = "Score";
    private static final String USERNAME = "UserName";
    private static final String NAME = "Name";

    public static void signUp(String email, String password, int type) {
        boolean willAdd = true;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + EMAIL + " FROM " + USERS)) {
                while (result.next()) {
                    if (result.getString(EMAIL).equals(email)) {
                        willAdd = false;
                    }
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {
                statement.execute("INSERT INTO " + USERS + "(" + EMAIL + "," + PASSWORD + "," + TYPE + "," + ICON + "," + USERNAME + "," + NAME
                        + ") \n VALUES('" + email + "','" + password + "'," + type + ",0,'" + email.split("@")[0] + "','" + email.split("@")[0] + "')");
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void aboutYou(String name, String username, User user) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {

            statement.execute("UPDATE " + USERS + " SET " + USERNAME + " = '" + username + "', " + NAME + " = '" + name + "' WHERE " + EMAIL + " = '" + user.getEmail() + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void createMethod(String name, String description) {
        boolean willAdd = true;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + METHODNAME + " FROM " + METHODS)) {
                while (result.next()) {
                    if (result.getString(METHODNAME).equals(name)) {
                        willAdd = false;
                    }
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {
                statement.execute("INSERT INTO " + METHODS + "(" + METHODNAME + "," + DESCRIPTION
                        + ") \n VALUES('" + name + "','" + description + "')");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void addFormalPaper(Student student, Paper paper) {
        int ID = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {

            statement.execute("INSERT INTO " + STUDENTFORMAL + "\n VALUES(NULL, '" + student.getEmail() + "'," + paper.getID() + ", '" + java.time.LocalDate.now() + "'," + paper.getScore() + ");");
            try ( ResultSet result = statement.executeQuery("SELECT " + STUDENTFORMALID + " FROM " + STUDENTFORMAL + " ORDER BY " + STUDENTFORMALID + " DESC")) {
                result.next();
                ID = result.getInt(STUDENTFORMALID);
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            for (Question question : paper.getQuestions()) {
                addQuestion(student, question, ID);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void addQuestion(Student student, Question question, int paperID) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {

            statement.execute("INSERT INTO " + STUDENTQUESTION + "\n VALUES(NULL, '" + student.getEmail() + "'," + question.getID() + "," + question.getScore() + "," + paperID + ")");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void addInformalPaper(Student student, Subject subject, int mark, int maxMark) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {

            statement.execute("INSERT INTO " + STUDENTINFORMAL + "\n VALUES(NULL, '" + student.getEmail() + "','" + java.time.LocalDate.now() + "'," + mark + "," + maxMark + "," + subject.getID() + ")");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static int createTopic(String topic, Subject subject) {
        boolean willAdd = true;
        int maxID = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + TOPIC + ","  + TOPICID  + " FROM " + TOPICS)) {
                while (result.next()) {
                    if (result.getString(TOPIC).equals(topic)) {
                        willAdd = false;
                    }
                    maxID = result.getInt(TOPICID);
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {
                statement.execute("INSERT INTO " + TOPICS + "(" + TOPIC + " , " + SUBJECTID
                        + ") \n VALUES('" + topic + "'," + subject.getID() + ")");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return maxID;
    }

    public static void createStudentSub(Student student, Subject subject) {
        boolean willAdd = true;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + STUDENTSUBID + " FROM " + STUDENTSUB)) {
                while (result.next()) {
                    if (result.getString(STUDENTSUBID).equals(student.getEmail() + subject.getID())) {
                        willAdd = false;
                    }
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {
                statement.execute("INSERT INTO " + STUDENTSUB + "(" + STUDENTSUBID + " , " + EMAIL + " , " + SUBJECTID + " , " + DATE
                        + ") \n VALUES('" + student.getEmail() + subject.getID() + "','" + student.getEmail() + "', " + subject.getID() + ", '" + Date.nextYear() + "-06-01')");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void createPaper(Paper paper, Subject subject) {
        int ID = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {

            statement.execute("INSERT INTO " + BOUNDARIES + " \n VALUES(NULL, " + paper.getBoundaries()[0] + "," + paper.getBoundaries()[1] + ","
                    + paper.getBoundaries()[2] + "," + paper.getBoundaries()[3] + "," + paper.getBoundaries()[4] + ","
                    + paper.getBoundaries()[5] + ")");
            try ( ResultSet result = statement.executeQuery("SELECT " + BOUNDARYID + " FROM " + BOUNDARIES + " ORDER BY " + BOUNDARYID + " DESC")) {
                result.next();
                ID = result.getInt(BOUNDARYID);

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            statement.execute("INSERT INTO " + PAPERS + " \n VALUES(NULL, '" + paper.getYear() + "-06-01'," + paper.getNum() + ","
                    + ID + "," + subject.getID() + "," + paper.getMax() + ")");
            for (Question question : paper.getQuestions()) {
                PreparedStatement state = conn.prepareStatement("INSERT INTO " + QUESTIONS + " \n VALUES(NULL, " + question.getMark() + "," + question.getTopic().getID() + ","
                        + ID + ",(?))");
                state.setBinaryStream(1, GradePredictorPrototype.imageToBinary(question.getQuestion()));
                state.execute();

            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void createClass(String name, User teacher) {
        boolean newCode = true;
        boolean willAdd = true;
        String studentCode = "";
        String teacherCode = "";
        int i = 0;
        Classroom[] classes = getClasses().toArray(Classroom[]::new);
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            while (willAdd && i < classes.length) {
                if (classes[i].getName().equals(name)) {
                    willAdd = false;
                }
                i++;
            }
            if (willAdd) {
                while (newCode) {
                    i = 0;
                    newCode = false;
                    studentCode = GradePredictorPrototype.getCode();
                    teacherCode = GradePredictorPrototype.getCode();
                    while (i < classes.length && !(newCode)) {
                        newCode = classes[i].studentCodeExists(studentCode);
                        if (!(newCode)) {
                            newCode = classes[i].teacherCodeExists(teacherCode);
                        }
                        i++;
                    }
                }
                statement.execute("INSERT INTO " + CLASSES
                        + " \n VALUES('" + name + "','" + studentCode + "','" + teacherCode + "', " + GradePredictorPrototype.getSubject().getID() + ");");
                statement.execute("INSERT INTO " + CLASSUSERS + "\n VALUES('" + teacher.getEmail() + name + "','" + teacher.getEmail() + "','" + name + "')");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void joinClass(String code, User teacher) {
        boolean willAdd = false;
        String className = "";
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + CLASSNAME + " FROM " + CLASSES + " WHERE " + TEACHERCODE + " = '" + code + "'")) {
                if (result.next()) {
                    className = result.getString(CLASSNAME);
                    willAdd = true;
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {

                statement.execute("INSERT INTO " + CLASSUSERS
                        + "\n VALUES('" + teacher.getEmail() + className + "','" + teacher.getEmail() + "','" + className + "')");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static boolean updateClass(String name, String newName) {
        boolean willAdd = true;
        int i = 0;
        Classroom[] classes = getClasses().toArray(Classroom[]::new);
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            while (willAdd && i < classes.length) {
                if (classes[i].getName().equals(newName)) {
                    willAdd = false;
                }
                i++;
            }
            if (willAdd) {
                statement.execute("Update Classes,ClassUsers"
                        + "\nSet Classes.ClassName = '" + newName + "', ClassUsers.ClassuserID = Concat(Email,'" + newName + "') "
                        + "\nWhere Classes.ClassName = ClassUsers.ClassName and ClassUsers.ClassName = '" + name + "';");

            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return willAdd;
    }

    public static void joinClass(String code, Student student) {
        boolean willAdd = false;
        String className = "";
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + CLASSNAME + " FROM " + CLASSES + " WHERE " + STUDENTCODE + " = '" + code + "'")) {
                if (result.next()) {
                    className = result.getString(CLASSNAME);
                    System.out.println(className);
                    willAdd = true;
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {
                statement.execute("INSERT INTO " + CLASSUSERS
                        + "\n VALUES('" + student.getEmail() + className + "','" + student.getEmail() + "','" + className + "')");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void makeSubject(String name) {
        boolean willAdd = true;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + SUBJECTNAME + " FROM " + SUBJECTS)) {
                while (result.next()) {
                    if (result.getString(SUBJECTNAME).equals(name)) {
                        willAdd = false;
                    }
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (willAdd) {
                statement.execute("INSERT INTO " + SUBJECTS
                        + "\n VALUES(NULL, '" + name + "')");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static ArrayList<Subject> getSubjects() {
        ArrayList<Subject> subjects = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + SUBJECTS)) {
                while (result.next()) {
                    subjects.add(new Subject(result.getInt(SUBJECTID), result.getString(SUBJECTNAME)));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return subjects;

    }

    public static ArrayList<User> getClassStudents(String name) {
        ArrayList<User> users = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM Users \n"
                    + "JOIN ClassUsers on Users.Email = ClassUsers.Email\n"
                    + "WHERE ClassUsers.ClassName = '" + name + "' AND Users.type = 1")) {
                while (result.next()) {
                    users.add(new User(result.getString(EMAIL), result.getString(PASSWORD), result.getInt(TYPE), result.getString(USERNAME), result.getString(NAME)));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return users;

    }

    public static ArrayList<Classroom> getClasses() {
        ArrayList<Classroom> classes = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + CLASSES)) {
                while (result.next()) {
                    classes.add(new Classroom(result.getString(CLASSNAME), result.getString(STUDENTCODE), result.getString(TEACHERCODE), subjectFromID(result.getInt(SUBJECTID))));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return classes;

    }

    public static ArrayList<Classroom> getClasses(User teacher) {
        ArrayList<Classroom> classes = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT Classes.ClassName, StudCode, TeacherCode, SubjectID FROM Classes\n"
                    + "join ClassUsers on Classes.ClassName = ClassUsers.ClassName " + " WHERE " + EMAIL + " = '" + teacher.getEmail() + "'")) {
                while (result.next()) {
                    classes.add(new Classroom(result.getString(CLASSNAME), result.getString(STUDENTCODE), result.getString(TEACHERCODE), subjectFromID(result.getInt(SUBJECTID))));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return classes;

    }

    public static ArrayList<Paper> getPapers(Subject subject) {
        ArrayList<Paper> papers = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + PAPERS + " WHERE " + SUBJECTID + " = " + subject.getID())) {
                while (result.next()) {
                    int[] boundaries = getPaperBoundaries(result.getInt(PAPERID));
                    papers.add(new Paper(questionsFromPaper(result.getInt(PAPERID)).toArray(Question[]::new), result.getInt(PAPERID), Integer.parseInt(result.getString(DATE).substring(0, 4)), result.getInt(PAPERNUM), boundaries[0], boundaries[1], boundaries[2], boundaries[3], boundaries[4], boundaries[5], result.getInt(SUBJECTID), result.getInt(MAXMARK)));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return papers;

    }

    public static ArrayList<Topic> getTopicsFromSubject(Subject subject) {
        ArrayList<Topic> topics = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + TOPICS + " WHERE " + SUBJECTID + " = " + subject.getID())) {
                while (result.next()) {
                    topics.add(new Topic(result.getInt(TOPICID), result.getString(TOPIC)));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return topics;

    }

    public static ArrayList<Question> questionsFromPaper(int paperID) {
        ArrayList<Question> questions = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + QUESTIONS + " WHERE " + PAPERID + " = " + paperID)) {
                while (result.next()) {

                    try {
                        questions.add(new Question(result.getInt(QUESTIONID), result.getInt(MAXMARK), new ImageIcon((BufferedImage) ImageIO.read(result.getBlob(QUESTION).getBinaryStream())), topicFromTopicID(result.getInt(TOPICID))));
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return questions;
    }

    public static ArrayList<Question> studentQuestions(Student student, Subject subject) {
        ArrayList<Question> questions = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT StudQuestion.Mark, Questions.MaxMark, Questions.TopicID, StudQuestion.QuestionID, Questions.Question\n"
                    + "From StudQuestion \n"
                    + "inner join Questions on StudQuestion.QuestionID = Questions.QuestionID\n"
                    + "inner join Papers on Questions.PaperID = Papers.PaperID\n"
                    + "WHERE Papers.SubjectID = " + subject.getID() + " and StudQuestion.Email = '" + student.getEmail() + "';")) {
                while (result.next()) {

                    try {
                        questions.add(new Question(result.getInt(QUESTIONID), result.getInt(MAXMARK), result.getInt(MARK), new ImageIcon((BufferedImage) ImageIO.read(result.getBlob(QUESTION).getBinaryStream())), topicFromTopicID(result.getInt(TOPICID))));
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return questions;
    }

    public static int[] getPaperBoundaries(int paperID) {
        int[] toReturn = new int[6];
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + BOUNDARIES + " WHERE " + BOUNDARYID + " = " + paperID)) {
                result.next();
                toReturn = new int[]{result.getInt(ASTAR), result.getInt(A), result.getInt(B), result.getInt(C), result.getInt(D), result.getInt(E)};
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static ArrayList<Method> getMethods() {
        ArrayList<Method> methods = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + METHODS)) {
                while (result.next()) {
                    methods.add(new Method(result.getString(METHODNAME), result.getString(DESCRIPTION)));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return methods;

    }

    public static ArrayList<Double[]> getPercentages(Student student, Subject subject, Date date) {
        ArrayList<Double[]> percentages = new ArrayList<>();
        int earliest = 0;
        int i = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT StudFormalPaper.Score, Papers.MaxMark, StudFormalPaper.Date\n"
                    + "From StudFormalPaper \n"
                    + "inner join Papers on StudFormalPaper.PaperID = Papers.PaperID\n"
                    + "WHERE Papers.SubjectID = " + subject.getID() + " and StudFormalPaper.Email = '" + student.getEmail() + "' ORDER BY StudFormalPaper.Date ASC;")) {

                while (result.next()) {
                    if (i == 0) {
                        earliest = Math.abs(date.subtract(new Date(result.getString(DATE))));
                        i = 1;
                    }
                    percentages.add(new Double[]{(double) result.getInt(SCORE) / result.getInt(MAXMARK), (double) earliest - date.subtract(new Date(result.getString(DATE)))});
                }

            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            try ( ResultSet result = statement.executeQuery("SELECT Mark, MaxMark, Date FROM StudInformalPaper "
                    + "WHERE StudInformalPaper.SubjectID = " + subject.getID() + " and StudInformalPaper.Email = '" + student.getEmail() + "' ORDER BY StudInformalPaper.Date ASC;")) {
                while (result.next()) {
                    percentages.add(new Double[]{0.9 * ((double) result.getInt(MARK) / result.getInt(MAXMARK)), (double) earliest - date.subtract(new Date(result.getString(DATE)))});
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        percentages.add(new Double[]{(double) earliest});
        return percentages;

    }

    public static void deleteMethod(String methodName) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("DELETE FROM " + METHODS + " WHERE " + METHODNAME + " = '" + methodName + "';");
            statement.execute("ALTER TABLE " + METHODS + " AUTO_INCREMENT = 1;");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static boolean deleteTopic(int topicID) {
        boolean toReturn = true;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT TopicID FROM " + QUESTIONS + " where TopicId = " + topicID + " GROUP BY TopicID;")) {
                toReturn = result.next();
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            if (!toReturn) {
                statement.execute("DELETE FROM " + TOPICS + " WHERE " + TOPICID + " = '" + topicID + "';");
                statement.execute("ALTER TABLE " + TOPICS + " AUTO_INCREMENT = 1;");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return !toReturn;
    }

    public static void deleteClass(String className) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("DELETE FROM " + CLASSUSERS + " WHERE " + CLASSNAME + " = '" + className + "'");
            statement.execute("DELETE FROM " + CLASSES + " WHERE " + CLASSNAME + " = '" + className + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void leaveClass(String className, User teacher) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("DELETE FROM " + CLASSUSERS + " WHERE " + CLASSUSERID + " = '" + teacher.getEmail() + className + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void updateMethod(String methodName, String newName) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            if (!(methodExists(newName))) {
                statement.execute("UPDATE " + METHODS + "\nSET " + METHODNAME + " = '" + newName + "' \nWHERE " + METHODNAME + " = '" + methodName + "'");
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static boolean updateTopic(String topicName, String newName) {
        boolean toReturn = false;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            if (!(topicExists(newName))) {
                statement.execute("UPDATE " + TOPICS + "\nSET " + TOPIC + " = '" + newName + "' \nWHERE " + TOPIC + " = '" + topicName + "'");
                toReturn = true;
            }
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static void updateTarget(String newTarget, String studentSubId) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("UPDATE " + STUDENTSUB + "\nSET " + TARGETGRADE + " = '" + newTarget + "' \nWHERE " + STUDENTSUBID + " = '" + studentSubId + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void updateUserIcon(int newIcon, String userID) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("UPDATE " + USERS + "\nSET " + ICON + " = " + newIcon + " \nWHERE " + EMAIL + " = '" + userID + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void updateExamDate(String year, String studentSubId) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("UPDATE " + STUDENTSUB + "\nSET " + DATE + " = '" + year + "-06-01" + "' \nWHERE " + STUDENTSUBID + " = '" + studentSubId + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void updatePredicted(String newPredicted, String studentSubId) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("UPDATE " + STUDENTSUB + "\nSET " + PREDICTEDGRADE + " = '" + newPredicted + "' \nWHERE " + STUDENTSUBID + " = '" + studentSubId + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void updateFinal(String newPredicted, String studentSubId) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("UPDATE " + STUDENTSUB + "\nSET " + FINALGRADE + " = '" + newPredicted + "' \nWHERE " + STUDENTSUBID + " = '" + studentSubId + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static void updateStudentMethod(String newMethod, String studentSubId) {
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            statement.execute("UPDATE " + STUDENTSUB + "\nSET " + METHODNAME + " = '" + newMethod + "' \nWHERE " + STUDENTSUBID + " = '" + studentSubId + "'");
            conn.close();//closes  the connection
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
    }

    public static Student studentFromEmail(String email) {
        Student toReturn = new Student("", "");
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + USERS + " WHERE " + EMAIL + " = '" + email + "'")) {
                while (result.next()) {
                    toReturn = new Student(result.getString(EMAIL), result.getString(PASSWORD), result.getString(USERNAME), result.getString(NAME), result.getInt(ICON));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static Topic topicFromTopic(String topic) {
        Topic toReturn = new Topic(0, "");
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + TOPICS + " WHERE " + TOPIC + " = '" + topic + "'")) {
                if (result.next()) {
                    toReturn = new Topic(result.getInt(TOPICID), result.getString(TOPIC));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static Topic topicFromTopicID(int ID) {
        Topic toReturn = new Topic(0, "");
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + TOPICS + " WHERE " + TOPICID + " = " + ID)) {
                if (result.next()) {
                    toReturn = new Topic(result.getInt(TOPICID), result.getString(TOPIC));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static User teacherFromEmail(String email) {
        User toReturn = new User("", "", 0);
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + USERS + " WHERE " + EMAIL + " = '" + email + "'")) {
                while (result.next()) {
                    toReturn = new User(result.getString(EMAIL), result.getString(PASSWORD), 0, result.getString(USERNAME), result.getString(NAME), result.getInt(ICON));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static User userFromEmail(String email) {
        User toReturn = new User("", "", 0);
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + USERS + " WHERE " + EMAIL + " = '" + email + "'")) {
                while (result.next()) {
                    toReturn = new User(result.getString(EMAIL), result.getString(PASSWORD), result.getInt(TYPE), result.getString(USERNAME), result.getString(NAME), result.getInt(ICON));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static Subject subjectFromID(int ID) {
        Subject toReturn = new Subject(ID, "");
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + SUBJECTS + " WHERE " + SUBJECTID + " = " + ID)) {
                while (result.next()) {
                    toReturn = new Subject(ID, result.getString(SUBJECTNAME));
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static Classroom classFromName(String className) {
        Classroom toReturn = new Classroom(className, "", "", GradePredictorPrototype.getSubject());
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT * FROM " + CLASSES + " WHERE " + CLASSNAME + " = '" + className + "'")) {
                while (result.next()) {
                    toReturn = new Classroom(className, result.getString(STUDENTCODE), result.getString(TEACHERCODE), GradePredictorPrototype.getSubject());
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static String getPredicted(String StudentSubId) {
        String toReturn = "N/A";
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + PREDICTEDGRADE + " FROM " + STUDENTSUB + " WHERE "
                    + STUDENTSUBID + " = '" + StudentSubId + "'")) {
                if (result.next()) {
                    toReturn = result.getString(PREDICTEDGRADE);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static String[] getStudentSubjectInfo(String StudentSubId) {
        String[] toReturn = {"N/A", "N/A", "PPQ", "2023-01-01"};
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + PREDICTEDGRADE + "," + TARGETGRADE
                    + "," + METHODNAME + "," + DATE + " FROM " + STUDENTSUB + " WHERE " + STUDENTSUBID + " = '" + StudentSubId + "'")) {
                if (result.next()) {
                    toReturn[0] = result.getString(PREDICTEDGRADE);
                    toReturn[1] = result.getString(TARGETGRADE);
                    toReturn[2] = result.getString(METHODNAME);
                    toReturn[3] = result.getString(DATE);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static double getFormalPerformance(Subject subject, Method method) {
        double toReturn = 0;
        int count = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT StudFormalPaper.Score, Papers.MaxMark\n"
                    + "From StudentSub\n"
                    + "inner join StudFormalPaper on StudFormalPaper.Email = StudentSub.Email\n"
                    + "inner join Papers on Papers.PaperID = StudFormalPaper.PaperID\n"
                    + "where StudentSub.MethodName = '" + method.getName() + "' and StudentSub.SubjectID = " + subject.getID())) {
                while (result.next()) {
                    count++;
                    toReturn += (double) result.getInt(SCORE) / result.getInt(MAXMARK);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn / count;
    }

    public static double getInformalPerformance(Subject subject, Method method) {
        double toReturn = 0;
        int count = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT Mark, MaxMark \n"
                    + "From StudentSub\n"
                    + "inner join StudInformalPaper on StudInformalPaper.Email = StudentSub.Email\n"
                    + "where StudentSub.MethodName = '" + method.getName() + "' and StudentSub.SubjectID = " + subject.getID())) {
                while (result.next()) {
                    count++;
                    toReturn += (double) result.getInt(MARK) / result.getInt(MAXMARK);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn / count;
    }

    public static double getGradePerformance(Subject subject, Method method) {
        double toReturn = 0;
        int count = 0;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("Select PredictedGrade,TargetGrade,FinalGrade\n"
                    + "From StudentSub\n"
                    + "where StudentSub.MethodName = '" + method.getName() + "' and FinalGrade IS NOT NULL AND StudentSub.SubjectID = " + subject.getID())) {
                while (result.next()) {
                    toReturn += GradePredictorPrototype.ungrade((GradePredictorPrototype.gradeToInt(result.getString(FINALGRADE)) - GradePredictorPrototype.gradeToInt(result.getString(TARGETGRADE))));
                    toReturn += GradePredictorPrototype.ungrade((GradePredictorPrototype.gradeToInt(result.getString(FINALGRADE)) - GradePredictorPrototype.gradeToInt(result.getString(PREDICTEDGRADE))));
                    count += 2;
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn / count;
    }

    public static String getMostRecent(Subject subject, Student student) {
        String toReturn = "N/A";
        int score = 0;
        int paperid = 1;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT score,StudFormalPaper.PaperID \n"
                    + "FROM StudFormalPaper \n"
                    + "Join Papers on StudFormalPaper.PaperID = Papers.PaperID \n"
                    + "WHERE Papers.SubjectID = " + subject.getID() + " and Email = '" + student.getEmail() + "' ORDER BY StudFormalPaper.Date DESC;")) {
                if (result.next()) {
                    score = result.getInt(SCORE);
                    paperid = result.getInt(PAPERID);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
            toReturn = GradePredictorPrototype.grade(score, getPaperBoundaries(paperid));
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static String getTarget(String StudentSubId) {
        String toReturn = "A*";
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + TARGETGRADE + " FROM " + STUDENTSUB + " WHERE " + STUDENTSUBID
                    + " = '" + StudentSubId + "'")) {
                if (result.next()) {
                    toReturn = result.getString(TARGETGRADE);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static String getExamDate(String StudentSubId) {
        String toReturn = "2023-06-01";
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + DATE + " FROM " + STUDENTSUB
                    + " WHERE " + STUDENTSUBID + " = '" + StudentSubId + "'")) {
                if (result.next()) {
                    toReturn = result.getString(DATE);
                    if (toReturn == null) {
                        toReturn = "2023-06-01";
                    }
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static String getMethod(String StudentSubId) {
        String toReturn = "PPQ";
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + METHODNAME + " FROM " + STUDENTSUB + " WHERE "
                    + STUDENTSUBID + " = '" + StudentSubId + "'")) {
                if (result.next()) {
                    toReturn = result.getString(METHODNAME);
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }
        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static boolean methodExists(String name) {
        boolean toReturn = false;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + METHODNAME + " FROM " + METHODS)) {
                while (result.next()) {
                    if (result.getString(METHODNAME).equals(name)) {
                        toReturn = true;
                    }
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }

    public static boolean topicExists(String name) {
        boolean toReturn = false;
        try ( Connection conn = DriverManager.getConnection(URL, "THope", DATABASEPASSWORD);  Statement statement = conn.createStatement()) {
            try ( ResultSet result = statement.executeQuery("SELECT " + TOPIC + " FROM " + TOPICS)) {
                while (result.next()) {
                    if (result.getString(TOPIC).equals(name)) {
                        toReturn = true;
                    }
                }
                conn.close();//closes  the connection
            } catch (SQLException e) {
                System.out.println("ERROR MESSAGE 2!!!!" + e);
            }

        } catch (SQLException e) {
            System.out.println("ERROR MESSAGE 1!!!!" + e);
        }
        return toReturn;
    }
}
