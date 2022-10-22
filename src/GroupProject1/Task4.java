package GroupProject1;

public class Task4 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store
		odd and even numbers. Develop a program which will
		identify/print the even numbers only.
		*/

		//setting up odd and even numbers in the array
		int [][] num = {
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 }
		};
		
		//nested for loops to go through the elements in the array
		for (int r = 0; r<num.length; r++) { // outer loop is r = rows and num.length is the # of rows
			for (int c=0; c<num[r].length; c++) { // inner loop is c = column and num[r].length is the # of the column of the array
				if (num[r][c] %2 == 0) { //condition is if index array # has remainder that equals to 0
					System.out.print(num[r][c]+" "); // if true print out even
				}
		
			}
		}	
	}

}
