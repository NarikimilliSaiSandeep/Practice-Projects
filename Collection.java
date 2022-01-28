package com.assistedproject;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		
	      System.out.println("Vector");
	      Vector<String> name = new Vector();
	      name.addElement("Suresh"); 
	      name.addElement("Vishwesh"); 
	      System.out.println(name);
	      for(String hello:name)
	      System.out.print(hello+" ");


	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> identity=new LinkedList<String>();  
	      identity.add("Sam");  
	      identity.add("Ram");  	
	      identity.add("Hanuman");
	      Iterator<String> itr=identity.iterator();  
	      while(itr.hasNext()){  
	      System.out.println(itr.next());  }
	      System.out.println(identity);
     
	      System.out.println("\n");
	      System.out.println("ArrayList");
		  ArrayList<Integer> input=new ArrayList<Integer>();   
		      input.add(5);
		      input.add(15);    	   
		      System.out.println(input);  


	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> hset=new HashSet<Integer>();  
	       hset.add(10);  
	       hset.add(35);  
	       hset.add(56);
	       hset.add(67);
	       hset.add(89);
	       System.out.println(hset);


	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> lset2=new LinkedHashSet<Integer>();  
	       lset2.add(0);  
	       lset2.add(2);  
	       lset2.add(4);
	       lset2.add(58);
	       lset2.add(99);
	       System.out.println(lset2);
	      	} 

	}


