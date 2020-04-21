package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Hello", " World!!"));
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Привет", " Мир!!"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Привіт", " Всесвіт!!"));
        ArrayList<String>[] mas = (ArrayList<String>[]) new ArrayList [3];
        mas[0] = list;
        mas[1] = list1;
        mas[2] = list2;
        return mas;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}