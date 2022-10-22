package GroupProject1;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		//task 9: Maximum and minimum number in the array?
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of elements in array: ");
		int sizeOfArr = input.nextInt();	 // storing a number into variable 
		int[] arr = new int[sizeOfArr];		// stored number in variable sizeOfArr is now the size of array

		for (int i = 0; i < sizeOfArr; i++) {
			System.out.print("Enter an element for index [" + i + "] in array: "); // asking user to enter numbers which we will store into each element
			arr[i] = input.nextInt();		// storing input numbers into each element of array
		}

		int max = arr[0];		// initializing variable MIN and assuming that a number stored in first element is the largest
		for (int a = 0; a < sizeOfArr; a++) {		// starting for loop to compare all elements of array
			if (arr[a] > max) {		// compare
				max = arr[a];		// storing a value
			}
		}

		int min = arr[0];		// initializing variable MIN and assuming that a number stored in first element is the smallest
		for (int b = 0; b < sizeOfArr; b++) { 		// starting for loop to compare all elements of array
			if (arr[b] < min) {		// compare
				min = arr[b];		// storing a value
			}
		}
		System.out.println("The MAX number in array is: " + max);
		System.out.println("The MIN number in array is: " + min);
	}

}
