package com.test;

import org.apache.commons.lang3.StringUtils;

public class StringReplace {

	public static void main(String[] args) {
		String str = "my name is ronak kabra hain";
		System.out.println(StringUtils.replace(str, "hain", ""));
		System.out.println(str.replaceAll(Character.toString('i'), ""));
	}

}
