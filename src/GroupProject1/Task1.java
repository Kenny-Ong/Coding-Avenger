package GroupProject1;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	
	      System.out.println("How many elements do you want in your Array? ");
	      Scanner input = new Scanner(System.in);
	      int elements = input.nextInt();
	      int arr[] = new int [elements];
	      int sum = 0;
	      System.out.println("Type down the elements you want in your Array");

	      for(int i=0; i<elements; i++){
	         arr[i] = input.nextInt();
	         sum = sum + arr[i];
	      }
	   
	      System.out.println("The Sum of all the elements in your array  is: "+sum);
	   }
	}


