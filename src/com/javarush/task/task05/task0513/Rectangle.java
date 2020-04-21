package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int height) {
        this.top = top;
        this.left = left;
        this.width = height;
        this.height = height;
    }

    public void initialize(int width) {
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = width;
    }

    public static void main(String[] args) {

    }
}
