package com.appslab;

import java.util.stream.Stream;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ContainsA containsA = (List<People> peopleList) ->{

            boolean result = peopleList.stream()
                    .anyMatch(e -> e.getName().contains("a"));
            System.out.println(result);
        };
        People person1 = new People("John", 21, 23000 );
        People person2 = new People("Steve", 32, 40000);
        People person3 = new People("Martin", 16, 2700);

        List<People> peopleList = new ArrayList<>();

        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);

        containsA.conA(peopleList);


    }
    interface ContainsA{
        void conA(List<People> personList);
    }
}
class People {
    private String name;
    private int age;
    private int budget;

    public People(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }
    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public int getAge() {
        return age;
    }
}