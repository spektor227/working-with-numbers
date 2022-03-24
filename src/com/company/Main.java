package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        for (int number : intList) {
            if (number > 0) {
                intList1.add(number);
            }
        }
        for (int number1 : intList1) {
            if ((number1 % 2) == 0) {
                intList2.add(number1);
            }
        }
        Collections.sort(intList2);

        System.out.println(intList2);

    }
}


