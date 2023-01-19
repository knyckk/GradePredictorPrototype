/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepredictorprototype;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author 1-thope
 */
public class ValidationRoutines {

    /**
     * @param args the command line arguments
     */
   

    

    public static boolean studentEmail(String inEmail) {
        inEmail = inEmail.trim();
        String regex = "^1-[a-zA-Z]{1,63}@bayhouse.gfmat.org$";
        return inEmail.matches(regex);

    }
    public static boolean teacherEmail(String inEmail) {
        inEmail = inEmail.trim();
        String regex = "^[a-zA-Z]{1,63}@bayhouse.gfmat.org$";
        return inEmail.matches(regex);

    }

    public static boolean presenceCheck(String check) {
        check = check.trim();
        if (check.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean rangeCheck(String min, String check, String max) {
        return Integer.valueOf(check) >= Integer.valueOf(min) && Integer.valueOf(check) <= Integer.valueOf(max);  //returns whether or not check is between min and max
    }
    public static boolean lengthCheck(int min, String check, int max) {
        return (min <= check.length() && max >= check.length());
    }

    public static boolean isInt(String check) {
        check = check.trim();
        boolean toReturn = true;
        for(char character : check.toCharArray()) {
            if(!isDigit(character)) {
                toReturn = false;
            }
        }
        return toReturn;
    }

    public static boolean isReal(String check) {
        check = check.trim();
        boolean toReturn = true;
        int count = 0;
        for(char character : check.toCharArray()) {
            if(!isDigit(character)) {
                if(character == '.') {
                    count ++;
                    if(count > 1) {
                        toReturn = false;
                    }
                } else if (character != '.') {
                    toReturn = false;
                }
                
            }
        }
        return toReturn;
    }

    public static boolean isDate(String date) {

        int year = 0;
        String regex = "^((1|2)[0-9]{3}-(((01|03|05|07|08|10|12)-31)|(((0[0-9])|(1[0-2]))-[0-2][0-9])|(((0[0-13-9])|(1[0-2]))-30)))$";
        boolean toReturn;
        toReturn = date.matches(regex);
        if (toReturn) {         
            if ((date.substring(0, 2).equals("29")
                    && Integer.valueOf(date.substring(3, 5)) == 2)) {
                toReturn = false;
                year = Integer.valueOf(date.substring(6));
                if (year % 4 == 0) {
                    if(year % 100 == 0 && !(year % 400 == 0)) {
                        toReturn = true;
                    }
                    
                }
            }
        }
        return toReturn;

    }

    

}
