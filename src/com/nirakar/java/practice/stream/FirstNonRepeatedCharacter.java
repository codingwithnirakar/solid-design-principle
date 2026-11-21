package com.nirakar.java.practice.stream;

import java.util.Optional;

public class FirstNonRepeatedCharacter{
    public static void main(String[] args) {
        String input = "swiss";
        Optional<Character> first = input.chars().mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();
        System.out.println(first.orElse(null));
    }
}
