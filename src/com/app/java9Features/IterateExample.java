package com.app.java9Features;

import java.util.stream.Stream;


/*
 *1).Stream API already has an iterate() method which takes a seed value and a UnaryOperator and generates a Stream.
 *   ex:- Stream.iterate(1, i -> i+1); //it will generate an infinite Stream of numbers 1,2,3,4,….
 *
 *2).We can use limit() method on the above Stream to limit the number of elements generated by the iterate() method -
 *   ex:- Stream.iterate(1, i -> i+1).limit(10).forEach(System.out::println);
 * 
 *3).But if you want to limit the number of elements based on some condition instead of specifying a limit directly.
 *   ex:- Stream.iterate(1, i -> i <= 10, i -> i+1).forEach(System.out::println);
 * 
 *4).The new overloaded version of the iterate() method takes a Predicate and keep generating elements until the predicate fails.
 *   ex:- Stream.iterate(1, i -> i <= 10, i -> i+1).forEach(System.out::println);
 *   ~It is similar to the traditional for loop which takes a seed value, a condition, and an increment operation 
 *   ~ for(int i = 1; i <= 10; i++){....}
 *     
 */
public class IterateExample {
	
	public static void main(String[] args) {
		//JDK1.8
		Stream.iterate(1,i->i+1)
		      .filter(n->n%2==0)
		      .map(m->m+1)
		      .limit(10)
		      .forEach(System.out::println);
		
		System.out.println("========================");
		
		//JDK1.9
		Stream.iterate(1,i->i<=100,i->i+1)
	      .limit(10)
	      .forEach(System.out::println);
	}
}
