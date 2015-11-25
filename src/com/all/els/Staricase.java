package com.all.els;

import java.util.Scanner;

public class Staricase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= n - k) {
					System.out.print("#");
				} else
					System.out.print(" ");
			}
			System.out.println();
			k += 1;
		}
	}
}
