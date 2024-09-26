package com.mindgate.main;

import java.util.Arrays;
import java.util.List;

import com.mindgate.main.domain.Person;

public class CollectionIteration {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vivek", "Gohil", 34), new Person("Trupti", "Acharekar", 36),
				new Person("Gurubux", "Gill", 32), new Person("Samarth", "Patil", 11));

		for (Person person : people) {
			System.out.println(person);
		}

		System.out.println();

		people.forEach(p -> System.out.println(p));

	}
}
