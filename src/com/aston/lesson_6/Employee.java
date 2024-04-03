package com.aston.lesson_6;

// 1

public class Employee {
        public String surname;
        public String name;
        public String middle_name;
        public String position;
        public String email;
        public int phone;
        public int salary;
        public int age;

    public Employee(String surname, String name, String middle_name, String position,
                String email, int phone, int salary, int age){
            this.surname = surname;
            this.name = name;
            this.middle_name = middle_name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

public void info() {
            System.out.println(surname + name + middle_name + position + email + phone + salary + age);
        }
    }
}