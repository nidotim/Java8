package com.tim.example.java8.lambda;

import java.time.Duration;
import java.time.Instant;

public class SmallTests {

	public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now();
		Thread.sleep(5000);
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);

		long millis = timeElapsed.toMillis();
		System.err.println(millis);

		// repeat(1000, () -> System.out.println("Hello World"));

		// repeat(1000, () -> SmallTests.hello());
		// repeat(1000, SmallTests::hello);
	}

	public static void hello() {
		System.out.println("Hello World");
	}

	public static void calcSpeed(Runnable action) {
		long startTime = System.currentTimeMillis();
		action.run();
		long endTime = System.currentTimeMillis();
	}

	public static void repeat(int n, Runnable action) {
		for (int i = 0; i < n; i++)
			action.run();
	}
}
