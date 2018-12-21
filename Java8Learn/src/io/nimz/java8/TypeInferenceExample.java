package io.nimz.java8;

public class TypeInferenceExample {

	public static void main(String[] args) {

		StringLengthLambda myLambda = (String s) -> s.length();
		// if there is lambda function in interface then no need to write the type, use
		// instead
		StringLengthLambda myLambda1 = (s) -> s.length();
		// if there is only one parameter, then remove the parenthesis use instead
		StringLengthLambda myLambda2 = s -> s.length();

		System.out.println(myLambda.getStringLength("HelloNimz"));

		// using type inference...
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getStringLength("Hello NIMZY"));
	}

	interface StringLengthLambda {
		int getStringLength(String s);
	}

}
