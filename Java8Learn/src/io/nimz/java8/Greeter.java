package io.nimz.java8;

public class Greeter {

	public static void main(String args[]) {
		Greeter g = new Greeter();

		// Java 7 way
		HelloWorldGreeting hg = new HelloWorldGreeting();
		g.greeter(hg);

		GoodByeGreeting gg = new GoodByeGreeting();
		g.greeter(gg);
		// Java 7 but take out extra implementation classes, use innerclass
		Greeting innerGreeting = new Greeting() {
			public void perform() {
				System.out.println("INLINE GREETING");
			}
		};
		innerGreeting.perform();
		// or
		g.greeter(innerGreeting);

		// Java8 way, no need of implementation clas or inner class, just call function
		// direct with interface

		Greeting myGreetingLambaFunction = () -> System.out.println("hello Nimz to lambda functions");
		myGreetingLambaFunction.perform();
		// or
		g.greeter(myGreetingLambaFunction);
		
		// one step further , java has type inference, so use inline direct
		g.greeter(() -> System.out.println("INLIN  lambda functions"));

	}

	public void greeter(Greeting greeting) {
		greeting.perform();
	}
}
