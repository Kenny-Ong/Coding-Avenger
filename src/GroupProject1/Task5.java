package GroupProject1;

public class Task5 {

	public static void main(String[] args) {
		
		int[][] values= {{5,99,78,90,77},
                {4,5,87,99,34}
               };
int oddSum=0;
int evenSum=0;;

for(int r=0; r<values.length;r++) {

   for(int c=0;c<values[r].length ;c++ ) {

       if(values[r][c]%2==0) {
       evenSum += values[r][c];

   } else if(values[r][c]%2==1) {
       oddSum += values[r][c];
   }
       }

       }
System.out.println(evenSum);
System.out.println(oddSum);


	}

}
