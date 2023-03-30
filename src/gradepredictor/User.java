/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictor;

/**
 *
 * @author kingt
 */
public class User {
    private String email;
    private String password;
    private String name;//declares variable
    private String username;
    private int type; // 0 is teacher, 1 is student
    public int icon;
    public User(String email, String password, int type) {//signing up constructor
        this.email = email;
        this.password = password;//initialises variables
        this.type = type;
    }
    public User(String email, String password, int type, int icon) {//logging in constructor
        this.email = email;
        this.password = password;
        this.type = type;
        this.icon = icon;
    }
    public User(String email, String password, int type, String username, String name) {//constructor without icon
        this.email = email;
        this.password = password;
        this.type = type;
        this.username = username;
        this.name = name;
    }
    public User(String email, String password, int type, String username, String name, int icon) {//constructor with all variables
        this.email = email;
        this.password = password;
        this.type = type;
        this.username = username;
        this.name = name;
        this.icon = icon;
    }
    public String getEmail() {
        return email;//returns email
    }
    public void setNames(String username, String name) {
        this.username = username;
        this.name = name;//sets names
    }
    public void setIcon(int icon) {
        this.icon = icon;//sets icon
    }
    public String getName() {
        return name;//gets name
    }
    public String getUsername() {
        return username;//gets username
    }
    public String getPassword() {
        return password;//gets password
    }
    public int getType() {
        return type;//gets type (student or teacher)
    }
    public int getIcon() {
        return icon;//gets icon
    }
}
