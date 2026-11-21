package com.nirakar.java.practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("Reverse Order");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
