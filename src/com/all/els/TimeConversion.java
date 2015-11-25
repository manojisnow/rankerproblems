package com.all.els;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		in.close();
		String[] values = time.split(":");
		if (values[2].contains("PM")) {
			values[0] = Integer.toString(Integer.parseInt(values[0]) + 12);
			if (values[0].equals("24"))
				values[0] = "12";
		}
		if (values[2].contains("AM"))
			if (values[0].equals("12"))
				values[0] = "00";
		values[2] = values[2].replace("PM", "");
		values[2] = values[2].replace("AM", "");
		for (int i = 0; i < 3; i++) {
			System.out.print(values[i]);
			if (i != 2)
				System.out.print(":");
		}

	}

}
