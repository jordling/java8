package io.nimz.java8;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Naeem", "Arshad", 30), new Person("Tom", "Engro", 50),
				new Person("Marie", "Lundin", 25), new Person("Aysha", "Takia", 18), new Person("Johnny", "English", 60)

		);

		System.out.println("///// Using for loop");

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i));
		}

		System.out.println("///// Using for-in loop");

		for (Person p : personList) {
			System.out.println(p);
		}

		System.out.println("///// Using java 8 lambda fore-each with consumer");

		personList.forEach(System.out::println);

	}

}
