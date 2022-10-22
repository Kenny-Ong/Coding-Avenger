package GroupProject1;

public class Task8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

	/* Write a Java Program to print the first 10 numbers of
	     Fibonacci series. */



//The sequence follows the rule that each number is equal to the sum of the preceding two numbers. so in here i assigned two value 1 & 2 in  a & b variable.
//Fibonacci series means adding two number of the series.ex: 1+ 2+ 3+ 5+ 8 + 13 + 21 +34...it will go on infinite.
        int a=1;
        int b=2;
        int c;

        for(int i=0; i<10; i++) { // using for loop,because we know how many iteration we need for this task.

            System.out.print(a + " ");
            c=a+b; // basically adding a and b value to c
            a=b; // take b value and put into a
            b=c; // take c value and put into b
        }
    }

}
