package com.javarush.task.task08.task0828;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");
        DateFormat format = new SimpleDateFormat("MMMMM", Locale.ENGLISH);
        DateFormat format1 = new SimpleDateFormat("M", Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        Date month = new Date();
        month = format.parse(m);
        int month1 = Integer.parseInt(format1.format(month));
        System.out.println(map.get(month1) + " is the " + month1 + " month");
    }


}

