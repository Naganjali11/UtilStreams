package com.codegnan.utilstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomObjectsProcessMechanisms {

	public static void main(String[] args) {
		List<Person>persons=Arrays.asList(
				new Person(1,"Malli","arjun@gmail.com",27),
				new Person(5,"Mani","kumar@gmail.com",22),
				new Person(3,"ravi","kumari@gmail.com",32),
				new Person(7,"Manish","sharma@gmail.com",42)
				);
				//collect
		List<Person> ageAbove30=persons.stream().filter(e->e.age>30)
				.collect(Collectors.toList());
		System.out.println("Person with Age above 30:"+ageAbove30);
		//count
		System.out.println("Person names length greater than 4:"
		+persons.stream().filter(p->p.name.length()>4).count());
		//sorted() method
		System.out.println("person with id in Assending order:"
		+persons.stream().sorted((e1,e2)->Integer.compare(e1.id,e2.id)).
		collect(Collectors.toList()));
		System.out.println("person with id in desending order:"
				+persons.stream().sorted((e1,e2)->-Integer.compare(e1.id,e2.id)).
				collect(Collectors.toList()));
		System.out.println("person  email id in Assending order:"
				+persons.stream().sorted((p1,p2)->p1.email.compareTo(p2.email)).
				collect(Collectors.toList()));
		System.out.println("person  email id in Desending order:"
				+persons.stream().sorted((p1,p2)->-p1.email.compareTo(p2.email)).
				collect(Collectors.toList()));
		//Min And Max Methods
		System.out.println("person  email id in Desending order in min element:"
				+persons.stream().min((p1,p2)->p1.email.compareTo(p2.email))
				.get());
		System.out.println("person  email id in Desending order in max element:"
				+persons.stream().max((p1,p2)->p1.email.compareTo(p2.email))
				.get());
		
				
				
	}

}
