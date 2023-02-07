/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Student extends User{//inherits user
    private String year;//declare variables
    public Student(String email, String password) {//constructor for signing up
        super(email, password, 1);//calls user constructor
    }
    public Student(String email, String password, int icon) {//constructor without name and username
        super(email, password, 1, icon);
    }
    public Student(String email, String password,String username, String name, int icon) {//constructor for logging in
        super(email, password, 1,username,name, icon);
    }
    public void setYear(String date) {
        year = date;//sets date exam is being sat
    }
    public String getDate() {
        return year+"-06-01";//returns date assuming paper will be sat in june
    }
}
