package edu.csudh.jcardona2toromail.rafflealot20;

/**
 * Created by akajo on 3/11/2017.
 */

public class Date {
    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    private int Month;
    private int Day;
    private int Year;

    public Date(int month, int day, int year) {
        Month = month;
        Day = day;
        Year = year;
    }

    public Date(String x){
        this.Month = Integer.parseInt(x.substring(0, 2));
        this.Day = Integer.parseInt(x.substring(2, 4));
        this.Year = Integer.parseInt(x.substring(4,8));
    }

    public String  moreDays(String x){
        this.Month = Integer.parseInt(x.substring(0, 2));
        this.Day = Integer.parseInt(x.substring(2, 4));
        this.Year = Integer.parseInt(x.substring(4,8));

        return x;
    }
    public String toString(){//TO ADD SLASHES ON THE DATE
        return" "+ String.valueOf(Month)+"/"+String.valueOf(Day)+"/"+String.valueOf(Year);
    }

}
