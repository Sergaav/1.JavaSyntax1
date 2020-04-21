package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 2 2016"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        DateFormat format1 = new SimpleDateFormat("D", Locale.ENGLISH);
        Date d = new Date();
        d = format.parse(date);
        int result = Integer.parseInt(format1.format(d));

        System.out.println(result);
        return (result) % 2 != 0;

    }
}
