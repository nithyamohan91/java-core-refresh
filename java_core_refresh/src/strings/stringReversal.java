package strings;

import java.util.Scanner;

public class stringReversal {
	
	public static void main(String[] args)
	{
		System.out.println("enter the string to be reversed");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String reverse="";
		scan.close();
		
		for (int i=name.length()-1;i>=0;i--)
		{
			reverse =reverse + name.charAt(i);				
			
		}
		System.out.println("String reversed is " +reverse);
		if (name.equals(reverse))
			System.out.println("Name string is palindrome");
		else
		 System.out.println("Name string is not palindrome");
		}
	}

