package io.nimz.java8;

public class RunnableExample {

	public static void main(String[] args) {

		
		Thread myThread  = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("this is runnable run");
				
			}
			
		});
		myThread.start();  // to run the run method, myThread.run();

		// USE Lambda version now
		
		Thread myLambdaThread = new Thread(()->System.out.println("Lambda Runnable"));
		myLambdaThread.start();
		
	}

}
