package com.appslab;
import com.appslab.everythingbutmain.Driver;
import com.appslab.everythingbutmain.Employee;
import com.appslab.everythingbutmain.Programmer;
import com.appslab.everythingbutmain.Teacher;

import java.util.*;
public class Main {

        public static void main(String[] args) {
            ArrayList<Employee> listOfEmployees = new ArrayList<>();
            listOfEmployees.add(new Teacher(900,300));
            listOfEmployees.add(new Programmer(1700,200));
            listOfEmployees.add(new Driver(1000,250));

            listOfEmployees.forEach(Employee::getInfo);
        }
    }
