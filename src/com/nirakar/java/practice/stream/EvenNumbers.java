package com.nirakar.java.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Even numbers
public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenList = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Even Numbers: " + evenList);
    }

}
