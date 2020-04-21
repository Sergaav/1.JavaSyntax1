package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Penrov",1000);
        map.put("Petrov",1200);
        map.put("Sydorov",1000);
        map.put("Ivanov",200);
        map.put("Sergeenko",400);
        map.put("Ivanenko",1000);
        map.put("Petrenko",850);
        map.put("Dziura",500);
        map.put("Serga",350);
        map.put("Baranov",499);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
       // Map<String, Integer> map2 = new HashMap<String, Integer>(map);

        map.entrySet().removeIf(stringIntegerEntry -> stringIntegerEntry.getValue() < 500);


    }

    public static void main(String[] args) {

    }
}