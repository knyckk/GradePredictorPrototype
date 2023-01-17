/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class User {
    private String email;
    private String password;
    private String name;
    private String username;
    private int type; // 0 is teacher, 1 is student
    public int icon;
    public User(String email, String password, int type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }
    public User(String email, String password, int type, int icon) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.icon = icon;
    }
    public User(String email, String password, int type, String username, String name) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.username = username;
        this.name = name;
    }
    public User(String email, String password, int type, String username, String name, int icon) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.username = username;
        this.name = name;
        this.icon = icon;
    }
    public String getEmail() {
        return email;
    }
    public void setNames(String username, String name) {
        this.username = username;
        this.name = name;
    }
    public void setIcon(int icon) {
        this.icon = icon;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getType() {
        return type;
    }
    public int getIcon() {
        return icon;
    }
}
