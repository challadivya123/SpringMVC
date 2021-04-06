package com.streams.streamdotofarrays;

import java.util.stream.Stream;

public class MainIntArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<Integer> stream=Stream.of(new Integer[] {1,2,3,4});
stream.forEach(element->System.out.println(element));
	}

}
