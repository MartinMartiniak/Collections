package com.appslab.everythingbutmain;


import com.appslab.everythingbutmain.Employee;
import com.appslab.everythingbutmain.EnumEmployee;

public class Teacher extends Employee {


    public Teacher(float salary, int bonus) {
        super(salary, bonus, EnumEmployee.TEACHER);
    }
}