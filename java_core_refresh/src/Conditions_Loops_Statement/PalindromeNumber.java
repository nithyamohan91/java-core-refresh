package Conditions_Loops_Statement;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		int  number = scanner.nextInt();
		int original = number;
		int reverse = 0;
		
		while(number>0)
		{
			int remainder = number%10;
			reverse = reverse *10 + remainder;
			number=number/10;
		}
		
		if (original==reverse)
		{
			System.out.println("number is palindrome");
		}
		
		else 
		{
			System.out.println("number is not paplindrome");
		}
		
	    
	}

}
