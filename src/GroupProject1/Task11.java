package GroupProject1;

public class Task11 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?

		String[] arr = { 
				"apple@gmail.com", 
				"mango@gmail.com", 
				"orange@gmail.com", 
				"banana@gmail.com",
				"peach@gmail.com", 
				"melon@gmail.com", 
				"banana@gmail.com",
				"appricot@gmail.com",
				"mango@gmail.com" };

		for (int i = 0; i < arr.length; i++) {			// we take first element of array
			for (int j = 0; j < arr.length; j++)		// and compare it with the all elements of array one by one
				if (i == j) {							// to not compare each element with itself made this condition
					continue;							// which skips the comparison if we try to compare it with itself
				} else if (arr[i].equals(arr[j])) {		// if we find element same to the one we compare with 
					System.out.println(arr[i] + " stored in index [" + i + "] is a dublicate");		// we print it out and showing where it is stored
				}
		}
	}
}
