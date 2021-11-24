package com.appslab;

public class Main {

        public static void main(String[] args) {
            Teacher teacher = new Teacher(900,300);
            Programmer programmer = new Programmer(1700,200);

            teacher.getInfo();
            programmer.getInfo();
        }
    }
