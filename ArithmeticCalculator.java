package com.assistedproject;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		System.out.println("enter a number");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("enter your choice :: (+,-,*,/,%)");
		
		char op=scan.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("addition of two numbers is : " +(a+b));
			break;
		case '-':
			System.out.println("substraction of two numbers is : " +(a-b));
			break;
		case '*':
			System.out.println("multiplication of two numbers is : " +(a*b));
			break;
		case '/':
			if(b==0) {
				System.out.println("invalid division");
			}else {
			System.out.println("division of two numbers is : " +(a/b));
			}
			break;
		case '%':
			if(b==0) {
				System.out.println("invalid division");
			}else {
			System.out.println("remainder of two numbers is : " +(a%b));
			}
			break;
			default:
				System.out.println("invalid");
			
		}
		
	    }

	    }
