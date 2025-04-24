package com.ss;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		List<String> names = Arrays.asList("Alice john", "Bob Marlie", "Charlie Jackson");
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4,5));
		
		/*find maximum number*/
		int max =	numbers.stream().max(Integer::compareTo)
		.orElseThrow(() -> new RuntimeException("List is empty"));
		
		/*========Calculate the sum of elements in a list of integers.*/
		
		int sum = numbers.stream()
				  .mapToInt(Integer::intValue)
				  .sum();
		
		//System.out.println(sum);
		
		
		/*========List of Names to Uppercase*/
		 List<String> upper = names.stream().map(String::toUpperCase)
				         .collect(Collectors.toList());
		 
		 //System.out.println(upper);
		 
		 
		 /*========Sort List*/
		 
		 List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
		 
		 //System.out.println(sorted);
		 
		 
		 /*========. Count Elements*/
		 
		  //long count = numbers.stream().count();
		  
	
		//System.out.println(count);
		
		 /*========Get Distinct Elements=======*/
		
		List<Integer> distinctValues = numbers.stream().distinct().collect(Collectors.toList());
		
		//System.out.println(distinctValues);
		
		
		/*========Count Elements which is greater than 5=======*/
		
		long counts = numbers.stream().filter(n -> n>5)
				               .count();
		
		//System.out.println(counts);
		
		
		/*========Reduce a list of integers to their sum. =======*/
		
		//int sums= numbers.stream().reduce(0,(a,b) -> a+b);
		
		//System.out.println(sums);
		
		/*========Reduce a list of inReturn any element from a list of integers.  =======*/
		
		Optional<Integer> anyElement = numbers.parallelStream().findAny();
		//System.out.println(anyElement);
		
		
		/*========Extract first names from a list of full names =======*/
		
		List<String> firstName = names.stream().map(name -> name.split(" ")[0])
				                 .collect(Collectors.toList());
		
		//System.out.println(firstName);
		
		/*========Check if all numbers in a list are positive. =======*/
		
		boolean allPositive = numbers.stream().allMatch(n -> n%2==0);
		//System.out.println(allPositive);
		
		List<Integer> flatList = nestedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		//System.out.println(flatList);
		
		
		/*========Print elements of a stream during processing without altering the stream. =======*/
		
		List<Integer> peekNumbers = numbers.stream().filter(n -> n%2==0)
				                    .peek( n ->System.out.println("Even number: " + n))
				                    .collect(Collectors.toList());
		
		System.out.println(peekNumbers);
		
		
		
	   
		
		
		
		

	}

}
