package com.appslab;
import java.util.ArrayList;
import com.appslab.everythingbutmain.Employee;


public class EmployeeInterfaceImpl {
    public static void totalSalary(ArrayList<Employee> listOfEmployees){
        System.out.println("Spolu výplaty" + listOfEmployees.stream().
                mapToDouble(Employee::getSalary).
                sum());
    }
    public static void totalBonus(ArrayList<Employee> listOfEmployees){
        System.out.println("Spolu bonusy:" + listOfEmployees.stream().
                mapToDouble(Employee::getBonus).
                sum());
    }
}

