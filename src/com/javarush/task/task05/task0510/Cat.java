package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;


    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "red";
    }

    public void initialize(String name,int weight,int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "white";
    }


    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;

    }

    public static void main(String[] args) {

    }
}
