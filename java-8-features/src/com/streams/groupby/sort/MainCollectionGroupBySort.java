package com.streams.groupby.sort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainCollectionGroupBySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3 insurances,2 banks,1 super store
		List<String> domains=Arrays.asList("Bank","InsuranceCompany","Bank","SuperStore","InsuranceCompany","Hospital","Hospital");
	Map<String,Long> result=domains.stream()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println("Data without sorting");
	System.out.println(result);
	System.out.println("Data with sorting");
	
	Map<String,Long> finalMap=new LinkedHashMap<>();
	//sort a map and add to finalMap
	result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
	.forEachOrdered(domain->finalMap.put(domain.getKey(),domain.getValue()));
System.out.println(finalMap);
}
}
