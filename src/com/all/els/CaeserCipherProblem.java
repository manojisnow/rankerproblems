package com.all.els;

import java.util.Scanner;

/**
 * @author 10619244
 *
 */
public class CaeserCipherProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer length = Integer.parseInt(scan.nextLine());
		String msg = scan.nextLine();
		Integer shift = Integer.parseInt(scan.nextLine());
		if(shift<=100){
			shift %= 26;
			if (length<=100 && length == msg.length())
				System.out.println(cipher(msg, shift));	
		}
		scan.close();
	}

	static String cipher(String msg, int shift) {
		String s = "";
		int len = msg.length();
		for (int x = 0; x < len; x++) {
			char c = (char) msg.charAt(x);
			if (c < 'A' || c > 'z' || (c > 'Z' && c < 'a')) {
				s += c;
			} else {
				if(c>='A' && c<='Z'){
					char y = (char) (c + shift);
					if (y > 'Z')
						s += (char) (c - (26 - shift));
					else
						s += (char) (c + shift);	
				}
				if(c>='a' && c<='z'){
					char y = (char) (c + shift);
					if (y > 'z')
						s += (char) (c - (26 - shift));
					else
						s += (char) (c + shift);
				}
				
			}
		}
		return s;
	}
	
	static int solveMeFirst(int a, int b){
		return a+b;
	}
}
