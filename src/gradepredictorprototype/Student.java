/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Student extends User{
    private String year;
    public Student(String email, String password) {
        super(email, password, 1);
    }
    public Student(String email, String password, int icon) {
        super(email, password, 1, icon);
    }
    public void setYear(String date) {
        year = date;
    }
    public String getDate() {
        return year+"-06-01";
    }
}
