package com.all.els;

import java.util.Scanner;

public class OPFormatter {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s1 = sc.next();
		int x = sc.nextInt();
		sc.nextLine();
		String s2 = sc.next();
		int y = sc.nextInt();
		sc.nextLine();
		String s3 = sc.next();
		int z = sc.nextInt();
		sc.nextLine();
		System.out.println("================================");
		System.out.print(spacePadder(s1));
		System.out.println(zeroPadder(x));
		System.out.print(spacePadder(s2));
		System.out.println(zeroPadder(y));
		System.out.print(spacePadder(s3));		
		System.out.println(zeroPadder(z));
		System.out.println("================================");

	}
	static String spacePadder(String s){
		for(int i=s.length();i<15;i++){
			s=s+" ";
		}
		return s;		
	}
	static String zeroPadder(Integer x){
		String y = "";
		if(x==0)
			y="000";
		else if(x<10)
			y=00+ x.toString();
		else if(x<100)
			y=0+ x.toString();
		else 
			y=x.toString();
		return y;
		
	}
}
