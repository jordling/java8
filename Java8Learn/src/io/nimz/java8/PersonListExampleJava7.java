package io.nimz.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonListExampleJava7 {

	public static void main(String args[]) {
		List<Person> personList = Arrays.asList(new Person("Naeem", "Arshad", 30), new Person("Tom", "Engro", 50),
				new Person("Marie", "Lundin", 25), new Person("Aysha", "Takia", 18), new Person("Johnny", "English", 60)

		);

		// sort person list by last name;

		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// print all elements in the list

		printAll(personList);

		// print all elements starting lastName with E, its not good if condition changes

		printLastNameStartingWithE(personList);

		// to improve above method use another method

		printConditionally(personList, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("E");
			}

		});
		
		
		printConditionally(personList, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("N");
			}

		});

	}

	private static void printConditionally(List<Person> personList, Condition condition) {
		for (Person p : personList) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printLastNameStartingWithE(List<Person> personList) {
		for (Person p : personList) {
			if (p.getLastName().startsWith("E")) {
				System.out.println("STARTING WITH E LASTNAME:" + p);
			}
		}
	}

	private static void printAll(List<Person> personList) {

		for (Person p : personList) {
			System.out.println(p);
		}
	}

}

interface Condition {
	boolean test(Person p);
}
