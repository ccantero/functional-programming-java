package com.canterosolutions.funcionalprogramming;

import java.util.List;

public class PP01Structured {

    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(1,2,3,4,5));
        printEvenNumbersInListFunctional(List.of(1,2,3,4,5));
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        for (int number : numbers) {
            if(number%2 == 0)
                System.out.println(number);
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
