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
    private String SubjectName;//declares variables
    public Subject(int ID, String name) {
        SubjectID = ID;//initialise variables
        SubjectName = name;
    }
    public String getName() {
        return this.SubjectName;//returns name
    }
    public int getID() {
        return this.SubjectID;//returns ID
    }
    @Override
    public boolean equals(Object compare) {//method for comparing equality of a subject and an object
        boolean toReturn = false;
        if(this == compare) {
            toReturn = true;//checks they are equal
        }
        if(!(compare instanceof Subject) && !(toReturn)) {
            toReturn = false;//if not equal checks compared if it is a subject
        }
        Subject compared = (Subject) compare;//casts compared into a subject
        
        if(this.SubjectID == compared.SubjectID 
                && this.SubjectName.equals(compared.SubjectName)) {//compares variables for equality
            toReturn = true;
    }
        return toReturn;
    }
}
