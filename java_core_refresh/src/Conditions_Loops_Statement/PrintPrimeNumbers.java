package Conditions_Loops_Statement;

public class PrintPrimeNumbers {
	
public static void main(String [] args)
{
	for (int no=1;no<=20;no++)
	{
		if (no<=1)
		{
			continue;
		}
		
		boolean isPrime = true;
		
		for (int i=2;i<no;i++)
		{
			if (no%i==0)
			{
			  isPrime=false;
			  break;

			}
			
		}
		
		if (isPrime)
		{
			System.out.println(no);
		}

	}
	
}

}
