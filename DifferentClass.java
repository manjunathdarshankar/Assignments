package com.te.javabasics.accessmodifiers;

import com.te.javabasics.inheritance.InSameClass;

public class DifferentClass {

	public void publicMethod() {
		System.out.println("This is a public method");
	}

	public void protectedMethod() {
		System.out.println("This is a protected method");
	}

	void defaultMethod() {
		System.out.println("This is a default method");
	}

	public static void main(String[] args) {
		DifferentClass class1 = new DifferentClass();
		class1.defaultMethod();
		class1.protectedMethod();
		class1.publicMethod();
	} //end of main
}

//program pull
