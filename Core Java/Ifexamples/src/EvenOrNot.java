/*
 * WRITE A JAVA PROGRAM TO CHECK WEATHER A GIVEN NUMBER IS EVEN OR NOT
 */

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();
		scan.close();
		if( n % 2 == 0)
			System.out.println("Given number is even");
		else
			System.out.println("given number is odd");
	}

}
