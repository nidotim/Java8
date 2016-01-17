package com.tim.example.java8.lambda;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstructorReferences {

	private static List<String> intStringList;

	private static int listSize = 1000000;

	public static void main(String[] args) {
		intStringList = new ArrayList<String>();
		for(int i = 0; i < listSize; i++){
			intStringList.add(String.valueOf(i));
		}
		// List<String> labels = new ArrayList<String>(Arrays.asList("new",
		// "edit", "save"));
		// List<String> labels = new ArrayList<String>(Arrays.asList("1", "4",
		// "6"));
		// Stream<Integer> stream = labels.stream().map(Integer::new);
		// List<Integer> ints = stream.collect(Collectors.toList());
		// System.err.println(ints);

		calcSpeed("oldWay", ConstructorReferences::oldWay);
		calcSpeed("lambdaWay", ConstructorReferences::lambdaWay);

	}

	public static void oldWay() {
		List<Integer> intList = new ArrayList<Integer>();
		for (String str : intStringList) {
			intList.add(Integer.parseInt(str));
			// intList.add(new Integer(str));
		}
	}

	public static void lambdaWay() {
		// intStringList.forEach(System.out::println);
		List<Integer> ints = intStringList.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public static void calcSpeed(String name, Runnable action) {
		long startTime = System.currentTimeMillis();
		action.run();
		long endTime = System.currentTimeMillis();
		System.out.println(name + " time spent:" + (endTime - startTime));
	}

}
