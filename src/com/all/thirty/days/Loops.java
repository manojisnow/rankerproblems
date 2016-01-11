package com.all.thirty.days;

import java.util.Scanner;

public class Loops {
	private static Integer[][] xs;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		xs = new Integer[t][3];
		for (int a0 = 0; a0 < t; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			xs[a0][0] = a;
			xs[a0][1] = b;
			xs[a0][2] = n;
		}
		in.close();

		for (int a0 = 0; a0 < t; a0++) {
			int a = xs[a0][0];
			int b = xs[a0][1];
			int n = xs[a0][2];
			int pow=0;
			for (int i = 0; i < n; i++) {
				 pow+= (int) Math.pow(2, i) * b;
				int s = a + pow;
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}
