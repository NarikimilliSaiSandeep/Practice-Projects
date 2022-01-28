package com.project;

public class InnerClass_1 {
	
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }
	public static void main(String[] args) {
		InnerClass_1  ob=new InnerClass_1 ();  
		ob.display();  
		}

	}


