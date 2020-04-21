package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        SimpleDateFormat format1 = new SimpleDateFormat(("MMM dd, yyyy"),Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date();
        String date1 = "";
        try {
            String d = reader.readLine();
            date = format.parse(d);
            date1 = format1.format(date);
            System.out.println(date1.toString().toUpperCase());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
