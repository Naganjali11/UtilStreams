package com.codegnan.utilstreams;

import java.util.Arrays;
import java.util.List;

public class FilterMapCustomExample {

	public static void main(String[] args) {
		List<Employee>employees=Arrays.asList(
				new Employee(101,"Ravi",55000,"IT"),
				new Employee(102,"priya",35000,"HR"),
				new Employee(103,"Arjun",60000,"Finanace"),
				new Employee(104,"Deepa",42000,"IT"),
				new Employee(105,"Anil",28000,"Admin")
				);
		//Filter
		//1. Print all Employees having salary greater than 40000
		System.out.println("Employees Salary is Greater than 40000");
		employees.stream().filter(e->e.salary>40000).forEach(System.out::println);
		//2. Print all Employees who belonging to IT department
		System.out.println("Employees belonging to the IT department");
		employees.stream().filter(e->e.department.equalsIgnoreCase("IT")).forEach(System.out::println);
		
		//3. Print Employees whose names start with A
		System.out.println("Employees Whoose names start with A");
		employees.stream().filter(e->e.name.startsWith("A")).forEach(System.out::println);
		
		//4. Employees not from HR department
		System.out.println("Employees Who are not from Hr department");
		employees.stream().filter(e->!e.department.equalsIgnoreCase("HR")).forEach(System.out::println);
		
		//Map
		//1. Display only Employee Names
		System.out.println("Employees Names ");
		employees.stream().map(e->e.name).forEach(System.out::println);
		
	    //2. Print Names in Upper Case
		System.out.println("Employees Names in Upper Case");
		employees.stream().map(e->e.name.toUpperCase()).forEach(System.out::println);
		
		//3. Print Salary After adding 10% increment
		System.out.println("Employees after 10% Increment");
		employees.stream().map(e->e.salary*1.10).forEach(System.out::println);
		
		//4. Create Message Name works in Department
		System.out.println("Employees ");
		employees.stream().map(e->e.name+"works in"+e.department+"department").forEach(System.out::println);
		
	}

}
