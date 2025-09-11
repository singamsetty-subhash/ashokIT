
/*
 * write a program to check given year is leap year or not 
 * --> leap year conditions 
 * 1. year divisible by 4 and not divisible by 100,year is leap
 * 2. year divisible by 4 and divisible by 100 it must be divisible by 400 then it is leap year other wise
 * not a leap year 
 * 3.year not divisible 4 not a leap year
 */
import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr year");
		int year = scan.nextInt();
		scan.close();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					System.out.println(year + ":leap year");
				else
					System.out.println(year + ":not leap year");
			} else
				System.out.println(year + ":leap year");
		} else
			System.out.println(year + ":not a leap year");
	}

}
