package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;

        int a = 0;
        int b = 0;
        if (age > anotherCat.age)
            a++;
        else if (age == anotherCat.age){
                a++;
            b++;}
            else b++;
        if (weight > anotherCat.weight)
            a++;
        else if (weight == anotherCat.weight){
            a++;
            b++;}
            else b++;
        if (strength > anotherCat.strength)
            a++;
        else if (strength == anotherCat.strength) {
                a++;
            b++;}
            else b++;

        if (a != b) {
            if (a > b) return true;
            else return false;
        } else
            return false;





}

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 3;
        cat1.strength = 10;

        Cat cat2 = new Cat();
        cat2.age = 6;
        cat2.weight = 2;
        cat2.strength = 8;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}

