package com.all.els;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Integer[] heights = new Integer[t];
		for (int a0 = 0; a0 < t && t <= 10; a0++) {
			int n = in.nextInt();
			int tree = 1;
			for (int a1 = 1; a1 <= n && n <= 60; a1++) {
				if (a1 % 2 == 1)
					tree = tree * 2;
				else if (a1 % 2 == 0)
					tree = tree + 1;
			}
			heights[a0] = tree;
		}
		in.close();
		for (int a0 = 0; a0 < t && t <= 10; a0++) {
			System.out.println(heights[a0]);
		}
	}
}
