package com.aston.lesson_6;

//3
public class Park {
    public class Attractions {
        private String info;
        private int working_hours;
        private int cost;
        public Attractions(String info,int working_hours,int cost) {
            this.info = info;
            this.working_hours = working_hours;
            this.cost = cost;
        }
        public  String getInfo() {
            return info;
        }
        public int getCost() {
            return cost;
        }
        public int getWorking_hours() {
            return working_hours;
        }
    }
}
