package com.test;

public class StringSubsequence {

	public static void main(String[] args) {

		String str = "www.admaxim.com";
		System.out.println("Last 4 character of the string: "+str.subSequence(str.length()-4, str.length()));
		System.out.println("First 4 character of the string: "+str.subSequence(0, 4));
		System.out.println("Website name: "+str.subSequence(4, 11));
		System.out.println("substring===subsequence: "+(str.substring(4,11)==str.subSequence(4, 11)));
		System.out.println("substring equals subsequence: "+(str.substring(4,11).equals(str.subSequence(4, 11))));
	}

}
