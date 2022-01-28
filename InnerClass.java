package com.project;

public class InnerClass {
	
	private String name="Welcome To My Home"; 
	 
	 class Inner{  
	  void greetings(){System.out.println(name+", Let's Have A Cup Of Tea ");}  
	 }  

	public static void main(String[] args) {
		InnerClass object=new InnerClass();
		InnerClass.Inner in=object.new Inner();  
		in.greetings();

	}

}
