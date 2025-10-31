package com.codegnan.utilstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class FilterExample {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		numbers.stream().filter(i->i%2==0).forEach(System.out::println);
		
		/*Stream<Integer> s=numbers.stream();
		Stream<Integer> evenNumbers=s.filter(i->i%2==0);
		System.out.println(evenNumbers);
		evenNumbers.forEach(System.out::println);*/
		System.out.println("Map");
		numbers.stream().map(i->i+2).forEach(System.out::println);
		/*Stream<Integer> s1=numbers.stream();
		System.out.println("Map");
		Stream<Integer> addTwo=s1.map(i->i+2);
		addTwo.forEach(System.out::println);*/
		
	}

}
