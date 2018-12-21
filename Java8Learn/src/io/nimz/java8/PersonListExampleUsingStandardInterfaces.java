package io.nimz.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonListExampleUsingStandardInterfaces {

	public static void main(String args[]) {
		List<Person> personList = Arrays.asList(new Person("Naeem", "Arshad", 30), new Person("Tom", "Engro", 50),
				new Person("Marie", "Lundin", 25), new Person("Aysha", "Takia", 18), new Person("Johnny", "English", 60)

		);

		// sort person list by last name;

		Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// print all elements starting lastName with E, its not good if condition
		// changes

		// for printing all use printConditionally also

		performConditionally(personList, p -> true, p -> System.out.println(p));

		// to improve above method use another method

		performConditionally(personList, p -> p.getLastName().startsWith("E"),p -> System.out.println(p));

		performConditionally(personList, p -> p.getFirstName().startsWith("N"),p -> System.out.println(p));

	}

	private static void performConditionally(List<Person> personList, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : personList) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
