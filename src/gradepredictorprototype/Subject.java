/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Subject {
    private int SubjectID;
    private String SubjectName;
    public Subject(int ID, String name) {
        SubjectID = ID;
        SubjectName = name;
    }
    public String getName() {
        return this.SubjectName;
    }
    public int getID() {
        return this.SubjectID;
    }
    @Override
    public boolean equals(Object compare) {
        boolean toReturn = false;
        if(this == compare) {
            toReturn = true;
        }
        if(!(compare instanceof Subject) && !(toReturn)) {
            toReturn = false;
        }
        Subject compared = (Subject) compare;
        
        if(this.SubjectID == compared.SubjectID 
                && this.SubjectName.equals(compared.SubjectName)) {
            toReturn = true;
    }
        return toReturn;
    }
}
