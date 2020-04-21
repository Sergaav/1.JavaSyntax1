package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listMain = new ArrayList<Integer>();
        ArrayList<Integer> listD3 = new ArrayList<Integer>();
        ArrayList<Integer> listD2 = new ArrayList<Integer>();
        ArrayList<Integer> listElse = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
            listMain.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < listMain.size(); i++) {
            if (listMain.get(i) % 3 == 0) {
                listD3.add(listMain.get(i));
            }
            if (listMain.get(i) % 2 ==0) {
                listD2.add(listMain.get(i));
            }
            if (listMain.get(i) % 3 != 0 && listMain.get(i) % 2 !=0){
                listElse.add(listMain.get(i));
            }
        }

        printList(listD3);
        printList(listD2);
        printList(listElse);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));

        }
    }
}
