package com.ss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,9,11);

		List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		List<String> fruits2 = Arrays.asList("apple","apple","apple","apple","apple","appl");

		/*List<Integer> primeNumbers = list.stream()
		                                 .filter(Practice::isPrime)
		                                 .collect(Collectors.toList());

		System.out.println("Prime Numbers: " + primeNumbers);
	}

	// ✅ Move this method OUTSIDE the main method
	public static boolean isPrime(int number) 
	{
		if (number <= 1) 
			return false;

		return IntStream.rangeClosed(2, (int)Math.sqrt(number))
		                .allMatch(n -> number % n != 0); */
		String match ="apple";
		
	/*boolean res =	fruits.stream().anyMatch(str -> str.contains(match));
	System.out.println(res);
		boolean res2 = fruits2.stream().allMatch(str -> str.contains(match));
		
		System.out.println(res2);*/
		
		
		
	List<String> result =  fruits.stream().filter(str -> str.length()>5).collect(Collectors.toList());
	
	System.out.println(result);
		
		
		
	}
}
