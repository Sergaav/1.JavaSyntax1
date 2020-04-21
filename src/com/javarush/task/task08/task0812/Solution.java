package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count=0;
        int max = 0;
       for (int i=1;i<10;i++){
           if (list.get(i - 1).equals(list.get(i))) {
               count++;
           }
           if (max < count) {
               max = count;
           }
           if (!list.get(i-1).equals(list.get(i))){
               count = 0;
           }

       }
        System.out.println(max + 1);

    }
}