package com.hcl.anonymousclass;

public class AgeCalculator extends IAgeCalculator{
public void getAge(int birthYear,int currentYear) {
	int age=currentYear-birthYear;
	System.out.println("age in years:"+age);
}
}
