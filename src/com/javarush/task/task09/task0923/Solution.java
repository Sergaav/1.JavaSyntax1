package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] list = new String[string.length()];
        String[] list1 = new String[string.length()];
        char c;
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            if (c != ' ') {
                if (isVowel(c)) {
                    list[i] = Character.toString(c);
                } else list1[i] = Character.toString(c);
            }
        }
        for (String s : list) {
            if (s!=null){
            System.out.print(s + " ");}
        }
        System.out.println();
        for (String s : list1) {
            if (s!=null){
            System.out.print(s + " ");}
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}