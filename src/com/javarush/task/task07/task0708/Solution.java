package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;
    private static ArrayList<String> str;
    private static int index;
    private static int strLength;
    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        strLength = 0;
        index = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > strLength){
                strLength = strings.get(i).length();
                index = i;}
        }
        str.add(strings.get(index));

        for (int i = 0; i < strings.size(); i++) {
            if ((str.get(0).length() == strings.get(i).length()) && (i != index))
                str.add(strings.get(i));
        }
        for (String s : str) {
            System.out.println(s);
        }


    }
}
