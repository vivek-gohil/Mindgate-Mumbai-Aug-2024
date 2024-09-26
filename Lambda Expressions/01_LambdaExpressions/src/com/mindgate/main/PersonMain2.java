package com.mindgate.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.mindgate.main.domain.Person;

public class PersonMain2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vivek", "Gohil", 34), new Person("Trupti", "Acharekar", 36),
				new Person("Gurubux", "Gill", 32), new Person("Samarth", "Patil", 11));

		Collections.sort(people, 
				(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printConditionally(people,
				p -> true, 
				p -> System.out.println(p));

		System.out.println();

		printConditionally(people,
				p -> p.getLastName().startsWith("G"),
				p -> System.out.println(p.getFirstName()));

		System.out.println();

		printConditionally(people,
				p -> p.getLastName().endsWith("l"),
				p -> System.out.println(p.getLastName()));
	}

	private static void printConditionally(List<Person> people,
			Predicate<Person> condition,
			Consumer<Person> consumer) 
	{
		for (Person person : people) {
			if (condition.test(person)) {
				consumer.accept(person);
			}
		}
	}
}

//interface Condition {
//	boolean test(Person p);
//}
