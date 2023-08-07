package com.canterosolutions.funcionalprogramming;

import java.util.List;

public class PP01Excercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> courses = List.of(
                "Spring",
                "Spring Boot",
                "API",
                "Microservices",
                "AWS",
                "PCP",
                "Azure",
                "Docker",
                "Kubernets"
        );
        // Print odd numbers
        numbers.stream()
                .filter(x -> x%2 != 0)
                .forEach(System.out::println);

        System.out.println("......");
        // Print All courses
        courses.forEach(System.out::println);
        System.out.println("......");
        // Print All courses containing Spring
        courses.stream()
                .filter(x -> x.contains("Spring"))
                .forEach(System.out::println);
        System.out.println("......");
        // Print All courses containing at least 4 letters
        courses.stream()
                .filter(x -> x.length() >= 4)
                .forEach(System.out::println);
    }
}
