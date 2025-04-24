package com.ss;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
       int testCases = scanner.nextInt();  // Number of test cases
       
       for (int i = 0; i < testCases; i++) {
           String numStr = scanner.next(); // Number ko as string read karein

           try {
               long n = Long.parseLong(numStr); // Long me convert karne ki koshish
               
               System.out.println(n + " can be fitted in:");
               
               if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                   System.out.println("* byte");
               }
               if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                   System.out.println("* short");
               }
               if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                   System.out.println("* int");
               }
               if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                   System.out.println("* long");
               }
           } catch (NumberFormatException e) {
               // Agar long se bhi bada number hai toh print kar do
               System.out.println(numStr + " can't be fitted anywhere.");
           }
       }
       
       scanner.close();

	}

}
