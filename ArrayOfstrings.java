package com.assistedproject;

import java.util.Scanner;

public class ArrayOfstrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int no;
		Scanner input = new Scanner(System.in);
		System.out.println("How Many Friends Are There In Your Gang : ");
		no = input.nextInt();
		input.skip(System.lineSeparator());
		String []names=new String[no];
		for(int value=0; value<no; value++) {
			System.out.println("Enter Names Of Your Friends : "+(value+1));
			names [value]=input.nextLine();
				}
		input.close();
		System.out.println("Friends In Your Gang Are:");
		for(int value =0; value<no; value++) {
			System.out.println(names[value]);
		
		}	
		

	}

}
