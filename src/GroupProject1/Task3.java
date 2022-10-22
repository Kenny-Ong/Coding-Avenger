package GroupProject1;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a 2D array of integer values.
		 * Print the sum of all numbers.
		 */
		 
		
		System.out.println("Using regular addition method:");
		System.out.println();

		int[][] array= {
					   {10, 20, 30, 40}, 
					   {50, 60, 70, 80},
					   {90, 100, 110, 120}
					   };
		
		System.out.println("Sum of all integers = " + (array[0][0] + array[0][1] + array[0][2] + array[0][3] 
													 + array[1][0] + array[1][1] + array[1][2] + array[1][3]
													 + array[2][0] + array[2][1] + array[2][2] + array[2][3]));
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Using for loop:");
		System.out.println();
		
		int sum=0;
		for(int r=0; r<array.length; r++)
		{
			for(int c=0;c<array[r].length; c++)
			{
				sum+=array[r][c];
			}
		}
		System.out.println("Sum of all integers = " + sum);
		
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Using enhanced for loop:");
		System.out.println();
	
		
		sum=0;
		
		for(int[] r:array)
		{
			for(int c:r )
			{
				sum+=c;
			}
		}
		System.out.println("Sum of all integers = " + sum);
	}

}
