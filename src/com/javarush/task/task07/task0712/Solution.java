package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int indexLong = 0;
        int indexShort = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int strLength1 = strings.get(0).length();
        int strLength2 = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > strLength1) {
                strLength1 = strings.get(i).length();
                indexLong = i;
            }
            if (strings.get(i).length() < strLength2) {
                strLength2 = strings.get(i).length();
                indexShort = i;
            }
        }
        if (indexLong > indexShort){
            System.out.println(strings.get(indexShort));}
        else if (indexLong < indexShort) {System.out.println(strings.get(indexLong));}
            else System.out.println(indexShort);


    }
}


