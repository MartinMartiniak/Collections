package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
//Collections1
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //    numbers = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

//Collections2
        AddIfNotExists addIfNotExists = (List<Integer> list, int a) -> {
            if (list.contains(a)) {
                System.out.println("Already in the list!");
            } else {
                list.add(a);
            }
        };
        //Collections3
        DeleteEvenNumbers deleteEvenNumbers = (List<Integer> list) -> list.removeIf(n -> (n % 2 == 0));

        //deleteEvenNumbers.getOdd(numbers);
      //  System.out.println(numbers);
       // addIfNotExists.noExist(numbers, 8);
        //System.out.println(numbers);

        //Collections4
        GetEvenNumbers getEvenNumbers = (List<Integer> list) -> {
            List<Integer> listOfEvenNumbers = new ArrayList<>();
            list.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
            System.out.println(listOfEvenNumbers);
        };
        getEvenNumbers.getEven(numbers);

    }



    interface DeleteEvenNumbers {
        void getOdd(List<Integer> list);
    }

        interface AddIfNotExists{
            void noExist(List<Integer> list, int a);
        }
        interface GetEvenNumbers{
        void getEven(List<Integer> list);
        }
    }





