package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
       for (Cat cat : cats) {
           cats.remove(cat);
           break;
       }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat("Barsik"));
        set.add(new Cat("Murzik"));
        set.add(new Cat("Pupsik"));
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }

    public static class Cat {


       public String name;
        public Cat(String name) {
            this.name=name;
            }
        public Cat() {

        }
    }
}
