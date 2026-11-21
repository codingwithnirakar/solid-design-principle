package com.nirakar.java.practice.stream;

import java.util.Arrays;
import java.util.List;

public class CountStringWithASpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        System.out.println("Printing names starting with A:");
        names.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println("Printing total count of names starting with A:");
        long a = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(a);
    }
}
