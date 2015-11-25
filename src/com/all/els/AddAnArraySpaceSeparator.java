package com.all.els;

import java.util.Scanner;

/**
 * @author 10619244
 *
 */
public class AddAnArraySpaceSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer length = Integer.parseInt(scan.nextLine());
		String msg = scan.nextLine();
		String[] number = msg.split(" ");
		scan.close();
		if (length == number.length){
			Double y = new Double(0);
			for(String x : number){
				y+= Double.parseDouble(x);
			}
			System.out.printf("%.0f\n",y.doubleValue());

		}			
	}
	
}
