package com.appslab;

import com.appslab.everythingbutmain.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    void totalSalary(ArrayList<Employee> listOfEmployee);

    void totalBonus(ArrayList<Employee> listOfEmployee);
}