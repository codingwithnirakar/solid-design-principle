package com.nirakar.java.practice.stream;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
