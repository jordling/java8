package io.nimz.java8;

public class MethodReferenceExample {

	public static void main(String[] args) {

		Thread t = new Thread(() -> printMessage());
		t.start();

		// using method reference
		Thread t1 = new Thread(MethodReferenceExample::printMessage); //()->method()
		t1.start();

	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
