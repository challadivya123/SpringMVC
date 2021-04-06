package com.defaultmethod;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyInterface myImpl=new MyInterfaceImpl();
myImpl.square(5);
//default method executed
myImpl.show();
	}

}
