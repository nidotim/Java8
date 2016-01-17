package com.tim.example.java8.lambda;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		RunnableExample();

	}
	
	public static void RunnableExample(){
		//original
		Runnable oldRunnable = new Runnable(){
			@Override
			public void run(){
				System.err.println("old runnable");
			}
		};
		
		//lambda
		Runnable runnable = () -> {
			System.err.println("runnable");
		};
		
		
		runnable.run();
		oldRunnable.run();		
	}

}
