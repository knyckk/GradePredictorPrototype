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
    public static void main(String[] args) {
        //System.out.println(validatePostcode("LK77 7HH"));
//        System.out.println(validateEmail("thope7002@gmail.com"));
//        System.out.println(validateEmail("thope7002gmail.com"));
//        System.out.println(validateEmail("thope@7002gmailcom"));
//        System.out.println(validateEmail("1-thope@bayhouse.gfmat.org"));
//        printDate("28-02-2000");
//        printDate("29/02-2001");
//        printDate("29-02-2000");
        System.out.println(isDate("28-02-2000"));
        System.out.println(isDate("29-02-2001"));
        System.out.println(isDate("29-02-2000"));
        System.out.println(isDate("30-04-2000"));
        System.out.println(isDate("31-04-2001"));
        System.out.println(isDate("30-05-2000"));
        //new SelectValidate().setVisible(true);
    }

    public static boolean validatePostcode(String inPost) {
        inPost = inPost.trim();
        if (inPost.length() != 8) {
            System.out.println("Wrong length");
            return false;
        }

        return isDigit(inPost.charAt(2))
                && isDigit(inPost.charAt(3))
                && isDigit(inPost.charAt(5))
                && isLetter(inPost.charAt(0))
                && isLetter(inPost.charAt(1))
                && isLetter(inPost.charAt(6))
                && isLetter(inPost.charAt(7))
                && inPost.charAt(4) == ' ';

    }

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

    public static boolean isInt(String check) {
        String regex = "^[0-9]{1,11}$";
        Pattern PC = Pattern.compile(regex);
        Matcher matcher = PC.matcher(check);
        return matcher.find();
    }

    public static boolean isReal(String check) {
        String regex = "^[0-9]{1,11}.[0-9]{1,11}$";
        return check.matches(regex);
    }

    public static boolean isDate(String date) {

        int year = 0;
        String regex = "^(((31-(01|03|05|07|08|10|12))|([0-2][0-9]-(0[0-9])|(1[0-2]))|(30-(0[0-13-9])|(1[0-2])))-(1|2)[0-9]{3})$";
        boolean toReturn = false;
        toReturn = date.matches(regex);
        if (toReturn) {         
            if ((date.substring(0, 2).equals("29")
                    && Integer.valueOf(date.substring(3, 5)) == 2)) {
                toReturn = false;
                year = Integer.valueOf(date.substring(6));
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    toReturn = true;
                }
            }
        }
        return toReturn;

    }

    public static void printDate(String date) {
        System.out.println(date.substring(0, 2) + "day\n" + date.substring(3, 5) + "month\n" + date.substring(6) + "year");
    }

}
