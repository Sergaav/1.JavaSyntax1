package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < 1; ) {
            int id = 0;
            String temp = reader.readLine();
            try {
                id = Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                break;
            }
            String name = reader.readLine();
            if (name.isEmpty()) i++;
            map.put(name, id);
        }


        for(
    Map.Entry<String, Integer> entry :map.entrySet())

    {
        System.out.println(entry.getValue() + " " + entry.getKey());
    }
}
}
