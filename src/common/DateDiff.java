package common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDiff {

    public static void main(String[] args) {

        String d1 = "20-04-2002";
        String d2 = "20-04-2022";


        // all the date , month and year is valid


        // daysLeftInTheMonth + howManyDaysLeftInThatYearFromNextMonth + daysBetweenYear + numberOfDaysTillFutureMonth + numberOfDaysFromStartingOfMonthToDate



    }


    int numberOfDaysFromStartingOfMonthToDate(int date,int month,int year){
        return  numberOfDaysInMonth(month,year)-date;
    }


    int numberOfDaysTillFutureMonth(int month,int year){
        int sum = 0;
        for(int i = 1;i<=month-1;i++){
            sum += numberOfDaysInMonth(month,year);
        }
        return sum;
    }

    int daysBetweenYear(int year1,int year2){
        int sum = 0;
        for(int i = year1; i<=year2-1;i++){
            sum = sum+numberOfDaysInYear(i);
        }
        return sum;
    }

    int howManyDaysLeftInThatYearFromNextMonth(int month,int year){
        int sum = 0;
        for(int i = 1;i<=month;i++){
            sum += numberOfDaysInMonth(month,year);
        }
        return numberOfDaysInYear(year)-sum;
    }

    int daysLeftInTheMonth(int date,int month,int year){
        int numOfDaysInMonth = numberOfDaysInMonth(month,year);
        return numOfDaysInMonth-date;
    }

    int numberOfDaysInMonth(int month,int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
                return 31;
            case 4:
                return 30;
            case 2:
                return numberOfDaysInYear(year)==365?28:29;
            default: return 0;
        }
    }

    int numberOfDaysInYear(int year){
        if( (year%100==0 && year%400==0) || year %4 == 0)
            return 366;
        return 365;
    }

}
