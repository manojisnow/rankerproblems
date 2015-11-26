package com.all.els;

import java.util.Scanner;

public class DecentNumber {

	static int digit3;
	static int digit5;
	static int valid = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] numbers = new String[t];
		for (int a0 = 0; a0 < t; a0++) {
			StringBuffer decen = new StringBuffer();
			int n = in.nextInt();
			valid = 0;
			digit3=0;
			digit5=0;
			if (n < 3) {
				decen.append("-1");
			} else if (n % 3 == 0) {
				for (int j = 0; j < n; j++) {
					decen.append("5");
				}
			} else {
				int circle = n;
				int mod3 = 0;
				do {
					mod3 = circle % 3;
					if (mod3 != 0) {
						circle = circle - 5;
					} else {
						digit3 = n - circle;
						digit5 = circle;
						valid = 1;
						for (int j = 0; j < digit5; j++) {
							decen.append("5");
						}
						for (int j = 0; j < digit3; j++) {
							decen.append("3");
						}
						break;
					}

				} while (circle > 0);
				if (valid == 0) {
					circle = n;
					int mod5 = 0;
					do {
						mod5 = circle % 5;
						if (mod5 != 0) {
							circle = circle - 3;
						} else {
							digit5 = n - circle;
							digit3 = circle;
							valid = 1;
							for (int j = 0; j < digit5; j++) {
								decen.append("5");
							}
							for (int j = 0; j < digit3; j++) {
								decen.append("3");
							}
							break;
						}

					} while (circle > 0);
				}
				if (valid == 0) {
					decen.append("-1");
				}

			}
			numbers[a0] = decen.toString();
		}

		in.close();
		for (int a1 = 0; a1 < t; a1++) {
			System.out.println(numbers[a1]);
		}
	}

}
