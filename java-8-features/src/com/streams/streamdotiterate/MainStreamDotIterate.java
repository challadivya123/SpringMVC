package com.streams.streamdotiterate;

import java.util.stream.Stream;

public class MainStreamDotIterate {

	public static void main(String[] args) {
				//shows all multiples of 3 - no condition to stop-method to control the iteration
		//no for loop no condition on no of iterations
Stream.iterate(101,count->count+1)
.filter(numbers->numbers%3==0)
.limit(6)
.forEach(System.out::println);
	}
}
