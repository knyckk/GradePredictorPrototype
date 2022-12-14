/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Date {
    private int day;
    private int month;
    private int year;
    public Date(String date) { // date in form yyyy/mm/dd
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(5,7));
        day = Integer.parseInt(date.substring(8,10));
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public int subtract(Date date) {
        int toReturn = 0;
        toReturn += this.getMonth();
        toReturn += (12 *(this.year - date.getYear())) - date.getMonth();
        return toReturn;
    }
    public static void main(String[] args) {
        Date date1 = new Date("2015-10-12");
        Date date2 = new Date("2016-10-13");
        System.out.println(Math.abs(date1.subtract(date2)));
        
    }
    public static int nextYear() {   
        return Integer.parseInt(java.time.LocalDate.now().toString().substring(0,4)) + 1;
    }
}
