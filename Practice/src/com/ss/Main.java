package com.ss;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    
    // findDay method ko class ke andar but main ke bahar likhna hai
    public static String findDay(int month, int day, int year)
    {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        cal.set(year, month - 1, day); // Month 0-based hota hai, isliye (month - 1)
        
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1]; // Calendar.DAY_OF_WEEK 1-based hota hai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        
        System.out.println(findDay(month, day, year)); // Correct function call
        sc.close();
    }
}
