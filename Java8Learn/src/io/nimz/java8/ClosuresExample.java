package io.nimz.java8;

public class ClosuresExample {

	public static void main(String[] args) {

		int a= 10;
		doProcess(a, b->System.out.println(b));
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}
