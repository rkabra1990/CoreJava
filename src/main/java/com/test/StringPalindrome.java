package com.test;

import org.apache.commons.lang3.StringUtils;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "aba";
		//boolean palindrome = isPalindrome(str);
		boolean palindrome = isPalindromeString(str);
		if(palindrome) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

	private static boolean isPalindromeString(String str) {
		if(StringUtils.isEmpty(str))
		return false;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPalindrome(String str) {
		if(StringUtils.isEmpty(str)) {
			return false;
		}else {
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			return sb.toString().equals(str);
		}
	}

}
