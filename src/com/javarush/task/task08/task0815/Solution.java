package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Bober", "Ivan");
        map.put("Vaskov", "Ivan");
        map.put("Glkjdvlkj", "Vasiliy");
        map.put("Bjkjdvjh", "Vasvas");
        map.put("Boberki", "LKNkdv;dsv");
        map.put("JNkjdv", "Ivan");
        map.put("Bob", "LKNJLlm");
        map.put("Bobik", "Ivan");
        map.put("Bobur", "JKGkjhklj");
        map.put("Bonur", "Ivan");
        return map;


    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }

        }
return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {


    }
}
