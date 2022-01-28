package com.assistedproject;

public class DifferentReturnTypes {

	public static void main(String[] args) {
		int addition= addition(2,3);
		System.out.println("The addition of 2 and 3 is : "+ addition);

		System.out.println();


		callingMethod cal= new callingMethod();

		System.out.println("Call by value Before is : "+cal.value);
		cal.change(200);
		System.out.println("Call by value after is : "+cal.value);

		System.out.println();

		area(2,3);

		area(3);
	}

	static int addition(int num1, int num2){

		return num1+num2;

	}

	static void area(int num1, int num2) {
		System.out.println("The area of rectangle is : "+ (num1*num2));
	}
	static void area(int num1) {
		System.out.println("The area of square is : "+ (num1*num1));
	}

}

class callingMethod{
	int value=500;

	int change(int value) {
		this.value=value + 500;
		return this.value;
	}
}


