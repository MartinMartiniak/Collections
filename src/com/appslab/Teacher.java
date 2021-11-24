package com.appslab;


public class Teacher extends Employee {


    public Teacher(float salary, int bonus) {
        super(salary, bonus, EnumEmployee.TEACHER);
    }
}