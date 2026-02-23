package Conditions_Loops_Statement;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int number[]= {1,2};
		int largest=number[0];
		int secondlargest=number[0];
		
		for (int i=1;i<number.length;i++)
		{
			if (number[i]>largest)
			{
				secondlargest=largest;
				largest = number[i];
			}
				
			else if (number[i]<largest)
			{
				if (largest==secondlargest)
			    {
				secondlargest=number[i];
				
		        }
				
				else if (number[i]>secondlargest)
				{
					secondlargest=number[i];

				}
	}

	}
		System.out.println(secondlargest);

}
}
