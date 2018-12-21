package io.nimz.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Naeem", "Arshad", 30), new Person("Tom", "Engro", 50),
				new Person("Marie", "Lundin", 25), new Person("Aysha", "Takia", 18), new Person("Johnny", "English", 60)

		);

		personList.parallelStream()
		.filter(p->p.getLastName().startsWith("E"))
		.forEach(System.out::println);

		
		long count = personList.stream()
		.filter(p->p.getLastName().startsWith("T"))
		.count();
		System.out.println(count);
		
		
		
	}

}
