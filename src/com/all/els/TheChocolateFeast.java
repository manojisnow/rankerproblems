package com.all.els;

import java.util.Scanner;

public class TheChocolateFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Integer[] chocs = new Integer[t];
		for (int a0 = 0; a0 < t && t <= 1000; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int chocolates = 0;
			if ((2 <= n && n <= 100000) && 1 <= c && c <= n && 2 <= m && m <= n) {
				chocolates = n / c;
				int wrapperExch = 0;
				int extraCho = 0;
				if (chocolates >= m) {
					wrapperExch = chocolates / m;
					extraCho = chocolates % m;
					chocolates = chocolates + wrapperExch;
					while (wrapperExch + extraCho >= m) {
						chocolates = chocolates + (wrapperExch + extraCho) / m;
						int tempExtra = (wrapperExch + extraCho) % m;
						wrapperExch = (wrapperExch + extraCho) / m;
						extraCho  = tempExtra;
					}
				}
			}
			chocs[a0] = chocolates;
		}
		in.close();
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println(chocs[a0]);
		}
	}

}
