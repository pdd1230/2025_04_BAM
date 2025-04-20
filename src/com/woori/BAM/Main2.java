package com.woori.BAM;

public class Main2 {
	public static void main(String[] args) {
		String a = "asd";
		String b = "asd";

		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println("--------");

		String c = new String("asd");
		String d = new String("asd");
		System.out.println(c == d);
		System.out.println(c.equals(d));

//	System.out.println(c);
//	System.out.println(d);
	}
}
