package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        double sum = 0;
        int i = 0;
        while (number != -1) {
            number = Integer.parseInt(reader.readLine());
            if (number != -1) {
                sum = sum + number;
                i++;
            } else break;
        }
        System.out.println(sum / i);


    }
}

