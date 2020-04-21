package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Petrov","Ivan");
        map.put("Petrenko","Ivan");
        map.put("Ivanenko","Petr");
        map.put("Sergeenko","Vadim");
        map.put("Petrov","Taras");
        map.put("Sergeev","Denys");
        map.put("Dmitriev","Dmitriy");
        map.put("Dmitriev","Ivan");
        map.put("Nazarov","Petr");
        map.put("Dziura","Inna");



        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
