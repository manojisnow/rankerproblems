package com.all.els;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Calculate {
	Output output = new Output();
	double volume = 0.0d;

	public double main(int a) {
		volume = a * a * a;
		return volume;
	}

	public double main(int a, int b, int c) {

		volume = a * b * c;
		return volume;
	}

	public double main(double r) {
		volume = ((double) 2 / 3) * Math.PI * r * r * r;
		return volume;
	}

	public double main(double r, double h) {
		volume = Math.PI * r * r * h;
		return volume;
	}

	public static Calculate get_Vol() {
		Calculate cal = new Calculate();
		return cal;
	}

	public int getINTVal() throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		try {
			x = sc.nextInt();
			if (x <= 0) {
				sc.close();
				throw new NumberFormatException("All the values must be positive");
			}
		} catch (InputMismatchException e) {
			String y = sc.next();
			if (y.contains("-"))
				throw new NumberFormatException("All the values must be positive");
            sc.close();
		}
		return x;

	}

	public double getDoubleVal() throws IOException {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		try {
			x = sc.nextDouble();
			if (x <= 0) {
				sc.close();
				throw new NumberFormatException("All the values must be positive");
			}
		} catch (InputMismatchException e) {
			String y = sc.next();
			if (y.contains("-"))
				throw new NumberFormatException("All the values must be positive");
            sc.close();
		}
		return x;
	}
}

class Output {
	public void display(double volume) {
		System.out.println(Math.round(volume * 1000d) / 1000d);
	}

}


public class Solution
{
	
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
			
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
				
				
			}
			else if(ch==2){
			
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
				
			}
			else if(ch==3){
			
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
				
			}
			else if(ch==4){
			
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
				
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
		
	}
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	