/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepredictorprototype;

import static java.lang.Character.isDigit;


/**
 *
 * @author 1-thope
 */
public class ValidationRoutines {
    public static boolean studentEmail(String inEmail) {
        inEmail = inEmail.trim();
        String regex = "^1-[a-zA-Z]{1,63}@bayhouse.gfmat.org$";//checks email is in form 1-xxxx@bayhouse.gfmat.org (student email form at clients school)
        return inEmail.matches(regex);

    }
    public static boolean teacherEmail(String inEmail) {
        inEmail = inEmail.trim();
        String regex = "^[a-zA-Z]{1,63}@bayhouse.gfmat.org$";//checks email is in form xxxx@bayhouse.gfmat.org (teacher email form at clients school)
        return inEmail.matches(regex);

    }

    public static boolean presenceCheck(String check) {
        check = check.trim();//trims leading or trailing spaces
        if (check.length() == 0) {
            return false;//checks data has been inputed
        }
        return true;
    }

    public static boolean rangeCheck(String min, String check, String max) {
        return Integer.valueOf(check) >= Integer.valueOf(min) && Integer.valueOf(check) <= Integer.valueOf(max);  //returns whether or not check is between min and max
    }
    public static boolean lengthCheck(int min, String check, int max) {
        return (min <= check.length() && max >= check.length());//returns whether check is shorter than max and longer than min
    }

    public static boolean isInt(String check) {
        check = check.trim();//trims spaces
        boolean toReturn = true;//sets default to true
        for(char character : check.toCharArray()) {//looks at each character in the string
            if(!isDigit(character)) {//if character is not a number
                toReturn = false;//returns false
            }
        }
        return toReturn;
    }

    

    public static boolean isDate(String date) {

        int year = 0;
        String regex = "^((1|2)[0-9]{3}-(((01|03|05|07|08|10|12)-31)|(((0[0-9])|(1[0-2]))-[0-2][0-9])|(((0[0-13-9])|(1[0-2]))-30)))$";//checks date is in form yyyy-dd-mm and checks all valid dates except leap years
        boolean toReturn;
        toReturn = date.matches(regex);
        if (toReturn) {//if form is correct
            if ((date.substring(0, 2).equals("29")//checks leap year if day is 29th
                    && Integer.valueOf(date.substring(3, 5)) == 2)) { //and month is feb
                toReturn = false;
                year = Integer.valueOf(date.substring(6));
                if (year % 4 == 0) {
                    if(year % 100 == 0 && !(year % 400 == 0)) {//and checks for exceptions
                        toReturn = true;
                    }
                    
                }
            }
        }
        return toReturn;

    }

    

}
