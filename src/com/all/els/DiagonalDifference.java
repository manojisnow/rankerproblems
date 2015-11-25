package com.all.els;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(diagonalDifference(a, n));
    }

	private static int diagonalDifference(int[][] a, int n) {
		int x=0;
		int y=0;
		int z=0;
		for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
            	if(a_i==a_j)
            		x+=a[a_i][a_j];
            }
        }
		for(int a_i=0; a_i < n; a_i++){
            for(int a_j=n-1; a_j >=0 ; a_j--){
            	if(n-a_i-1==a_j || a_i==n-1-a_j)
            		y+=a[a_i][a_j];
            }
        }
		z=y-x;
		return (int) Math.sqrt(Math.pow(z, 2)); 
	}

}
