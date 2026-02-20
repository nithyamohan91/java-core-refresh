package Arrays;

public class MinMaxInMatrixColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{2,4,5},{3,4,8},{1,2,9}};
		int smallest = arr[0][0];
		int col=0 , x=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]< smallest)
				{
					smallest=arr[i][j];
					col= j;
				}
			}
			
		}
		System.out.println("smmalest number is : " +smallest);
		System.out.println("the column with smmalest number is :" + col);
		int largest= arr[x][col];
		for(x=0;x<=col;x++)
		{
			int no=arr[x][col];
			if (largest <  no)
					{
				      largest = arr[x][col];
					}
		}
		System.out.println("The largest  umber in the column with the smalest number is :" + largest);

	}

}
