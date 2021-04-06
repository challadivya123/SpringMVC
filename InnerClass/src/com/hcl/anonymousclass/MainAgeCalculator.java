package com.hcl.anonymousclass;

public class MainAgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IAgeCalculator ageCalc=new IAgeCalculator() {
	public void getAge(int birthYear,int currentYear) {
		int age=currentYear-birthYear;
		System.out.println("age in years:in the anonymous class getAge() method"+age);
		
	}
};
IAgeCalculator ageCalcTeens =new IAgeCalculator() {
	public void getAge(int birthYear,int currentYear) {
		int age=currentYear-birthYear;
		if(age<13||age>19) {
			System.out.println("not a teenager");
			
		}else {
			System.out.println("Teeneger");
		}
	}
};
ageCalc.getAge(2000, 2020);
ageCalcTeens.getAge(2004, 2020);
	}

}
