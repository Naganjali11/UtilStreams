package com.codegnan.utilstreams;

import java.util.Arrays;
import java.util.List;

public class FilterMapExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 75, 100, 22, 37);
        List<String> names = Arrays.asList("Ravi", "Priya", "Arjun", "Deepa", "Anil", "Bhavana");
        System.out.println("FILTER EXAMPLES:");
        // 1. Numbers greater than 40
        numbers.stream()
                .filter(n -> n > 40)
                .forEach(n -> System.out.println("Greater than 40: " + n));

        // 2. Names starting with 'A' 
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println("Starts with A: " + name));

        // 3. Names with length greater than 4
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(name -> System.out.println("Length > 4: " + name));

        // 4. Numbers divisible by 5
        numbers.stream()
                .filter(n -> n % 5 == 0)
                .forEach(n -> System.out.println("Divisible by 5: " + n));

        System.out.println("\nMAP EXAMPLES:");
        // 1. Multiply each number by 2
        numbers.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.println("Number*2: " + n));

        // 2. Convert all names to uppercase
        names.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println("Uppercase: " + name));

        // 3. Find the length of each name
        names.stream()
                .map(String::length)
                .forEach(length -> System.out.println("Name length: " + length));

        // 4. Print welcome message
        names.stream()
                .map(name -> "Welcome " + name)
                .forEach(msg -> System.out.println(msg));
    }

}
