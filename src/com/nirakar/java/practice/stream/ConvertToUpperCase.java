package com.nirakar.java.practice.stream;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
