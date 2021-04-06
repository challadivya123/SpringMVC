package com.defaultmethod;

public interface MyInterface {
	//abstract method
public void square(int side);

//default method
default void show() {
	System.out.println("Defaut method execution");
}
}
