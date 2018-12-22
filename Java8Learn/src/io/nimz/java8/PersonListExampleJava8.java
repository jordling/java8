package io.nimz.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class PersonListExampleJava8 {

	public static void main(String args[]) {
		List<Person> personList = Arrays.asList(new Person("Naeem", "Arshad", 30), new Person("Tom", "Engro", 50),
				new Person("Marie", "Lundin", 25), new Person("Aysha", "Takia", 18), new Person("Johnny", "English", 60)

		);

		// sort person list by last name;

		Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// print all elements starting lastName with E, its not good if condition
		// changes

		// for printing all use printConditionally also
		
        
		printConditionally(personList, p -> true);
		
		
		// to improve above method use another method

		//printConditionally(personList, p -> p.getLastName().startsWith("E"));

		//printConditionally(personList, p -> p.getFirstName().startsWith("N"));

	
	}

	private static void printConditionally(List<Person> personList, Condition condition) {
		for (Person p : personList) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}
