package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grFather1 = new Human("Valera",true,65);
        Human grFather2 = new Human("Vova",true,68);
        Human grMother1 = new Human("Valentina",false,61);
        Human grMother2 = new Human("Olga",false,63);

        Human mother = new Human("Inna",false,38,grFather1 , grMother2);
        Human father = new Human("Anrdii",true,38,grFather2, grMother1);
        Human son = new Human("Ielisei",true,10,father,mother);
        Human daughter1 = new Human("Maria",false,2,father, mother);
        Human daughter2 = new Human("Marina",false,1,father, mother);
        System.out.println(grFather1.toString());
        System.out.println(grFather2.toString());
        System.out.println(grMother1.toString());
        System.out.println(grMother2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(son.toString());
        System.out.println(daughter1.toString());
        System.out.println(daughter2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}