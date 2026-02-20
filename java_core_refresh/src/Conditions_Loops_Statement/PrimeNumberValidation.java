package Conditions_Loops_Statement;

public class PrimeNumberValidation 
     
{
	     public static void main(String[] args)
	{
	     int number = 1;
	     int count=0;
	     
	     if(number<=1)
	     {
	         System.out.println("the number is not prime");
	         return;
	     }
	     
	     for(int i=2;i<number;i++)
	     {
	      if (number%i==0)
	      {
	          count++;
	          break;
	      }
	     } 
	    
	     if (count>0)
	     System.out.println("the number is not prime");
	     else
	     System.out.println("the number is prime");
	}
}
