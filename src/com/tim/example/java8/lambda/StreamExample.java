package com.tim.example.java8.lambda;

import java.util.HashMap;
import java.util.Map;

public class StreamExample {

	public static void main(String[] args) {
		Map<String, Integer> perfMap = new HashMap<String, Integer>();
		perfMap.put("api 1", 200);
		perfMap.put("api 2", 5912);
		perfMap.put("api 3", 594412);
		perfMap.put("api 4", 53912);
		perfMap.put("api 5", 1912);
		

		// perfMap.forEach((String x, Integer y) -> System.out.println(",value:"
		// + y));
	}

}
