package com.appslab;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MultiplyByLength multiplyByLength = (List<Integer> list) -> {
            List<Integer> listOfEvenNumbers = new ArrayList<>();

            list.stream().map(i->i*list.size()).forEach(listOfEvenNumbers::add);
            System.out.println(listOfEvenNumbers);
        };

        List<Integer> Array1 = new ArrayList<>();
        Array1.add(2);
        Array1.add(3);
        Array1.add(1);
        Array1.add(0);

        multiplyByLength.multipList(Array1); //don't mind the pun :D multip(ly/Li)st haha get it?
    }
    interface MultiplyByLength{
      void multipList(List<Integer> list);
    }
}
