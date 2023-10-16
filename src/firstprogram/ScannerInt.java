package firstprogram;

import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter your 1st number:");
		
		int a = reader.nextInt();
		
		System.out.println("Enter your 2nd number:");
		
		int b = reader.nextInt();
		
		int sum = a + b;
		
		System.out.println("Sum of two numbers you have entered is:" +sum);
		
		reader.close();
	}

}
