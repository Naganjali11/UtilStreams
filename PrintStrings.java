package com.codegnan.utilstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }
        names.stream().forEach(System.out::println);
        sc.close();
    }
}
