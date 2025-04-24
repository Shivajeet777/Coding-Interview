package com.ss;

import java.io.IOException;
import java.util.Scanner;

public class Std2 {

	public static void main(String[] args) throws IOException 
	{
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String language = scanner.next();//nextLine() kyu nhi h 
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d%n", language, number);// isko detail me smjhao %-15s%03d%n
        }

        System.out.println("================================");

	}

}
