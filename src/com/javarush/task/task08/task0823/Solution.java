package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        string =string.trim();
       while (string.contains("  ")){
            string = string.replaceAll("  "," ");

    }

    string =string.trim();
    List<String> list = new ArrayList<String>(Arrays.asList(string.split(" ")));

    char ch;

        for(
    int i = 0; i<list.size();i++)

    {
        ch = list.get(i).charAt(0);
        if (Character.isLowerCase(ch)) {
            String ch1 = Character.toString(Character.toUpperCase(ch));
            list.set(i, list.get(i).replaceFirst(Character.toString(list.get(i).charAt(0)), ch1));
        }

    }


        for(
    String s :list)

    {
        System.out.print(s + " ");
    }

}
}
