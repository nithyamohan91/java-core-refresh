package patterns;

public class InvertedSequencePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		
		for (int i=0;i<=3;i++) //outer rows loop
		{
			for (int j=0;j<=i;j++) //inner column loop
			{
				System.out.print(number +"\t");
				number++;
			}
			System.out.print("\n");
		}

	}

}
