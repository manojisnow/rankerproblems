package com.all.els;

import java.util.Scanner;

public class AngryProfessor {

	private static String[] xs;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		xs = new String[t];
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			int pos=0;
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
				if(a[a_i]<=0)
					pos+=1;
				else
					;
			}
			if(pos<k)
				xs[a0]="YES";
			else
				xs[a0]="NO";
		}
		in.close();
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println(xs[a0]);
		}
	}

}
