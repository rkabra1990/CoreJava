package com.test;

public class StringComparator {

	public static void main(String[] args) {

		String str = "ABC";
		char a='A';
		char b ='D';
		System.out.println(str.compareTo("DEF"));
		System.out.println(str.compareToIgnoreCase("abc"));
		System.out.println(a-b);
	}

}
