package com.all.thirty.days;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double cost = sc.nextDouble(); 
      int tip = sc.nextInt(); 
      int tax = sc.nextInt(); 
      
      
      double finalPrice=cost+(cost*tip/100)+(cost*tax/100);
      sc.close();
      System.out.println("The final price of the meal is $"+Math.round(finalPrice)+".");
      
    }
}
