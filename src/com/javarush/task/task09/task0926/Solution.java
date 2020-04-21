package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int []> listArr = new ArrayList<>();
        int [] mas1 = {15,2,8,85,65};
        int [] mas2 = {85,65};
        int [] mas3 = {15,65,18,65};
        int [] mas4 = {15,2,35,4,8,85,65};
        int [] mas5 = {};
        listArr.add(mas1);
        listArr.add(mas2);
        listArr.add(mas3);
        listArr.add(mas4);
        listArr.add(mas5);
        return listArr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
