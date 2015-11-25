package com.all.els;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        in.close();
	        double pos = 0;
	        double neg = 0;
	        double zer = 0;
	        for(int arr_i=0; arr_i < n; arr_i++){
	        	if(arr[arr_i] ==0)
	        		zer+=1;
	        	else if(arr[arr_i]<0)
	        		neg+=1;
	        	else
	        		pos+=1;
	        }
	        
	        DecimalFormat formatter = new DecimalFormat("#0.000");
	        System.out.println(formatter.format((double)pos/n));
	        System.out.println(formatter.format((double)neg/n));
	        System.out.println(formatter.format((double)zer/n));
	        
	    }

}
