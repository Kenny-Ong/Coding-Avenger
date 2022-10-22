package GroupProject1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int givenNum = sc.nextInt();
		boolean isPrime;

		if ((givenNum > 0 && givenNum <= 3)) {
			isPrime = true;
			System.out.println("prime");
		} else {

			for (int i = 2; i < givenNum; i++) {
				int remainder = givenNum % i;
				if (remainder == 0) {
					isPrime = false;
					System.out.println("Not prime");
					break;
				} else if (i == (givenNum - 1)) {

					System.out.println("prime");
					break;
				}

			}

		}
	}
}
