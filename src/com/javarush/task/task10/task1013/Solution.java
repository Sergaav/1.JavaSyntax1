package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int height;
        private int weight;
        private String hairColor;

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean sex, int height, int weight) {
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(boolean sex, int height, String hairColor) {
            this.sex = sex;
            this.height = height;
            this.hairColor = hairColor;
        }

        public Human(String name, boolean sex, String hairColor) {
            this.name = name;
            this.sex = sex;
            this.hairColor = hairColor;
        }

        public Human(String name, int age, String hairColor) {
            this.name = name;
            this.age = age;
            this.hairColor = hairColor;
        }

        public Human(String name, int age, boolean sex, int height, int weight, String hairColor) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.hairColor = hairColor;
        }

        public Human(String name, int age, boolean sex, int height, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
