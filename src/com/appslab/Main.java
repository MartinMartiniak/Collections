package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5);
        if (numbers.isEmpty()) {
            System.out.println("List je prázdny");
        } else {
            numbers.forEach(System.out::println);
        }
    }
}