package com.appslab;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");

        Integer key1 = 0;
        Integer key2 = 2;

        String value1 = "Grey";
        String value2 = "Red";

        addNewItemIfDoesntExit(map, value1, key1);
        showHashMap(map);

        System.out.println();

        addNewItemIfDoesntExit(map, value2, key2);
        showHashMap(map);

        System.out.println();
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

    public static void addNewItemIfDoesntExit(HashMap<Integer, String> map, String value, Integer key) {
        if (!map.containsKey(key)) {
            if (!map.containsValue(value)) {
                System.out.println("Item added in HashMap");
                map.put(key, value);
            } else {
                System.out.println("Item already exist");
            }
        } else {
            System.out.println("Item already exist");
        }
    }
}