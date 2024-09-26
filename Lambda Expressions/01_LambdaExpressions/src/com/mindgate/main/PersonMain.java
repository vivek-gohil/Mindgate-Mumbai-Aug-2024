package com.mindgate.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mindgate.main.domain.Person;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vivek", "Gohil", 34), new Person("Trupti", "Acharekar", 36),
				new Person("Gurubux", "Gill", 32), new Person("Samarth", "Patil", 11));

		// Sort the list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		// Create a method that prints all the elements from list people
		printAll(people);

		System.out.println();
		// Create a method that prints people that have last
		// name beginning with G
		printAllLastNameStartWithG(people);

		// Create a method that prints people that have last
		// name ending with L
		System.out.println();
		printAllLastNameEndingWithL(people);
	}

	public static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}

	public static void printAllLastNameStartWithG(List<Person> people) {
		for (Person person : people) {
			if (person.getLastName().startsWith("G"))
				System.out.println(person);
		}
	}

	public static void printAllLastNameEndingWithL(List<Person> people) {
		for (Person person : people) {
			if (person.getLastName().endsWith("l"))
				System.out.println(person);
		}
	}
}
