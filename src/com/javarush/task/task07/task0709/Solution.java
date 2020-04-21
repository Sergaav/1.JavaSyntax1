package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
       public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        int index;
        int strLength;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        strLength = strings.get(0).length();
        index = 0;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() < strLength) {
                strLength = strings.get(i).length();
                index = i;
            }
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

