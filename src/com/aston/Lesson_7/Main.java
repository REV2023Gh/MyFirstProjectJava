package com.aston.Lesson_7;


public static void main(String[] args) {
    Animal animal = new Animal();
    Cat barsik1 = new Cat("Барсик1");
    Cat barsik2 = new Cat("Барсик2");
    Dog sharik1 = new Dog("Шарик1");
    Dog sharik2 = new Dog("Шарик2");
    barsik1.run(100);
    barsik2.run(250);
    barsik1.swim(100);
    barsik2.swim(1);
    sharik1.run(500);
    sharik2.run(501);
    System.out.println("Всего животных: " + Animal.getCountAnimal());
    System.out.println("Всего котиков: " + Cat.getCountCat());
    System.out.println("Всего собачек: " + Dog.getCountDog());

    Cat cat2 = new Cat();
    cat2.getFullness(10);
    Cat[] array = new Cat[3];
    array[0] = new Cat("Барсик1", 1, false);
    array[1] = new Cat("Барсик2, 10, false);
    array[2] = new Cat("Барсик3, 20, false);

    for (int i = 0; i < array.length; i++) {
        if






}
