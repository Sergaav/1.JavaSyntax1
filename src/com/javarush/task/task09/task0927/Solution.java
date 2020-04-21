package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> map = new HashMap<>();
        map.put("Murka",new Cat("Murka"));
        map.put("Barsik",new Cat("Barsik"));
        map.put("Markiz",new Cat("Markiz"));
        map.put("Vaska",new Cat("Vaska"));
        map.put("Baron",new Cat("Baron"));
        map.put("Proglot",new Cat("Proglot"));
        map.put("Begemot",new Cat("Begemot"));
        map.put("Chunka",new Cat("Chunka"));
        map.put("Murzik",new Cat("Murzik"));
        map.put("Baranchik",new Cat("Baranchik"));

        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String,Cat> entry : map.entrySet()){
            set.add(entry.getValue());
        }
        return set;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
