package com.codegnan.utilstreams;

public class Person {
	int id;
	String name;
	String email;
	int age;
	public Person(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	

}
