package com.aston.Lesson_7;

public class Cat extends Animal {
    static int countCat = 0;
    public Cat(String name) {
        super(name);
        countCat++;
    }
        this.name = name;
    @Override
    void run(int distance) {
        if (distance < 200) {
            System.out.println(name + "Пробежал " + distance + "метров");
        } else {
            System.out.println("Котики столько не бегают!");
        }
    }
    @Override
    void swim(int distance) {
        System.out.println("Котики не умеют плавать");
    }

    static int getCountCat() {
        return countCat;
    }

   public int getFullness(int food){
        return food;
   }



}