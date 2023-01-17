/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Teacher extends User{
    
    public Teacher(String email, String password) {
        super(email, password, 0);
    }
    public Teacher(String email, String password, int icon) {
        super(email, password, 0, icon);
    }
    public Teacher(String email, String password,String username, String name, int icon) {
        super(email, password, 0,username, name, icon);
    }
}
