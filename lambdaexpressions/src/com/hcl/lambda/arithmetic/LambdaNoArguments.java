package com.hcl.lambda.arithmetic;

public class LambdaNoArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MathOperator sum=(int num1,int num2)->num1+num2;//expression-not a method in a class
//invoke method
System.out.println("Sum="+sum.operation(12,13));
//with out type declaration
MathOperator difference=(int num1,int num2)->num1-num2;
System.out.println("Difference="+difference.operation(23, 12));
//with return statement along with curly braces
MathOperator product=(int num1,int num2)->{return num1-num2;};
System.out.println("Product="+product.operation(23, 12));


MathOperator quotient=(int num1,int num2)->(num1/num2);
System.out.println("Quotient="+quotient.operation(23, 2));



MathOperator remainder=(int num1,int num2)->(num1%num2);
System.out.println("Remainder="+remainder.operation(23, 2));

	}

}
