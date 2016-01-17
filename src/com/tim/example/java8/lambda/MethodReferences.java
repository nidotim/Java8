package com.tim.example.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferences::greet) ;
		//t.run();
		
		Thread t2 = new Thread(System.out::println) ;
		t2.run();

		Runnable runnable = () ->{
			
		};
		ArraySort();
	}
	
	public static void ArraySort(){
		List<String> stringList = new ArrayList<String>(Arrays.asList("Aa", "Bb", "bc", "aE", "de", "ac"));
		System.err.println(stringList);

		// Collections.sort(stringList);
		// Collections.sort(stringList, (x, y) -> x.compareToIgnoreCase(y));
		Collections.sort(stringList, String::compareToIgnoreCase);

		System.err.println(stringList);

	}
	
	public static void greet(){
		System.out.println("Hello World" );
	}

}
