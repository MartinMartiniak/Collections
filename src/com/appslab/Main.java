package com.appslab;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");

        showHashMap(map);

    }

    public static void showHashMap(HashMap<Integer, String> map) {
        System.out.println("Keys: ");
        for (Integer i : map.keySet()) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Values: ");
        for (String i : map.values()) {
            System.out.print(i + ", ");
        }
    }


}