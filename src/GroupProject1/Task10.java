package GroupProject1;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		// List of elements in array
		int[] nums = { 1299, 399, 299, 699, 100, 799, 899 };
		// Initializing 2 variables and assigning the minimum integer value 
		//(considering negative numbers)
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		// find the first largest number
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > first) {
				first = nums[i];
			}
		}
		System.out.println("The first largest number in the array is " + first);

		// find second largest number, exclude the first number and find the largest
		// number in the array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != first) {
				if (nums[i] > second) {
					second = nums[i];
				}
			}
		}
		System.out.println("The second largest number is " + second);
	}
}
