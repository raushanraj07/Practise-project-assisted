package com.strings;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("Java");
		StringBuffer sb2= new StringBuffer("Language");
		
		System.out.println(sb1);
		System.out.println(sb2);
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.append(sb2);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		

	}

}
