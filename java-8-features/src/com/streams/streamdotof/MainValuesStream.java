package com.streams.streamdotof;

import java.util.stream.Stream;

public class MainValuesStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<Integer> stream=Stream.of(1,2,3,4,5);
Stream<String> stream2=Stream.of("HYD","PUNE");

//iterates with single foreac() method no classic for loop
stream.forEach(value->System.out.println(value));
stream2.forEach(value->System.out.println(value));

	}

}
