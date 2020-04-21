package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov", "Ivan");
        map.put("Sydorov", "Petr");
        map.put("Ivanov", "Volodia");
        map.put("Sergeev", "Sergey");
        map.put("Yurchenko", "Ivan");
        map.put("Fedorov", "Ivan");
        map.put("Ivanenko", "Andrii");
        map.put("Pivnenko", "Sergey");
        map.put("Sydorenko", "Vadim");
        map.put("Stepanenko", "Ivan");

        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        String value;
        int count = 0;
        Set<String> set = new HashSet<>(map.values());
        ArrayList<String> list = new ArrayList<>();


        for (String s : set) {
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                value = iterator.next().getValue();
                if (s.equals(value)) count++;
            }

            if (count > 1) {
                list.add(s);
            }
            count = 0;
        }

        for (String s : list) removeItemFromMapByValue(map, s);

    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
