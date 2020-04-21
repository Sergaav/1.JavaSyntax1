package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName, null, null);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, grandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }


        @Override
        public String toString() {
            if (parent == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father";
            else if (parent == null)
                return "The cat's name is " + name + ", no mother, father is " + parent2.name;
            else return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;


        }
    }

}
