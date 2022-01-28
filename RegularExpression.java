package com.assistedproject;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression {

	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String check = "My Name Is Sandeep,and Iam Here To Become An Software Engineer";
		Pattern var = Pattern.compile(pattern);
		Matcher word = var.matcher(check);
		
		
		//condition check using find() method
		while (word.find())
	      	System.out.println( check.substring( word.start(), word.end() ) );
	}		
}
		


