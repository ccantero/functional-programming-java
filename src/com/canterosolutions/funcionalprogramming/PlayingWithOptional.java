package com.canterosolutions.funcionalprogramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Orange", "Apple");
        Predicate<? super String> predicate = fruit -> fruit.toLowerCase().startsWith("b");
        Optional<String> first = fruits.stream().filter(predicate).findFirst();
        System.out.println(first.isEmpty());
        System.out.println(first.isPresent());
        System.out.println(first.get());

        Optional<String> none = fruits.stream().filter(String::isEmpty).findFirst();
        System.out.println(none.isEmpty());
        System.out.println(none.isPresent());
        // System.out.println(none.get()); // NoSuchElementException

    }
}
