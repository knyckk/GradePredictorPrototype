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
    private int icon;
    public User(String email, String password, int type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
