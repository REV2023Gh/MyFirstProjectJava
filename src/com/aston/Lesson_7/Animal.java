package com.aston.Lesson_7;

public class Animal {
    static int countAnimal = 0 ;

    String name;

    public Animal(String name) {
        countAnimal ++;
        this.name = name;

    void run(int distance) {
        System.out.println("Животное пробежало " + distance + "метров");
        }

    void swim(int distance) {
         System.out.println("Животное проплыло " + distance + "метров");
        }
    }
    public static int getCountAnimal() {
        return countAnimal;
    }
}
