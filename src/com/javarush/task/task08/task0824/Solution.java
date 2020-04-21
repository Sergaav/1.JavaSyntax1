package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();
        ArrayList<Human> children3 = new ArrayList<>();
        ArrayList<Human> children4 = new ArrayList<>();

        Human grandFather1 = new Human("Vova", false, 68, children1);
        Human grandFather2 = new Human("Valera", false, 65, children2);
        Human grandMother1 = new Human("Valentina",true,62,children1);
        Human grandMother2 = new Human("Olia",true,61,children2);
        Human Father = new Human("Andrii",false,38,children3);
        Human Mother = new Human("Inna",true,38,children3 );
        Human daughter = new Human("Mariya", true,2,children4);
        Human son = new Human("Ielysei",false,10,children4);
        Human son2 = new Human("Aleksandr",false,1,children4);
        children1.add(Father);
        children2.add(Mother);
        children3.add(son);
        children3.add(son2);
        children3.add(daughter);
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(son.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "женский" : "мужской");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
