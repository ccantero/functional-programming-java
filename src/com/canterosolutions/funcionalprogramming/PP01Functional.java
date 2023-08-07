package com.canterosolutions.funcionalprogramming;

import java.util.List;

public class PP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        printAllNumbersInListFunctional(numbers);
        System.out.println("......");
        printEvenNumbersInListFunctional(numbers);
        System.out.println("......");
        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> "The square of " + number.toString() + " is " + String.valueOf(number * number))
                .forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //numbers.stream().forEach(PP01Functional::print);
        numbers.forEach(System.out::println);
    }

}
