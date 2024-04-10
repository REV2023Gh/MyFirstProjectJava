package com.aston.Lesson_7;

public class Dog extends Animal {
    static int countDog = 0;
    public Dog(String name) {
        super(name);
        countDog++;
    }
        this.name = name;
    @Override
    void run(int distance) {
        if (distance < 500) {
            System.out.println(name + "Пробежал " + distance + "метров");
        } else {
            System.out.println("Собаки столько пробежать не могут!");
        }
    }
    @Override
    void swim(int distance) {
        if (distance < 10) {
            System.out.println(name + "Проплыл " + distance + "метров");
        } else {
            System.out.println("Спасите собачку, кажется, она тонет!");
        }

    }
    static int getCountDog() {
        return countDog;
    }




}


