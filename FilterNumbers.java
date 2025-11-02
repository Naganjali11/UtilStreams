package com.codegnan.utilstreams;
import java.util.*;
import java.util.stream.*;
public class FilterNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt(); 
        int k = scanner.nextInt(); 
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        List<Integer> filteredNumbers = numbers.stream()
            .filter(num -> num > k)
            .collect(Collectors.toList()); 
        filteredNumbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        scanner.close();
		
	}

}
