package com.te.javabasics.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import com.te.javabasics.collections.Employee;

public class StudentTest {
	public static void main(String[] args) {
		boolean count = true;
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(14, "Manjunath", 28, 784.44, "Ballari"));
		arrayList.add(new Student(29, "Santosh", 26, 465.44, "Ballari"));
		arrayList.add(new Student(34, "Ankit", 24, 284.44, "Ballari"));
		arrayList.add(new Student(62, "Rajesh", 32, 384.44, "Ballari"));
		arrayList.add(new Student(24, "Nithin", 23, 564.44, "Ballari"));
		do {
			System.out.println("Enter 1 to sort student details by rollNo");
			System.out.println("Enter 2 to sort student details by name");
			System.out.println("Enter 3 to sort student details by age");
			System.out.println("Enter 4 to sort student details by marks");
			System.out.println("Enter 5 to sort student details by address");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number");
			int number = scanner.nextInt();

			switch (number) {
			case 1: {
				Collections.sort(arrayList, new CompareByrollNo());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}

				break;

			case 2: {
				Collections.sort(arrayList, new CompareByName());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 3: {
				Collections.sort(arrayList, new CompareByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 4: {
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 5: {
				Collections.sort(arrayList, new CompareByAddress());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			}
			System.out.println("want to repeat the student details");
			String string = scanner.next();
			if (string.equalsIgnoreCase("YES")) {
				count = true;
			} else if (string.equalsIgnoreCase("NO")) {
				count = false;
				System.out.println("EXIT the program");
			}

		} while (count);
	}
}
