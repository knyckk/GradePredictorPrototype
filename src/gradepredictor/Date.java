/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictor;

/**
 *
 * @author kingt
 */
public class Date {
    private int month; //declares variables
    private int year;
    public Date(String date) { // date in form yyyy-mm-dd
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(5,7));
    }
    public int getMonth() {
        return this.month; // returns the month for the date
    }
    public int getYear() {
        return this.year;//returns the year for the date
    }
    public int subtract(Date date) {//returns the difference between 2 dates in months
        int toReturn = 0;//sets initial difference to 0
        toReturn += this.getMonth();//adds this dates months
        toReturn += (12 *(this.year - date.getYear())) - date.getMonth();//adds 12 months for every year difference between them and takes the second dates number of months
        return toReturn;
    }
    
    public static int nextYear() {   //returns the following year for the date
        return Integer.parseInt(java.time.LocalDate.now().toString().substring(0,4)) + 1;
    }
}
