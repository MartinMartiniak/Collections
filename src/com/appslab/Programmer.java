package com.appslab;

public class Programmer extends Employee {

    public Programmer(float salary, int bonus) {
        super(salary, bonus, EnumEmployee.PROGRAMMER);
    }
}