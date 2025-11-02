package com.codegnan.utilstreams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class FilterStudents {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student1> students = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int grade = sc.nextInt();
            students.add(new Student1(id, name, grade));
        }

        int threshold = sc.nextInt();

        List<String> filteredNames = students.stream()
            .filter(s -> s.getGrade() >= threshold)
            .map(Student1::getName)
            .collect(Collectors.toList());
        filteredNames.forEach(name -> System.out.print(name + " "));
        System.out.println();

        sc.close();
    }

}
