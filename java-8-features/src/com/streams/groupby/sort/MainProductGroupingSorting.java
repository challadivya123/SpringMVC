package com.streams.groupby.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainProductGroupingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Product> products=new ArrayList<Product>();
products.add(new Product("Refridgerator",25632.25f,10));
products.add(new Product("Woven",25632.25f,20));
products.add(new Product("Washing machine",25632.25f,10));
products.add(new Product("Refridgerator",25632.25f,10));
products.add(new Product("Refridgerator",25632.25f,20));
products.add(new Product("Woven",25632.25f,10));
products.add(new Product("Refridgerator",25632.25f,10));
products.add(new Product("Woven",25632.25f,20));

Map<String,Long> counting1=products.stream()
.collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
System.out.println(counting1);

Map<String,Integer> sum1=products.stream()
.collect(Collectors.groupingBy(Product::getName,Collectors.summingInt(Product::getQty)));
System.out.println(sum1);

Map<String,Long> counting2=products.stream()
.collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
System.out.println("Grouping products-counting\t"+counting2);

Map<String,Integer> sum2=products.stream()
.collect(Collectors.groupingBy(Product::getName,Collectors.summingInt(Product::getQty)));
System.out.println("Group by products-summing Quantity\t"+sum2);

	}

}
