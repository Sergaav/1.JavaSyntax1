package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);
        set.add(21);
        return set;


    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
     set.removeIf(n ->(n > 10));
     return set;



    }

    public static void main(String[] args) {



    }
}
